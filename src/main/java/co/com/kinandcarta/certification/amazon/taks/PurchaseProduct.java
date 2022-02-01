package co.com.kinandcarta.certification.amazon.taks;

import co.com.kinandcarta.certification.amazon.models.Search;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.kinandcarta.certification.amazon.userinterfaces.PurchaseAlexa.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class PurchaseProduct implements Task {
    private String product;

    public PurchaseProduct(List<Search> data){
        this.product = data.get(0).getProduct();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_SEARCH, isEnabled()).forNoMoreThan(60).seconds(),
                Enter.theValue(product).into(TXT_SEARCH).thenHit(Keys.ENTER)
        );

    }

    public static PurchaseProduct theData(List<Search> data){
        return Tasks.instrumented(PurchaseProduct.class, data);
    }
}
