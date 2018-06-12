package prestashoptests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import prestashoptests.ui.RegistrationFormStartPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginAsAUser implements Task {
    RegistrationFormStartPage registrationFormStartPage;
    private final String emaillogin;
    private final String password;

    protected LoginAsAUser(String emaillogin, String password){
        this.emaillogin = emaillogin;
        this.password = password;
    }


    @Step("Add new user for registraiion")
    public <T extends Actor> void performAs(T actor){
        //actor.attemptsTo(Open.browserOn().the(registrationFormStartPage));
        actor.attemptsTo(Click.on(RegistrationFormStartPage.SIGNIN_BUTTON));
        actor.attemptsTo(Enter.theValue(emaillogin).into(RegistrationFormStartPage.EMAIL_TEXTBOX_FOR_LOGIN));
        actor.attemptsTo(Enter.theValue(password).into(RegistrationFormStartPage.PASSWORD_TEXTBOX_FOR_LOGIN));
        actor.attemptsTo(Click.on(RegistrationFormStartPage.LOGIN_BUTTON));
    }
    public static LoginAsAUser withValue(String emaillogin, String password){
        return instrumented(LoginAsAUser.class, emaillogin, password);
    }
}
