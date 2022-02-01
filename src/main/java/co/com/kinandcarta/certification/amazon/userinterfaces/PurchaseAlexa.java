package co.com.kinandcarta.certification.amazon.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseAlexa {


    public static final Target TXT_SEARCH = Target.the("Product search field ")
            .located(By.id("twotabsearchtextbox"));

    public static final Target BTN_PAGE = Target.the("Button to go to the second page ")
            .located(By.xpath(""));

    public static final Target SLC_PRODUCT = Target.the("Third product")
            .located(By.xpath(""));



}
