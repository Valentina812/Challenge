package co.com.kinandcarta.certification.amazon.taks;
import co.com.kinandcarta.certification.amazon.models.Search;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



import java.util.List;

import static co.com.kinandcarta.certification.amazon.userinterfaces.PurchaseProduct.*;


public class NavigatePage implements Task{



    public NavigatePage(){

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PAGE)

        );

    }

    public static NavigatePage theData(){
        return Tasks.instrumented(NavigatePage.class);
    }
}

