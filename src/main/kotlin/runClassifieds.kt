package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.UnhandledAlertException
import org.openqa.selenium.chrome.ChromeDriver

fun runClassifieds(driver: ChromeDriver) {
    //runClassChicago(driver)
    runClassLA(driver)
}

fun runClassChicago(driver: ChromeDriver) {
    val usrAd = "customersupport@thefinchfarm.com"
    val pwAd = "Marketing2019!"
    adsLogin(driver,usrAd,pwAd)
    adNowChicago(driver)
}

fun runClassLA(driver: ChromeDriver) {
    val usrAd = "customersupport@petkittensforsale.com"
    val pwAd = "PKFS2019!"
    adsLogin(driver,usrAd,pwAd)
    adNowLA(driver)
}

fun adsLogin(driver: ChromeDriver, user: String, pass: String) {
    try {
        driver.get("https://www.classifiedads.com/login.php")
        driver.findElement(By.name("login_email")).sendKeys("$user")
        driver.findElement(By.name("login_password")).sendKeys("$pass")
        driver.findElement(By.xpath("//input[@value='Log in']")).click()
        Thread.sleep(1000)

    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}