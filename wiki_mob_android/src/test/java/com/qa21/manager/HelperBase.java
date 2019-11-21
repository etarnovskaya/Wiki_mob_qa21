package com.qa21.manager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class HelperBase {
  AppiumDriver driver;

  public HelperBase(AppiumDriver driver) {
    this.driver = driver;
  }

  public void type(By locator, String text) {
    click(locator);
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public void click(By locator) {
    driver.findElement(locator).click();
  }

  public void pause(int time) throws InterruptedException {
    Thread.sleep(time);
  }

  public void swipeUp() {

    TouchAction touch = new TouchAction(driver);

    Dimension size = driver.manage().window().getSize();
    int x= size.width/2;

    int startY = (int) (size.height * 0.8);
    int stopY = (int) (size.height * 0.2);


    touch.press(PointOption.point(x, startY))
            .moveTo(PointOption.point(x, stopY)).release().perform();
  }

  public void swipeUpToElement(By locator, int maxSwipes){

    int alreadySwipes = 0;
    while (driver.findElements(locator).size()== 0 && alreadySwipes <= maxSwipes ){

        swipeUp();
        ++alreadySwipes;

    }

  }
}
