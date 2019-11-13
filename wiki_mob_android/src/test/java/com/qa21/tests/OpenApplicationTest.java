package com.qa21.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenApplicationTest extends  TestBase{

  @Test(priority = 1)
  public  void  testApplicationStarted(){
    System.out.println("Application opened");

  }

  @Test(priority = 2)
  public void searchArticleTest() throws InterruptedException {
    app.startSearch();
    app.typeRequest("Appium");
    app.pause(5000);
    app.click(By.id("page_list_item_title"));
    app.pause(5000);
  }


}
