package com.pinnsights

import org.openqa.selenium.*
import java.util.HashMap
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.time.LocalDateTime

fun viewCount(driver: ChromeDriver) {
    runViewsWA(driver)
    runViewsAZ(driver)
    runViewsCA(driver)
    runViewsIL(driver)
    runViewsFL(driver)
    runViewsIN(driver)
    runViewsMA(driver)
    runViewsNY(driver)
    runViewsOH(driver)
    runViewsPA(driver)
    runViewsTX(driver)
    runViewsDL(driver)
    runViewsDC(driver)
    runViewsAT(driver)
    runViewsDT(driver)
}