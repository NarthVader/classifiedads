package com.pinnsights

import org.openqa.selenium.*
import java.util.HashMap
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.time.LocalDateTime

val singleAlphaBC:HashMap<Int,String> = hashMapOf(594 to "African Grey Parrots", 298 to "African Ring-necked Parakeets",220 to "Black-bellied Firefinch",
    1257 to "Black Headed Caique", 1171 to "Blue and Gold Macaw",132 to "Blue-faced Parrotfinch",216 to "Blue Billed Firefinch",460 to "Budgies - (Budgerigar Parakeets) - Blue",
    778 to "Blue Indian Ringneck Parakeet", 597 to "Blue Quaker Parrot (Monk Parakeet)",572 to "Bourke Parakeets - Rubino",439 to "Bourke's Parrot",
    457 to "Budgerigar Parakeets (Budgies) - Green",469 to "Budgies - (Budgerigar Parakeets) - Pied", 553 to "Budgies - (Budgerigar Parakeets) - Violet",
    478 to "Budgies - (Budgerigar Parakeets) - Yellow",483 to "Budgies - (Budgerigar Parakeets) - White",479 to "Canary - Fife Fancy",156 to "Crested Canaries",
    269 to "Canary-Winged Parakeets",458 to "Cockatiel",609 to "Cockatiel - Albino",571 to "Cockatiel - Cinnamon",557 to "Cockatiel - Lutino",459 to "Cockatiel - Pied",
    570 to "Cockatiel - Pearl", 525 to "Cockatiel - White-faced", 83 to "Combassou Finch",540 to "Conure - Jenday (Jandaya Parakeet)",546 to "Conure - Pineapple Green-Cheeked",
    647 to "Conure - NanSun", 541 to "Conure - Sun",419 to "Conure - Yellow-sided Green Cheek", 84 to "Cut-Throat Finch",638 to "Dusky-headed Conure", 797 to "Eclectus",
    104 to "Euro Society Finch - Varied Colors",791 to "Fawn Diamond Firetail", 783 to "Fiery Golden Mantle", 479 to "Canary - Fife Fancy",133 to "Forbes Parrotfinch",260 to "Frill Canary - Northern Dutch",
    87 to "Gold Breasted Waxbill",527 to "Gold Capped Conure", 795 to "Goffin's Cockatoo", 539 to "Green Canary",1157 to "Green Cheek Conure Normal",777 to "Green Indian Ringneck Parakeet",
    89 to "Green Singer (Yellow fronted canary)", 776 to "Grey Indian Ringneck Parakeet",751 to "Iranian Highflying Tumbler", 256 to "Kakariki (Red Crowned Parakeet)",
    742 to "Kakariki (Red Crowned Parakeet) - Pied", 804 to "Kakarikis Cinnamon Parakeet",250 to "Lady Gouldian Finch - Yellow-back",252 to "Lady Gouldian Finch - Blue-back",
    144 to "Lady Gouldian Green Back Normal", 96 to "Lavender Waxbill",263 to "Lizard Canary", 435 to "Lovebirds - Black Masked",477 to "Lovebirds - Blue Masked",
    528 to "Lovebirds - Blue Peach-faced", 423 to "Lovebirds - Fischer's",274 to "Lovebirds - Peach-faced", 1161 to "Lutino Indian Ringneck Parakeet",143 to "Mosaic Canary",
    109 to "Orange Crown Weaver (Red Bishop)", 120 to "Owl Finch",604 to "Parrotlet - Blue",606 to "Parrotlet - Green", 608 to "Parrotlet - Pied",273 to "Pied Parrotfinch",
    116 to "Pied Zebra Finch", 456 to "Quaker Parrot (Monk Parakeet)",86 to "Red-Billed Firefinch", 131 to "Red-faced Parrotfinch",820 to "Red Agate Canary",
    81 to "Red Cheeked Cordon Bleu Finch", 142 to "Red Factor Canary",810 to "Regent (Rock Pebbler) Parrot",284 to "Ring-necked Dove - White",441 to "Rosy Bourke's Parakeets",
    823 to "Scarlet Macaw", 771 to "Scarlet-chested Parakeet",264 to "Scotch Fancy Canary",210 to "Seagreen Parrotfinch",821 to "Swainsons Lories",637 to "Tambourine Doves",
    800 to "Thick-billed Green Pigeon", 1156 to "Umbrella Cockatoo",141 to "Variegated Canary",442 to "Violet Eared Waxbill Finch - Pairs",1250 to "Violet Indian Ringneck",
    1258 to "White Bellied Caique",
    139 to "White Canary", 786 to "White Crested Canary",569 to "Whiteface Pearl Cockatiel", 257 to "Yellow Canary",
    110 to "Yellow Crown Weaver (Bishop)", 803 to "Yellow Fischer's Lovebird",801 to "Zebra Doves",114 to "Zebra Finch - Chestnut Flanked White",115 to "Zebra Finch - Normal")

val bigCommerce: HashMap<Int,String> = hashMapOf(594 to "African Grey Parrots", 298 to "African Ring-necked Parakeets", 220 to "Black-bellied Firefinch", 1257 to "Black Headed Caique",
    1171 to "Blue and Gold Macaw", 132 to "Blue-faced Parrotfinch", 216 to "Blue Billed Firefinch", 460 to "Budgies - (Budgerigar Parakeets) - Blue", 778 to "Blue Indian Ringneck Parakeet",
    597 to "Blue Quaker Parrot (Monk Parakeet)", 572 to "Bourke Parakeets - Rubino", 439 to "Bourke's Parrot", 457 to "Budgerigar Parakeets (Budgies) - Green", 469 to "Budgies - (Budgerigar Parakeets) - Pied",
    553 to "Budgies - (Budgerigar Parakeets) - Violet", 478 to "Budgies - (Budgerigar Parakeets) - Yellow", 483 to "Budgies - (Budgerigar Parakeets) - White",
    269 to "Canary-Winged Parakeets", 458 to "Cockatiel", 571 to "Cockatiel - Cinnamon", 557 to "Cockatiel - Lutino", 459 to "Cockatiel - Pied", 525 to "Cockatiel - White-faced",
    83 to "Combassou Finch", 540 to "Conure - Jenday (Jandaya Parakeet)", 541 to "Conure - Sun", 419 to "Conure - Yellow-sided Green Cheek", 84 to "Cut-Throat Finch", 638 to "Dusky-headed Conure",
    797 to "Eclectus", 104 to "Euro Society Finch - Varied Colors", 791 to "Fawn Diamond Firetail", 479 to "Canary - Fife Fancy", 133 to "Forbes Parrotfinch", 260 to "Frill Canary - Northern Dutch",
    87 to "Gold Breasted Waxbill", 527 to "Gold Capped Conure", 1157 to "Green Cheek Conure Normal", 777 to "Green Indian Ringneck Parakeet", 751 to "Iranian Highflying Tumbler",
    256 to "Kakariki (Red Crowned Parakeet)", 742 to "Kakariki (Red Crowned Parakeet) - Pied", 804 to "Kakarikis Cinnamon Parakeet", 252 to "Lady Gouldian Finch - Blue-back",
    144 to "Lady Gouldian Green Back Normal", 96 to "Lavender Waxbill", 435 to "Lovebirds - Black Masked", 477 to "Lovebirds - Blue Masked", 528 to "Lovebirds - Blue Peach-faced",
    1161 to "Lutino Indian Ringneck Parakeet", 143 to "Mosaic Canary", 115 to "Zebra Finch - Normal", 109 to "Orange Crown Weaver (Red Bishop)", 120 to "Owl Finch", 606 to "Parrotlet - Green",
    608 to "Parrotlet - Pied", 273 to "Pied Parrotfinch", 116 to "Pied Zebra Finch", 546 to "Conure - Pineapple Green-Cheeked", 456 to "Quaker Parrot (Monk Parakeet)", 86 to "Red-Billed Firefinch",
    131 to "Red-faced Parrotfinch", 820 to "Red Agate Canary", 142 to "Red Factor Canary", 810 to "Regent (Rock Pebbler) Parrot", 284 to "Ring-necked Dove - White", 441 to "Rosy Bourke's Parakeets",
    823 to "Scarlet Macaw", 771 to "Scarlet-chested Parakeet", 210 to "Seagreen Parrotfinch", 541 to "Conure - Sun", 821 to "Swainsons Lories", 637 to "Tambourine Doves",
    800 to "Thick-billed Green Pigeon", 141 to "Variegated Canary", 442 to "Violet Eared Waxbill Finch - Pairs", 1250 to "Violet Indian Ringneck", 1258 to "White Bellied Caique ",
    786 to "White Crested Canary", 569 to "Whiteface Pearl Cockatiel", 250 to "Lady Gouldian Finch - Yellow-back", 257 to "Yellow Canary", 110 to "Yellow Crown Weaver (Bishop)",
    803 to "Yellow Fischer's Lovebird", 114 to "Zebra Finch - Chestnut Flanked White",

    298 to "African Ring-necked Parakeets", 609 to "Cockatiel - Albino", 435 to "Lovebirds - Black Masked", 778 to "Blue Indian Ringneck Parakeet", 477 to "Lovebirds - Blue Masked",
    528 to "Lovebirds - Blue Peach-faced", 479 to "Canary - Fife Fancy", 458 to "Cockatiel", 156 to "Crested Canaries", 423 to "Lovebirds - Fischer's",
    260 to "Frill Canary - Northern Dutch", 87 to "Gold Breasted Waxbill", 539 to "Green Canary", 777 to "Green Indian Ringneck Parakeet", 606 to "Parrotlet - Green",
    89 to "Green Singer (Yellow fronted canary)", 776 to "Grey Indian Ringneck Parakeet", 144 to "Lady Gouldian Green Back Normal", 263 to "Lizard Canary",
    143 to "Mosaic Canary", 120 to "Owl Finch", 604 to "Parrotlet - Blue", 274 to "Lovebirds - Peach-faced", 81 to "Red Cheeked Cordon Bleu Finch", 264 to "Scotch Fancy Canary",
    139 to "White Canary", 525 to "Cockatiel - White-faced", 115 to "Zebra Finch - Normal")

val top40template:HashMap<Int,String> = hashMapOf(594 to "African Grey Parrots", 298 to "African Ring-necked Parakeets", 609 to "Cockatiel - Albino",
    435 to "Lovebirds - Black Masked", 1171 to "Blue and Gold Macaw", 252 to "Lady Gouldian Finch - Blue-back", 1169 to "Blue Crowned Conure",
    778 to "Blue Indian Ringneck Parakeet", 604 to "Parrotlet - Blue", 439 to "Bourke's Parrot", 458 to "Cockatiel",
    87 to "Gold Breasted Waxbill", 144 to "Lady Gouldian Green Back Normal", 1157 to "Green Cheek Conure Normal",
    777 to "Green Indian Ringneck Parakeet", 89 to "Green Singer (Yellow fronted canary)", 776 to "Grey Indian Ringneck Parakeet",
    804 to "Kakarikis Cinnamon Parakeet", 96 to "Lavender Waxbill", 557 to "Cockatiel - Lutino", 120 to "Owl Finch",
    274 to "Lovebirds - Peach-faced", 546 to "Conure - Pineapple Green-Cheeked", 456 to "Quaker Parrot (Monk Parakeet)",
    820 to "Red Agate Canary", 86 to "Red-Billed Firefinch", 81 to "Red Cheeked Cordon Bleu Finch",
    131 to "Red-faced Parrotfinch", 142 to "Red Factor Canary", 1271 to "Red-Lored Amazon",
    441 to "Rosy Bourke's Parakeets", 1168 to "Severe Chestnut Fronted Macaw",
    541 to "Conure - Sun", 1156 to "Umbrella Cockatoo", 1250 to "Violet Indian Ringneck", 139 to "White Canary",
    525 to "Cockatiel - White-faced", 250 to "Lady Gouldian Finch - Yellow-back", 257 to "Yellow Canary", 115 to "Zebra Finch - Normal")

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
//
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
    runAll(driver)
}

fun runAll(driver: ChromeDriver) {
    runBirdsWA(driver)
    runBirdsCA(driver)
    runBirdsAZ(driver)
    runBirdsFL(driver)
    runBirdsTX(driver)
    runBirdsNY(driver)
    runBirdsIL(driver)
    runBirdsPA(driver)
    runBirdsOH(driver)
    runBirdsIN(driver)
    runBirdsMA(driver)
    runCats(driver)
    runReps(driver)
    runDogs(driver)
    runClassifieds(driver)
    runHooblyWA(driver)
    runHooblyFL(driver)
    runHooblyAZ(driver)
    runHooblyCA(driver)
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

//////////////////////////////
///// RUN SECTION!!!!!! //////
//////////////////////////////

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
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runBirdsIL(driver: ChromeDriver) {

    val usrBirdsIL = "customersupportIL@thefinchfarm.com"
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
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runBirdsPA(driver: ChromeDriver) {

    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsPA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsPA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowPA(driver)
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

fun runBirdsOH(driver: ChromeDriver) {

    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsOH")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsOH")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowOH(driver)
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

fun runBirdsIN(driver: ChromeDriver) {

    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsIN")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsIN")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowIN(driver)
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

fun runBirdsMA(driver: ChromeDriver) {

    val usrBirdsMA = "customersupportMA@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsMA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsMA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowMA(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
        birdsNowMA(driver)
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

fun runBirdsWANoon(driver: ChromeDriver) {

    val usrBirdsWA = "customersupport@thefinchfarm.com"
    val pwBirdsWA = "TFF2020!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsWA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsWA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowWANoon(driver)
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

fun runBirdsCANoon(driver: ChromeDriver) {

    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsCA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsCA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowCANoon(driver)
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

fun runBirdsAZNoon(driver: ChromeDriver) {

    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsAZ")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsAZ")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowAZNoon(driver)
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

fun runBirdsFLNoon(driver: ChromeDriver) {

    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsFL")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsFL")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowFLNoon(driver)
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

fun runBirdsTXNoon(driver: ChromeDriver) {

    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsTX")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsTX")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowTXNoon(driver)
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

fun runBirdsNYNoon(driver: ChromeDriver) {

    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsNY")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsNY")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowNYNoon(driver)
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

fun runBirdsILNoon(driver: ChromeDriver) {

    val usrBirdsIL = "customersupportIL@thefinchfarm.com"
    val pwBirdsIL = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsIL")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsIL")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowILNoon(driver)
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

fun runBirdsPANoon(driver: ChromeDriver) {

    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsPA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsPA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowPANoon(driver)
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

fun runBirdsOHNoon(driver: ChromeDriver) {

    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsOH")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsOH")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowOHNoon(driver)
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

fun runBirdsINNoon(driver: ChromeDriver) {

    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsIN")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsIN")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowINNoon(driver)
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

fun runBirdsMANoon(driver: ChromeDriver) {

    val usrBirdsMA = "customersupportMA@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsMA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsMA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowMANoon(driver)
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

fun runHooblyWANoon(driver: ChromeDriver) {

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
        hooblyWANoon(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyFLNoon(driver: ChromeDriver) {

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
        hooblyFLNoon(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyAZNoon(driver: ChromeDriver) {

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
        hooblyAZNoon(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyCANoon(driver: ChromeDriver) {

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
        hooblyCANoon(driver)
        driver.quit()
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}


fun runBirdsWAPM(driver: ChromeDriver) {

    val usrBirdsWA = "customersupport@thefinchfarm.com"
    val pwBirdsWA = "TFF2020!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsWA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsWA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowWAPM(driver)
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

fun runBirdsCAPM(driver: ChromeDriver) {

    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsCA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsCA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowCAPM(driver)
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

fun runBirdsAZPM(driver: ChromeDriver) {

    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsAZ")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsAZ")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowAZPM(driver)
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

fun runBirdsFLPM(driver: ChromeDriver) {

    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsFL")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsFL")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowFLPM(driver)
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

fun runBirdsTXPM(driver: ChromeDriver) {

    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsTX")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsTX")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowTXPM(driver)
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

fun runBirdsNYPM(driver: ChromeDriver) {

    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsNY")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsNY")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowNYPM(driver)
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

fun runBirdsILPM(driver: ChromeDriver) {

    val usrBirdsIL = "customersupportIL@thefinchfarm.com"
    val pwBirdsIL = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsIL")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsIL")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowILPM(driver)
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

fun runBirdsPAPM(driver: ChromeDriver) {

    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsPA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsPA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowPAPM(driver)
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

fun runBirdsOHPM(driver: ChromeDriver) {

    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsOH")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsOH")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowOHPM(driver)
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

fun runBirdsINPM(driver: ChromeDriver) {

    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsIN")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsIN")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowINPM(driver)
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

fun runBirdsMAPM(driver: ChromeDriver) {

    val usrBirdsMA = "customersupportMA@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"

    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$usrBirdsMA")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pwBirdsMA")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
        birdsNowMAPM(driver)
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

fun runHooblyWAPM(driver: ChromeDriver) {

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
        hooblyWAPM(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyFLPM(driver: ChromeDriver) {

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
        hooblyFLPM(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyAZPM(driver: ChromeDriver) {

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
        hooblyAZPM(driver)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runHooblyCAPM(driver: ChromeDriver) {

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
        hooblyCAPM(driver)
        driver.quit()
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
        driver.get("https://www.birdsnow.com/main-logout-now")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

//////////////////////////////
///// EXECTION!!!!!!!!! //////
//////////////////////////////

fun birdsNowWA(driver: ChromeDriver) {

    Thread.sleep(1000)

    val birdsNowWAPricing: HashMap<Int,Int> = hashMapOf(594 to 528585, 298 to 546952, 220 to 547616, 1257 to 530943, 1171 to 545479, 132 to 547687, 216 to 520364, 778 to 537420,
        460 to 545597, 597 to 547217, 572 to 528595, 439 to 534872, 457 to 537303, 469 to 531348, 553 to 528305, 478 to 545694, 483 to 547816, 269 to 545480, 458 to 537300,
        571 to 547210, 557 to 545741, 459 to 546949, 525 to 547810, 83 to 528597, 540 to 543572, 541 to 545791, 419 to 537315, 84 to 520353, 638 to 547615, 797 to 545842, 104 to 547812,
        791 to 547028, 479 to 547815, 133 to 547366, 260 to 544252, 87 to 545475, 527 to 545691, 1157 to 535294, 777 to 545547, 751 to 527836, 256 to 534869, 742 to 545683, 804 to 543931,
        252 to 520733, 144 to 534162, 96 to 544385, 435 to 537313, 477 to 544254, 528 to 526530, 1161 to 547410, 143 to 547160, 115 to 545328, 109 to 545788, 120 to 547814, 606 to 545685,
        608 to 547409, 273 to 520726, 116 to 545908, 546 to 531349, 456 to 537314, 86 to 547111, 131 to 528593, 820 to 545907, 142 to 526507, 810 to 530942, 284 to 531392, 441 to 545739,
        823 to 534155, 771 to 545339, 210 to 520759, 541 to 547510, 821 to 545945, 637 to 520950, 800 to 531395, 141 to 520833, 442 to 545946, 1250 to 528311, 1258 to 520885, 786 to 534157,
        569 to 530947, 250 to 545738, 257 to 545688, 110 to 545947, 803 to 534871, 114 to 547215)

    val birdsWA: IntArray = intArrayOf(520353,520364,520726,520733,520759,520833,520885,
        520950,526507,526530,527836,528305,528311,528585,528593,528595,528597,530942,
        530943,530947,531348,531349,531392,531395,534155,534157,534162,534869,534871,
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

    val birdsNowCAPricing: HashMap<Int,Int> = hashMapOf(594 to 549550, 298 to 556355, 609 to 554844, 435 to 550215, 778 to 549549,
         458 to 550026, 87 to 554849, 777 to 549657, 89 to 554848,
        776 to 554836, 144 to 550587, 557 to 554841, 120 to 550585, 274 to 550213, 546 to 554838, 820 to 554839, 86 to 554846,
        81 to 554840, 131 to 554837, 142 to 550583, 441 to 554850, 541 to 550132, 1250 to 554834, 139 to 549689, 525 to 554842,
        250 to 554847, 257 to 554835, 115 to 554845,
        1171 to 558749, 252 to 558750, 1169 to 558752, 604 to 558753, 439 to 558754, 1157 to 558757, 804 to 558758, 96 to 558759,
        456 to 558760, 1271 to 558761, 1168 to 558762, 1156 to 558763)

    //new pending listings 558749,558750,558752,558753,558754,558757,558758,558759,558760,558761,558762,558763

    val birdsCA: IntArray = intArrayOf(


        558749,558750,558752,558753,558754,558757,558758,558759,558760,558761,558762,558763,
        549549,549550,549657,549689,
        550026,550132,550213,550215,
        550583,550585,550587,
        554834,554835,554836,554837,554838,554839,554840,554846,554847,554848,554849,554850,554842,554844,554845,554841,556355 )
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

    val birdsNowAZPricing: HashMap<Int,Int> = hashMapOf(1156 to 558832, 1168 to 558831, 1271 to 558830, 456 to 558829, 96 to 558828, 804 to 558827, 776 to 558826, 1157 to 558825, 439 to 558824, 1169 to 558822, 252 to 558821, 1171 to 558820, 298 to 558819, 594 to 550513, 609 to 554876, 435 to 554873, 778 to 550458, 604 to 550511, 458 to 554541, 87 to 554885,
        777 to 550512, 89 to 554884, 114 to 550515, 557 to 554871, 120 to 550516, 274 to 550517, 546 to 554868, 820 to 554869, 86 to 554881, 81 to 554870, 131 to 554865,
        142 to 550514, 441 to 554886, 541 to 550518, 1250 to 554880, 139 to 554877, 525 to 554872, 250 to 554882, 257 to 554867, 115 to 554878)



    val birdsAZ: IntArray = intArrayOf(558832,558831,558830,558829,558819,558820,558828,558827,558826,558825,558824,558822,558821,
        550458,550511,550512,550513,550514,550515,550516,550517,550518,
        554865,554867,554868,554869,554870,554872,554873,554876,554877,554878,554880,554881,554882,554884,554885,554886,554871,554541)
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

    val birdsNowFLPrice: HashMap<Int,Int> = hashMapOf(594 to 550502, 609 to 554663, 477 to 554661, 778 to 550500, 604 to 550466, 528 to 554575, 87 to 554670, 1157 to 554662,
        776 to 550501, 606 to 550509, 89 to 554669, 144 to 550504, 557 to 554658, 120 to 550505, 274 to 550506, 546 to 554651, 820 to 554654, 86 to 554667, 81 to 554657, 131 to 554577,
        142 to 550503, 441 to 554671, 541 to 550508, 1250 to 554666, 139 to 554664, 525 to 554660, 250 to 554668, 257 to 554647, 115 to 554665,
        298 to 558840, 1169 to 558841, 439 to 558842, 458 to 558853, 776 to 558844,
        804 to 558845, 96 to 558846, 456 to 558847, 1271 to 558849,
        1168 to 558851, 1156 to 558852)

    val birdsFL: IntArray = intArrayOf(550466,550500,550501,550502,550503,550504,550505,550506,550508,550509,
        554664,554669,554575,554668,554670,554660,554647,554662,554654,554658,554667,554651,554661,554665,554657,554663,554666,554671,554577,
        558840,558841,558842,558853,558844,558845,558846,558847,558849,558851,558852)
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

    val birdsNowTXPrice: HashMap<Int,Int> = hashMapOf(594 to 555365, 609 to 555350, 435 to 555346, 778 to 555310, 604 to 555307, 528 to 555314, 458 to 555337,
        87 to 555358, 1157 to 555348, 777 to 555311, 606 to 555327, 89 to 555357, 557 to 555343, 1161 to 555362,120 to 555312,
        274 to 555313, 546 to 555309, 820 to 555339, 86 to 555354, 81 to 555342,
        131 to 555336, 142 to 555306, 441 to 555360, 541 to 555316, 1156 to 555366, 1250 to 555266, 139 to 555351,
        525 to 555344, 250 to 555356, 257 to 555338, 115 to 555353, 1169 to 558962, 439 to 558964, 144 to 558966,
        776 to 558968,
        804 to 558969, 96 to 558970, 456 to 558973, 1271 to 558978, 1168 to 558979)

    val birdsTX: IntArray = intArrayOf(558962,558964,558966,558968,558969,558970,558973,558978,558979,
        555365,555350,555346,555310,555307,555314,555337,555358,555348,555311,555327,555357,555343,555362,555312,555313,555309,555339,555354,555342,555336,555306,555360,555316,555366,555266,555351,555344,555356,555338,555353)
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

    val birdsNY: IntArray = intArrayOf(551369,555636,555633,550797,550527,555622,555626,555127,555635,555619,555627,555643,550605,555631,555620,555621,555617,555629,555640,555630,555624,555615,555644,550796,555616,555638,555632,555641,555628,555639,
        558989,559001,558991,558992,558993,558994,558995,559002,558996,558997)

    val birdsNowNYPricing: HashMap<Int,Int> = hashMapOf(594 to 551369, 609 to 555636, 435 to 555633, 778 to 550797,
        604 to 550527, 528 to 555622, 458 to 555626, 419 to 555635, 87 to 555127, 777 to 555619,
        606 to 555627, 89 to 555643, 144 to 550605, 557 to 555631,
        120 to 555620,
        274 to 555621, 546 to 555617, 820 to 555629, 86 to 555640, 81 to 555630,
        131 to 555624, 142 to 555615, 441 to 555644, 541 to 550796,
        1250 to 555616, 139 to 555638,
        525 to 555632, 250 to 555641, 257 to 555628, 115 to 555639, 439 to 558989, 1157 to 559001,
        776 to 558991,
        804 to 558992, 96 to 558993, 456 to 558994, 1271 to 558995,
        441 to 559002, 1168 to 558996, 1156 to 558997)


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

    val birdsIL: IntArray = intArrayOf(555468,555763,555761,555466,555479,555476,555647,555769,555762,555467,555768,555469,555759,555474,555475,555461,555650,555766,555758,555646,555453,555770,555477,555771,555393,555764,555760,555767,555649,555765,
        559016,559003,559004,559006,559007,559008,559009,559010,559011,559013)

    val birdsNowILPricing: HashMap<Int,Int> = hashMapOf(594 to 555468, 609 to 555763, 435 to 555761, 778 to 555466,
        604 to 555479, 528 to 555476, 458 to 555647, 87 to 555769, 1157 to 555762, 777 to 555467,
        89 to 555768, 144 to 555469, 557 to 555759,
        120 to 555474,
        274 to 555475, 546 to 555461, 820 to 555650, 86 to 555766, 81 to 555758,
        131 to 555646, 142 to 555453, 441 to 555770, 541 to 555477, 1156 to 555771,
        1250 to 555393, 139 to 555764,
        525 to 555760, 250 to 555767, 257 to 555649, 115 to 555765,
        298 to 559016, 252 to 559003, 1169 to 559004, 439 to 559006, 776 to 559007,
        804 to 559008, 96 to 559009,
        456 to 559010, 1271 to 559011, 1168 to 559013)


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

fun birdsNowPA(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsNowPAPricing: HashMap<Int,Int> = hashMapOf(594 to 555861, 609 to 555890, 435 to 555888, 778 to 555859,
        604 to 555867, 528 to 555865, 458 to 555880, 87 to 555898, 144 to 555903, 777 to 555860,
        606 to 555877, 89 to 555897, 557 to 555886, 1161 to 555901,
        120 to 555862,
        274 to 555864, 546 to 555858, 820 to 555882, 86 to 555894, 81 to 555883,
        131 to 555879, 142 to 555857, 441 to 555900, 541 to 555866, 1156 to 555902,
        1250 to 555781, 139 to 555891,
        525 to 555887, 419 to 555889, 250 to 555895, 257 to 555881, 115 to 555893)

    val birdsPA: IntArray = intArrayOf(555861,555890,555888,555859,555867,555865,555880,555898,555903,555860,555877,555897,555886,555901,555862,555864,555858,
        555882,555894,555883,555879,555857,555900,555866,555902,555781,555891,555887,555895,555881,555893,555889)
    println("birdNowPA: " + birdsPA.size)

    for (i in 0..birdsPA.size-1) {
        val index = birdsPA[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowOH(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsNowOHPricing: HashMap<Int,Int> = hashMapOf(594 to 558297, 298 to 558502, 609 to 558299,
        435 to 558300, 1171 to 558499, 252 to 558504, 1169 to 558497,
        778 to 558301, 604 to 558303, 439 to 558495, 458 to 558306,
        87 to 558307, 144 to 558311, 1157 to 558308,
        777 to 558309, 89 to 558310, 776 to 558501,
        804 to 558505, 96 to 558493, 557 to 558312, 120 to 558313,
        274 to 558314, 546 to 558315, 456 to 558503,
        820 to 558316, 86 to 558317, 81 to 558318,
        131 to 558319, 142 to 558321, 1271 to 558492,
        441 to 558324, 1168 to 558508,
        541 to 558325, 1156 to 558326, 1250 to 556209, 139 to 558328,
        525 to 558329, 250 to 558330, 257 to 558331, 115 to 558332)

    val birdsOH: IntArray = intArrayOf(558297,558502,558299,558300,558499,558504,558497,558301,558303,558303,558306,558307,558311,
        558308,558309,558310,558501,558505,558493,558312,558313,558314,558315,558503,558316,558317,558318,558319,558321,558492,558324,558508,
        558325,558326,556209,558328,558329,558330,558331,558332)
    println("birdNowOH: " + birdsOH.size)

    for (i in 0..birdsOH.size-1) {
        val index = birdsOH[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowIN(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsIN: IntArray = intArrayOf(558546,558547,558548,558549,558550,558551,558552,558553,558554,558555,558556,558557,558558,558559,558560,558561,
        558562,558563,558565,558566,558567,558568,558569,558570,558571,558573,558575,558576,558577,558578,558579,558580,558582,558583,556208,558584,
        558585,558586,558588,558589)

    val birdsNowINPricing: HashMap<Int,Int> = hashMapOf(594 to 558546, 298 to 558547, 609 to 558548,
        435 to 558549, 1171 to 558550, 252 to 558551, 1169 to 558552,
        778 to 558553, 604 to 558554, 439 to 558555, 458 to 558556,
        87 to 558557, 144 to 558558, 1157 to 558559,
        777 to 558560, 89 to 558561, 776 to 558562,
        804 to 558563, 96 to 558565, 557 to 558566, 120 to 558567,
        274 to 558568, 546 to 558569, 456 to 558570,
        820 to 558571, 86 to 558573, 81 to 558575,
        131 to 558576, 142 to 558577, 1271 to 558578,
        441 to 558579, 1168 to 558580,
        541 to 558582, 1156 to 558583, 1250 to 556208, 139 to 558584,
        525 to 558585, 250 to 558586, 257 to 558588, 115 to 558589)

    println("birdNowIN: " + birdsIN.size)

    for (i in 0..birdsIN.size-1) {
        val index = birdsIN[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowMA(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsNowMAPricing: HashMap<Int,Int> = hashMapOf(594 to 556314, 778 to 556312, 777 to 556313,
        120 to 556315,
        546 to 556311,
        1250 to 556207,
        298 to 558645, 609 to 558646,
        435 to 558647, 1171 to 558648, 252 to 558650, 1169 to 558651,
        604 to 558653, 439 to 558655, 458 to 558656,
        87 to 558657, 144 to 558658, 1157 to 558738,
        89 to 558739, 776 to 558740,
        804 to 558742, 96 to 558743, 557 to 558745,
        274 to 558746, 456 to 558720,
        820 to 558721, 86 to 558722, 81 to 558723,
        131 to 558724, 142 to 558725, 1271 to 558726,
        441 to 558727, 1168 to 558728,
        541 to 558730, 1156 to 558731, 139 to 558732,
        525 to 558733, 250 to 558734, 257 to 558735, 115 to 558736)

    val birdsMA: IntArray = intArrayOf(556314,556312,556313,556315,556311,556207,558645,558646,558647,558648,558650,558651,558653,558655,558656,558657,558658,
        558738,558739,558740,558742,558743,558745,558746,558720,558721,558722,558723,558724,558725,558726,558727,558728,558730,558731,558732,558733,558734,
        558735,558736)


    println("birdNowMA: " + birdsMA.size)

    for (i in 0..birdsMA.size-1) {
        val index = birdsMA[i]
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

    val hooblyWAPricing: HashMap<Int,String> = hashMapOf(1250 to "hd8r6", 84 to "KNEXh", 86 to "rcUay",458 to "lwUzY", 250 to "vKclC", 479 to "nyuye", 1161 to "i6yGN",
        260 to "QE0y1",783 to "CWfgP", 477 to "vjc07", 419 to "JMQws", 605 to "0dFbB", 132 to "4iTm6", 594 to "FZ0Bm", 572 to "RnbXy", 1161 to "vXqoa", 269 to "HY7My",
        141 to "dJNJx",139 to "k4N5C",546 to "ltc2x", 751 to "T9KD9", 483 to "U3Kyk", 795 to "U5ORI", 604 to "NaN0H", 777 to "eeDAL", 778 to "ZaAVE", 423 to "AgAwK",
        284 to "7wgmN", 274 to "BkYaN", 457 to "0c8TU", 646 to "ClTO6", 120 to "ZepT3", 131 to "6qGm2", 81 to "IUadk", 606 to "dYrD6", 527 to "CmeqH", 1171 to "5relL",
        144 to "eD3Rn", 528 to "MdUHa", 257 to "CmPz2", 570 to "1Zc33", 647 to "AccBa", 776 to "72ae9", 441 to "WiYEc", 459 to "RXjWL", 132 to "RM2kj", 87 to "gfYMc",
        820 to "Uhi55", 609 to "aVw9O", 142 to "QOZH1", 803 to "ujbPf", 469 to "JJYf0", 114 to "pncBM", 597 to "2fapx", 801 to "Rz06f",525 to "XaVLW",143 to "5lxlC",435 to "Cj53A")

    var hoobly:Array<String> = arrayOf("hd8r6","KNEXh","rcUay","lwUzY","vKclC","nyuye","i6yGN","QE0y1","CWfgP","vjc07","JMQws","0dFbB","4iTm6","FZ0Bm","RnbXy","vXqoa","HY7My",
        "dJNJx","k4N5C","ltc2x","T9KD9","U3Kyk","U5ORI","NaN0H","eeDAL","ZaAVE","AgAwK","7wgmN","BkYaN","0c8TU","ClTO6","ZepT3","6qGm2","IUadk","dYrD6","CmeqH","5relL","eD3Rn",
        "MdUHa","CmPz2","1Zc33","AccBa","72ae9","WiYEc","RXjWL","RM2kj","gfYMc","Uhi55","aVw9O","QOZH1","ujbPf","JJYf0","pncBM","2fapx","Rz06f","XaVLW","5lxlC","Cj53A")

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

    val hoobly:Array<String> = arrayOf("xyfiT","nuhMi","CUMch","Nc20R","BbiCS","AHedI","zOdc6","zeq08","7rtFO","zXLd6","SQksa","7cQR8","feg87","G5fcU","MDZ3d","0dBFw","gsqLh",
        "xh26W","ohKgb","FPlAs","l6eEy","pi99M","n4Bnq","tewX5","G05ly","cmdyr","flTwp","kF6lh","fkLjz")

    val hooblyFLPricing:HashMap<Int,String> = hashMapOf(250 to "xyfiT",820 to "nuhMi",87 to "CUMch",257 to "Nc20R",86 to "BbiCS",139 to "AHedI",609 to "zOdc6",115 to "zeq08",
        81 to "7rtFO",525 to "zXLd6",419 to "SQksa", 435 to "7cQR8", 557 to "feg87",458 to "G5fcU",131 to "MDZ3d",1250 to "0dBFw",606 to "gsqLh",546 to "xh26W",777 to "ohKgb",89 to "FPlAs",
        528 to "l6eEy",604 to "pi99M",441 to "n4Bnq",142 to "tewX5",594 to "G05ly",120 to "cmdyr",274 to "flTwp",778 to "kF6lh",541 to "fkLjz")

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

    var hooblyAZPricing:HashMap<Int,String> = hashMapOf(546 to "ZNq1T",120 to "nWZFV",274 to "xfSlP",139 to "2FPED",250 to "E9OY6",144 to "ozVSI",86 to "vG7af",131 to "h6POZ",
        477 to "C1xCa",1157 to "QwvUF",777 to "6LgSS",594 to "HhzPl",142 to "mOose",115 to "DLZ32",609 to "1WOeY",419 to "jpSrh",435 to "C4wcl",528 to "egumo",89 to "aNDSk",
        541 to "YPQyK",778 to "aHfQm",441 to "1jcUq",87 to "ffcG4",1250 to "pwILM",606 to "7MrjN",458 to "hoOxg",81 to "SmQhH",604 to "hV5if",557 to "yK5Ro",525 to "9mZKz",
        820 to "69WA0")

    var hoobly: Array<String> = arrayOf("ZNq1T","nWZFV","xfSlP","2FPED","E9OY6","ozVSI","vG7af","h6POZ","C1xCa","QwvUF","6LgSS","HhzPl","mOose","DLZ32","1WOeY","jpSrh","C4wcl",
        "egumo","aNDSk","YPQyK","aHfQm","1jcUq","ffcG4","pwILM","7MrjN","hoOxg","SmQhH","hV5if","yK5Ro","9mZKz","69WA0")
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

    val hooblyCAPricing:HashMap<Int,String> = hashMapOf(131 to "lwO0b",81 to "ITYhd",86 to "UXvup",604 to "2HrtL",546 to "N9cro",458 to "RKSUg",419 to "Jmj6h",1250 to "uIvlf",
        144 to "2B7y0",139 to "JpXqh",777 to "4yg3N",528 to "G1H7C",820 to "45bRF",441 to "RVEsv",1258 to "CFCBe",606 to "KNbQg",778 to "9eMkb",594 to "YFSFe",142 to "uEhZb",
        1257 to "bC0sv",274 to "iaDmn",110 to "ZSNbM",115 to "77Ec1",250 to "miryH",87 to "znNNe",609 to "TJ8DM",435 to "uRHMp",525 to "a83tI",557 to "AFn8c",120 to "eqIaw",
        89 to "z2xXB",541 to "DHcvX")

    var hoobly: Array<String> = arrayOf("lwO0b","ITYhd","UXvup","2HrtL","N9cro","RKSUg","Jmj6h","uIvlf","2B7y0","JpXqh","4yg3N","G1H7C","45bRF","RVEsv","CFCBe","KNbQg","9eMkb",
        "YFSFe","uEhZb","bC0sv","iaDmn","ZSNbM","77Ec1","miryH","znNNe","TJ8DM","uRHMp","a83tI","AFn8c","eqIaw","z2xXB","DHcvX")
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

fun birdsNowWANoon(driver: ChromeDriver) {

    Thread.sleep(1000)

    val birdsWA: IntArray = intArrayOf(520353,520364,520726,520733,520759,520833,520885,
        520950,526507,526530,527836,528305,528311,528585,528593,528595,528597,530942,
        530943,530947,531348,531349,531392,531395,534155,534157,534162,534869,534871,
        534872,535294,537300,537303,537313,537314,537315,537420,543572,543931,544252)
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

fun birdsNowCANoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsCA: IntArray = intArrayOf(549549,549550,549657,549689,
        550026,550132,550213,550215)
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

fun birdsNowAZNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsAZ: IntArray = intArrayOf(550458,550511,550512,550513,550514,550515,550516,550517,550518,
        554865,554867)
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

fun birdsNowFLNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsFL: IntArray = intArrayOf(550466,550500,550501,550502,550503,550504,550505,550506,550508,550509,
        554664,554669,554575,554668,554670,554660)
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

fun birdsNowTXNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsTX: IntArray = intArrayOf(555365,555350,555346,555310,555307,555314,555337,555358,555348,555311,555327,555357,555343,555362)
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

fun birdsNowNYNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsNY: IntArray = intArrayOf(551369,555636,555633,550797,550527,555622,555626,555127,555635,555619,555627,555643,550605)
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

fun birdsNowILNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsIL: IntArray = intArrayOf(555468,555763,555761,555466,555479,555476,555647,555769,555762,555467,555768,555469)
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

fun birdsNowPANoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsPA: IntArray = intArrayOf(555861,555890,555888,555859,555867,555865,555880,555898,555903,555860,555877,555897,555886)
    println("birdNowPA: " + birdsPA.size)

    for (i in 0..birdsPA.size-1) {
        val index = birdsPA[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowOHNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsOH: IntArray = intArrayOf(556209)
    println("birdNowOH: " + birdsOH.size)

    for (i in 0..birdsOH.size-1) {
        val index = birdsOH[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowINNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsIN: IntArray = intArrayOf(556208)
    println("birdNowIN: " + birdsIN.size)

    for (i in 0..birdsIN.size-1) {
        val index = birdsIN[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowMANoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsMA: IntArray = intArrayOf(556314,556312,556313,556315,556311,556207)
    println("birdNowMA: " + birdsMA.size)

    for (i in 0..birdsMA.size-1) {
        val index = birdsMA[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun catsNowNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val cats: IntArray = intArrayOf(2752,2753,2755,2757,2758,2759,2762,2763,2764,2765)
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

fun dogsNowNoon(driver: ChromeDriver) {

    Thread.sleep(3000)
    val dogs: IntArray = intArrayOf(240926,240929,240948,241035,241243,241363,241501,241508,
        241509,242112,242113,242114,242115,242118)
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

fun hooblyWANoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    var hoobly:Array<String> = arrayOf("hd8r6","KNEXh","rcUay","lwUzY","vKclC","nyuye","i6yGN","QE0y1","CWfgP","vjc07","JMQws","0dFbB","4iTm6","FZ0Bm","RnbXy","vXqoa","HY7My",
        "dJNJx","k4N5C","ltc2x","T9KD9","U3Kyk","U5ORI","NaN0H","eeDAL","ZaAVE","AgAwK","7wgmN","BkYaN","0c8TU")

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

fun hooblyFLNoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    val hoobly:Array<String> = arrayOf("xyfiT","nuhMi","CUMch","Nc20R","BbiCS","AHedI","zOdc6","zeq08","7rtFO","zXLd6","SQksa","7cQR8","feg87","G5fcU","MDZ3d","0dBFw")

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

fun hooblyAZNoon(driver: ChromeDriver) {

    Thread.sleep(3000)


    var hoobly: Array<String> = arrayOf("ZNq1T","nWZFV","xfSlP","2FPED","E9OY6","ozVSI","vG7af","h6POZ","C1xCa","QwvUF","6LgSS","HhzPl","mOose","DLZ32","1WOeY","jpSrh")
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

fun hooblyCANoon(driver: ChromeDriver) {

    Thread.sleep(3000)

    var hoobly: Array<String> = arrayOf("lwO0b","ITYhd","UXvup","2HrtL","N9cro","RKSUg","Jmj6h","uIvlf","2B7y0","JpXqh","4yg3N","G1H7C","45bRF","RVEsv","CFCBe","KNbQg","9eMkb")
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

fun birdsNowWAPM(driver: ChromeDriver) {

    Thread.sleep(1000)


    val birdsWA: IntArray = intArrayOf(537315,537420,543572,543931,544252,
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

fun birdsNowCAPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsCA: IntArray = intArrayOf(
        554834,554835,554836,554837,554838,554839,554840,554846,554847,554848,554849,554850,554842,554844,554845,554841)
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

fun birdsNowAZPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsAZ: IntArray = intArrayOf(554868,554869,554870,554872,554873,554876,554877,554878,554880,554881,554882,554884,554885,554886,554871,554541)
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

fun birdsNowFLPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsFL: IntArray = intArrayOf(554654,554658,554667,554651,554661,554665,554657,554663,554666,554671,554577)
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

fun birdsNowTXPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsTX: IntArray = intArrayOf(555312,555313,555309,555339,555354,555342,555336,555306,555360,555316,555366,555266,555351,555344,555356,555338,555353)
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

fun birdsNowNYPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsNY: IntArray = intArrayOf(555620,555621,555617,555629,555640,555630,555624,555615,555644,550796,555616,555638,555632,555641,555628,555639)
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

fun birdsNowILPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsIL: IntArray = intArrayOf(555469,555759,555474,555475,555461,555650,555766,555758,555646,555453,555770,555477,555771,555393,555764,555760,555767,555649,555765)
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

fun birdsNowPAPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsPA: IntArray = intArrayOf(555858,
        555882,555894,555883,555879,555857,555900,555866,555902,555781,555891,555887,555895,555881,555893,555889)
    println("birdNowPA: " + birdsPA.size)

    for (i in 0..birdsPA.size-1) {
        val index = birdsPA[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowOHPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsOH: IntArray = intArrayOf(556209)
    println("birdNowOH: " + birdsOH.size)

    for (i in 0..birdsOH.size-1) {
        val index = birdsOH[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowINPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val birdsIN: IntArray = intArrayOf(556208)
    println("birdNowIN: " + birdsIN.size)

    for (i in 0..birdsIN.size-1) {
        val index = birdsIN[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun birdsNowMAPM(driver: ChromeDriver) {

    Thread.sleep(3000)
    val birdsMA: IntArray = intArrayOf(556315,556311,556207)
    println("birdNowMA: " + birdsMA.size)

    for (i in 0..birdsMA.size-1) {
        val index = birdsMA[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun hooblyWAPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    var hoobly:Array<String> = arrayOf("7wgmN","BkYaN","0c8TU","ClTO6","ZepT3","6qGm2","IUadk","dYrD6","CmeqH","5relL","eD3Rn",
        "MdUHa","CmPz2","1Zc33","AccBa","72ae9","WiYEc","RXjWL","RM2kj","gfYMc","Uhi55","aVw9O","QOZH1","ujbPf","JJYf0","pncBM","2fapx","Rz06f","XaVLW","5lxlC","Cj53A")

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

fun hooblyFLPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    val hoobly:Array<String> = arrayOf("FPlAs","l6eEy","pi99M","n4Bnq","tewX5","G05ly","cmdyr","flTwp","kF6lh","fkLjz")

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

fun hooblyAZPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    var hoobly: Array<String> = arrayOf("YPQyK","aHfQm","1jcUq","ffcG4","pwILM","7MrjN","hoOxg","SmQhH","hV5if","yK5Ro","9mZKz","69WA0")
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

fun hooblyCAPM(driver: ChromeDriver) {

    Thread.sleep(3000)

    var hoobly: Array<String> = arrayOf("ZSNbM","77Ec1","miryH","znNNe","TJ8DM","uRHMp","a83tI","AFn8c","eqIaw","z2xXB","DHcvX")
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