package com.pinnsights

import org.openqa.selenium.*
import java.util.HashMap
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.time.LocalDateTime

fun runViewsWA(driver: ChromeDriver) {
    val usrBirdsWA = "customersupport@thefinchfarm.com"
    val pwBirdsWA = "TFF2020!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsWA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsWA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        WAViews(driver)
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

fun runViewsCA(driver: ChromeDriver) {

    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsCA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsCA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        CAViews(driver)
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

fun runViewsAZ(driver: ChromeDriver) {

    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsAZ")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsAZ")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        AZViews(driver)
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

fun runViewsFL(driver: ChromeDriver) {

    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsFL")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsFL")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        FLViews(driver)
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

fun runViewsTX(driver: ChromeDriver) {

    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsTX")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsTX")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        TXViews(driver)
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

fun runViewsNY(driver: ChromeDriver) {

    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsNY")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsNY")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        NYViews(driver)
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

fun runViewsIL(driver: ChromeDriver) {

    val usrBirdsIL = "customersupportIL@thefinchfarm.com"
    val pwBirdsIL = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsIL")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsIL")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        ILViews(driver)
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

fun runViewsPA(driver: ChromeDriver) {

    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsPA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsPA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        PAViews(driver)
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

fun runViewsOH(driver: ChromeDriver) {

    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsOH")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsOH")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        OHViews(driver)
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

fun runViewsIN(driver: ChromeDriver) {

    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsIN")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsIN")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        INViews(driver)
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

fun runViewsMA(driver: ChromeDriver) {

    val usrBirdsMA = "customersupportMA@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsMA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsMA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        MAViews(driver)
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

fun runViewsDL(driver: ChromeDriver) {

    val usrBirdsMA = "supportdallas@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsMA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsMA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        DLViews(driver)
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

fun runViewsDC(driver: ChromeDriver) {

    val usrBirdsDC = "supportwashingtondc@thefinchfarm.com"
    val pwBirdsDC = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsDC")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsDC")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        DCViews(driver)
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

fun runViewsAT(driver: ChromeDriver) {

    val usrBirdsAT = "supportatlanta@thefinchfarm.com"
    val pwBirdsAT = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsAT")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsAT")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        ATViews(driver)
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

fun runViewsDT(driver: ChromeDriver) {

    val usrBirdsDT = "supportdetroit@thefinchfarm.com"
    val pwBirdsDT = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsDT")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsDT")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        DTViews(driver)
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