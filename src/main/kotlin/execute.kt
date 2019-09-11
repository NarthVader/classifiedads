package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.support.ui.*
import org.openqa.selenium.chrome.ChromeDriver
import java.util.HashMap


fun birdsNowWA(driver: ChromeDriver, pass: Int) {

    Thread.sleep(1000)

    val birdsWA: IntArray = intArrayOf(520353,520364,520726,520733,520759,520833,520885,
        520950,526507,526530,527836,528305,528311,528585,528593,528595,528597,530942,
        530943,530947,531348,531349,531392,531395,534155,534157,534162,534869,534871,
        534872,535294,537300,537303,537313,537314,537315,537420,543572,543931,544252,
        544254,544385,544769,545328,545339,545475,545479,545480,545547,545597,545683,545685,
        545688,545691,545694,545738,545739,545741,545788,545791,545842,545907,545908,545945,
        545946,545947,546949,546952,547028,547111,547160,547210,547215,547217,547366,
        547409,547410,547510,547615,547616,547687,547810,547812,547814,547815,547816)

    println("birdNowWA: " + birdsWA.size)
    executeBNPartial(driver,birdsWA,pass)
    Thread.sleep(3000)
}

fun birdsNowCA(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsCA: IntArray = intArrayOf(
        558749,558750,558752,558753,558754,558757,558758,558759,558760,558761,558762,558763,
        549549,549550,549657,549689,
        550026,550132,550213,550215,
        550583,550585,550587,
        554834,554835,554836,554837,554838,554839,554840,554846,554847,554848,554849,554850,554842,554844,554845,554841,556355 )

    println("birdNowCA: " + birdsCA.size)
    executeBNPartial(driver,birdsCA,pass)
    Thread.sleep(3000)
}

fun birdsNowAZ(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsAZ: IntArray = intArrayOf(558832,558831,558830,558829,558819,558820,558828,558827,558826,558825,558824,558822,558821,
        550458,550511,550512,550513,550514,550515,550516,550517,550518,
        554865,554867,554868,554869,554870,554872,554873,554876,554877,554878,554880,554881,554882,554884,554885,554886,554871,554541)

    println("birdNowAZ: " + birdsAZ.size)
    executeBNPartial(driver,birdsAZ,pass)
    Thread.sleep(3000)
}

fun birdsNowORL(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsORL: IntArray = intArrayOf(559764,560532,560533,560534,560535,560536,560537,560538,560539,560540,560541,560542,560543,560544,560545,560546,560547,560548,
        560549,560550,560551,560552,560553,560554,560555,560556,560557,560577,560559,560560,560561,560562,560563,560564,560565,560566,560567,560568,560569,560570)

    println("birdNowORL: " + birdsORL.size)
    executeBNPartial(driver,birdsORL,pass)
    Thread.sleep(3000)
}

fun birdsNowRVR(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsRVR: IntArray = intArrayOf(559072,560323,560324,560325,560326,560327,560328,560329,560330,560331,560332,560333,560334,560335,560336,560337,560338,560339,
        560340,560341,560342,560343,560344,560345,560346,560347,560348,560349,560350,560351,560352,560353,560354,560355,560356,560357,560358,560359,560360,560362)
    val birdsNowRVRPricing: HashMap<Int, Int> = hashMapOf(594 to 559072, 298 to 560323, 609 to 560324,
        435 to 560325, 1171 to 560326, 252 to 560327, 1169 to 560328,
        778 to 560329, 604 to 560330, 439 to 560331, 458 to 560332,
        87 to 560333, 144 to 560334, 1157 to 560335,
        777 to 560336, 89 to 560337, 776 to 560338,
        804 to 560339, 96 to 560340, 557 to 560341, 120 to 560342,
        274 to 560343, 546 to 560344, 456 to 560345,
        820 to 560346, 86 to 560347, 81 to 560348,
        131 to 560349, 142 to 560350, 1271 to 560351,
        441 to 560352, 1168 to 560353,
        541 to 560354, 1156 to 560355, 1250 to 560356, 139 to 560357,
        525 to 560358, 250 to 560359, 257 to 560360, 115 to 560362)

    println("birdNowRVR: " + birdsRVR.size)
    executeBNPartial(driver,birdsRVR,pass)
    Thread.sleep(3000)
}

//fun birdsNowKAN(driver: ChromeDriver, pass: Int) {
//
//    Thread.sleep(3000)
//
//    val birdsKAN: IntArray = intArrayOf(560094,560911,560912,560913,560914,560915,560916,560917,560918,560919,560920,560921,560922,560923,560924,560925,560926,560927,
//        560889,560929,560930,560931,560932,560933,560934,560935,560936,560898,560899,560900,560901,560902,560903,560943,560905,560906,560907,560909,560910)
//    val birdsNowKANPricing: HashMap<Int, Int> = hashMapOf(594 to 560094, 298 to 560911, 609 to 560912,
//        435 to 560913, 1171 to 560914, 252 to 560915, 1169 to 560916,
//        778 to 560917, 604 to 560918, 439 to 560919, 458 to 560920,
//        87 to 560921, 144 to 560922, 1157 to 560923,
//        777 to 560924, 89 to 560925, 776 to 560926,
//        804 to 560927, 96 to 560889, 96 to 560928, 557 to 560929, 120 to 560930,
//        274 to 560931, 546 to 560932, 456 to 560933,
//        820 to 560934, 86 to 560935, 81 to 560936,
//        131 to 560898, 142 to 560899, 1271 to 560900,
//        441 to 560901, 1168 to 560902,
//        541 to 560903, 1156 to 560943, 1250 to 560905, 139 to 560906,
//        525 to 560907, 250 to "Lady Gouldian Finch - Yellow-back", 257 to 560909, 115 to 560910)
//
//    println("birdNowKAN: " + birdsKAN.size)
//    executeBNPartial(driver,birdsKAN,pass)
//    Thread.sleep(3000)
//}

fun birdsNowFL(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsFL: IntArray = intArrayOf(550466,550500,550501,550502,550503,550504,550505,550506,550508,550509,
        554664,554669,554575,554668,554670,554660,554647,554662,554654,554658,554667,554651,554661,554665,554657,554663,554666,554671,554577,
        558840,558841,558842,558853,558844,558845,558846,558847,558849,558851,558852)

    println("birdNowFL: " + birdsFL.size)
    executeBNPartial(driver,birdsFL,pass)
    Thread.sleep(3000)
}

fun birdsNowTX(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsTX: IntArray = intArrayOf(558962,558964,558966,558968,558969,558970,558973,558978,558979,
        555365,555350,555346,555310,555307,555314,555337,555358,555348,555311,555327,555357,555343,555362,555312,555313,555309,555339,555354,555342,555336,555306,555360,555316,555366,555266,555351,555344,555356,555338,555353)

    println("birdNowTX: " + birdsTX.size)
    executeBNPartial(driver,birdsTX,pass)
    Thread.sleep(3000)
}

fun birdsNowNY(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsNY: IntArray = intArrayOf(551369,555636,555633,550797,550527,555622,555626,555127,555635,555619,555627,555643,550605,555631,555620,555621,555617,555629,555640,555630,555624,555615,555644,550796,555616,555638,555632,555641,555628,555639,
        558989,559001,558991,558992,558993,558994,558995,559002,558996,558997)

    println("birdNowNY: " + birdsNY.size)
    executeBNPartial(driver,birdsNY,pass)
    Thread.sleep(3000)
}

fun birdsNowIL(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsIL: IntArray = intArrayOf(555468,555763,555761,555466,555479,555476,555647,555769,555762,555467,555768,555469,555759,555474,555475,555461,555650,555766,555758,555646,555453,555770,555477,555771,555393,555764,555760,555767,555649,555765,
        559016,559003,559004,559006,559007,559008,559009,559010,559011,559013)

    println("birdNowIL: " + birdsIL.size)
    executeBNPartial(driver,birdsIL,pass)
    Thread.sleep(3000)
}

fun birdsNowPA(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsPA: IntArray = intArrayOf(555861,555890,555888,555859,555867,555865,555880,555898,555903,555860,555877,555897,555886,555901,555862,555864,555858,
        555882,555894,555883,555879,555857,555900,555866,555902,555781,555891,555887,555895,555881,555893,555889,
        559073,559074,559076,559088,559089,559090,559092,559093)

    println("birdNowPA: " + birdsPA.size)
    executeBNPartial(driver,birdsPA,pass)
    Thread.sleep(3000)
}

fun birdsNowOH(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsOH: IntArray = intArrayOf(558297,558502,558299,558300,558499,558504,558497,558301,558303,558303,558306,558307,558311,
        558308,558309,558310,558501,558505,558493,558312,558313,558314,558315,558503,558316,558317,558318,558319,558321,558492,558324,558508,
        558325,558326,556209,558328,558329,558330,558331,558332)

    println("birdNowOH: " + birdsOH.size)
    executeBNPartial(driver,birdsOH,pass)
    Thread.sleep(3000)
}

fun birdsNowIN(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsIN: IntArray = intArrayOf(558546,558547,558548,558549,558550,558551,558552,558553,558554,558555,558556,558557,558558,558559,558560,558561,
        558562,558563,558565,558566,558567,558568,558569,558570,558571,558573,558575,558576,558577,558578,558579,558580,558582,558583,556208,558584,
        558585,558586,558588,558589)

    println("birdNowIN: " + birdsIN.size)
    executeBNPartial(driver,birdsIN,pass)
    Thread.sleep(3000)
}

fun birdsNowMA(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsMA: IntArray = intArrayOf(556314,556312,556313,556315,556311,556207,558645,558646,558647,558648,558650,558651,558653,558655,558656,558657,558658,
        558738,558739,558740,558742,558743,558745,558746,558720,558721,558722,558723,558724,558725,558726,558727,558728,558730,558731,558732,558733,558734,
        558735,558736)


    println("birdNowMA: " + birdsMA.size)
    executeBNPartial(driver,birdsMA,pass)
    Thread.sleep(3000)
}

fun birdsNowDL(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsDL: IntArray = intArrayOf(558717,559094,559095,559096,559097,559098,559099,559100,559101,559102,559103,559104,559105,559106,559107,559108,
        559109,559110,559111,559112,559113,559114,559115,559116,559117,559118,559119,559120,559121,559122,559123,559124,559125,559126,559127,559128,559129,
        559130,559131,559132)

    println("birdNowDL: " + birdsDL.size)
    executeBNPartial(driver,birdsDL,pass)
    Thread.sleep(3000)
}

fun birdsNowDC(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsDC: IntArray = intArrayOf(558815,559153,559154,559155,559156,559157,559159,559161,559163,559164,559165,559166,559169,559170,559171,559173,
        559174,559175,559176,559177,559178,559208,559210,559212,559215,559216,559217,559218,559219,559220,559222,559223,559224,559225,559226,559227,559228,
        559229,559231,559232)

    println("birdNowDC: " + birdsDC.size)
    executeBNPartial(driver,birdsDC,pass)
    Thread.sleep(3000)
}

fun birdsNowAT(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsAT: IntArray = intArrayOf(558958,559239,559240,559241,559242,559243,559245,559292,559293,559294,559295,559296,559298,559299,559300,559325,559326,
        559301,559302,559303,559304,559305,559306,559307,559308,559309,559310,559311,559312,559313,559314,559315,559316,559317,559318,559319,559320,559321,559327,
        559322)

    println("birdNowAT: " + birdsAT.size)
    executeBNPartial(driver,birdsAT,pass)
    Thread.sleep(3000)
}

fun birdsNowDT(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsDT: IntArray = intArrayOf(559150,559330,559331,559334,559335,559485,559486,559487,559488,559489,559490,559491,559492,559493,559494,559495,559496,
        559497,559498,559499,559500,559501,559502,559503,559504,559505,559506,559507,559508,559509,559510,559512,559513,559515,559516,559517,559519,559520,559521,
        559522)

    println("birdNowDT: " + birdsDT.size)
    executeBNPartial(driver,birdsDT,pass)
    Thread.sleep(3000)
}

fun birdsNowPDX(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsPDX: IntArray = intArrayOf(559666,559667,559668,559669,559670,559671,559672,559674,559675,559676,559677,559678,559679,559680,559681,559682,
        559684,559685,559686,559687,559688,559689,559690,559691,559692,559693,559694,559695,559696,559697,559715,559716,559717,559718,559719,559720,
        559721,559723,559724,559725)

    println("birdNowPDX: " + birdsPDX.size)
    executeBNPartial(driver,birdsPDX,pass)
    Thread.sleep(3000)
}

fun birdsNowMIN(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsMIN: IntArray = intArrayOf(559291,560145,560146,560147,560148,560149,560150,560151,560152,560153,560154,560155,560156,560157,560158,560159,560160,
        560161,560162,560163,560164,560165,560166,560167,560168,560169,560170,560171,560172,560173,560174,560175,560176,560177,560178,560179,560180,560181,
        560182,560183)

    println("birdNowMIN: " + birdsMIN.size)
    executeBNPartial(driver,birdsMIN,pass)
    Thread.sleep(3000)
}

fun birdsNowLA(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsLA: IntArray = intArrayOf(558628,560282,560283,560284,560285,560286,560287,560288,560289,560290,560291,560292,560293,560294,560295,560296,560297,
        560298,560299,560300,560301,560302,560303,560305,560306,560307,560308,560309,560310,560311,560312,560313,560314,560315,560316,560317,560318,560319,
        560320,560321)

    println("birdNowLA: " + birdsLA.size)
    executeBNPartial(driver,birdsLA,pass)
    Thread.sleep(3000)
}

fun birdsNowSAN(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsSAN: IntArray = intArrayOf(559483,560243,560244,560245,560246,560247,560322,560249,560250,560251,560252,560253,560254,560255,560256,560257,560258,
        560259,560260,560261,560262,560263,560264,560265,560266,560267,560268,560269,560270,560271,560272,560273,560274,560275,560276,560277,560278,560279,
        560280,560281)

    println("birdNowSAN: " + birdsSAN.size)
    executeBNPartial(driver,birdsSAN,pass)
    Thread.sleep(3000)
}

fun birdsNowDEN(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsDEN: IntArray = intArrayOf(559653,560403,560448,560405,560406,560407,560408,560409,560410,560411,560412,560413,560414,560415,560416,560417,560418,560449,
        560420,560421,560422,560423,560424,560425,560426,560427,560428,560429,560430,560431,560432,560433,560434,560435,560436,560437,560438,560439,560440,560441)

    println("birdNowDEN: " + birdsDEN.size)
    executeBNPartial(driver,birdsDEN,pass)
    Thread.sleep(3000)
}

fun birdsNowBAL(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsBAL: IntArray = intArrayOf(559763,560491,560492,560493,560494,560495,560496,560497,560498,560499,560501,560502,560503,560504,560505,560506,560507,560508,
        560509,560510,560511,560512,560513,560514,560515,560516,560517,560518,560519,560520,560522,560523,560524,560525,560526,560527,560528,560529,560530,560531)

    println("birdNowBAL: " + birdsBAL.size)
    executeBNPartial(driver,birdsBAL,pass)
    Thread.sleep(3000)
}

fun birdsNowSTL(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsSTL: IntArray = intArrayOf(559762,560450,560451,560452,560453,560454,560455,560456,560457,560458,560459,560460,560461,560462,560464,560465,560466,560467,560468,
        560469,560470,560471,560472,560473,560474,560475,560476,560477,560479,560480,560481,560482,560483,560484,560485,560486,560487,560489,560488,560490)

    println("birdNowSTL: " + birdsSTL.size)
    executeBNPartial(driver,birdsSTL,pass)
    Thread.sleep(3000)
}

fun birdsNowTMP(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsTMP: IntArray = intArrayOf(559549,560363,560364,560365,560366,560367,560368,560369,560370,560371,560372,560373,560374,560375,560376,560377,560378,560379,560380,
        560381,560382,560383,560384,560385,560386,560387,560388,560389,560390,560391,560392,560393,560402,560395,560396,560397,560398,560399,560400,560401)

    println("birdNowTMP: " + birdsTMP.size)
    executeBNPartial(driver,birdsTMP,pass)
    Thread.sleep(3000)
}

fun birdsNowAUS(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsAUS: IntArray = intArrayOf(560087,560832,560833,560834,560835,560836,560837,560838,560839,560840,560841,560843,560844,560845,560846,560847,560848,560849,
        560850,560851,560852,560853,560854,560855,560856,560857,560858,560859,560860,560861,560862,560863,560864,560865,560866,560867,560868,560869,560870,560871)

    println("birdNowAUS: " + birdsAUS.size)
    executeBNPartial(driver,birdsAUS,pass)
    Thread.sleep(3000)
}

fun birdsNowLVG(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsLVG: IntArray = intArrayOf(560086,560753,560754,560755,560756,560757,560758,560759,560760,560761,560762,560763,560764,560765,560766,560767,560808,560769,
        560770,560771,560773,560774,560775,560776,560777,560817,560779,560780,560781,560821,560783,560784,560785,560786,560787,560788,560789,560829,560791,560792)

    println("birdNowLVG: " + birdsLVG.size)
    executeBNPartial(driver,birdsLVG,pass)
    Thread.sleep(3000)
}

fun birdsNowPITT(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsPITT: IntArray = intArrayOf(560084,560701,560702,560703,560704,560705,560706,560707,560708,560740,560710,560711,560712,560713,560714,560715,560716,560717,
        560718,560719,560720,560721,560722,560723,560724,560725,560726,560727,560728,560741,560730,560731,560732,560733,560734,560735,560736,560737,560738,560739)

    println("birdNowPITT: " + birdsPITT.size)
    executeBNPartial(driver,birdsPITT,pass)
    Thread.sleep(3000)
}

fun birdsNowSAC(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsSAC: IntArray = intArrayOf(560083,560651,560652,560697,560654,560655,560656,560657,560658,560659,560660,560661,560662,560663,560664,560665,560666,560667,
        560668,560669,560670,560671,560672,560698,560674,560675,560676,560677,560678,560679,560680,560681,560682,560683,560684,560685,560686,560687,560688,560689)

    println("birdNowSAC: " + birdsSAC.size)
    executeBNPartial(driver,birdsSAC,pass)
    Thread.sleep(3000)
}

fun birdsNowCHAR(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsCHAR: IntArray = intArrayOf(560079,560571,560969,560573,560574,560576,560578,560579,560580,560581,560582,560583,560584,560585,560586,560587,560588,560589,
        560590,560591,560592,560593,560594,560595,560596,560597,560598,560599,560983,560601,560602,560603,560604,560605,560606,560607,560608,560609,560610,560611)

    println("birdNowCHAR: " + birdsCHAR.size)
    executeBNPartial(driver,birdsCHAR,pass)
    Thread.sleep(3000)
}

fun birdsNowSANT(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val birdsSANT: IntArray = intArrayOf(560080,560612,560613,560614,560615,560616,560617,560618,560619,560699,560621,560622,560700,560624,560625,560626,560627,560628,
        560629,560630,560631,560632,560633,560634,560635,560636,560637,560638,560639,560640,560641,560642,560643,560644,560645,560646,560647,560648,560649,560650)

    println("birdNowSANT: " + birdsSANT.size)
    executeBNPartial(driver,birdsSANT,pass)
    Thread.sleep(3000)
}

fun adNow(driver: ChromeDriver,i: Int) {

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
    executeAdsPartial(driver,ads,i)
}

fun hooblyWA(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val hooblyWAPricing: HashMap<Int, String> = hashMapOf(1250 to "hd8r6", 84 to "KNEXh", 86 to "rcUay",458 to "lwUzY", 250 to "vKclC", 479 to "nyuye", 1161 to "i6yGN",
        260 to "QE0y1",783 to "CWfgP", 477 to "vjc07", 419 to "JMQws", 605 to "0dFbB", 132 to "4iTm6", 594 to "FZ0Bm", 572 to "RnbXy", 1161 to "vXqoa", 269 to "HY7My",
        141 to "dJNJx",139 to "k4N5C",546 to "ltc2x", 751 to "T9KD9", 483 to "U3Kyk", 795 to "U5ORI", 604 to "NaN0H", 777 to "eeDAL", 778 to "ZaAVE", 423 to "AgAwK",
        284 to "7wgmN", 274 to "BkYaN", 457 to "0c8TU", 646 to "ClTO6", 120 to "ZepT3", 131 to "6qGm2", 81 to "IUadk", 606 to "dYrD6", 527 to "CmeqH", 1171 to "5relL",
        144 to "eD3Rn", 528 to "MdUHa", 257 to "CmPz2", 570 to "1Zc33", 647 to "AccBa", 776 to "72ae9", 441 to "WiYEc", 459 to "RXjWL", 132 to "RM2kj", 87 to "gfYMc",
        820 to "Uhi55", 609 to "aVw9O", 142 to "QOZH1", 803 to "ujbPf", 469 to "JJYf0", 114 to "pncBM", 597 to "2fapx", 801 to "Rz06f",525 to "XaVLW",143 to "5lxlC",435 to "Cj53A")
    var hoobly:Array<String> = arrayOf("hd8r6","KNEXh","rcUay","lwUzY","vKclC","nyuye","i6yGN","QE0y1","CWfgP","vjc07","JMQws","0dFbB","4iTm6","FZ0Bm","RnbXy","vXqoa","HY7My",
        "dJNJx","k4N5C","ltc2x","T9KD9","U3Kyk","U5ORI","NaN0H","eeDAL","ZaAVE","AgAwK","7wgmN","BkYaN","0c8TU","ClTO6","ZepT3","6qGm2","IUadk","dYrD6","CmeqH","5relL","eD3Rn",
        "MdUHa","CmPz2","1Zc33","AccBa","72ae9","WiYEc","RXjWL","RM2kj","gfYMc","Uhi55","aVw9O","QOZH1","ujbPf","JJYf0","pncBM","2fapx","Rz06f","XaVLW","5lxlC","Cj53A")

    println("hooblyWA: " + hoobly.size)
    executeHooblyPartial(driver,hoobly,pass)
    Thread.sleep(3000)
}

fun hooblyFL(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    val hoobly:Array<String> = arrayOf("xyfiT","nuhMi","CUMch","Nc20R","BbiCS","AHedI","zOdc6","zeq08","7rtFO","zXLd6","SQksa","7cQR8","feg87","G5fcU","MDZ3d","0dBFw","gsqLh",
        "xh26W","ohKgb","FPlAs","l6eEy","pi99M","n4Bnq","tewX5","G05ly","cmdyr","flTwp","kF6lh","fkLjz")

    println("hooblyFL: " + hoobly.size)
    executeHooblyPartial(driver,hoobly,pass)
    Thread.sleep(3000)
}

fun hooblyAZ(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    var hoobly: Array<String> = arrayOf("ZNq1T","nWZFV","xfSlP","2FPED","E9OY6","ozVSI","vG7af","h6POZ","C1xCa","QwvUF","6LgSS","HhzPl","mOose","DLZ32","1WOeY","jpSrh","C4wcl",
        "egumo","aNDSk","YPQyK","aHfQm","1jcUq","ffcG4","pwILM","7MrjN","hoOxg","SmQhH","hV5if","yK5Ro","9mZKz","69WA0")

    println("hooblyAZ: " + hoobly.size)
    executeHooblyPartial(driver,hoobly,pass)
    Thread.sleep(3000)
}

fun hooblyCA(driver: ChromeDriver, pass: Int) {

    Thread.sleep(3000)

    var hoobly: Array<String> = arrayOf("lwO0b","ITYhd","UXvup","2HrtL","N9cro","RKSUg","Jmj6h","uIvlf","2B7y0","JpXqh","4yg3N","G1H7C","45bRF","RVEsv","CFCBe","KNbQg","9eMkb",
        "YFSFe","uEhZb","bC0sv","iaDmn","ZSNbM","77Ec1","miryH","znNNe","TJ8DM","uRHMp","a83tI","AFn8c","eqIaw","z2xXB","DHcvX")

    println("hooblyCA: " + hoobly.size)
    executeHooblyPartial(driver,hoobly,pass)
    Thread.sleep(3000)
}


fun catsNow(driver: ChromeDriver, i: Int) {

    Thread.sleep(3000)

    val cats: IntArray = intArrayOf(2752,2753,2755,2757,2758,2759,2762,2763,2764,2765,2743,2767,2768,2775,2776,2777,2778,2779,2780)
    println("Cats Now: " + cats.size)
    executeCNPartial(driver,cats,i)
    Thread.sleep(3000)
}

fun repsNow(driver: ChromeDriver, i: Int) {

    Thread.sleep(3000)
    val reps: IntArray = intArrayOf(2405,2414,2415,2417,2418)
    println("Reps Now: " + reps.size)
    executeRepsPartial(driver,reps,i)

}

fun executeRepsPartial(driver: ChromeDriver, reps: IntArray, startIndex: Int) {

    val repsUpdated = reps.size/4
    val repStart = repsUpdated*startIndex
    println(repsUpdated)
    println(repStart)
    var repEnd = 0
    if(startIndex==3) {
        repEnd=reps.size-1
    } else {
        repEnd=(repStart+repsUpdated)-1
    }
    println(repEnd)
    for (i in repStart..repEnd) {
        val index = reps[i]
        println("$i: " + index)
        driver.get("http://www.reptilesnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.reptilesnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun dogsNow(driver: ChromeDriver,i: Int) {

    Thread.sleep(3000)
    val dogs: IntArray = intArrayOf(240926,240929,240948,241035,241243,241363,241501,241508,
        241509,242112,242113,242114,242115,242118,242125,242126,242127,242190,242192,242195,
        242198,242201,242202,242208,242215,242218)
    println("Dogs Now: " + dogs.size)
    executeDogsPartial(driver,dogs,i)
    driver.get("https://www.dogsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun executeDogsPartial(driver: ChromeDriver,dogs:IntArray,i: Int) {
    val dogsUpdated = dogs.size/4
    val dogStart = dogsUpdated*i
    println(dogsUpdated)
    println(dogStart)
    var dogEnd = 0
    if(i==3) {
        dogEnd=dogs.size-1
    } else {
        dogEnd=(dogStart+dogsUpdated)-1
    }
    println(dogEnd)
    for (i in dogStart..dogEnd) {
        val index = dogs[i]
        println("$i: " + index)
        driver.get("https://www.dogsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    Thread.sleep(3000)
}

fun executeUpdates(driver: ChromeDriver,birds: IntArray) {
    for (i in 0..birds.size-1) {
        val index = birds[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    Thread.sleep(3000)
}

fun executeBNPartial(driver: ChromeDriver,birds: IntArray,startIndex: Int) {
    val birdsUpdated = birds.size/4
    val birdStart = birdsUpdated*startIndex
    println(birdsUpdated)
    println(birdStart)
    var birdEnd = 0
    if(startIndex==3) {
        birdEnd=birds.size-1
    } else {
        birdEnd=(birdStart+birdsUpdated)-1
    }
    println(birdEnd)
    for (i in birdStart..birdEnd) {
        val index = birds[i]
        println("$i: " + index)
        driver.get("https://www.birdsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    Thread.sleep(3000)
}

fun executeCNPartial(driver: ChromeDriver,cats: IntArray,startIndex: Int) {
    val catsUpdated = cats.size/4
    val catStart = catsUpdated*startIndex
    println(catsUpdated)
    println(catStart)
    var catEnd = 0
    if(startIndex==3) {
        catEnd=cats.size-1
    } else {
        catEnd=(catStart+catsUpdated)-1
    }
    println(catEnd)
    for (i in catStart..catEnd) {
        val index = cats[i]
        println("$i: " + index)
        driver.get("https://www.catsnow.com/place_ad-adid-$index")
        driver.findElement(By.name("doContinue")).click()
        Thread.sleep(3000)
    }
    driver.get("https://www.catsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun executeHooblyPartial(driver: ChromeDriver,hoobly: Array<String>,startIndex: Int) {
    val hooblyUpdated = hoobly.size/4
    val hooblyStart = hooblyUpdated*startIndex
    println(hooblyUpdated)
    println(hooblyStart)
    var hooblyEnd = 0
    if(startIndex==3) {
        hooblyEnd=hoobly.size-1
    } else {
        hooblyEnd=(hooblyStart+hooblyUpdated)-1
    }
    println(hooblyEnd)
    for (i in hooblyStart..hooblyEnd) {
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

fun executeAdsPartial(driver: ChromeDriver,ads:IntArray,i:Int) {
    val adsUpdated = ads.size/4
    val adStart = adsUpdated*i
    println(adsUpdated)
    println(adStart)
    var adEnd = 0
    if(i==3) {
        adEnd=ads.size-1
    } else {
        adEnd=(adStart+adsUpdated)-1
    }
    println(adEnd)
    for (i in adStart..adEnd) {
        val index = ads[i]
        println("$i: " + index)
        driver.get("https://www.classifiedads.com/post.php?$index")
        Thread.sleep(1000)
        driver.findElement(By.xpath("//a[@class='flat']")).click()
        Thread.sleep(1000)
    }
    driver.get("https://www.classifiedads.com/account.php?notice=loggedin")
    Thread.sleep(1000)
    driver.findElement(By.xpath("//a[@href='/logout.php']")).click()
    Thread.sleep(1000)
}



