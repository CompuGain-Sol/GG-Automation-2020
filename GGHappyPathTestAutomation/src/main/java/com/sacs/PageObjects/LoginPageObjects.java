package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface LoginPageObjects {
By logintextbox=By.xpath("//input[@id='userNameInput']");
By passwordtextbox=By.xpath("//input[@id='passwordInput']");
By submitbutton=By.xpath("//span[@id='submitButton']");
}
