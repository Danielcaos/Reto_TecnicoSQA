package co.sqasa.interactions;

import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.sqasa.ui.ProductAddCartUI.IMG_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandomProduct implements Interaction {
    private WebElementFacade element;

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = IMG_PRODUCT.resolveAllFor(actor);
        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());
        element=listProducts.get(indexRandom);
        element.click();
    }

    public static Performable click(){
        return instrumented(ClickRandomProduct.class);
    }
}