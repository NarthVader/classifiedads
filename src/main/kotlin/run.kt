package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.UnhandledAlertException
import org.openqa.selenium.chrome.ChromeDriver

fun runBirdsPDX(driver: ChromeDriver, i: Int) {
    val usrBirdsPDX = "supportportland@thefinchfarm.com"
    val pwBirdsPDX = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPDX,pwBirdsPDX)
    birdsNowPDX(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsWA(driver: ChromeDriver, i: Int) {

    val usrBirdsWA = "customersupport@thefinchfarm.com"
    val pwBirdsWA = "TFF2020!"
    birdsNowLogin(driver,usrBirdsWA,pwBirdsWA)
    birdsNowWA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsCA(driver: ChromeDriver, i: Int) {

    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"
    birdsNowLogin(driver,usrBirdsCA,pwBirdsCA)
    birdsNowCA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsAZ(driver: ChromeDriver, i: Int) {

    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAZ,pwBirdsAZ)
    birdsNowAZ(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsFL(driver: ChromeDriver, i: Int) {

    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"
    birdsNowLogin(driver,usrBirdsFL,pwBirdsFL)
    birdsNowFL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsTX(driver: ChromeDriver, i: Int) {

    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"
    birdsNowLogin(driver,usrBirdsTX,pwBirdsTX)
    birdsNowTX(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsNY(driver: ChromeDriver, i: Int) {

    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"
    birdsNowLogin(driver,usrBirdsNY,pwBirdsNY)
    birdsNowNY(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsIL(driver: ChromeDriver, i: Int) {

    val usrBirdsIL = "customersupportIL@thefinchfarm.com"
    val pwBirdsIL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsIL,pwBirdsIL)
    birdsNowIL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsPA(driver: ChromeDriver, i: Int) {

    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPA,pwBirdsPA)
    birdsNowPA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsOH(driver: ChromeDriver, i: Int) {

    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsOH,pwBirdsOH)
    birdsNowOH(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsIN(driver: ChromeDriver, i: Int) {

    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsIN,pwBirdsIN)
    birdsNowIN(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsMA(driver: ChromeDriver, i: Int) {

    val usrBirdsMA = "customersupportMA@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMA,pwBirdsMA)
    birdsNowMA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsDL(driver: ChromeDriver, i: Int) {

    val usrBirdsDL = "supportdallas@thefinchfarm.com"
    val pwBirdsDL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDL,pwBirdsDL)
    birdsNowDL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsDC(driver: ChromeDriver, i: Int) {

    val usrBirdsDC = "supportwashingtondc@thefinchfarm.com"
    val pwBirdsDC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDC,pwBirdsDC)
    birdsNowDC(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsAT(driver: ChromeDriver, i: Int) {

    val usrBirdsAT = "supportatlanta@thefinchfarm.com"
    val pwBirdsAT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAT,pwBirdsAT)
    birdsNowAT(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsDT(driver: ChromeDriver, i: Int) {

    val usrBirdsDT = "supportdetroit@thefinchfarm.com"
    val pwBirdsDT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDT,pwBirdsDT)
    birdsNowDT(driver,i)
    birdsNowLogout(driver)
}

fun birdsNowLogin(driver: ChromeDriver, user: String, pass: String) {
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$user")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pass")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
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

fun birdsNowLogout(driver: ChromeDriver) {
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun runHooblyWA(driver: ChromeDriver, i: Int) {

    val usrHooblyWA = "customersupport@thefinchfarm.com"
    val pwHooblyWA = "Marketing2019!"
    hooblyLogin(driver,usrHooblyWA,pwHooblyWA)
    hooblyWA(driver,i)
}

fun runHooblyFL(driver: ChromeDriver, i: Int) {

    val usrHooblyFL = "customersupportFL@thefinchfarm.com"
    val pwHooblyFL = "TFFFL2019!"
    hooblyLogin(driver,usrHooblyFL,pwHooblyFL)
    hooblyFL(driver,i)
}

fun runHooblyAZ(driver: ChromeDriver, i: Int) {

    val usrHooblyAZ = "customersupportAZ@thefinchfarm.com"
    val pwHooblyAZ = "TFFAZ2019!"
    hooblyLogin(driver,usrHooblyAZ,pwHooblyAZ)
    hooblyAZ(driver,i)
}

fun runHooblyCA(driver: ChromeDriver, i: Int) {

    val usrHooblyCA = "customersupportCA@thefinchfarm.com"
    val pwHooblyCA = "TFFC3522!"
    hooblyLogin(driver,usrHooblyCA,pwHooblyCA)
    hooblyCA(driver,i)
}

fun hooblyLogin(driver: ChromeDriver,user: String,pass: String) {
    try {
        driver.get("https://www.hoobly.com/")
        driver.findElement(By.xpath("//a[@href='/c/login']")).click()
        driver.get("https://www.hoobly.com/c/login")
        Thread.sleep(1000)
        driver.findElement(By.id("email")).sendKeys("$user")
        driver.findElement(By.id("pass")).sendKeys("$pass")
        driver.findElement(By.xpath("//button[@type='submit']")).click()
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


fun runCats(driver: ChromeDriver, i: Int) {

    val usrCats = "support@thefinchfarm.zendesk.com"
    val pwCats = "Catterydirectory2018!"
    catsLogin(driver,usrCats,pwCats)
    catsNow(driver,i)

}

fun catsLogin(driver: ChromeDriver, user: String, pass: String) {
    try {
        driver.get("https://www.catsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$user")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pass")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
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

fun runReps(driver: ChromeDriver, i: Int) {

    val usrRep = "customersupport@thefinchfarm.com"
    val pwRep = "Reptiledirectory2018!"

    repsLogin(driver,usrRep,pwRep)
    repsNow(driver,i)
}

fun repsLogin(driver: ChromeDriver,user: String,pass: String) {
    try {
        driver.get("https://www.reptilesnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$user")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pass")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
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

fun runDogs(driver: ChromeDriver,i: Int) {

    val usrDog = "customersupport@thefinchfarm.com"
    val pwDog = "Dogdelight2019!"
    dogLogin(driver,usrDog,pwDog)
    dogsNow(driver,i)
}

fun dogLogin(driver: ChromeDriver,user: String,pass: String) {
    try {
        driver.get("https://www.dogsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$user")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pass")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)

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

fun runClassifieds(driver: ChromeDriver) {

    val usrAd = "customersupport@thefinchfarm.com"
    val pwAd = "Marketing2019!"
    try {
        driver.get("https://www.classifiedads.com/login.php")
        driver.findElement(By.name("login_email")).sendKeys("$usrAd")
        driver.findElement(By.name("login_password")).sendKeys("$pwAd")
        driver.findElement(By.xpath("//input[@value='Log in']")).click()
        Thread.sleep(1000)
        adNow(driver)
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