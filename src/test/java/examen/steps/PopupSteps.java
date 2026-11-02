package examen.steps;

import examen.page.PopupPage;
import org.openqa.selenium.WebDriver;

public class PopupSteps {
    private WebDriver driver;

    //constructor
    public PopupSteps(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return this.driver.findElement(PopupPage.popupTitle).getText();
    }
    public String getAmmount(){
        return this.driver.findElement(PopupPage.popupAmmount).getText();
    }
}
