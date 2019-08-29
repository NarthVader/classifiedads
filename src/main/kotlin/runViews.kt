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

    birdsNowLogin(driver,usrBirdsWA,pwBirdsWA)
    WAViews(driver)
}

fun runViewsCA(driver: ChromeDriver) {

    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"

    birdsNowLogin(driver,usrBirdsCA,pwBirdsCA)
    CAViews(driver)
}

fun runViewsAZ(driver: ChromeDriver) {

    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"

    birdsNowLogin(driver,usrBirdsAZ,pwBirdsAZ)
    AZViews(driver)
}

fun runViewsFL(driver: ChromeDriver) {

    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"

    birdsNowLogin(driver,usrBirdsFL,pwBirdsFL)
    FLViews(driver)
}

fun runViewsTX(driver: ChromeDriver) {

    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"

    birdsNowLogin(driver,usrBirdsTX,pwBirdsTX)
    TXViews(driver)
}

fun runViewsNY(driver: ChromeDriver) {

    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"

    birdsNowLogin(driver,usrBirdsNY,pwBirdsNY)
    NYViews(driver)
}

fun runViewsIL(driver: ChromeDriver) {

    val usrBirdsIL = "customersupportIL@thefinchfarm.com"
    val pwBirdsIL = "TFF2019!"

    birdsNowLogin(driver,usrBirdsIL,pwBirdsIL)
    ILViews(driver)
}

fun runViewsPA(driver: ChromeDriver) {

    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"

    birdsNowLogin(driver,usrBirdsPA,pwBirdsPA)
    PAViews(driver)
}

fun runViewsOH(driver: ChromeDriver) {

    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"

    birdsNowLogin(driver,usrBirdsOH,pwBirdsOH)
    OHViews(driver)
}

fun runViewsIN(driver: ChromeDriver) {

    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"

    birdsNowLogin(driver,usrBirdsIN,pwBirdsIN)
    INViews(driver)
}

fun runViewsMA(driver: ChromeDriver) {

    val usrBirdsMA = "customersupportMA@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"

    birdsNowLogin(driver,usrBirdsMA,pwBirdsMA)
    MAViews(driver)
}

fun runViewsDL(driver: ChromeDriver) {

    val usrBirdsMA = "supportdallas@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"

    birdsNowLogin(driver,usrBirdsMA,pwBirdsMA)
    DLViews(driver)
}

fun runViewsDC(driver: ChromeDriver) {

    val usrBirdsDC = "supportwashingtondc@thefinchfarm.com"
    val pwBirdsDC = "TFF2019!"

    birdsNowLogin(driver,usrBirdsDC,pwBirdsDC)
    DCViews(driver)
}

fun runViewsAT(driver: ChromeDriver) {

    val usrBirdsAT = "supportatlanta@thefinchfarm.com"
    val pwBirdsAT = "TFF2019!"

    birdsNowLogin(driver,usrBirdsAT,pwBirdsAT)
    ATViews(driver)
}

fun runViewsDT(driver: ChromeDriver) {

    val usrBirdsDT = "supportdetroit@thefinchfarm.com"
    val pwBirdsDT = "TFF2019!"

    birdsNowLogin(driver,usrBirdsDT,pwBirdsDT)
    DTViews(driver)
}

fun runViewsPDX(driver: ChromeDriver) {

    val usrBirdsPDX = "supportportland@thefinchfarm.com"
    val pwBirdsPDX = "TFF2019!"

    birdsNowLogin(driver,usrBirdsPDX,pwBirdsPDX)
    PDXViews(driver)
}

fun runViewsMIN(driver: ChromeDriver) {

    val usrBirdsMIN = "supportminneapolis@thefinchfarm.com"
    val pwBirdsMIN = "TFF2019!"

    birdsNowLogin(driver,usrBirdsMIN,pwBirdsMIN)
    MINViews(driver)
}

fun runViewsLA(driver: ChromeDriver) {

    val usrBirdsLA = "supportlosangeles@thefinchfarm.com"
    val pwBirdsLA = "TFF2019!"

    birdsNowLogin(driver,usrBirdsLA,pwBirdsLA)
    LAViews(driver)
}

fun runViewsORL(driver: ChromeDriver) {

    val usrBirdsORL = "supportorlando@thefinchfarm.com"
    val pwBirdsORL = "TFF2019!"

    birdsNowLogin(driver,usrBirdsORL,pwBirdsORL)
    ORLViews(driver)
}

fun runViewsRVR(driver: ChromeDriver) {

    val usrBirdsRVR = "supportriverside@thefinchfarm.com"
    val pwBirdsRVR = "TFF2019!"

    birdsNowLogin(driver,usrBirdsRVR,pwBirdsRVR)
    RVRViews(driver)
}

fun runViewsAUS(driver: ChromeDriver) {

    val usrBirdsAUS = "supportaustin@thefinchfarm.com"
    val pwBirdsAUS = "TFF2019!"

    birdsNowLogin(driver,usrBirdsAUS,pwBirdsAUS)
    AUSViews(driver)
}

fun runViewsLVG(driver: ChromeDriver) {

    val usrBirdsLVG = "supportlasvegas@thefinchfarm.com"
    val pwBirdsLVG = "TFF2019!"

    birdsNowLogin(driver,usrBirdsLVG,pwBirdsLVG)
    LVGViews(driver)
}

fun runViewsPITT(driver: ChromeDriver) {

    val usrBirdsPITT = "supportpittsburgh@thefinchfarm.com"
    val pwBirdsPITT = "TFF2019!"

    birdsNowLogin(driver,usrBirdsPITT,pwBirdsPITT)
    PITTViews(driver)
}

fun runViewsSAC(driver: ChromeDriver) {

    val usrBirdsSAC = "supportsacramento@thefinchfarm.com"
    val pwBirdsSAC = "TFF2019!"

    birdsNowLogin(driver,usrBirdsSAC,pwBirdsSAC)
    SACViews(driver)
}

fun runViewsCHAR(driver: ChromeDriver) {

    val usrBirdsCHAR = "supportcharlotte@thefinchfarm.com"
    val pwBirdsCHAR = "TFF2019!"

    birdsNowLogin(driver,usrBirdsCHAR,pwBirdsCHAR)
    CHARViews(driver)
}

fun runViewsSANT(driver: ChromeDriver) {

    val usrBirdsSANT = "supportsanantonio@thefinchfarm.com"
    val pwBirdsSANT = "TFF2019!"

    birdsNowLogin(driver,usrBirdsSANT,pwBirdsSANT)
    SANTViews(driver)
}

fun runViewsSAN(driver: ChromeDriver) {

    val usrBirdsSAN = "supportsandiego@thefinchfarm.com"
    val pwBirdsSAN = "TFF2019!"

    birdsNowLogin(driver,usrBirdsSAN,pwBirdsSAN)
    SANViews(driver)
}

fun runViewsBAL(driver: ChromeDriver) {

    val usrBirdsBAL = "supportbaltimore@thefinchfarm.com"
    val pwBirdsBAL = "TFF2019!"

    birdsNowLogin(driver,usrBirdsBAL,pwBirdsBAL)
    BALViews(driver)
}

fun runViewsSTL(driver: ChromeDriver) {

    val usrBirdsSTL = "supportstlouis@thefinchfarm.com"
    val pwBirdsSTL = "TFF2019!"

    birdsNowLogin(driver,usrBirdsSTL,pwBirdsSTL)
    STLViews(driver)
}

fun runViewsTMP(driver: ChromeDriver) {

    val usrBirdsTMP = "supporttampa@thefinchfarm.com"
    val pwBirdsTMP = "TFF2019!"

    birdsNowLogin(driver,usrBirdsTMP,pwBirdsTMP)
    TMPViews(driver)
}

fun runViewsDEN(driver: ChromeDriver) {

    val usrBirdsDEN = "supportdenver@thefinchfarm.com"
    val pwBirdsDEN = "TFF2019!"

    birdsNowLogin(driver,usrBirdsDEN,pwBirdsDEN)
    DENViews(driver)
}