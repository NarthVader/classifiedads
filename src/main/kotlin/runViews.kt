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

fun runViewsNASH(driver: ChromeDriver) {
    val usrBirdsNASH = "supportnashville@thefinchfarm.com"
    val pwBirdsNASH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsNASH,pwBirdsNASH)
    NASHViews(driver)
}

fun runViewsOKC(driver: ChromeDriver) {
    val usrBirdsOKC = "supportoklahomacity@thefinchfarm.com"
    val pwBirdsOKC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsOKC,pwBirdsOKC)
    OKCViews(driver)
}

fun runViewsMIL(driver: ChromeDriver) {
    val usrBirdsMIL = "supportmilwaukee@thefinchfarm.com"
    val pwBirdsMIL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMIL,pwBirdsMIL)
    MILViews(driver)
}

fun runViewsPRO(driver: ChromeDriver) {
    val usrBirdsPRO = "supportprovidence@thefinchfarm.com"
    val pwBirdsPRO = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPRO,pwBirdsPRO)
    PROViews(driver)
}

fun runViewsVIR(driver: ChromeDriver) {
    val usrBirdsVIR = "supportvirginia@thefinchfarm.com"
    val pwBirdsVIR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsVIR,pwBirdsVIR)
    VIRViews(driver)
}

fun runViewsRICH(driver: ChromeDriver) {
    val usrBirdsRICH = "supportrichmond@thefinchfarm.com"
    val pwBirdsRICH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsRICH,pwBirdsRICH)
    RICHViews(driver)
}

fun runViewsRAL(driver: ChromeDriver) {
    val usrBirdsRAL = "supportraleigh@thefinchfarm.com"
    val pwBirdsRAL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsRAL,pwBirdsRAL)
    RALViews(driver)
}

fun runViewsMEM(driver: ChromeDriver) {
    val usrBirdsMEM = "supportmemphis@thefinchfarm.com"
    val pwBirdsMEM = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMEM,pwBirdsMEM)
    MEMViews(driver)
}

fun runViewsSLC(driver: ChromeDriver) {
    val usrBirdsSLC = "supportsaltlake@thefinchfarm.com"
    val pwBirdsSLC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSLC,pwBirdsSLC)
    SLCViews(driver)
}

fun runViewsNO(driver: ChromeDriver) {
    val usrBirdsNO = "supportneworleans@thefinchfarm.com"
    val pwBirdsNO = "TFF2019!"
    birdsNowLogin(driver,usrBirdsNO,pwBirdsNO)
    NOViews(driver)
}

fun runViewsLOU(driver: ChromeDriver) {
    val usrBirdsLOU = "supportlouisville@thefinchfarm.com"
    val pwBirdsLOU = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLOU,pwBirdsLOU)
    LOUViews(driver)
}

fun runViewsJACK(driver: ChromeDriver) {
    val usrBirdsJACK = "supportjacksonville@thefinchfarm.com"
    val pwBirdsJACK = "TFF2019!"
    birdsNowLogin(driver,usrBirdsJACK,pwBirdsJACK)
    JACKViews(driver)
}

fun runViewsCLV(driver: ChromeDriver) {
    val usrBirdsCLV = "supportcleveland@thefinchfarm.com"
    val pwBirdsCLV = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCLV,pwBirdsCLV)
    CLVViews(driver)
}

fun runViewsCOL(driver: ChromeDriver) {
    val usrBirdsCOL = "supportcolumbus@thefinchfarm.com"
    val pwBirdsCOL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCOL,pwBirdsCOL)
    COLViews(driver)
}

fun runViewsBUF(driver: ChromeDriver) {
    val usrBirdsBUF = "supportbuffalo@thefinchfarm.com"
    val pwBirdsBUF = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBUF,pwBirdsBUF)
    BUFViews(driver)
}

fun runViewsSJ(driver: ChromeDriver) {
    val usrBirdsSJ = "supportsanjose@thefinchfarm.com"
    val pwBirdsSJ = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSJ,pwBirdsSJ)
    SJViews(driver)
}

fun runViewsHAR(driver: ChromeDriver) {
    val usrBirdsHAR = "supporthartford@thefinchfarm.com"
    val pwBirdsHAR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsHAR,pwBirdsHAR)
    HARViews(driver)
}

fun runViewsBIR(driver: ChromeDriver) {
    val usrBirdsBIR = "supportbirmingham@thefinchfarm.com"
    val pwBirdsBIR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBIR,pwBirdsBIR)
    BIRViews(driver)
}

fun runViewsKAN(driver: ChromeDriver) {
    val usrBirdsKAN = "supportkansas@thefinchfarm.com"
    val pwBirdsKAN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsKAN,pwBirdsKAN)
    KANViews(driver)
}
