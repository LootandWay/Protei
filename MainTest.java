package com.mycompany.app;

import org.junit.Test;


public class MainTest {

   //Вводим расположение сайта
   private final static String URL = "file:///C:/Users/Fireshot/Downloads/qa-test%20(1).html";
   @Test
    public void CheckIN() {
       MainPage mainPage= new MainPage();
       mainPage.OpenSite(URL);
       mainPage.EnterData();
       mainPage.SetDataM();
       mainPage.SetDataFem();
   }
}
