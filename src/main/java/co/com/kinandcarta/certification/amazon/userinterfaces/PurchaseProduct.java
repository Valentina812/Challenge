package co.com.kinandcarta.certification.amazon.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseProduct {

    public static final Target TXT_SEARCH = Target.the("Product search field ")
            .located(By.id("twotabsearchtextbox"));

    public static final Target BTN_PAGE = Target.the("Button to go to the second page ")
            .located(By.xpath("(//a[@class = 's-pagination-item s-pagination-button'])[1]"));

    public static final Target SLC_PRODUCT = Target.the("Third product")
            .located(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[3]"));

    public static final Target BTN_ADD_CART = Target.the("Button add cart product")
            .located(By.xpath("//input[@id = 'add-to-cart-button']"));

    public static final Target SLC_PLAY = Target.the("Select playstation product")
            .located(By.xpath("//span[contains(text(),'Sony Playstation PS4 - Consola negra de 1 TB')]"));


}
