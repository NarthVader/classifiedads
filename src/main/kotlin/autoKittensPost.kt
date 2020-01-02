package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select


fun autoKittenPost(driver: ChromeDriver,location:String) {
    var userLoc = ""
    if(location=="san diego") {
        userLoc = "sandiego"
    } else if(location=="new york") {
        userLoc = "newyork"
    } else if(location=="los angeles") {
        userLoc="la"
    }
    else {
        userLoc = location
    }
    var user = "$userLoc@petkittensforsale.com"
    var pass = locPass.getValue(location)
    adsLogin(driver,user,pass)
    postBirman(driver,location)
    postAbyssian(driver, location)
    postOcicat(driver, location)
    postNorweigan(driver, location)
    postMaine(driver, location)
    postJapanese(driver, location)
    postHimalayan(driver, location)
    postBritishShort(driver, location)
    postBengal(driver, location)
    postBalinese(driver, location)
    postBobtail(driver, location)
    postBritishLong(driver, location)
    postPersian(driver,location)
    postRagdoll(driver,location)
    postRussian(driver,location)
    postScottishFold(driver,location)
    postScottishStraight(driver,location)
    postSiberian(driver,location)
    postDwelf(driver,location)
    postSphynx(driver,location)
    postTurkish(driver,location)
    postTonkinese(driver,location)
}

fun postBirman(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Birman")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownFirst(driver,location)
    driver.findElement(By.name("title")).sendKeys("Birman Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/birman-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Birman Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified ")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postAbyssian(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Abyssisian")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Abyssinian Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("2187.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/abyssinian-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Abyssinian Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified ")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postOcicat(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Ocicat")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Ocicat Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/ocicat-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Ocicat Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postNorweigan(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Norweigan Forest")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Norwegian Forest Kitten for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1562.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/norwegian-forest-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Norwegian Forest Kitten for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postMaine(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Maine Coon")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Maine Coon Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/maine-coon-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Maine Coon Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postJapanese(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Japanese Bobtail")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Japanese Bobtail Kitten")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/japanese-bobtail-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Japanese Bobtail Kitten\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postHimalayan(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Himalayan")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Himalayan Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/himalayan-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Himalayan Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postBritishShort(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating British Shorthair")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("British Shorthair Kitten For Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1718.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/british-shorthair-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet British Shorthair Kitten For Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postBengal(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Bengal")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Bengal Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1718.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/pet-kittens-for-sale/bengal-kittens-for-sale/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Bengal Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postBalinese(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Balinese")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Balinese Kittens For Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/balinese-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Balinese Kittens For Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified ")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postBobtail(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Bobtail")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("American Bobtail Kitten For Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/american-bobtail-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet American Bobtail Kitten For Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified ")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postBritishLong(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating British Longhair")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("British Longhair Kitten For Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/pet-kittens-for-sale/british-longhair-kittens-for-sale/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet British Longhair Kitten For Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postPersian(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Persian")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Persian Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/persian-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Persian Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postRagdoll(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Ragdoll")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Ragdoll Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("2343.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/ragdoll-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Ragdoll Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postRussian(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Russian Blue")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Russian Blue Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/russian-blue-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Russian Blue Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    driver.switchTo().defaultContent()
    Thread.sleep(3000)
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postScottishFold(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Scottish Fold")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Scottish Fold Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1499.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/pet-kittens-for-sale/scottish-fold-kittens-for-sale/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Scottish Fold Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postScottishStraight(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Scottish Straight")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Scottish Straight Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("2343.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/scottish-straight-kittens-for-sale/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Scottish Straight Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postSiberian(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Siberian")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Siberian Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/siberian-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Siberian Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postDwelf(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Dwelf Sphynx")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Dwelf Sphynx Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("3749.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/dwelf-sphynx-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Dwelf Sphynx Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postSphynx(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Sphynx")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Sphynx Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/sphynx-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Sphynx Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postTurkish(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Turkish Angora")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Turkish Angora Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("1874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/turkish-angora/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Turkish Angora Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postTonkinese(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Tonkinese")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    kittenDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Tonkinese Kittens for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("2249.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petkittensforsale.com/tonkinese-kitten/\n" +
            "email  - customersupport@petkittensforsale.com\n" +
            "call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Tonkinese Kittens for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun iframe(driver: ChromeDriver) {
    val iframe = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"))
    driver.switchTo().frame(iframe)
    Thread.sleep(3000)
}

fun kittenDropdownFirst(driver: ChromeDriver,location: String) {
    //pets dropdown
    Select(driver.findElement(By.name("category"))).selectByValue("17")
    Thread.sleep(3000)

    //pets dropdown
    Select(driver.findElement(By.id("subcategory"))).selectByValue("290")
    Thread.sleep(3000)

    driver.findElement(By.cssSelector("#location")).sendKeys(location)
    Thread.sleep(3000)
    var locString = locMap.getValue(location)
    driver.findElement(By.xpath("//li[@lid='$locString']")).click()
    Thread.sleep(3000)
}

fun kittenDropdownSecond(driver: ChromeDriver,location: String) {
    //pets dropdown
    Select(driver.findElement(By.name("category"))).selectByValue("17")
    Thread.sleep(3000)

    //pets dropdown
    Select(driver.findElement(By.id("subcategory"))).selectByValue("290")
    Thread.sleep(3000)
    
}

fun captchaLoop(driver: ChromeDriver, location: String) {
    Thread.sleep(3000)
    var done = false
    var test = driver.findElement(By.name("captchacode"))
    driver.findElement(By.name("captchacode")).sendKeys("test")
    Thread.sleep(1000)
    while(!done) {
        var input = driver.findElement(By.name("captchacode")).getAttribute("value")
        if(input.length==5 && !test.equals(driver.switchTo().activeElement())) {
            println("conditions met")
            done = true
        }
        Thread.sleep(1000)
    }
}
