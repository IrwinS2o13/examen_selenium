package examen.steps;

import examen.page.HomePage;
import org.openqa.selenium.WebDriver;

public class NavegacionSteps {
    private WebDriver driver;

    //constructor
    public NavegacionSteps(WebDriver driver){
        this.driver = driver;
    }

    public void clothes(){
        this.driver.findElement(HomePage.clothesButton).click();
    }
    public void men(){
        this.driver.findElement(HomePage.menButton).click();
    }
    public void iraseccionmen() {
        clothes();
        men();
    }

}
