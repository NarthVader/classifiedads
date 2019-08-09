package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

val comment = "We Ship Safely Nationwide! We use a patented safety travel box that’s climate controlled, comfortable, and meets the bird's nutritional needs! OUR BIRDS ARE VET CERTIFIED WITH A LIVE ARRIVAL GUARANTEE AND AN OPTIONAL EXTENDED WARRANTY! "
val small = "small"
val medium = "mediu"
val large = "large"

fun createBirds(driver: ChromeDriver) {
    //createAfricanRingneck(driver)
    //createAlbinoCocaktiel(driver)
    //createBlackMaskedLovebird(driver)
    //createBGMacaw(driver)
    //createBlueLadyFinch(driver)
    //createBlueConure(driver)
    //createBlueRingneck(driver)
    //createBlueParrotlet(driver)
    //createBourkesParrot(driver)
    //createCockatiel(driver)

    //createGoldWaxbill(driver)
    //createGreenLadyFinch(driver)
    //createGreenConure(driver)
    createGreenRingneck(driver)
    createGreenSinger(driver)
    createGreyRingneck(driver)
    createKakarikis(driver)
    createLavenderWaxbill(driver)
    createLutinoCockatiel(driver)
    createOwlFinch(driver)

    createPeachFacedLove(driver)
    createPineappleConure(driver)
    createQuaker(driver)
    createRedAgate(driver)
    createRedbilledFinch(driver)
    createRedCheekedCordonBlue(driver)
    createRedFacedParrotfinch(driver)
    createRedFactorCanary(driver)
    createRedLoredAmazon(driver)
    createRosyBourke(driver)
    createChestnutMacaw(driver)
    createSunConure(driver)
    createUmbrellaCockatoo(driver)
    createVioletRingneck(driver)
    createWhiteCanary(driver)
    createWhiteFacedCockatiel(driver)
    createYellowGouldian(driver)
    createYellowCanary(driver)
    createZebraFinch(driver)
}

fun createAfricanRingneck(driver: ChromeDriver) {
    val title = "African Ringneck Parakeet"
    val species = "pa1"
    val subspecies = "rin"
    val price = "349.99"
    val searchTags = "african ringneck parakeet, africanringneckparakeet"
    val size = medium

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.birdsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    Select(driver.findElement(By.name("type1"))).selectByValue(species)
    Thread.sleep(3000)
    Select(driver.findElement(By.name("type2"))).selectByValue(subspecies)
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(comment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    //title
    driver.findElement(By.cssSelector("#name")).sendKeys(title)
    //color
    green(driver)
    //size
    Select(driver.findElement(By.name("size"))).selectByValue(size)
    forAllBirds(driver)
    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createAlbinoCocaktiel(driver: ChromeDriver) {
    val title = "Albino Cockatiel"
    val species = "coc"
    val subspecies = "none"
    val price = "247.00"
    val searchTags = "albino cockatiels for sale, cockatiels for sale"
    val size = medium

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.birdsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    Select(driver.findElement(By.name("type1"))).selectByValue(species)
    Thread.sleep(3000)
    if(subspecies!="none") {
        Select(driver.findElement(By.name("type2"))).selectByValue(subspecies)
    }
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(comment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    //title
    driver.findElement(By.cssSelector("#name")).sendKeys(title)
    //color
    albino(driver)
    white(driver)
    //size
    Select(driver.findElement(By.name("size"))).selectByValue(size)
    forAllBirds(driver)
    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createBlackMaskedLovebird(driver: ChromeDriver) {
    val title = "Black Masked Lovebird"
    val species = "lov"
    val subspecies = "bl1"
    val price = "108.99"
    val size = medium
    val searchTags = "black masked lovebirds for sale, lovebirds for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    black(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createBGMacaw(driver: ChromeDriver) {
    val title = "Blue and Gold Macaw"
    val species = "mac"
    val subspecies = "blu"
    val price = "3999.99"
    val size = medium
    val searchTags = "blue and gold macaw, blueandgoldmacaw"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    gold(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createBlueLadyFinch(driver: ChromeDriver) {
    val title = "Blue Back Lady Gouldian Finch"
    val species = "fin"
    val subspecies = "lad"
    val price = "264.99"
    val size = small
    val searchTags = "blue back lady gouldian finch, bluebackladygouldianfinch"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createBlueConure(driver: ChromeDriver) {
    val title = "Blue Crowned Conure"
    val species = "con"
    val subspecies = "blu"
    val price = "1199.99"
    val size = medium
    val searchTags = "bluecrownedconure, blue crowned conure"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createBlueRingneck(driver: ChromeDriver) {
    val title = "Blue Indian Ringneck Parakeet"
    val species = "pa1"
    val subspecies = "rin"
    val price = "494.99"
    val size = medium
    val searchTags = "blue indian ringneck parakeets for sale, indian ringneck parakeets for sale, parakeets for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    forTalkingBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createBlueParrotlet(driver: ChromeDriver) {
    val title = "Blue Parrotlet"
    val species = "pa2"
    val subspecies = "none"
    val price = "199.99"
    val size = small
    val searchTags = "blue parrotlets for sale, parrotlets for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createBourkesParrot(driver: ChromeDriver) {
    val title = "Bourke's Parrot"
    val species = "pa1"
    val subspecies = "bou"
    val price = "173.99"
    val size = medium
    val searchTags = "bourke's parrot bourke's parakeet bourkesparrot bourkesparakeet"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    brown(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createCockatiel(driver: ChromeDriver) {
    val title = "Cockatiel"
    val species = "coc"
    val subspecies = "none"
    val price = "177.99"
    val size = medium
    val searchTags = "cockatiels for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    grey(driver)
    yellow(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createGoldWaxbill(driver: ChromeDriver) {
    val title = "Gold Breasted Waxbill"
    val species = "fin"
    val subspecies = "wax"
    val price = "56.99"
    val size = small
    val searchTags = "gold breasted waxbills for sale, waxbills for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    gold(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createGreenLadyFinch(driver: ChromeDriver) {
    val title = "Green Back Lady Gouldian Finch"
    val species = "fin"
    val subspecies = "lad"
    val price = "160.99"
    val size = small
    val searchTags = "lady gouldian finches for sale, finches for sale, rainbow finches for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    green(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createGreenConure(driver: ChromeDriver) {
    val title = "Green Cheeked Conure"
    val species = "con"
    val subspecies = "gre"
    val price = "388.99"
    val size = medium
    val searchTags = "green cheeked conures for sale, green cheek conure for sale, conure for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    green(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createGreenRingneck(driver: ChromeDriver) {
    val title = "Green Indian Ringneck Parakeet"
    val species = "pa1"
    val subspecies = "rin"
    val price = "374.99"
    val size = medium
    val searchTags = "green indian ringneck parakeets for sale, indian ringneck parakeets for sale, parakeets for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    green(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createGreenSinger(driver: ChromeDriver) {
    val title = "Green Singer (Yellow Fronted Canary)"
    val species = "fin"
    val subspecies = "oth"
    val price = "60.99"
    val size = small
    val searchTags = "green singer for sale, yellow fronted canary for sale, finches for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    green(driver)
    yellow(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createGreyRingneck(driver: ChromeDriver) {
    val title = "Grey Indian Ringneck Parakeet"
    val species = "pa1"
    val subspecies = "rin"
    val price = "464.99"
    val size = medium
    val searchTags = "grey indian ringneck parakeet, greyindianringneckparakeet"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    green(driver)
    yellow(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createKakarikis(driver: ChromeDriver) {
    val title = "Kakarikis Cinnamon Parakeet"
    val species = "pa1"
    val subspecies = "none"
    val price = "394.99"
    val size = medium
    val searchTags = "kakarikis cinnamon parakeet, kakarikiscinnamonparakeet"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    cinnamon(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createLavenderWaxbill(driver: ChromeDriver) {
    val title = "Lavender Waxbill"
    val species = "fin"
    val subspecies = "wax"
    val price = "78.99"
    val size = small
    val searchTags = "lavender waxbill, lavendarwaxbill"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    lilac(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createLutinoCockatiel(driver: ChromeDriver) {
    val title = "Lutino Cockatiel"
    val species = "coc"
    val subspecies = "none"
    val price = "192.99"
    val size = medium
    val searchTags = "lutino cockatiels for sale, cockatiels for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    lutino(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createOwlFinch(driver: ChromeDriver) {
    val title = "Owl Finch"
    val species = "fin"
    val subspecies = "oth"
    val price = "153.99"
    val size = small
    val searchTags = "owl finches for sale, finches for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    brown(driver)
    grey(driver)
    white(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createPeachFacedLove(driver: ChromeDriver) {
    val title = "Peach Faced Lovebird"
    val species = "lov"
    val subspecies = "pea"
    val price = "93.99"
    val size = small
    val searchTags = "peach faced lovebirds for sale, lovebirds for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    peach(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createPineappleConure(driver: ChromeDriver) {
    val title = "Pineapple Green Cheek Conure"
    val species = "con"
    val subspecies = "gre"
    val price = "550.99"
    val size = medium
    val searchTags = "pineapple green cheek conures for sale, conures for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    pineapple(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createQuaker(driver: ChromeDriver) {
    val title = "Quaker Parrot"
    val species = "qua"
    val subspecies = "none"
    val price = "469.00"
    val size = medium
    val searchTags = "quakerparrot, quaker parrot"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    green(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createRedAgate(driver: ChromeDriver) {
    val title = "Red Agate Canary"
    val species = "can"
    val subspecies = "none"
    val price = "165.99"
    val size = small
    val searchTags = "red agate canary for sale, red agate canaries for sale, canaries for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    black(driver)
    red(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createRedbilledFinch(driver: ChromeDriver) {
    val title = "Red Billed Firefinch"
    val species = "fin"
    val subspecies = "oth"
    val price = "75.99"
    val size = small
    val searchTags = "red billed firefinches for sale, firefinches for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    black(driver)
    red(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createRedCheekedCordonBlue(driver: ChromeDriver) {
    val title = "Red Cheeked Cordon Bleu"
    val species = "fin"
    val subspecies = "cor"
    val price = "73.99"
    val size = small
    val searchTags = "red cheeked cordon bleu's for sale, finches for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createRedFacedParrotfinch(driver: ChromeDriver) {
    val title = "Red Faced Parrotfinch"
    val species = "fin"
    val subspecies = "oth"
    val price = "225.99"
    val size = small
    val searchTags = "red faced parrotfinches for sale, parrotfinches for sale, finches for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    red(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createRedFactorCanary(driver: ChromeDriver) {
    val title = "Red Factor Canary"
    val species = "can"
    val subspecies = "red"
    val price = "169.99"
    val size = small
    val searchTags = "red factor canary for sale, canaries for sale, red factor canaries for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    red(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createRedLoredAmazon(driver: ChromeDriver) {
    val title = "Red Lored Amazon Parrot"
    val species = "ama"
    val subspecies = "re1"
    val price = "1919.99"
    val size = large
    val searchTags = "red lored amazon parrot, redloredamazonparrot"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    green(driver)
    red(driver)
    yellow(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    forTalkingBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createRosyBourke(driver: ChromeDriver) {
    val title = "Rosy Bourke Parakeet"
    val species = "pa1"
    val subspecies = "bou"
    val price = "225.99"
    val size = medium
    val searchTags = "rosy bourke parakeets for sale, parakeets for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    rose(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createChestnutMacaw(driver: ChromeDriver) {
    val title = "Severe Chestnut Fronted Macaw"
    val species = "mac"
    val subspecies = "sev"
    val price = "2799.99"
    val size = large
    val searchTags = "severe chestnut fronted macaw, severechestnutfrontedmacaw"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    green(driver)
    red(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createSunConure(driver: ChromeDriver) {
    val title = "Sun Conure"
    val species = "con"
    val subspecies = "sun"
    val price = "599.99"
    val size = medium
    val searchTags = "sun conures for sale, conures for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    yellow(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createUmbrellaCockatoo(driver: ChromeDriver) {
    val title = "Umbrella Cockatoo"
    val species = "co1"
    val subspecies = "umb"
    val price = "3989.99"
    val size = large
    val searchTags = "umbrella cockatoos for sale, cockatoos for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    white(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createVioletRingneck(driver: ChromeDriver) {
    val title = "Violet Indian Ringneck Parakeet"
    val species = "pa1"
    val subspecies = "rin"
    val price = "999.99"
    val size = medium
    val searchTags = "violet indian ringneck parakeets for sale, parakeets for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    purple(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    forRareBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createWhiteCanary(driver: ChromeDriver) {
    val title = "White Canary"
    val species = "can"
    val subspecies = "none"
    val price = "147.99"
    val size = small
    val searchTags = "white canary for sale, white canaries for sale, canaries for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    white(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createWhiteFacedCockatiel(driver: ChromeDriver) {
    val title = "White Faced Cockatiel"
    val species = "coc"
    val subspecies = "none"
    val price = "177.99"
    val size = medium
    val searchTags = "white faced cockatiels for sale, cockatiels for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    white(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createYellowGouldian(driver: ChromeDriver) {
    val title = "Yellow Back Lady Gouldian"
    val species = "fin"
    val subspecies = "lad"
    val price = "173.99"
    val size = small
    val searchTags = "yellow back lady gouldians for sale, lady gouldians for sale, finches for sale, rainbow finches for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    yellow(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createYellowCanary(driver: ChromeDriver) {
    val title = "Yellow Canary"
    val species = "can"
    val subspecies = "none"
    val price = "142.99"
    val size = small
    val searchTags = "yellow canary for sale, yellow canaries for sale, canaries for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    yellow(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createZebraFinch(driver: ChromeDriver) {
    val title = "Zebra Finch"
    val species = "fin"
    val subspecies = "zeb"
    val price = "24.99"
    val size = small
    val searchTags = "zebra finches for sale, finches for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    black(driver)
    grey(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

//colors
fun albino(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='alb']")).click()
}

fun black(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='bla']")).click()
}

fun blue(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='blu']")).click()
}

fun brown(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='bro']")).click()
}

fun cinnamon(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='cin']")).click()
}

fun grey(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='gr1']")).click()
}

fun gold(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='gol']")).click()
}

fun green(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='gre']")).click()
}

fun lilac(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='lil']")).click()
}

fun lutino(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='lut']")).click()
}

fun peach(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='pea']")).click()
}

fun pineapple(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='pin']")).click()
}

fun purple(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='pur']")).click()
}

fun red(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='red']")).click()
}

fun rose(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='ros']")).click()
}

fun yellow(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='yel']")).click()
}

fun white(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='whi']")).click()
}

//helper functions
fun birdCreationStart(driver: ChromeDriver, title: String) {
    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.birdsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
}

fun birdSpecies(driver: ChromeDriver, species: String, subspecies: String) {
    //type dropdown
    Select(driver.findElement(By.name("type1"))).selectByValue(species)
    Thread.sleep(3000)
    if(subspecies!="none") {
        Select(driver.findElement(By.name("type2"))).selectByValue(subspecies)
    }
    Thread.sleep(1000)
}

fun birdSize(driver: ChromeDriver, size: String) {
    //size
    Select(driver.findElement(By.name("size"))).selectByValue(size)
}

fun birdTitle(driver: ChromeDriver, title: String) {
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //title
    driver.findElement(By.cssSelector("#name")).sendKeys(title)
}

fun birdPrice(driver: ChromeDriver, price: String) {
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    driver.findElement(By.cssSelector("#comments")).sendKeys(comment)
    Thread.sleep(1000)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
}

fun birdTags(driver: ChromeDriver, searchTags: String) {
    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
}

fun saveAndContinue(driver: ChromeDriver) {
    driver.findElement(By.name("doContinue")).click()
    Thread.sleep(3000)
    driver.findElement(By.name("doContinue")).click()
    Thread.sleep(60000)
}

fun forAllBirds(driver: ChromeDriver) {
    Select(driver.findElement(By.name("age"))).selectByValue("you")
    Select(driver.findElement(By.name("adkind"))).selectByValue("for")
    Select(driver.findElement(By.name("sex"))).selectByValue("un")
    driver.findElement(By.cssSelector("#marking")).sendKeys("Phone #: 877-527-5656")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys("http://www.thefinchfarm.com/african-grey-parrots/")
    driver.findElement(By.xpath("//input[@value='exo']")).click()
    driver.findElement(By.xpath("//input[@value='fan']")).click()
    driver.findElement(By.xpath("//input[@value='com']")).click()
    driver.findElement(By.xpath("//input[@value='pet']")).click()
    driver.findElement(By.xpath("//input[@value='cut']")).click()
    driver.findElement(By.xpath("//input[@value='pla']")).click()
    driver.findElement(By.name("shipping")).sendKeys(comment)
}

fun forRareBirds(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='rar']")).click()
}

fun forTalkingBirds(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='tal']")).click()
}


fun createAfricanGrey(driver: ChromeDriver) {
    Thread.sleep(3000)
    println("creating African Grey")
    driver.get("https://www.birdsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    driver.findElement(By.cssSelector("#title")).sendKeys("African Grey Parrot")
    Select(driver.findElement(By.name("type1"))).selectByValue("afr")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("type2"))).selectByValue("con")
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("you")
    driver.findElement(By.cssSelector("#price")).sendKeys("4484.99")
    driver.findElement(By.cssSelector("#comments")).sendKeys(comment)
    driver.findElement(By.cssSelector("#price")).sendKeys("4484.99")
    driver.findElement(By.cssSelector("#name")).sendKeys("African Grey Parrot")
    Select(driver.findElement(By.name("adkind"))).selectByValue("for")
    Select(driver.findElement(By.name("sex"))).selectByValue("un")
    driver.findElement(By.xpath("//input[@value='gr1']")).click()
    Select(driver.findElement(By.name("size"))).selectByValue("large")
    driver.findElement(By.cssSelector("#marking")).sendKeys("Phone #: 877-527-5656")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys("http://www.thefinchfarm.com/african-grey-parrots/")
    driver.findElement(By.xpath("//input[@value='exo']")).click()
    driver.findElement(By.xpath("//input[@value='fan']")).click()
    driver.findElement(By.xpath("//input[@value='com']")).click()
    driver.findElement(By.xpath("//input[@value='pet']")).click()
    driver.findElement(By.xpath("//input[@value='rar']")).click()
    driver.findElement(By.xpath("//input[@value='tal']")).click()
    driver.findElement(By.xpath("//input[@value='cut']")).click()
    driver.findElement(By.xpath("//input[@value='pla']")).click()
    driver.findElement(By.name("shipping")).sendKeys(comment)
    driver.findElement(By.cssSelector("#tags")).sendKeys("african grey parrots for sale")
    driver.findElement(By.name("doContinue")).click()
    Thread.sleep(3000)
}