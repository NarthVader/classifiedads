package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

val dogComment = "Beautiful puppies for sale! We safely transport puppies to your local airport. Visit us on our website at PetPuppiesForSale .com or give us a call!\n" +
        "\n" +
        "Our puppies have all of their papers, a full health check, vaccinations, and a live arrival guarantee. Gender, color, pattern info available."

fun createDogs(driver: ChromeDriver) {
    createAffenpinscher(driver)
    createAkita(driver)
    createACD(driver)
    createBassett(driver)
    createBeagle(driver)
    createBichon(driver)
    createBorderCollie(driver)
    createCavalierKing(driver)
    createChihuahau(driver)
    createChow(driver)
    createChihuahau(driver)
    createCorgi(driver)
    createDalmation(driver)
    createDauchsund(driver)
    createDoberman(driver)
    createGermanSheperd(driver)
    createGermanPointer(driver)
    createGolden(driver)
    createGreatDane(driver)
    createHavanese(driver)
    createHusky(driver)
    createJackRussell(driver)
    createLabrador(driver)
    createPekingese(driver)
    createPomeranian(driver)
    createPoodle(driver)
    createSamoyed(driver)
    createSchnauzer(driver)
    createShibaInu(driver)
    createShihTzu(driver)
    createWeimaraner(driver)
    createYorky(driver)
}

fun createAffenpinscher(driver: ChromeDriver) {
    val title = "Affenpinscher Puppies"
    val price = "4374.99"
    val searchTags = "affenpinscher puppies for sale, puppies for sale, affenpinscher for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Affenpinscher")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    Select(driver.findElement(By.name("color"))).selectByValue("bl2")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://www.petpuppiesforsale.com/affenpinscher-puppies/")

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createAkita(driver: ChromeDriver) {
    val title = "Akita Puppies"
    val price = "3499.99"
    val url = "https://www.petpuppiesforsale.com/akita-puppies/"
    val searchTags = "akita puppies for sale, akita puppies for sale, akita puppies for sale, puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Akita")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createACD(driver: ChromeDriver) {
    val title = "Australian Cattle Dog Puppies"
    val price = "3374.99"
    val url = "http://www.petpuppiesforsale.com/pet-australian-cattle-dog-puppies-for-sale/"
    val searchTags = "australian cattle dog puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Australian Cattle")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createBassett(driver: ChromeDriver) {
    val title = "Basset Hound Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/basset-hound-puppies/"
    val searchTags = "basset hound puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Basset Hound")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createBeagle(driver: ChromeDriver) {
    val title = "Beagle Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/beagle-puppies/"
    val searchTags = "beagle puppies for sale, beagle for sale, puppies for sale, beagle puppy for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Beagle")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createBichon(driver: ChromeDriver) {
    val title = "Bichon Frise Puppies"
    val price = "2561.99"
    val url = "http://www.petpuppiesforsale.com/pet-bichon-frise-puppies-for-sale/"
    val searchTags = "bichon frise puppies for sale, frise puppies for sale, bichon puppies for sale, puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Bichon Frise")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    Select(driver.findElement(By.name("color"))).selectByValue("whi")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createBorderCollie(driver: ChromeDriver) {
    val title = "Border Collie Puppies"
    val price = "2874.99"
    val url = "http://www.petpuppiesforsale.com/pet-border-collie-puppies-for-sale/"
    val searchTags = "border collie puppies for sale, collie puppies for sale, border collie puppy for sale, border puppies for sale, border collie for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Border Collie")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    Select(driver.findElement(By.name("coat"))).selectByValue("lo")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createCavalierKing(driver: ChromeDriver) {
    val title = "Cavalier King Charles Spaniel Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/cavalier-king-charles-spaniel-puppies/"
    val searchTags = "cavalier king charles spaniel puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Cavalier King Charles Spaniel")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createChihuahau(driver: ChromeDriver) {
    val title = "Chihuahua Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/chihuahua-puppies/"
    val searchTags = "chihuahua puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Chihuahua")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createChow(driver: ChromeDriver) {
    val title = "Chow Chow Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/chow-chow-puppies/"
    val searchTags = "chow chow puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Chow Chow")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createCorgi(driver: ChromeDriver) {
    val title = "Corgi Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/welsh-corgi-puppies/"
    val searchTags = "corgi puppies for sale, puppies for sale, corgi for sale, corgi for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Corgi")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createDauchsund(driver: ChromeDriver) {
    val title = "Dachshund Puppies"
    val price = "3124.99"
    val url = "http://www.petpuppiesforsale.com/pet-dachshund-puppies-for-sale/"
    val searchTags = "dachshund puppies for sale, puppies for sale, dachshunds for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Dachshund")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createDalmation(driver: ChromeDriver) {
    val title = "Dalmatian Puppies"
    val price = "2749.99"
    val url = "https://www.petpuppiesforsale.com/dalmatian-puppies/"
    val searchTags = "dalmatian puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Dalmatian")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createDoberman(driver: ChromeDriver) {
    val title = "Doberman Puppies"
    val price = "2999.99"
    val url = "https://www.petpuppiesforsale.com/doberman-puppies/"
    val searchTags = "doberman puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Doberman Pinscher")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createGermanSheperd(driver: ChromeDriver) {
    val title = "German Shepherd Puppies"
    val price = "2624.99"
    val url = "https://www.petpuppiesforsale.com/german-shepherd-puppies/"
    val searchTags = "german shepherd puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("German Shepherd")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createGermanPointer(driver: ChromeDriver) {
    val title = "German Shorthair Pointer"
    val price = "1999.99"
    val url = "https://www.petpuppiesforsale.com/german-shorthair-pointer/"
    val searchTags = "german shorthair pointer puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("German Shorthaired Pointer")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createGolden(driver: ChromeDriver) {
        val title = "Golden Retriever Puppies"
        val price = "3124.99"
        val url = "https://www.petpuppiesforsale.com/golden-retriever-puppies/"
        val searchTags = "golden retriever puppies for sale"

        Thread.sleep(3000)
        println("creating $title")
        driver.get("https://www.dogsnow.com/place_ad-adType-p")
        Thread.sleep(1000)
        //title
        driver.findElement(By.cssSelector("#title")).sendKeys(title)
        //type dropdown
        driver.findElement(By.id("breed")).sendKeys("Golden Retriever")
        Thread.sleep(3000)
        Select(driver.findElement(By.name("sex"))).selectByValue("mi")
        Thread.sleep(1000)

        //price and comment price again
        driver.findElement(By.cssSelector("#price")).sendKeys(price)
        driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
        driver.findElement(By.cssSelector("#price")).sendKeys(price)
        Thread.sleep(1000)
        Select(driver.findElement(By.name("age"))).selectByValue("pup")
        driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

        //tag words
        driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
        saveAndContinue(driver)
}

fun createGreatDane(driver: ChromeDriver) {
    val title = "Great Dane Puppies"
    val price = "3249.99"
    val url = "https://www.petpuppiesforsale.com/great-dane-puppies/"
    val searchTags = "great dane puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Great Dane")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createHavanese(driver: ChromeDriver) {
    val title = "Havanese Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/havanese-puppies/"
    val searchTags = "havanese puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Havanese")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createHusky(driver: ChromeDriver) {
    val title = "Husky Puppies"
    val price = "2749.99"
    val url = "https://www.petpuppiesforsale.com/siberian-husky-puppies/"
    val searchTags = "husky puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Siberian Husky")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createJackRussell(driver: ChromeDriver) {
    val title = "Jack Russell Terrier Puppies"
    val price = "2749.99"
    val url = "https://www.petpuppiesforsale.com/jack-russell-terrier-puppies/"
    val searchTags = "jack russell terrier puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Jack Russell Terrier")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createLabrador(driver: ChromeDriver) {
    val title = "Labrador Puppies"
    val price = "2874.99"
    val url = "https://www.petpuppiesforsale.com/labrador-puppies/"
    val searchTags = "labrador puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Labrador Retriever")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createPekingese(driver: ChromeDriver) {
    val title = "Pekingese Puppies"
    val price = "2749.99"
    val url = "https://www.petpuppiesforsale.com/pekingese-puppies/"
    val searchTags = "pekingese puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Pekingese")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createPomeranian(driver: ChromeDriver) {
    val title = "Pomeranian Puppies"
    val price = "3249.99"
    val url = "https://www.petpuppiesforsale.com/pomeranian-puppies/"
    val searchTags = "pomeranian puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Pomeranian")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createPoodle(driver: ChromeDriver) {
    val title = "Poodle Puppies"
    val price = "2999.99"
    val url = "https://www.petpuppiesforsale.com/standard-poodle-puppies/"
    val searchTags = "poodle puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Poodle")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createSamoyed(driver: ChromeDriver) {
    val title = "Samoyed Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/samoyed-puppies/"
    val searchTags = "samoyed puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Samoyed")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createSchnauzer(driver: ChromeDriver) {
    val title = "Schnauzer Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/miniature-schnauzer-puppies/"
    val searchTags = "miniature schnauzer puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Miniature Schnauzer")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createShibaInu(driver: ChromeDriver) {
    val title = "Shiba Inu Puppies"
    val price = "3124.99"
    val url = "https://www.petpuppiesforsale.com/shiba-inu-puppies/"
    val searchTags = "shiba inu puppies puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Shiba Inu")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createShihTzu(driver: ChromeDriver) {
    val title = "Shih Tzu Puppies"
    val price = "3061.99"
    val url = "https://www.petpuppiesforsale.com/shih-tzu-puppies/"
    val searchTags = "shih tzu puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Shih Tzu")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createWeimaraner(driver: ChromeDriver) {
    val title = "Weimaraner Puppies"
    val price = "2374.99"
    val url = "https://www.petpuppiesforsale.com/weimaraner-puppies/"
    val searchTags = "weimaraner puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Weimaraner")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createYorky(driver: ChromeDriver) {
    val title = "Yorkshire Terrier Puppies"
    val price = "3374.99"
    val url = "https://www.petpuppiesforsale.com/yorkshire-terrier-puppies/"
    val searchTags = "yorkshire terrier puppies for sale"

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.dogsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    driver.findElement(By.id("breed")).sendKeys("Yorkshire Terrier")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("sex"))).selectByValue("mi")
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(dogComment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("pup")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys(url)

    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}
