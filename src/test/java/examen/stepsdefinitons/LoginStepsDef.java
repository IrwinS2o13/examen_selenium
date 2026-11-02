package examen.stepsdefinitons;


import examen.steps.AgregarSteps;
import examen.steps.LoginSteps;
import examen.steps.NavegacionSteps;
import examen.steps.PopupSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static examen.core.DriverManager.*;

public class LoginStepsDef {

    private WebDriver driver;


    @Dado("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/en/");
        screenShot();
    }
    @Y("me logueo con mi usuario {string} y clave {string}")
    public void me_logueo_con_mi_usuario_XXX_y_clave_YYY(String user,  String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.ingresoUsuarioYClave(user,password);
        screenShot();
    }
    @Cuando("navego a la categoria Clothes y subcategoria Men")
    public void navego_a_la_categoria_Clothes_y_subcategoria_Men() {
        NavegacionSteps navegacionSteps = new NavegacionSteps(driver);
        navegacionSteps.iraseccionmen();
        screenShot();
    }
    @Y("agrego 2 unidades del primer producto al carrito")
    public void agrego_2_unidades_del_primer_producto_al_carrito() {
        AgregarSteps agregarSteps = new AgregarSteps(driver);
        agregarSteps.agregar2items();
        screenShot();
    }
    @Entonces("valido en el popup la confirmación del producto agregado")
    public void valido_en_el_popup_la_confirmación_del_producto_agregado(){
        PopupSteps popupSteps = new PopupSteps(driver);
        String title = popupSteps.getTitle();
        String expectedText = "Product successfully added to your shopping cart";
        Assertions.assertEquals(expectedText, title);
    }

}
