package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraScript 
{
 @FindBy(xpath = "//a[text()='Men']")
 private WebElement menbutton;
 
 @FindBy(xpath = "//a[text()='Phone Cases']")
 private WebElement phonecases;
 
 
}
