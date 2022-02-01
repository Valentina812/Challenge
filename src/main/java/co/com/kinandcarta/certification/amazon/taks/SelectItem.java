package co.com.kinandcarta.certification.amazon.taks;

import co.com.kinandcarta.certification.amazon.models.Search;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.kinandcarta.certification.amazon.userinterfaces.PurchaseProduct.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectItem implements Task {

    private String product;

    public SelectItem(List<Search> data){
        this.product = data.get(0).getProduct();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SLC_PRODUCT, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(SLC_PRODUCT)

        );

    }

    public static SelectItem theData(List<Search> data){
        return Tasks.instrumented(SelectItem.class, data);
    }
}
