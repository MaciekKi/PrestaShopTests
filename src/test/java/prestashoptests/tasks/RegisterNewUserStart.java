package prestashoptests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import prestashoptests.ui.RegistrationFormStartPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterNewUserStart implements Task {
    RegistrationFormStartPage registrationFormStartPage;
    private final String email;

    protected RegisterNewUserStart(String email){
        this.email = email;
    }


    @Step("Add new user for registraiion")
    public <T extends Actor> void performAs(T actor){
        //actor.attemptsTo(Open.browserOn().the(registrationFormStartPage));
        actor.attemptsTo(Click.on(RegistrationFormStartPage.SIGNIN_BUTTON));
        actor.attemptsTo(Enter.theValue(email).into(RegistrationFormStartPage.EMAIL_TEXTBOX));
        actor.attemptsTo(Click.on(RegistrationFormStartPage.SUBMIT_BUTTON));
    }
    public static RegisterNewUserStart withValue(String email){
        return instrumented(RegisterNewUserStart.class, email);
    }
}
