package com.pinnsights

import org.openqa.selenium.*
import java.util.HashMap
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.time.LocalDateTime


fun WAViews(driver: ChromeDriver) {

    val birdsWA: IntArray = intArrayOf(520353,520364,520726,520733,520759,520833,520885,
        520950,526507,526530,527836,528305,528311,528585,528593,528595,528597,530942,
        530943,530947,531348,531349,531392,531395,534155,534157,534162,534869,534871,
        534872,535294,537300,537303,537313,537314,537315,537420,543572,543931,544252,
        544254,544385,544769,545328,545339,545475,545479,545480,545547,545597,545683,545685,
        545688,545691,545694,545738,545739,545741,545788,545791,545842,545907,545908,545945,
        545946,545947,546949,546952,547028,547111,547160,547210,547215,547217,547366,
        547409,547410,547510,547615,547616,547687,547810,547812,547814,547815,547816)

    var stateTotal = 0

    for (i in 0..birdsWA.size-1) {
        val index = birdsWA[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("WA total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}


fun CAViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsCA: IntArray = intArrayOf(
        558749,558750,558752,558753,558754,558757,558758,558759,558760,558761,558762,558763,
        549549,549550,549657,549689,
        550026,550132,550213,550215,
        550583,550585,550587,
        554834,554835,554836,554837,554838,554839,554840,554846,554847,554848,554849,554850,554842,554844,554845,554841,556355)

    var stateTotal = 0

    for (i in 0..birdsCA.size-1) {
        val index = birdsCA[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("CA total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun AZViews(driver: ChromeDriver) {

    Thread.sleep(3000)
    val birdsAZ: IntArray = intArrayOf(558832,558831,558830,558829,558819,558820,558828,558827,558826,558825,558824,558822,558821,
        550458,550511,550512,550513,550514,550515,550516,550517,550518,
        554865,554867,554868,554869,554870,554872,554873,554876,554877,554878,554880,554881,554882,554884,554885,554886,554871,554541)

    var stateTotal = 0

    for (i in 0..birdsAZ.size-1) {
        val index = birdsAZ[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("AZ total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun FLViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsFL: IntArray = intArrayOf(550466,550500,550501,550502,550503,550504,550505,550506,550508,550509,
        554664,554669,554575,554668,554670,554660,554647,554662,554654,554658,554667,554651,554661,554665,554657,554663,554666,554671,554577,
        558840,558841,558842,558853,558844,558845,558846,558847,558849,558851,558852)

    var stateTotal = 0

    for (i in 0..birdsFL.size-1) {
        val index = birdsFL[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("FL total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun TXViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsTX: IntArray = intArrayOf(558962,558964,558966,558968,558969,558970,558973,558978,558979,
        555365,555350,555346,555310,555307,555314,555337,555358,555348,555311,555327,555357,555343,555362,555312,555313,555309,555339,555354,555342,555336,555306,555360,555316,555366,555266,555351,555344,555356,555338,555353)

    var stateTotal = 0

    for (i in 0..birdsTX.size-1) {
        val index = birdsTX[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("TX total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun NYViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsNY: IntArray = intArrayOf(551369,555636,555633,550797,550527,555622,555626,555127,555635,555619,555627,555643,550605,555631,555620,555621,555617,555629,555640,555630,555624,555615,555644,550796,555616,555638,555632,555641,555628,555639,
        558989,559001,558991,558992,558993,558994,558995,559002,558996,558997)

    var stateTotal = 0

    for (i in 0..birdsNY.size-1) {
        val index = birdsNY[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("NY total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun ILViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsIL: IntArray = intArrayOf(555468,555763,555761,555466,555479,555476,555647,555769,555762,555467,555768,555469,555759,555474,555475,555461,555650,555766,555758,555646,555453,555770,555477,555771,555393,555764,555760,555767,555649,555765,
        559016,559003,559004,559006,559007,559008,559009,559010,559011,559013)

    var stateTotal = 0

    for (i in 0..birdsIL.size-1) {
        val index = birdsIL[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("IL total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun PAViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsPA: IntArray = intArrayOf(555861,555890,555888,555859,555867,555865,555880,555898,555903,555860,555877,555897,555886,555901,555862,555864,555858,
        555882,555894,555883,555879,555857,555900,555866,555902,555781,555891,555887,555895,555881,555893,555889,
        559073,559074,559076,559088,559089,559090,559092,559093)

    var stateTotal = 0

    for (i in 0..birdsPA.size-1) {
        val index = birdsPA[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("PA total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun OHViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsOH: IntArray = intArrayOf(558297,558502,558299,558300,558499,558504,558497,558301,558303,558303,558306,558307,558311,
        558308,558309,558310,558501,558505,558493,558312,558313,558314,558315,558503,558316,558317,558318,558319,558321,558492,558324,558508,
        558325,558326,556209,558328,558329,558330,558331,558332)

    var stateTotal = 0

    for (i in 0..birdsOH.size-1) {
        val index = birdsOH[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("OH total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun INViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsIN: IntArray = intArrayOf(558546,558547,558548,558549,558550,558551,558552,558553,558554,558555,558556,558557,558558,558559,558560,558561,
        558562,558563,558565,558566,558567,558568,558569,558570,558571,558573,558575,558576,558577,558578,558579,558580,558582,558583,556208,558584,
        558585,558586,558588,558589)

    var stateTotal = 0

    for (i in 0..birdsIN.size-1) {
        val index = birdsIN[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("IN total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun MAViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsMA: IntArray = intArrayOf(556314,556312,556313,556315,556311,556207,558645,558646,558647,558648,558650,558651,558653,558655,558656,558657,558658,
        558738,558739,558740,558742,558743,558745,558746,558720,558721,558722,558723,558724,558725,558726,558727,558728,558730,558731,558732,558733,558734,
        558735,558736)

    var stateTotal = 0

    for (i in 0..birdsMA.size-1) {
        val index = birdsMA[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("MA total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun DLViews(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsDL: IntArray = intArrayOf(558717,559094,559095,559096,559097,559098,559099,559100,559101,559102,559103,559104,559105,559106,559107,559108,
        559109,559110,559111,559112,559113,559114,559115,559116,559117,559118,559119,559120,559121,559122,559123,559124,559125,559126,559127,559128,559129,
        559130,559131,559132)

    var stateTotal = 0

    for (i in 0..birdsDL.size-1) {
        val index = birdsDL[i]
        driver.get("https://www.birdsnow.com/bird-ad-$index")

        val parent = driver.findElement(By.xpath("//li[.//b[text()='Number of Views:']]"))
        val ptext = parent.text
        val length = ptext.length
        var substring = ptext.substring(17,length)
        val re = Regex("[^A-Za-z0-9 ]")
        substring = re.replace(substring, "")
        stateTotal += substring.toInt()
        Thread.sleep(3000)
    }

    println("DL total views: $stateTotal")
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}


