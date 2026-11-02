package examen.steps;

import examen.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static examen.core.DriverManager.*;


public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }
    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        //Espera implicita
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        //Espera explicita
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }
    /**
     * Hacer click en el botón Sign In
     * */
    public void signin(){
        this.driver.findElement(LoginPage.signinButton).click();
    }


    public void ingresoUsuarioYClave(String user, String password) {
        signin();
        typeUser(user);
        typePassword(password);
        esperaImplicita();
        login();
    }
}