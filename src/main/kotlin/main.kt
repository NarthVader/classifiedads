package com.pinnsights

import net.sf.cglib.core.Local
import org.openqa.selenium.*
import java.util.HashMap
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.time.LocalDateTime

var post = false
var autoLogin = ""
var autoPassword = ""

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


    //////////////////////////////////////////////////
    /////// JORDAN VALUES AND UNCOMMENT //////////////
    //////////////////////////////////////////////////

    autoLogin = "supportminneapolis@thefinchfarm.com"
    autoPassword = "TFF2019!"
    post = true

    //////////////////////////////////////////////////
    /////// JORDAN VALUES AND UNCOMMENT //////////////
    //////////////////////////////////////////////////


    if(post) {
        autoPost(driver, autoLogin, autoPassword)
    } else {
        run(driver)
    }
    //viewCount(driver)
    driver.quit()
}

fun autoPost(driver: ChromeDriver, login: String, pass: String) {
    birdsNowLogin(driver, login, pass)
    createBirds(driver)
    birdsNowLogout(driver)
}

fun run(driver: ChromeDriver) {
    val start = LocalDateTime.now()
    val startTime = (start.hour*60) + start.minute
    for(i in 0..3) {
        runBirdsNow(driver,i)
        runAllHoobly(driver,i)
        runClassifieds(driver,i)
        runOtherNowPets(driver,i)
    }
    val end = LocalDateTime.now()
    val endTime = (end.hour*60) + end.minute
    val runTime = endTime - startTime
    println(runTime)
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

fun runOtherNowPets(driver: ChromeDriver, i: Int) {
    runCats(driver,i)
    runReps(driver,i)
    runDogs(driver,i)
}

fun runAllHoobly(driver: ChromeDriver, i: Int) {
    runHooblyWA(driver,i)
    runHooblyFL(driver,i)
    runHooblyAZ(driver,i)
    runHooblyCA(driver,i)
}