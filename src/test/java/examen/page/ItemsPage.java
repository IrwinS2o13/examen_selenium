package examen.page;

import org.openqa.selenium.By;

public class ItemsPage {
    public static By itemtitleButton = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[2]/h2/a");
    public static By subircantidadButton = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i");
    public static By addtocartButton = By.className("btn btn-primary add-to-cart");
}
