package com.mycompany.app;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class MainTest {

   //Вводим расположение сайта
   private final static String URL = "file:///C:/Users/Fireshot/Downloads/qa-test%20(1).html";
   public void checkAdd(){
      $(".uk-modal-content").shouldHave(Condition.text("Данные добавлены."));
   }
   public void fillAutandEnter(){
      $(By.id("loginEmail")).setValue("test@protei.ru");
      $(By.id("loginPassword")).setValue("test");
      $(new ByText("Вход")).click();
   }
   public void fillNewUserandEnter(){
      $(By.id("dataEmail")).setValue("Main@protei.ru");
      $(By.id("dataName")).setValue("Protei");

   }

   @Test
    public void checkInAndAddUsers() {
       MainPage mainPage= new MainPage();
       mainPage.openSite(URL);
       fillAutandEnter();
       $(By.id("inputsPage")).shouldBe(Condition.appear);
       fillNewUserandEnter();
       mainPage.setDataM();
       checkAdd();
       mainPage.setDataFem();
       checkAdd();
   }
}
