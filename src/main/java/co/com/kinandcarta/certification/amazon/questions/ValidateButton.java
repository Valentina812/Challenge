package co.com.kinandcarta.certification.amazon.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.kinandcarta.certification.amazon.userinterfaces.PurchaseProduct.BTN_ADD_CART;

public class ValidateButton implements Question<Boolean> {


    public ValidateButton() {
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_ADD_CART.resolveFor(actor).isDisabled();
    }

    public static ValidateButton addCart() {
        return new ValidateButton();
    }
}
