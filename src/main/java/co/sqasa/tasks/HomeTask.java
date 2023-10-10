package co.sqasa.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.sqasa.ui.HomeUI.LNK_LOVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(LNK_LOVE)
            );
    }

    public static HomeTask on(){
        return  instrumented(HomeTask.class);
    }

}
