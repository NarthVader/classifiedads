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
    runAll(driver)
    //viewCount(driver)
    driver.quit()
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
    runBirdsDL(driver)
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
