package com.qa21.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenApplicationTest extends  TestBase{

  @Test(priority = 1)
  public  void  testApplicationStarted(){
    System.out.println("Application opened");

  }

}
