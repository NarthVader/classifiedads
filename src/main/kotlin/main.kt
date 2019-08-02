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
    println("$current $hour")

    if(hour in 10..15) {
        println("noon")
        noonBatch(driver)
    } else if (hour in 16..22) {
        println("pm")
        pmBatch(driver)
    } else {
        println("all")
        runAll(driver)
    }
    //runAll(driver)
    //viewCount(driver)
    //driver.quit()
}



fun runAll(driver: ChromeDriver) {
//    runBirdsWA(driver)
//    runBirdsCA(driver)
//    runBirdsAZ(driver)
//    runBirdsFL(driver)
//    runBirdsTX(driver)
//    runBirdsNY(driver)
//    runBirdsIL(driver)
//    runBirdsPA(driver)
//    runBirdsOH(driver)
//    runBirdsIN(driver)
//    runBirdsMA(driver)
//    runBirdsDL(driver)
    runBirdsDC(driver)
//    runCats(driver)
//    runReps(driver)
//    runDogs(driver)
//    runClassifieds(driver)
//    runHooblyWA(driver)
//    runHooblyFL(driver)
//    runHooblyAZ(driver)
//    runHooblyCA(driver)
}

fun noonBatch(driver: ChromeDriver) {
    runBirdsWANoon(driver)
    runBirdsCANoon(driver)
    runBirdsAZNoon(driver)
    runBirdsFLNoon(driver)
    runBirdsTXNoon(driver)
    runBirdsNYNoon(driver)
    runBirdsILNoon(driver)
    runBirdsPANoon(driver)
    runBirdsOHNoon(driver)
    runBirdsINNoon(driver)
    runBirdsMANoon(driver)
    runHooblyWANoon(driver)
    runHooblyFLNoon(driver)
    runHooblyAZNoon(driver)
    runHooblyCANoon(driver)
}

fun pmBatch (driver: ChromeDriver) {
    runBirdsWAPM(driver)
    runBirdsCAPM(driver)
    runBirdsAZPM(driver)
    runBirdsFLPM(driver)
    runBirdsTXPM(driver)
    runBirdsNYPM(driver)
    runBirdsILPM(driver)
    runBirdsPAPM(driver)
    runBirdsOHPM(driver)
    runBirdsINPM(driver)
    runBirdsMAPM(driver)
    runHooblyWAPM(driver)
    runHooblyFLPM(driver)
    runHooblyAZPM(driver)
    runHooblyCAPM(driver)
}
