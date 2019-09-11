package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import java.util.HashMap

fun priceChange(driver: ChromeDriver,birdName: String, birdPrice: String) {
    if(top40template.containsValue(birdName)) {
        val index = top40map.get(birdName)
        executionSuite(driver,index,birdPrice)
    } else {
        println("this isn't in the template. check spelling!")
    }
}

fun birdPriceUpdate(driver: ChromeDriver,price: String) {
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    Thread.sleep(1000)
    driver.findElement(By.cssSelector("#comments")).sendKeys("")
    Thread.sleep(1000)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
}

fun priceChangeExecution(driver: ChromeDriver,birdIndex: Int?,price: String) {
    Thread.sleep(3000)
    driver.get("https://www.birdsnow.com/place_ad-adid-$birdIndex")
    Thread.sleep(3000)
    birdPriceUpdate(driver,price)
    savePriceChange(driver)
    birdsNowLogout(driver)
}

fun savePriceChange(driver: ChromeDriver) {
    Thread.sleep(3000)
    driver.findElement(By.name("doContinue")).click()
    Thread.sleep(3000)
}

fun executionSuite(driver: ChromeDriver,birdIndex:Int?,birdPrice: String) {
    birdsNowWAPricing(driver,birdIndex,birdPrice)
    birdsNowCAPricing(driver,birdIndex,birdPrice)
    birdsNowAZPricing(driver,birdIndex,birdPrice)
    birdsNowORLPricing(driver,birdIndex,birdPrice)
    birdsNowFLPricing(driver,birdIndex,birdPrice)
    birdsNowTXPricing(driver,birdIndex,birdPrice)
    birdsNowNYPricing(driver,birdIndex,birdPrice)
    birdsNowILPricing(driver,birdIndex,birdPrice)
    birdsNowPAPricing(driver,birdIndex,birdPrice)
    birdsNowOHPricing(driver,birdIndex,birdPrice)
    birdsNowINPricing(driver,birdIndex,birdPrice)
    birdsNowMAPricing(driver,birdIndex,birdPrice)
    birdsNowDLPricing(driver,birdIndex,birdPrice)
    birdsNowDCPricing(driver,birdIndex,birdPrice)
    birdsNowATPricing(driver,birdIndex,birdPrice)
    birdsNowDTPricing(driver,birdIndex,birdPrice)
    birdsNowPDXPricing(driver,birdIndex,birdPrice)
    birdsNowMINPricing(driver,birdIndex,birdPrice)
    birdsNowLAPricing(driver,birdIndex,birdPrice)
    birdsNowSANPricing(driver,birdIndex,birdPrice)
    birdsNowDENPricing(driver,birdIndex,birdPrice)
    birdsNowBALPricing(driver,birdIndex,birdPrice)
    birdsNowSTLPricing(driver,birdIndex,birdPrice)
    birdsNowTMPPricing(driver,birdIndex,birdPrice)
    birdsNowAUSPricing(driver,birdIndex,birdPrice)
    birdsNowLVGPricing(driver,birdIndex,birdPrice)
    birdsNowPITTPricing(driver,birdIndex,birdPrice)
    birdsNowSACPricing(driver,birdIndex,birdPrice)
    birdsNowCHARPricing(driver,birdIndex,birdPrice)
    birdsNowSANTPricing(driver,birdIndex,birdPrice)
}

fun birdsNowWAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsWA = "customersupport@thefinchfarm.com"
    val pwBirdsWA = "TFF2020!"
    birdsNowLogin(driver,usrBirdsWA,pwBirdsWA)
    val birdsNowWAPricing: HashMap<Int, Int> = hashMapOf(594 to 528585, 298 to 546952, 220 to 547616, 1257 to 530943, 1171 to 545479, 132 to 547687, 216 to 520364, 778 to 537420,
        460 to 545597, 597 to 547217, 572 to 528595, 439 to 534872, 457 to 537303, 469 to 531348, 553 to 528305, 478 to 545694, 483 to 547816, 269 to 545480, 458 to 537300,
        571 to 547210, 557 to 545741, 459 to 546949, 525 to 547810, 83 to 528597, 540 to 543572, 541 to 545791, 419 to 537315, 84 to 520353, 638 to 547615, 797 to 545842, 104 to 547812,
        791 to 547028, 479 to 547815, 133 to 547366, 260 to 544252, 87 to 545475, 527 to 545691, 1157 to 535294, 777 to 545547, 751 to 527836, 256 to 534869, 742 to 545683, 804 to 543931,
        252 to 520733, 144 to 534162, 96 to 544385, 435 to 537313, 477 to 544254, 528 to 526530, 1161 to 547410, 143 to 547160, 115 to 545328, 109 to 545788, 120 to 547814, 606 to 545685,
        608 to 547409, 273 to 520726, 116 to 545908, 546 to 531349, 456 to 537314, 86 to 547111, 131 to 528593, 820 to 545907, 142 to 526507, 810 to 530942, 284 to 531392, 441 to 545739,
        823 to 534155, 771 to 545339, 210 to 520759, 541 to 547510, 821 to 545945, 637 to 520950, 800 to 531395, 141 to 520833, 442 to 545946, 1250 to 528311, 1258 to 520885, 786 to 534157,
        569 to 530947, 250 to 545738, 257 to 545688, 110 to 545947, 803 to 534871, 114 to 547215)
    val index = birdsNowWAPricing.get(birdIndex)

    println("Price Change for BNWA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowCAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"
    birdsNowLogin(driver,usrBirdsCA,pwBirdsCA)
    val birdsNowCAPricing: HashMap<Int, Int> = hashMapOf(594 to 549550, 298 to 556355, 609 to 554844, 435 to 550215, 778 to 549549,
        458 to 550026, 87 to 554849, 777 to 549657, 89 to 554848,
        776 to 554836, 144 to 550587, 557 to 554841, 120 to 550585, 274 to 550213, 546 to 554838, 820 to 554839, 86 to 554846,
        81 to 554840, 131 to 554837, 142 to 550583, 441 to 554850, 541 to 550132, 1250 to 554834, 139 to 549689, 525 to 554842,
        250 to 554847, 257 to 554835, 115 to 554845,
        1171 to 558749, 252 to 558750, 1169 to 558752, 604 to 558753, 439 to 558754, 1157 to 558757, 804 to 558758, 96 to 558759,
        456 to 558760, 1271 to 558761, 1168 to 558762, 1156 to 558763)
    val index = birdsNowCAPricing.get(birdIndex)

    println("Price Change for BNCA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowAZPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAZ,pwBirdsAZ)
    val birdsNowAZPricing: HashMap<Int, Int> = hashMapOf(1156 to 558832, 1168 to 558831, 1271 to 558830, 456 to 558829, 96 to 558828, 804 to 558827, 776 to 558826, 1157 to 558825, 439 to 558824, 1169 to 558822, 252 to 558821, 1171 to 558820, 298 to 558819, 594 to 550513, 609 to 554876, 435 to 554873, 778 to 550458, 604 to 550511, 458 to 554541, 87 to 554885,
        777 to 550512, 89 to 554884, 114 to 550515, 557 to 554871, 120 to 550516, 274 to 550517, 546 to 554868, 820 to 554869, 86 to 554881, 81 to 554870, 131 to 554865,
        142 to 550514, 441 to 554886, 541 to 550518, 1250 to 554880, 139 to 554877, 525 to 554872, 250 to 554882, 257 to 554867, 115 to 554878)
    val index = birdsNowAZPricing.get(birdIndex)

    println("Price Change for BNAZ " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowORLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsORL = "supportorlando@thefinchfarm.com"
    val pwBirdsORL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsORL,pwBirdsORL)
    val birdsNowORLPricing: HashMap<Int, Int> = hashMapOf(594 to 559764, 298 to 560532, 609 to 560533,
        435 to 560534, 1171 to 560535, 252 to 560536, 1169 to 560537,
        778 to 560538, 604 to 560539, 439 to 560540, 458 to 560541,
        87 to 560542, 144 to 560543, 1157 to 560544,
        777 to 560545, 89 to 560546, 776 to 560547,
        804 to 560548, 96 to 560549, 557 to 560550, 120 to 560551,
        274 to 560552, 546 to 560553, 456 to 560554,
        820 to 560555, 86 to 560556, 81 to 560557,
        131 to 560577, 142 to 560559, 1271 to 560560,
        441 to 560561, 1168 to 560562,
        541 to 560563, 1156 to 560564, 1250 to 560565, 139 to 560566,
        525 to 560567, 250 to 560568, 257 to 560569, 115 to 560570)
    val index = birdsNowORLPricing.get(birdIndex)

    println("Price Change for BNORL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowFLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"
    birdsNowLogin(driver,usrBirdsFL,pwBirdsFL)

    val birdsNowFLPricing: HashMap<Int, Int> = hashMapOf(594 to 550502, 609 to 554663, 477 to 554661, 778 to 550500, 604 to 550466, 528 to 554575, 87 to 554670, 1157 to 554662,
        776 to 550501, 606 to 550509, 89 to 554669, 144 to 550504, 557 to 554658, 120 to 550505, 274 to 550506, 546 to 554651, 820 to 554654, 86 to 554667, 81 to 554657, 131 to 554577,
        142 to 550503, 441 to 554671, 541 to 550508, 1250 to 554666, 139 to 554664, 525 to 554660, 250 to 554668, 257 to 554647, 115 to 554665,
        298 to 558840, 1169 to 558841, 439 to 558842, 458 to 558853, 776 to 558844,
        804 to 558845, 96 to 558846, 456 to 558847, 1271 to 558849,
        1168 to 558851, 1156 to 558852)
    val index = birdsNowFLPricing.get(birdIndex)

    println("Price Change for BNFL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowTXPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"
    birdsNowLogin(driver,usrBirdsTX,pwBirdsTX)
    val birdsNowTXPricing: HashMap<Int, Int> = hashMapOf(594 to 555365, 609 to 555350, 435 to 555346, 778 to 555310, 604 to 555307, 528 to 555314, 458 to 555337,
        87 to 555358, 1157 to 555348, 777 to 555311, 606 to 555327, 89 to 555357, 557 to 555343, 1161 to 555362,120 to 555312,
        274 to 555313, 546 to 555309, 820 to 555339, 86 to 555354, 81 to 555342,
        131 to 555336, 142 to 555306, 441 to 555360, 541 to 555316, 1156 to 555366, 1250 to 555266, 139 to 555351,
        525 to 555344, 250 to 555356, 257 to 555338, 115 to 555353, 1169 to 558962, 439 to 558964, 144 to 558966,
        776 to 558968,
        804 to 558969, 96 to 558970, 456 to 558973, 1271 to 558978, 1168 to 558979)
    val index = birdsNowTXPricing.get(birdIndex)

    println("Price Change for BNTX " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowNYPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"
    birdsNowLogin(driver,usrBirdsNY,pwBirdsNY)
    val birdsNowNYPricing: HashMap<Int, Int> = hashMapOf(594 to 551369, 609 to 555636, 435 to 555633, 778 to 550797,
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
    val index = birdsNowNYPricing.get(birdIndex)

    println("Price Change for BNNY " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowILPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"
    birdsNowLogin(driver,usrBirdsNY,pwBirdsNY)
    val birdsNowILPricing: HashMap<Int, Int> = hashMapOf(594 to 555468, 609 to 555763, 435 to 555761, 778 to 555466,
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
    val index = birdsNowILPricing.get(birdIndex)

    println("Price Change for BNIL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowPAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPA,pwBirdsPA)
    val birdsNowPAPricing: HashMap<Int, Int> = hashMapOf(594 to 555861, 609 to 555890, 435 to 555888, 778 to 555859,
        604 to 555867, 528 to 555865, 458 to 555880, 87 to 555898, 144 to 555903, 777 to 555860,
        606 to 555877, 89 to 555897, 557 to 555886, 1161 to 555901,
        120 to 555862,
        274 to 555864, 546 to 555858, 820 to 555882, 86 to 555894, 81 to 555883,
        131 to 555879, 142 to 555857, 441 to 555900, 541 to 555866, 1156 to 555902,
        1250 to 555781, 139 to 555891,
        525 to 555887, 419 to 555889, 250 to 555895, 257 to 555881, 115 to 555893,
        298 to 559073, 1157 to 559074, 776 to 559076,
        804 to 559088, 96 to 559089, 456 to 559090, 1271 to 559092,
        1168 to 559093)
    val index = birdsNowPAPricing.get(birdIndex)

    println("Price Change for BNPA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowOHPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsOH,pwBirdsOH)
    val birdsNowOHPricing: HashMap<Int, Int> = hashMapOf(594 to 558297, 298 to 558502, 609 to 558299,
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
    val index = birdsNowOHPricing.get(birdIndex)

    println("Price Change for BNOH " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowINPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"
    birdsNowLogin(driver, usrBirdsIN, pwBirdsIN)
    val birdsNowINPricing: HashMap<Int, Int> = hashMapOf(
        594 to 558546, 298 to 558547, 609 to 558548,
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
        525 to 558585, 250 to 558586, 257 to 558588, 115 to 558589
    )
    val index = birdsNowINPricing.get(birdIndex)

    println("Price Change for BNIN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowMAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"
    birdsNowLogin(driver, usrBirdsIN, pwBirdsIN)
    val birdsNowMAPricing: HashMap<Int, Int> = hashMapOf(594 to 556314, 778 to 556312, 777 to 556313,
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
    val index = birdsNowMAPricing.get(birdIndex)

    println("Price Change for BNMA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowDLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsDL = "supportdallas@thefinchfarm.com"
    val pwBirdsDL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDL,pwBirdsDL)
    val birdsNowDLPricing: HashMap<Int, Int> = hashMapOf(594 to 558717, 298 to 559094, 609 to 559095,
        435 to 559096, 1171 to 559097, 252 to 559098, 1169 to 559099,
        778 to 559100, 604 to 559101, 439 to 559102, 458 to 559103,
        87 to 559104, 144 to 559105, 1157 to 559106,
        777 to 559107, 89 to 559108, 776 to 559109,
        804 to 559110, 96 to 559111, 557 to 559112, 120 to 559113,
        274 to 559114, 546 to 559115, 456 to 559116,
        820 to 559117, 86 to 559118, 81 to 559119,
        131 to 559120, 142 to 559121, 1271 to 559122,
        441 to 559123, 1168 to 559124,
        541 to 559125, 1156 to 559126, 1250 to 559127, 139 to 559128,
        525 to 559129, 250 to 559130, 257 to 559131, 115 to 559132)
    val index = birdsNowDLPricing.get(birdIndex)

    println("Price Change for BNDL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowDCPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsDC = "supportwashingtondc@thefinchfarm.com"
    val pwBirdsDC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDC,pwBirdsDC)
    val birdsNowDCPricing: HashMap<Int, Int> = hashMapOf(594 to 558815, 298 to 559153, 609 to 559154,
        435 to 559155, 1171 to 559156, 252 to 559157, 1169 to 559159,
        778 to 559161, 604 to 559163, 439 to 559164, 458 to 559165,
        87 to 559166, 144 to 559169, 1157 to 559170,
        777 to 559171, 89 to 559173, 776 to 559174,
        804 to 559175, 96 to 559176, 557 to 559177, 120 to 559178,
        274 to 559208, 546 to 559210, 456 to 559212,
        820 to 559215, 86 to 559216, 81 to 559217,
        131 to 559218, 142 to 559219, 1271 to 559220,
        441 to 559222, 1168 to 559223,
        541 to 559224, 1156 to 559225, 1250 to 559226, 139 to 559227,
        525 to 559228, 250 to 559229, 257 to 559231, 115 to 559232)
    val index = birdsNowDCPricing.get(birdIndex)

    println("Price Change for BNDC " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowATPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsAT = "supportatlanta@thefinchfarm.com"
    val pwBirdsAT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAT,pwBirdsAT)
    val birdsNowATPricing: HashMap<Int, Int> = hashMapOf(594 to 558958, 298 to 559239, 609 to 559240,
        435 to 559241, 1171 to 559242, 252 to 559243, 1169 to 559245,
        778 to 559292, 604 to 559293, 439 to 559294, 458 to 559295,
        87 to 559296, 144 to 559298, 1157 to 559299,
        777 to 559300, 89 to 559325, 776 to 559326,
        804 to 559301, 96 to 559302, 557 to 559303, 120 to 559304,
        274 to 559305, 546 to 559306, 456 to 559307,
        820 to 559308, 86 to 559309, 81 to 559310,
        131 to 559311, 142 to 559312, 1271 to 559313,
        441 to 559314, 1168 to 559315,
        541 to 559316, 1156 to 559317, 1250 to 559318, 139 to 559319,
        525 to 559320, 250 to 559321, 257 to 559327, 115 to 559322)
    val index = birdsNowATPricing.get(birdIndex)

    println("Price Change for BNAT " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowDTPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsDT = "supportdetroit@thefinchfarm.com"
    val pwBirdsDT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDT,pwBirdsDT)
    val birdsNowDTPricing: HashMap<Int, Int> = hashMapOf(594 to 559150, 298 to 559330, 609 to 559331,
        435 to 559334, 1171 to 559335, 252 to 559485, 1169 to 559486,
        778 to 559487, 604 to 559488, 439 to 559489, 458 to 559490,
        87 to 559491, 144 to 559492, 1157 to 559493,
        777 to 559494, 89 to 559495, 776 to 559496,
        804 to 559497, 96 to 559498, 557 to 559499, 120 to 559500,
        274 to 559501, 546 to 559502, 456 to 559503,
        820 to 559504, 86 to 559505, 81 to 559506,
        131 to 559507, 142 to 559508, 1271 to 559509,
        441 to 559510, 1168 to 559512,
        541 to 559513, 1156 to 559515, 1250 to 559516, 139 to 559517,
        525 to 559519, 250 to 559520, 257 to 559521, 115 to 559522)
    val index = birdsNowDTPricing.get(birdIndex)

    println("Price Change for BNDT " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowPDXPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsPDX = "supportportland@thefinchfarm.com"
    val pwBirdsPDX = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPDX,pwBirdsPDX)
    val birdsNowPDXPricing: HashMap<Int, Int> = hashMapOf(594 to 559666, 298 to 559667, 609 to 559668,
        435 to 559669, 1171 to 559670, 252 to 559671, 1169 to 559672,
        778 to 559674, 604 to 559675, 439 to 559676, 458 to 559677,
        87 to 559678, 144 to 559679, 1157 to 559680,
        777 to 559681, 89 to 559682, 776 to 559684,
        804 to 559685, 96 to 559686, 557 to 559687, 120 to 559688,
        274 to 559689, 546 to 559690, 456 to 559691,
        820 to 559692, 86 to 559693, 81 to 559694,
        131 to 559695, 142 to 559696, 1271 to 559697,
        441 to 559715, 1168 to 559716,
        541 to 559717, 1156 to 559718, 1250 to 559719, 139 to 559720,
        525 to 559721, 250 to 559723, 257 to 559724, 115 to 559725)
    val index = birdsNowPDXPricing.get(birdIndex)

    println("Price Change for BNPDX " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowMINPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsMIN = "supportminneapolis@thefinchfarm.com"
    val pwBirdsMIN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMIN,pwBirdsMIN)
    val birdsNowMINPricing: HashMap<Int, Int> = hashMapOf(594 to 559291, 298 to 560145, 609 to 560146,
        435 to 560147, 1171 to 560148, 252 to 560149, 1169 to 560150,
        778 to 560151, 604 to 560152, 439 to 560153, 458 to 560154,
        87 to 560155, 144 to 560156, 1157 to 560157,
        777 to 560158, 89 to 560159, 776 to 560160,
        804 to 560161, 96 to 560162, 557 to 560163, 120 to 560164,
        274 to 560165, 546 to 560166, 456 to 560167,
        820 to 560168, 86 to 560169, 81 to 560170,
        131 to 560171, 142 to 560172, 1271 to 560173,
        441 to 560174, 1168 to 560175,
        541 to 560176, 1156 to 560177, 1250 to 560178, 139 to 560179,
        525 to 560180, 250 to 560181, 257 to 560182, 115 to 560183)
    val index = birdsNowMINPricing.get(birdIndex)

    println("Price Change for BNMIN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowLAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsLA = "supportlosangeles@thefinchfarm.com"
    val pwBirdsLA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLA,pwBirdsLA)
    val birdsNowLAPricing: HashMap<Int, Int> = hashMapOf(594 to 558628, 298 to 560282, 609 to 560283,
        435 to 560284, 1171 to 560285, 252 to 560286, 1169 to 560287,
        778 to 560288, 604 to 560289, 439 to 560290, 458 to 560291,
        87 to 560292, 144 to 560293, 1157 to 560294,
        777 to 560295, 89 to 560296, 776 to 560297,
        804 to 560298, 96 to 560299, 557 to 560300, 120 to 560301,
        274 to 560302, 546 to 560303, 456 to 560305,
        820 to 560306, 86 to 560307, 81 to 560308,
        131 to 560309, 142 to 560310, 1271 to 560311,
        441 to 560312, 1168 to 560313,
        541 to 560314, 1156 to 560315, 1250 to 560316, 139 to 560317,
        525 to 560318, 250 to 560319, 257 to 560320, 115 to 560321)
    val index = birdsNowLAPricing.get(birdIndex)

    println("Price Change for BNLA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowSANPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSAN = "supportsandiego@thefinchfarm.com"
    val pwBirdsSAN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSAN,pwBirdsSAN)
    val birdsNowSANPricing: HashMap<Int, Int> = hashMapOf(594 to 559483, 298 to 560243, 609 to 560244,
        435 to 560245, 1171 to 560246, 252 to 560247, 1169 to 560322,
        778 to 560249, 604 to 560250, 439 to 560251, 458 to 560252,
        87 to 560253, 144 to 560254, 1157 to 560255,
        777 to 560256, 89 to 560257, 776 to 560258,
        804 to 560259, 96 to 560260, 557 to 560261, 120 to 560262,
        274 to 560263, 546 to 560264, 456 to 560265,
        820 to 560266, 86 to 560267, 81 to 560268,
        131 to 560269, 142 to 560270, 1271 to 560271,
        441 to 560272, 1168 to 560273,
        541 to 560274, 1156 to 560275, 1250 to 560276, 139 to 560277,
        525 to 560278, 250 to 560279, 257 to 560280, 115 to 560281)
    val index = birdsNowSANPricing.get(birdIndex)

    println("Price Change for BNSAN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowDENPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsDEN = "supportdenver@thefinchfarm.com"
    val pwBirdsDEN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDEN,pwBirdsDEN)
    val birdsNowDENPricing: HashMap<Int, Int> = hashMapOf(594 to 559653, 298 to 560403, 609 to 560448,
        435 to 560405, 1171 to 560406, 252 to 560407, 1169 to 560408,
        778 to 560409, 604 to 560410, 439 to 560411, 458 to 560412,
        87 to 560413, 144 to 560414, 1157 to 560415,
        777 to 560416, 89 to 560417, 776 to 560418,
        804 to 560449, 96 to 560420, 557 to 560421, 120 to 560422,
        274 to 560423, 546 to 560424, 456 to 560425,
        820 to 560426, 86 to 560427, 81 to 560428,
        131 to 560429, 142 to 560430, 1271 to 560431,
        441 to 560432, 1168 to 560433,
        541 to 560434, 1156 to 560435, 1250 to 560436, 139 to 560437,
        525 to 560438, 250 to 560439, 257 to 560440, 115 to 560441)
    val index = birdsNowDENPricing.get(birdIndex)

    println("Price Change for BNDEN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowBALPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsBAL = "supportbaltimore@thefinchfarm.com"
    val pwBirdsBAL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBAL,pwBirdsBAL)
    val birdsNowBALPricing: HashMap<Int, Int> = hashMapOf(594 to 559763, 298 to 560491, 609 to 560492,
        435 to 560493, 1171 to 560494, 252 to 560495, 1169 to 560496,
        778 to 560497, 604 to 560498, 439 to 560499, 458 to 560501,
        87 to 560502, 144 to 560503, 1157 to 560504,
        777 to 560505, 89 to 560506, 776 to 560507,
        804 to 560508, 96 to 560509, 557 to 560510, 120 to 560511,
        274 to 560512, 546 to 560513, 456 to 560514,
        820 to 560515, 86 to 560516, 81 to 560517,
        131 to 560518, 142 to 560519, 1271 to 560520,
        441 to 560522, 1168 to 560523,
        541 to 560524, 1156 to 560525, 1250 to 560526, 139 to 560527,
        525 to 560528, 250 to 560529, 257 to 560530, 115 to 560531)
    val index = birdsNowBALPricing.get(birdIndex)

    println("Price Change for BNBAL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowSTLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSTL = "supportstlouis@thefinchfarm.com"
    val pwBirdsSTL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSTL,pwBirdsSTL)
    val birdsNowSTLPricing: HashMap<Int, Int> = hashMapOf(594 to 559762, 298 to 560450, 609 to 560451,
        435 to 560452, 1171 to 560453, 252 to 560454, 1169 to 560455,
        778 to 560456, 604 to 560457, 439 to 560458, 458 to 560459,
        87 to 560460, 144 to 560461, 1157 to 560462,
        777 to 560464, 89 to 560465, 776 to 560466,
        804 to 560467, 96 to 560468, 557 to 560469, 120 to 560470,
        274 to 560471, 546 to 560472, 456 to 560473,
        820 to 560474, 86 to 560475, 81 to 560476,
        131 to 560477, 142 to 560479, 1271 to 560480,
        441 to 560481, 1168 to 560482,
        541 to 560483, 1156 to 560484, 1250 to 560485, 139 to 560486,
        525 to 560487, 250 to 560488, 257 to 560489, 115 to 560490)
    val index = birdsNowSTLPricing.get(birdIndex)

    println("Price Change for BNSTL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowTMPPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsTMP = "supporttampa@thefinchfarm.com"
    val pwBirdsTMP = "TFF2019!"
    birdsNowLogin(driver,usrBirdsTMP,pwBirdsTMP)
    val birdsNowTMPPricing: HashMap<Int, Int> = hashMapOf(594 to 559549, 298 to 560363, 609 to 560364,
        435 to 560365, 1171 to 560366, 252 to 560367, 1169 to 560368,
        778 to 560369, 604 to 560370, 439 to 560371, 458 to 560372,
        87 to 560373, 144 to 560374, 1157 to 560375,
        777 to 560376, 89 to 560377, 776 to 560378,
        804 to 560379, 96 to 560380, 557 to 560381, 120 to 560382,
        274 to 560383, 546 to 560384, 456 to 560385,
        820 to 560386, 86 to 560387, 81 to 560388,
        131 to 560389, 142 to 560390, 1271 to 560391,
        441 to 560392, 1168 to 560393,
        541 to 560402, 1156 to 560395, 1250 to 560396, 139 to 560397,
        525 to 560398, 250 to 560399, 257 to 560400, 115 to 560401)
    val index = birdsNowTMPPricing.get(birdIndex)

    println("Price Change for BNTMP " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowAUSPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsAUS = "supportaustin@thefinchfarm.com"
    val pwBirdsAUS = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAUS,pwBirdsAUS)
    val birdsNowAUSPricing: HashMap<Int, Int> = hashMapOf(594 to 560087, 298 to 560832, 609 to 560833,
        435 to 560834, 1171 to 560835, 252 to 560836, 1169 to 560837,
        778 to 560838, 604 to 560839, 439 to 560840, 458 to 560841,
        87 to 560843, 144 to 560844, 1157 to 560845,
        777 to 560846, 89 to 560847, 776 to 560848,
        804 to 560849, 96 to 560850, 557 to 560851, 120 to 560852,
        274 to 560853, 546 to 560854, 456 to 560855,
        820 to 560856, 86 to 560857, 81 to 560858,
        131 to 560859, 142 to 560860, 1271 to 560861,
        441 to 560862, 1168 to 560863,
        541 to 560864, 1156 to 560865, 1250 to 560866, 139 to 560867,
        525 to 560868, 250 to 560869, 257 to 560870, 115 to 560871)
    val index = birdsNowAUSPricing.get(birdIndex)

    println("Price Change for BNAUS " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowLVGPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsLVG = "supportlasvegas@thefinchfarm.com"
    val pwBirdsLVG = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLVG,pwBirdsLVG)
    val birdsNowLVGPricing: HashMap<Int, Int> = hashMapOf(594 to 560086, 298 to 560753, 609 to 560754,
        435 to 560755, 1171 to 560756, 252 to 560757, 1169 to 560758,
        778 to 560759, 604 to 560760, 439 to 560761, 458 to 560762,
        87 to 560763, 144 to 560764, 1157 to 560765,
        777 to 560766, 89 to 560767, 776 to 560808,
        804 to 560769, 96 to 560770, 557 to 560771, 120 to 560773,
        274 to 560774, 546 to 560775, 456 to 560776,
        820 to 560777, 86 to 560817, 81 to 560779,
        131 to 560780, 142 to 560781, 1271 to 560821,
        441 to 560783, 1168 to 560784,
        541 to 560785, 1156 to 560786, 1250 to 560787, 139 to 560788,
        525 to 560789, 250 to 560829, 257 to 560791, 115 to 560792)
    val index = birdsNowLVGPricing.get(birdIndex)

    println("Price Change for BNLVG " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowPITTPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsPITT = "supportpittsburgh@thefinchfarm.com"
    val pwBirdsPITT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPITT,pwBirdsPITT)
    val birdsNowPITTPricing: HashMap<Int, Int> = hashMapOf(594 to 560084, 298 to 560701, 609 to 560702,
        435 to 560703, 1171 to 560704, 252 to 560705, 1169 to 560706,
        778 to 560707, 604 to 560708, 439 to 560740, 458 to 560710,
        87 to 560711, 144 to 560712, 1157 to 560713,
        777 to 560714, 89 to 560715, 776 to 560716,
        804 to 560717, 96 to 560718, 557 to 560719, 120 to 560720,
        274 to 560721, 546 to 560722, 456 to 560723,
        820 to 560724, 86 to 560725, 81 to 560726,
        131 to 560727, 142 to 560728, 1271 to 560741,
        441 to 560730, 1168 to 560731,
        541 to 560732, 1156 to 560733, 1250 to 560734, 139 to 560735,
        525 to 560736, 250 to 560737, 257 to 560738, 115 to 560739)
    val index = birdsNowPITTPricing.get(birdIndex)

    println("Price Change for BNPITT " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowSACPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSAC = "supportsacramento@thefinchfarm.com"
    val pwBirdsSAC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSAC,pwBirdsSAC)
    val birdsNowSACPricing: HashMap<Int, Int> = hashMapOf(594 to 560083, 298 to 560651, 609 to 560652,
        435 to 560697, 1171 to 560654, 252 to 560655, 1169 to 560656,
        778 to 560657, 604 to 560658, 439 to 560659, 458 to 560660,
        87 to 560661, 144 to 560662, 1157 to 560663,
        777 to 560664, 89 to 560665, 776 to 560666,
        804 to 560667, 96 to 560668, 557 to 560669, 120 to 560670,
        274 to 560671, 546 to 560672, 456 to 560698,
        820 to 560674, 86 to 560675, 81 to 560676,
        131 to 560677, 142 to 560678, 1271 to 560679,
        441 to 560680, 1168 to 560681,
        541 to 560682, 1156 to 560683, 1250 to 560684, 139 to 560685,
        525 to 560686, 250 to 560687, 257 to 560688, 115 to 560689)
    val index = birdsNowSACPricing.get(birdIndex)

    println("Price Change for BNSAC " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowCHARPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsCHAR = "supportcharlotte@thefinchfarm.com"
    val pwBirdsCHAR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCHAR,pwBirdsCHAR)
    val birdsNowCHARPricing: HashMap<Int, Int> = hashMapOf(594 to 560079, 298 to 560571, 609 to 560969,
        435 to 560573, 1171 to 560574, 252 to 560576, 1169 to 560578,
        778 to 560579, 604 to 560580, 439 to 560581, 458 to 560582,
        87 to 560583, 144 to 560584, 1157 to 560585,
        777 to 560586, 89 to 560587, 776 to 560588,
        804 to 560589, 96 to 560590, 557 to 560591, 120 to 560592,
        274 to 560593, 546 to 560594, 456 to 560595,
        820 to 560596, 86 to 560597, 81 to 560598,
        131 to 560599, 142 to 560983, 1271 to 560601,
        441 to 560602, 1168 to 560603,
        541 to 560604, 1156 to 560605, 1250 to 560606, 139 to 560607,
        525 to 560608, 250 to 560609, 257 to 560610, 115 to 560611)
    val index = birdsNowCHARPricing.get(birdIndex)

    println("Price Change for BNCHAR " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowSANTPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSANT = "supportsanantonio@thefinchfarm.com"
    val pwBirdsSANT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSANT,pwBirdsSANT)
    val birdsNowSANTPricing: HashMap<Int, Int> = hashMapOf(594 to 560080, 298 to 560612, 609 to 560613,
        435 to 560614, 1171 to 560615, 252 to 560616, 1169 to 560617,
        778 to 560618, 604 to 560619, 439 to 560699, 458 to 560621,
        87 to 560622, 144 to 560700, 1157 to 560624,
        777 to 560625, 89 to 560626, 776 to 560627,
        804 to 560628, 96 to 560629, 557 to 560630, 120 to 560631,
        274 to 560632, 546 to 560633, 456 to 560634,
        820 to 560635, 86 to 560636, 81 to 560637,
        131 to 560638, 142 to 560639, 1271 to 560640,
        441 to 560641, 1168 to 560642,
        541 to 560643, 1156 to 560644, 1250 to 560645, 139 to 560646,
        525 to 560647, 250 to 560648, 257 to 560649, 115 to 560650)
    val index = birdsNowSANTPricing.get(birdIndex)

    println("Price Change for BNSANT " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun hooblyWAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrHooblyWA = "customersupport@thefinchfarm.com"
    val pwHooblyWA = "Marketing2019!"
    hooblyLogin(driver,usrHooblyWA,pwHooblyWA)
    val hooblyWAPricing: HashMap<Int, String> = hashMapOf(1250 to "hd8r6", 84 to "KNEXh", 86 to "rcUay",458 to "lwUzY", 250 to "vKclC", 479 to "nyuye", 1161 to "i6yGN",
        260 to "QE0y1",783 to "CWfgP", 477 to "vjc07", 419 to "JMQws", 605 to "0dFbB", 132 to "4iTm6", 594 to "FZ0Bm", 572 to "RnbXy", 1161 to "vXqoa", 269 to "HY7My",
        141 to "dJNJx",139 to "k4N5C",546 to "ltc2x", 751 to "T9KD9", 483 to "U3Kyk", 795 to "U5ORI", 604 to "NaN0H", 777 to "eeDAL", 778 to "ZaAVE", 423 to "AgAwK",
        284 to "7wgmN", 274 to "BkYaN", 457 to "0c8TU", 646 to "ClTO6", 120 to "ZepT3", 131 to "6qGm2", 81 to "IUadk", 606 to "dYrD6", 527 to "CmeqH", 1171 to "5relL",
        144 to "eD3Rn", 528 to "MdUHa", 257 to "CmPz2", 570 to "1Zc33", 647 to "AccBa", 776 to "72ae9", 441 to "WiYEc", 459 to "RXjWL", 132 to "RM2kj", 87 to "gfYMc",
        820 to "Uhi55", 609 to "aVw9O", 142 to "QOZH1", 803 to "ujbPf", 469 to "JJYf0", 114 to "pncBM", 597 to "2fapx", 801 to "Rz06f",525 to "XaVLW",143 to "5lxlC",435 to "Cj53A")
    val index = hooblyWAPricing.get(birdIndex)

    println("Price Change for HooWA " + top40template.get(birdIndex) + " at index " + index)

}

fun hooblyFLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrHooblyFL = "customersupportFL@thefinchfarm.com"
    val pwHooblyFL = "TFFFL2019!"
    hooblyLogin(driver,usrHooblyFL,pwHooblyFL)
    val hooblyFLPricing: HashMap<Int, String> = hashMapOf(250 to "xyfiT",820 to "nuhMi",87 to "CUMch",257 to "Nc20R",86 to "BbiCS",139 to "AHedI",609 to "zOdc6",115 to "zeq08",
        81 to "7rtFO",525 to "zXLd6",419 to "SQksa", 435 to "7cQR8", 557 to "feg87",458 to "G5fcU",131 to "MDZ3d",1250 to "0dBFw",606 to "gsqLh",546 to "xh26W",777 to "ohKgb",89 to "FPlAs",
        528 to "l6eEy",604 to "pi99M",441 to "n4Bnq",142 to "tewX5",594 to "G05ly",120 to "cmdyr",274 to "flTwp",778 to "kF6lh",541 to "fkLjz")
    val index = hooblyFLPricing.get(birdIndex)

    println("Price Change for HooFL " + top40template.get(birdIndex) + " at index " + index)

}

fun hooblyAZPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrHooblyAZ = "customersupportAZ@thefinchfarm.com"
    val pwHooblyAZ = "TFFAZ2019!"
    hooblyLogin(driver,usrHooblyAZ,pwHooblyAZ)
    var hooblyAZPricing: HashMap<Int, String> = hashMapOf(546 to "ZNq1T",120 to "nWZFV",274 to "xfSlP",139 to "2FPED",250 to "E9OY6",144 to "ozVSI",86 to "vG7af",131 to "h6POZ",
        477 to "C1xCa",1157 to "QwvUF",777 to "6LgSS",594 to "HhzPl",142 to "mOose",115 to "DLZ32",609 to "1WOeY",419 to "jpSrh",435 to "C4wcl",528 to "egumo",89 to "aNDSk",
        541 to "YPQyK",778 to "aHfQm",441 to "1jcUq",87 to "ffcG4",1250 to "pwILM",606 to "7MrjN",458 to "hoOxg",81 to "SmQhH",604 to "hV5if",557 to "yK5Ro",525 to "9mZKz",
        820 to "69WA0")
    val index = hooblyAZPricing.get(birdIndex)

    println("Price Change for HooAZ " + top40template.get(birdIndex) + " at index " + index)
}

fun hooblyCAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrHooblyCA = "customersupportCA@thefinchfarm.com"
    val pwHooblyCA = "TFFC3522!"
    hooblyLogin(driver,usrHooblyCA,pwHooblyCA)
    val hooblyCAPricing: HashMap<Int, String> = hashMapOf(131 to "lwO0b",81 to "ITYhd",86 to "UXvup",604 to "2HrtL",546 to "N9cro",458 to "RKSUg",419 to "Jmj6h",1250 to "uIvlf",
        144 to "2B7y0",139 to "JpXqh",777 to "4yg3N",528 to "G1H7C",820 to "45bRF",441 to "RVEsv",1258 to "CFCBe",606 to "KNbQg",778 to "9eMkb",594 to "YFSFe",142 to "uEhZb",
        1257 to "bC0sv",274 to "iaDmn",110 to "ZSNbM",115 to "77Ec1",250 to "miryH",87 to "znNNe",609 to "TJ8DM",435 to "uRHMp",525 to "a83tI",557 to "AFn8c",120 to "eqIaw",
        89 to "z2xXB",541 to "DHcvX")
    val index = hooblyCAPricing.get(birdIndex)

    println("Price Change for HooCA " + top40template.get(birdIndex) + " at index " + index)
}
