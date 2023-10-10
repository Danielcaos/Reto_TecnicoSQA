package co.sqasa.StepDef;

import co.sqasa.tasks.HomeTask;
import co.sqasa.tasks.ProductAddCartTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TestStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("that user open page MundoFlor and select the love category")
    public void thatUserOpenPageMundoFlorAndSelectTheLoveCategory() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/"),
                HomeTask.on()
        );
    }
    @When("user click add to cart on one of the products and return to the love section")
    public void userClickAddToCartOnOneOfTheProductsAndReturnToTheLoveSection() {
        theActorInTheSpotlight().attemptsTo(
                ProductAddCartTask.on(),
                HomeTask.on()
        );
    }
    @When("repeat the process with another product")
    public void repeatTheProcessWithAnotherProduct() {
        theActorInTheSpotlight().attemptsTo(
                ProductAddCartTask.on()
        );
    }
    @Then("The user will be able to see the selected products")
    public void theUserWillBeAbleToSeeTheSelectedProducts() {

    }

}
