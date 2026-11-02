package examen.steps;

import examen.page.ItemsPage;
import org.openqa.selenium.WebDriver;

public class AgregarSteps {
    private WebDriver driver;

    //constructor
    public AgregarSteps(WebDriver driver){
        this.driver = driver;
    }

    public void titulo(){
        this.driver.findElement(ItemsPage.itemtitleButton).click();
    }
    public void subircantidad(){
        this.driver.findElement(ItemsPage.subircantidadButton).click();
    }
    public void addtocart(){
        this.driver.findElement(ItemsPage.addtocartButton).click();
    }

    public void agregar2items() {
        titulo();
        subircantidad();
        addtocart();
    }


}
