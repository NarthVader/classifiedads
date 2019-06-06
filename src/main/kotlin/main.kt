package com.pinnsights

import org.openqa.selenium.*
import java.util.HashMap
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities


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

    runBirdsWA(driver)
    runBirdsCA(driver)
    runBirdsAZ(driver)
    runBirdsFL(driver)
    runBirdsTX(driver)
    runBirdsNY(driver)
    runBirdsIL(driver)
    runCats(driver)
    runReps(driver)
    runDogs(driver)
    runClassifieds(driver)
    runHooblyWA(driver)
    runHooblyFL(driver)
    runHooblyAZ(driver)
    runHooblyCA(driver)
}

fun runBirdsWA(driver: ChromeDriver) {
    
    val usrBirdsWA = "customersupport@thefinchfarm.com"
    val pwBirdsWA = "TFF2020!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsWA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsWA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowWA(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowWA(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runBirdsCA(driver: ChromeDriver) {

    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsCA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsCA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowCA(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowCA(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runBirdsAZ(driver: ChromeDriver) {

    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsAZ")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsAZ")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowAZ(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowAZ(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runBirdsFL(driver: ChromeDriver) {

    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsFL")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsFL")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowFL(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowFL(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runBirdsTX(driver: ChromeDriver) {

    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsTX")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsTX")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowTX(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowWA(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runBirdsNY(driver: ChromeDriver) {

    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsNY")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsNY")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowNY(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowWA(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runBirdsIL(driver: ChromeDriver) {

    val usrBirdsIL = "TFFsavvypetsIL@gmail.com"
    val pwBirdsIL = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsIL")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsIL")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowIL(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowWA(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runCats(driver: ChromeDriver) {

    val usrCats = "support@thefinchfarm.zendesk.com"
    val pwCats = "Catterydirectory2018!"
    try {
        driver.get("https://www.catsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrCats")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwCats")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        catsNow(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        catsNow(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runReps(driver: ChromeDriver) {

    val usrRep = "customersupport@thefinchfarm.com"
    val pwRep = "Reptiledirectory2018!"
    try {
        driver.get("https://www.reptilesnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrRep")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwRep")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        repsNow(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowFL(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runDogs(driver: ChromeDriver) {

    val usrDog = "customersupport@thefinchfarm.com"
    val pwDog = "Dogdelight2019!"
    try {
        driver.get("https://www.dogsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrDog")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwDog")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        dogsNow(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowFL(driver)
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
        birdsNowFL(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyWA(driver: ChromeDriver) {

    val usrHooblyWA = "customersupport@thefinchfarm.com"
    val pwHooblyWA = "Marketing2019!"
    try {
        driver.get("https://www.hoobly.com/")
        driver.findElement(By.xpath("//a[@href='/c/login']")).click()
        driver.get("https://www.hoobly.com/c/login")
        Thread.sleep(1000)
        driver.findElement(By.id("email")).sendKeys("$usrHooblyWA")
        driver.findElement(By.id("pass")).sendKeys("$pwHooblyWA")
        driver.findElement(By.xpath("//button[@type='submit']")).click()
        Thread.sleep(1000)
        hooblyWA(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowFL(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyFL(driver: ChromeDriver) {

    val usrHooblyFL = "customersupportFL@thefinchfarm.com"
    val pwHooblyFL = "TFFFL2019!"
    try {
        driver.get("https://www.hoobly.com/")
        driver.findElement(By.xpath("//a[@href='/c/login']")).click()
        driver.get("https://www.hoobly.com/c/login")
        Thread.sleep(1000)
        driver.findElement(By.id("email")).sendKeys("$usrHooblyFL")
        driver.findElement(By.id("pass")).sendKeys("$pwHooblyFL")
        driver.findElement(By.xpath("//button[@type='submit']")).click()
        Thread.sleep(1000)
        hooblyFL(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowFL(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyAZ(driver: ChromeDriver) {

    val usrHooblyAZ = "customersupportAZ@thefinchfarm.com"
    val pwHooblyAZ = "TFFAZ2019!"
    try {
        driver.get("https://www.hoobly.com/")
        driver.findElement(By.xpath("//a[@href='/c/login']")).click()
        driver.get("https://www.hoobly.com/c/login")
        Thread.sleep(1000)
        driver.findElement(By.id("email")).sendKeys("$usrHooblyAZ")
        driver.findElement(By.id("pass")).sendKeys("$pwHooblyAZ")
        driver.findElement(By.xpath("//button[@type='submit']")).click()
        Thread.sleep(1000)
        hooblyAZ(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowFL(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyCA(driver: ChromeDriver) {

    val usrHooblyCA = "customersupportCA@thefinchfarm.com"
    val pwHooblyCA = "TFFC3522!"
    try {
        driver.get("https://www.hoobly.com/")
        driver.findElement(By.xpath("//a[@href='/c/login']")).click()
        driver.get("https://www.hoobly.com/c/login")
        Thread.sleep(1000)
        driver.findElement(By.id("email")).sendKeys("$usrHooblyCA")
        driver.findElement(By.id("pass")).sendKeys("$pwHooblyCA")
        driver.findElement(By.xpath("//button[@type='submit']")).click()
        Thread.sleep(1000)
        hooblyCA(driver)
        driver.quit()
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowFL(driver)
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun birdsNowWA(driver: ChromeDriver) {

    Thread.sleep(1000)
    val birdsWA: IntArray = intArrayOf(520353,520364,520726,520733,520759,520833,520885,
        520950,526507,526530,527836,528305,528311,528585,528593,528595,528597,530942,
        530943,530947,531347,531348,531349,531392,531395,534155,534157,534162,534869,534871,
        534872,535294,537300,537303,537313,537314,537315,537420,543572,543931,544252,
        544254,544385,544769,545328,545339,545475,545479,545480,545547,545597,545683,545685,
        545688,545691,545694,545738,545739,545741,545788,545791,545842,545907,545908,545945,
        545946,545947,546949,546952,547028,547111,547160,547210,547215,547217,547366,
        547409,547410,547510,547615,547616,547687,547810,547812,547814,547815,547816)
    println("birdNowWA: " + birdsWA.size)

    for (i in 0..birdsWA.size-1) {
        val index = birdsWA[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowCA(driver: ChromeDriver) {

    Thread.sleep(3000)
    val birdsCA: IntArray = intArrayOf(549547,549549,549550,549657,549688,549689,549794,549795,
        549797,549847,549848,549849,549850,550026,550132,550213,550214,550215,550216,550217,550218,
        550583,550585,550587,550589,
        554834,554835,554836,554837,554838,554839,554840,554843,554846,554847,554848,554849,554850,554842,554844,554845,554841 )
    println("birdNowCA: " + birdsCA.size)

    for (i in 0..birdsCA.size-1) {
        val index = birdsCA[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowAZ(driver: ChromeDriver) {

    Thread.sleep(3000)
    val birdsAZ: IntArray = intArrayOf(550458,550511,550512,550513,550514,550515,550516,550517,550518,550519,
    554860,554865,554867,554868,554869,554870,554872,554873,554875,554876,554877,554878,554880,554881,554882,554884,554885,554886,554871,554541)
    println("birdNowAZ: " + birdsAZ.size)

    for (i in 0..birdsAZ.size-1) {
        val index = birdsAZ[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowFL(driver: ChromeDriver) {

    Thread.sleep(3000)
    val birdsFL: IntArray = intArrayOf(550466,550500,550501,550502,550503,550504,550505,550506,550508,550509,
        554664,554669,554575,554668,554670,554660,554647,554662,554654,554658,554667,554651,554661,554665,554657,554663,554666,554671,554577)
    println("birdNowFL: " + birdsFL.size)

    for (i in 0..birdsFL.size-1) {
        val index = birdsFL[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowTX(driver: ChromeDriver) {

    Thread.sleep(3000)
    val birdsTX: IntArray = intArrayOf(555365,555350,555346,555310,555307,555314,555337,555358,555348,555311,555327,555357,555343,555362,555312,555313,555309,555339,555354,555342,555336,555306,555360,555316,555366,555266,555351,555344,555356,555338,555353)
    println("birdNowTX: " + birdsTX.size)

    for (i in 0..birdsTX.size-1) {
        val index = birdsTX[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowNY(driver: ChromeDriver) {

    Thread.sleep(3000)
    val birdsNY: IntArray = intArrayOf(551369,555636,555633,550797,550527,555622,555626,555127,555635,555619,555627,555643,550605,555631,555620,550563,555621,555617,555629,555640,555630,555624,555615,555644,550796,555616,555638,555632,555641,555628,555639)
    println("birdNowNY: " + birdsNY.size)

    for (i in 0..birdsNY.size-1) {
        val index = birdsNY[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowIL(driver: ChromeDriver) {

    Thread.sleep(3000)
    val birdsIL: IntArray = intArrayOf(555468,555763,555761,555466,555479,555476,555647,555769,555762,555467,555768,555469,555759,555474,555475,555461,555650,555766,555758,555646,555453,555770,555477,555771,555393,555764,555760,555767,555649,555765)
    println("birdNowIL: " + birdsIL.size)

    for (i in 0..birdsIL.size-1) {
        val index = birdsIL[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun catsNow(driver: ChromeDriver) {

    Thread.sleep(3000)

    val cats: IntArray = intArrayOf(2752,2753,2755,2757,2758,2759,2762,2763,2764,2765,2743,2767,2768,2775,2776,2777,2778,2779,2780)
    println("Cats Now: " + cats.size)

    for (i in 0..cats.size-1) {
        val index = cats[i]
        println("$i: " + index)
        driver.get("https://www.catsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.catsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun repsNow(driver: ChromeDriver) {

    Thread.sleep(3000)
    val reps: IntArray = intArrayOf(2405,2414,2415,2417,2418)
    println("Reps Now: " + reps.size)

    for (i in 0..reps.size-1) {
        val index = reps[i]
        println("$i: " + index)
        driver.get("http://www.reptilesnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.reptilesnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun dogsNow(driver: ChromeDriver) {

    Thread.sleep(3000)
    val dogs: IntArray = intArrayOf(240926,240929,240948,241035,241243,241363,241501,241508,
        241509,242112,242113,242114,242115,242118,242125,242126,242127,242190,242192,242195,
        242198,242201,242202,242208,242215,242218)
    println("Dogs Now: " + dogs.size)

    for (i in 0..dogs.size-1) {
        val index = dogs[i]
        println("$i: " + index)
        driver.get("https://www.dogsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.dogsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun adNow(driver: ChromeDriver) {

    Thread.sleep(1000)
    val ads: IntArray = intArrayOf(397197125,397197113,397197102,397197092,397197053,397197032,397196974,397196827,397196756,397195310,
        397194603,397193879,397193105,397186141,397183052,397182155,397178276,397176702,397172981,397172774,
        397171976,397171800,397171733,397171451,397170645,397170535,397170495,397170418,397170376,397170347,
        397170260,397170235,397166957,397166944,397166903,397166880,397166870,397166795,397166704,397166666,
        397166594,397166425,397166391,397166330,397166106,397166020,397165937,397165902,397165880,397165854,
        397165833,397165795,397165729,397165343,397165083,397164240,397093540,397093362,397093211,397092452,
        397090880,397085122,397083070,397082402,397076910,397076856,397076738,397076672,397076650,397076567,
        397008070,397008065,397008015,397007824,397006559,397006447,397005567,397004780,397004073,397002664,
        397002127,397001944,397000537,397000107,396814544,396814536,396814507,396814476,396814371,396814315,
        396814111,396814067,396813857,396813614,396813226,396812965,396812476,396810382,396809461,396807445,
        396376880,396375897,396375595,396372032,396371956,396368091,396367728,396367414,396367069,396366810,
        396366620,396366259,396365187,396365096,396365027,396364816,396364743,396364657,396364417,396364246,
        396347633,396347270,396347097,396344011,396343761,396342737,396339571,396339228,396338887,396335656,
        396335629,396219446,396217715,396215856,396214620,396211257,396210332,396208563,396205687,396205229,
        396204875,396202659,396202193,396200710,396199217,396197610,396197019,396195566,396193584,396190408,
        396187912,396187766,396187615,396181326,396170373,396169149,396168125,396165459,396164494,396150600,
        396150454,395817366)
    
    println("Ads Now: " + ads.size)

    for (i in 0..ads.size-1) {
        val index = ads[i]
        println("$i: " + index)
        driver.get("https://www.classifiedads.com/post.php?$index")
        driver.findElement(By.xpath("//a[@class='flat']")).click()
        Thread.sleep(1000)
    }
    driver.findElement(By.xpath("//a[@class='nomob']")).click()
    Thread.sleep(1000)
}

fun hooblyWA(driver: ChromeDriver) {

    Thread.sleep(3000)
    //var hoobly: Array<String> = arrayOf("SSN4Y", "NiOVp", "CBCva", "BkYaN", "9P2B8", "5WYMC", "0Hfpa", "15L9N", "AR7Yv") "ZepT3", "ZaAVE", "Ygkpx", "XaVLW", "U5ORI", "U3Kyk", "T9KD9", "Rz06f", "RnbXy", "RXjWL", "RM2kj", "RJLxf", "R3nUg", "Qqxm3", "PWkea", "PMcnn", "P8kMO",
    //        "hy9kk", "gYj0h", "gEQad", "g3nhg", "fzDzw", "f3z17", "eUjxw", "eReTB", "eNlme", "daEMf", "i6yGN", "izqAl", "dRJ3Y", "nyuye", "o1mAh", "oJa97", "aeHhe", "bP4MD", "jCibI", "jadVB",
    //        "cGidH", "coQC7", "dJNJx", "nmelX", "nahn0", "b1eCk", "0amSa", "0c8TU", "1Zc33", "QE0y1", "0xfS6", "0dFbB", "ClTO6", "ujbPf", "jt9po", "CBCva", "BkYaN", "jw56S", "kGcVb", "kO0eK",
    //        "kkOQ4", "zgepf", "lIaFU", "uiP0f", "uhaOR", "tc3Vn", "u6QmP", "sG58K", "sFZNZ", "s5hIl", "rcUay", "r8RU7", "qObVq", "SSN4Y", "pgYmL", "pnKZI", "oPSz3", "pV23g", "phD99", "pmO3W",
    //        "poBgK", "r0IrO", "r58ZR", "zcNGO", "zUEcA", "xKnWG", "wrMJA", "wYGKz", "vXqoa", "vS98U", "vLHQF", "vKVeh", "vH0Yt", "ZkrnR", "a0H8V", "aI8Wo", "NiOVp", "5WYMC", "0Hfpa", "15L9N",
    //        "AR7Yv", "9P2B8", "ukKbe", "OSEqM", "MVH2g", "MG8Ci", "LsUpg", "L6vGo", "Ky3Hi", "Kmz5O", "Kgswo", "KTFZ9", "KNEXh", "HY7My", "HZp6H", "HfnD5", "Hht47", "IO2tD", "IvLtb", "JGmTG",
    //        "JJYf0", "JgKKb", "JigqQ", "Grndr", "GYab0", "GXtS0", "Fl1ZI", "FCzWC", "F6fK6", "EJjSz", "DQN8y", "DBvqv", "CmeqH", "AccBa", "AgAwK", "AgM9W", "AkcrL", "Awal6", "BCbAQ", "BKEZK",
    //        "CHS03", "CWfgP", "Cj53A", "AL1F5", "7yRTf", "7wgmN", "7NNAG", "72ae9", "6Y6yS", "5relL", "5lxlC", "5RTkg", "4iTm6", "BjUZX", "Cocby", "hl1tt", "1NW2v", "1iva6", "28ADk", "2fapx",
    //        "2gqrs", "2uESV"
    var hoobly: Array<String> = arrayOf("2uESV", "2gqrs", "2fapx", "28ADk", "1iva6", "1NW2v", "hl1tt", "Cocby", "BjUZX", "4iTm6",
        "5RTkg", "5lxlC", "5relL", "6Y6yS", "72ae9", "7NNAG", "7wgmN", "7yRTf", "AL1F5", "Cj53A",
        "CWfgP", "CHS03", "BKEZK", "BCbAQ", "Awal6", "AkcrL", "AgM9W", "AgAwK", "AccBa", "CmeqH",
        "DBvqv", "DQN8y", "EJjSz", "F6fK6", "FCzWC", "Fl1ZI", "GXtS0", "GYab0", "Grndr", "JigqQ",
        "JgKKb", "JJYf0", "JGmTG", "Hht47", "IvLtb", "IO2tD", "HfnD5", "HZp6H", "HY7My", "KNEXh",
        "KTFZ9", "Kgswo", "Kmz5O", "Ky3Hi", "L6vGo", "LsUpg", "MG8Ci", "MVH2g", "OSEqM", "ukKbe",
        "9P2B8", "AR7Yv", "15L9N", "0Hfpa", "5WYMC", "NiOVp", "aI8Wo", "a0H8V", "ZkrnR", "vH0Yt",
        "vKVeh", "vLHQF", "vS98U", "vXqoa", "wYGKz", "wrMJA", "xKnWG", "zUEcA", "zcNGO", "r58ZR",
        "r0IrO", "poBgK", "pmO3W", "phD99", "pV23g", "oPSz3", "pnKZI", "pgYmL", "SSN4Y", "qObVq",
        "r8RU7", "rcUay", "s5hIl", "sFZNZ", "sG58K", "u6QmP", "tc3Vn", "uhaOR", "uiP0f", "lIaFU",
        "zgepf", "kkOQ4", "kO0eK", "kGcVb", "jw56S", "BkYaN", "CBCva", "jt9po", "ujbPf", "ClTO6",
        "0dFbB", "0xfS6", "QE0y1", "1Zc33", "0c8TU", "0amSa", "b1eCk", "nahn0", "nmelX", "dJNJx",
        "coQC7", "cGidH", "jadVB", "jCibI", "bP4MD", "aeHhe", "oJa97", "o1mAh", "nyuye", "dRJ3Y",
        "izqAl", "i6yGN", "daEMf", "eNlme", "eReTB", "eUjxw", "f3z17", "fzDzw", "g3nhg", "gEQad",
        "gYj0h", "hy9kk", "P8kMO", "PMcnn", "PWkea", "Qqxm3", "R3nUg", "RJLxf", "RM2kj", "RXjWL",
        "RnbXy", "Rz06f", "T9KD9", "U3Kyk", "U5ORI", "Ygkpx", "ZaAVE", "ZepT3", "vjc07", "ta5kK",
        "xDttY", "DnbOS", "GaoJt", "6uYcK", "IUadk", "2NAa1", "6Q3Vh", "6qGm2", "JMQws", "CmPz2",
        "MdUHa", "FZ0Bm", "NaN0H", "QOZH1", "WiYEc", "aVw9O", "dYrD6", "eD3Rn", "Uhi55", "eeDAL",
        "gfYMc", "hd8r6", "ioG8G", "k4N5C", "ltc2x", "lwUzY", "pncBM", "vKclC")

    println("hooblyWA: " + hoobly.size)

    for (i in 0..hoobly.size-1) {
        val index = hoobly[i]
        println("$i: " + index)
        driver.get("https://www.hoobly.com/c/listing?id=$index")
        Thread.sleep(1000)
        driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.RETURN)
        Thread.sleep(1000)
    }
    driver.findElement(By.xpath("//a[@href='/c/logout']")).click()
    Thread.sleep(3000)
}

fun hooblyFL(driver: ChromeDriver) {

    Thread.sleep(3000)
    //"pmyId", "yjTX8", "V1oBv", "2S3vr", "09Cp6", "3l65y", "9arAy", "cRCAz", "jwUjw"
    var hoobly: Array<String> = arrayOf("FPlAs", "kF6lh", "l6eEy", "flTwp", "cmdyr", "l89k5", "tewX5", "G05ly", "pi99M", "ohKgb",
        "nuhMi", "xyfiT", "CUMch", "n4Bnq", "Nc20R", "zOdc6", "BbiCS", "zeq08", "AHedI", "SQksa",
        "7cQR8", "zXLd6", "feg87", "7rtFO", "G5fcU", "MDZ3d", "gsqLh", "fkLjz")
    println("hooblyFL: " + hoobly.size)

    for (i in 0..hoobly.size-1) {
        val index = hoobly[i]
        println("$i: " + index)
        driver.get("https://www.hoobly.com/c/listing?id=$index")
        Thread.sleep(1000)
        driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.RETURN)
        Thread.sleep(1000)
    }
    driver.findElement(By.xpath("//a[@href='/c/logout']")).click()
    Thread.sleep(3000)
}

fun hooblyAZ(driver: ChromeDriver) {

    Thread.sleep(3000)
    //"l5kQ9", "YcDSD", "sGt44", "ho8n7", "aj1tV", "V5p2R", "wTuOm", "gIdvV", "VUDlt"
    var hoobly: Array<String> = arrayOf("7MrjN", "h6POZ", "hoOxg", "ZNq1T", "69WA0", "SmQhH", "yK5Ro", "9mZKz", "C4wcl", "jpSrh",
        "1WOeY", "2FPED", "DLZ32", "vG7af", "E9OY6", "aNDSk", "ffcG4", "1jcUq", "YPQyK", "egumo",
        "xfSlP", "nWZFV", "ozVSI", "mOose", "HhzPl", "6LgSS", "aHfQm", "QwvUF", "C1xCa", "h6POZ", "hV5if")
    println("hooblyAZ: " + hoobly.size)

    for (i in 0..hoobly.size-1) {
        val index = hoobly[i]
        println("$i: " + index)
        Thread.sleep(1000)
        driver.get("https://www.hoobly.com/c/listing?id=$index")
        Thread.sleep(1000)
        driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.RETURN)
        Thread.sleep(1000)
    }
    driver.findElement(By.xpath("//a[@href='/c/logout']")).click()
    Thread.sleep(3000)
}

fun hooblyCA(driver: ChromeDriver) {

    Thread.sleep(3000)
    //"CFCBe", "9eMkb", "iaDmn", "YFSFe", "uIvlf", "bC0sv", "a1NGG", "DHcvX", "kfeGx"
    var hoobly: Array<String> = arrayOf("lwO0b", "uEhZb", "kfeGx", "DHcvX", "a1NGG", "bC0sv", "uIvlf", "YFSFe", "iaDmn", "9eMkb",
        "CFCBe", "RVEsv", "JpXqh", "77Ec1", "UXvup", "miryH", "z2xXB", "znNNe", "TJ8DM", "Jmj6h",
        "uRHMp", "a83tI", "AFn8c", "G1H7C", "eqIaw", "2B7y0", "4yg3N", "2HrtL", "KNbQg", "45bRF",
        "N9cro", "ZSNbM", "RKSUg", "ITYhd")
    println("hooblyCA: " + hoobly.size)

    for (i in 0..hoobly.size-1) {
        val index = hoobly[i]
        println("$i: " + index)
        Thread.sleep(1000)
        driver.get("https://www.hoobly.com/c/listing?id=$index")
        Thread.sleep(1000)
        driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.RETURN)
        Thread.sleep(1000)
    }
    driver.findElement(By.xpath("//a[@href='/c/logout']")).click()
    Thread.sleep(3000)
}