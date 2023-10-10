package co.sqasa.tasks;


import co.sqasa.interactions.ClickRandomProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Value;

import static co.sqasa.ui.ProductAddCartUI.LNK_ADD_CART;
import static co.sqasa.ui.ProductAddCartUI.TXT_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductAddCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickRandomProduct.click(),
                Click.on(LNK_ADD_CART)

        );
    }

    public static ProductAddCartTask on(){
        return instrumented(ProductAddCartTask.class);
    }

}
