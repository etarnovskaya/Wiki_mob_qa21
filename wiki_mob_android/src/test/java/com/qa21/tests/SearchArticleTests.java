package com.qa21.tests;

import com.qa21.model.Article;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchArticleTests extends  TestBase {
  @Test(priority = 2)
  public void searchArticleTest() throws InterruptedException {
    app.getArticle().startSearch();
    app.getArticle().typeRequest(new Article("Appium"));
    app.getArticle().pause(5000);
    app.getArticle().click(By.id("page_list_item_title"));
    app.getArticle().pause(15000);
    String articleTitle = app.getArticle().getArticleTitle();

    Assert.assertTrue(articleTitle.contains("appium"));
  }
}
