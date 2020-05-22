package task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.ChoucairLoginPage;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("cmestral").into(ChoucairLoginPage.INPUT_USARNAME),
                Enter.theValue("W2619jeffrey90*+").into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.SIGN_UP_BUTTON)
                );

    }
}
