package com.qa21.tests;

import com.qa21.model.Article;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SwipeUpArticleTest extends TestBase{
  @Test
  public void swipeUpTest() throws InterruptedException {
    app.getArticle().startSearch();
    app.getArticle().typeRequest(new Article("Appium"));
    app.getArticle().pause(5000);
    app.getArticle().click(By.id("page_list_item_title"));
    app.getArticle().pause(15000);

//    app.getArticle().swipeUp();
//    app.getArticle().swipeUp();
//    app.getArticle().swipeUp();
//    app.getArticle().swipeUp();
//    app.getArticle().swipeUp();
    app.getArticle().swipeUpToElement(By.id("page_external_link"), 2);

  }
}
