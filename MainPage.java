package com.mycompany.app;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class MainPage {

    private final static String Email = "test@protei.ru";
    private final static String Pass="test";
    private final static String Name="Protei";
    private final static String Email2 = "Main@protei.ru";
    //Открываем сайт
    public void OpenSite(String URL){
        Selenide.open(URL);
    }
    //Вводим данные в формы
    public void EnterData(){
        $(By.id("loginEmail")).setValue(Email);
        $(By.id("loginPassword")).setValue(Pass);
        $(new ByText("Вход")).click();
        $(By.id("dataEmail")).setValue(Email2);
        $(By.id("dataName")).setValue(Name);
    }
    //Выполняем добавление всех форм
    public void ClickAdd(){
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect21").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect22").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect23").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataCheck11").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect21").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect22").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect23").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataCheck12").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect21").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect22").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
        $("#dataSelect23").click();
        $(new ByText("Добавить")).click();
        $(new ByText("Ok")).click();
    }
    //Выбираем мужской пол
    public void SetDataM(){

        $x("//select[@id='dataGender']").selectOption("Мужской");
        ClickAdd();

    }
    //Выбираем женский пол
    public void SetDataFem(){
        $x("//select[@id='dataGender']").selectOption("Женский");
        ClickAdd();
    }
}
