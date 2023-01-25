package com.mycompany.app;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class MainTest {

   //Вводим расположение сайта
   private final static String URL = "file:///C:/Users/Fireshot/Downloads/qa-test%20(1).html";
   public void checkAdd(){
      $(".uk-modal-content").shouldHave(Condition.text("Данные добавлены."));
   }

   @Test
    public void checkInAndAddUsers() {
       MainPage mainPage= new MainPage();
       mainPage.openSite(URL);
       mainPage.fillAutandEnter();
       $(By.id("inputsPage")).shouldBe(Condition.appear);
       mainPage.fillNewUserandEnter();
       mainPage.setDataM();
       checkAdd();
       mainPage.setDataFem();
       checkAdd();
   }
}
