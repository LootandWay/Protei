package com.mycompany.app;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class MainPage {



    //Открываем сайт
    public void openSite(String URL){
        Selenide.open(URL);
    }
    public void clickAdd(){
        $(new ByText("Добавить")).click();
    }
    public void clickOk(){
        $(new ByText("Ok")).click();
    }
    public void checkCondition(){
        $(".uk-modal-content").shouldHave(Condition.text("Данные добавлены."));
    }
    //Вводим данные в формы
    public void filAutandEnter(){
        $(By.id("loginEmail")).setValue("test@protei.ru");
        $(By.id("loginPassword")).setValue("test");
        $(new ByText("Вход")).click();

    }
    public void filNewUserandEnter(){
        $(By.id("dataEmail")).setValue("Main@protei.ru");
        $(By.id("dataName")).setValue("Protei");

    }
    //Выполняем добавление всех форм
    public void addUsers(){
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect21").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect22").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect23").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataCheck11").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect21").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect22").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect23").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataCheck12").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect21").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect22").click();
        clickAdd();
        checkCondition();
        clickOk();
        $("#dataSelect23").click();
        clickAdd();
        checkCondition();
        clickOk();
    }
    //Выбираем мужской пол
    public void setDataM(){

        $x("//select[@id='dataGender']").selectOption("Мужской");
        addUsers();

    }
    //Выбираем женский пол
    public void setDataFem(){
        $x("//select[@id='dataGender']").selectOption("Женский");
        addUsers();
    }
}
