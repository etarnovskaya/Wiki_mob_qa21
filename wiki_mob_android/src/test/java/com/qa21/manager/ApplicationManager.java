package com.qa21.manager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
  private AppiumDriver driver;

  public void init() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "qa21");
    capabilities.setCapability( "platformVersion", "8.0");
    capabilities.setCapability("automationName", "Appium");
    capabilities.setCapability( "appPackage", "org.wikipedia");
    capabilities.setCapability("appActivity",".main.MainActivity");
    capabilities.setCapability("app",
            "C:\\Users\\Elena\\Dropbox\\Tel-ran\\Mobile\\apk\\org.wikipedia.apk");

    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }

  public void pause(int time) throws InterruptedException {
    Thread.sleep(time);
  }

  public void typeRequest(String text) {
    type(By.id("search_container"), text);
  }

  public void type(By locator, String text) {
    click(locator);
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public void startSearch() {
    click(By.id("search_container"));
  }

  public void click(By locator) {
    driver.findElement(locator).click();
  }

  public void stop() {
    driver.quit();
  }
}
