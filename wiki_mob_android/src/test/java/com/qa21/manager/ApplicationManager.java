package com.qa21.manager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
  private AppiumDriver driver;
  ArticleHelper article;
  SessoionHelper session;

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

    session = new SessoionHelper(driver);
    article = new ArticleHelper(driver);
  }

  public void stop() {
    driver.quit();
  }

  public ArticleHelper getArticle() {
    return article;
  }
  public SessoionHelper getSession() {
    return session;
  }
}
