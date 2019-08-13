package com.pinnsights

import org.openqa.selenium.*
import java.util.HashMap
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.time.LocalDateTime

fun main(args: Array<String>) {
    scrape()
}

fun scrape() {
    val chromePrefs = HashMap<String, Any>()
    chromePrefs["profile.default_content_settings.popups"] = 0
    val options = ChromeOptions()
    options.setExperimentalOption("prefs", chromePrefs)
    val cap = DesiredCapabilities.chrome()
    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true)
    cap.setCapability(ChromeOptions.CAPABILITY, options)
    val driver = ChromeDriver(cap)


    val current = LocalDateTime.now()
    val hour = current.hour

//    if(hour in 10..15) {
//        println("noon")
//        noonBatch(driver)
//    } else if (hour in 16..22) {
//        println("pm")
//        pmBatch(driver)
//    } else {
//        println("all")
//        runAll(driver)
//    }

    val autoLogin = "customersupport@thefinchfarm.com"
    val autoPassword = "TFF2020!"
    //autoPost(driver, autoLogin, autoPassword)
    run(driver)
    //viewCount(driver)
    driver.quit()
}

fun autoPost(driver: ChromeDriver, login: String, pass: String) {
    birdsNowLogin(driver, login, pass)
    createBirds(driver)
    birdsNowLogout(driver)
}

fun run(driver: ChromeDriver) {
    for(i in 0..3) {
        runBirdsNow(driver,i)
        runAllHoobly(driver,i)
        runClassifieds(driver,i)
        runOtherNowPets(driver,i)
    }
}

fun runBirdsNow(driver: ChromeDriver, i: Int) {
    runBirdsWA(driver,i)
    runBirdsCA(driver,i)
    runBirdsAZ(driver,i)
    runBirdsFL(driver,i)
    runBirdsTX(driver,i)
    runBirdsNY(driver,i)
    runBirdsIL(driver,i)
    runBirdsPA(driver,i)
    runBirdsOH(driver,i)
    runBirdsIN(driver,i)
    runBirdsMA(driver,i)
    runBirdsDL(driver,i)
    runBirdsDC(driver,i)
    runBirdsAT(driver,i)
    runBirdsDT(driver,i)
    runBirdsPDX(driver,i)
}

fun runOtherNowPets(driver: ChromeDriver) {
    runCats(driver)
    runReps(driver)
    runDogs(driver)
}

fun runAllHoobly(driver: ChromeDriver, i: Int) {
    runHooblyWA(driver,i)
    runHooblyFL(driver,i)
    runHooblyAZ(driver,i)
    runHooblyCA(driver,i)
}