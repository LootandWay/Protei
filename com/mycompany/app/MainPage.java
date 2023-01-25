package com.mycompany.app;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class MainPage {
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
    public void setDataM(){

        $x("//select[@id='dataGender']").selectOption("Мужской");
        addUsers();

    }
    public void setDataFem(){
        $x("//select[@id='dataGender']").selectOption("Женский");
        addUsers();
    }
}
