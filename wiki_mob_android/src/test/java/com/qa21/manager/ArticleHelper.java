package com.qa21.manager;

import com.qa21.model.Article;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ArticleHelper extends HelperBase {
  public ArticleHelper(AppiumDriver driver) {
    super(driver);
  }

  public void typeRequest(Article article) {
    type(By.id("search_container"), article.getTitle());
  }



  public void startSearch() {
    click(By.id("search_container"));
  }

  public String getArticleTitle() {
    return driver.findElement(By.id("view_page_title_text")).getText().toLowerCase();
  }
}
