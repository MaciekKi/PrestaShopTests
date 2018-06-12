package prestashoptests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.*;
import net.thucydides.core.annotations.Step;
import org.yecht.Data;
import prestashoptests.ui.RegistrationForm;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.steps.Instrumented;

public class RegisterNewUserContinue implements Task {
    RegistrationForm registrationForm;
    //private final String email;
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String days;
    private final String months;
    private final String years;
    private final String nameOnAddress;
    private final String lastNameOnAddress;
    private final String address;
    private final String city;
    private final String postcode;
    private final String phone;
    private final String alias;
    private final String state;

    protected RegisterNewUserContinue(String firstName, String lastName, String password,
                                      String days, String months, String years, String nameOnAddress,
                                      String lastNameOnAddress, String address, String city, String phone, String alias, String state, String postcode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.days = days;
        this.months = months;
        this.years = years;
        this.nameOnAddress = nameOnAddress;
        this.lastNameOnAddress = lastNameOnAddress;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.phone = phone;
        this.alias = alias;
        this.state = state;

    }


    @Step("Add new user for registraiion -continue with form")
    public <T extends Actor> void performAs(T actor){

         actor.attemptsTo(Enter.theValue(firstName).into(RegistrationForm.FIRST_NAME));
         actor.attemptsTo(Enter.theValue(lastName).into(RegistrationForm.LAST_NAME));
         actor.attemptsTo(Enter.theValue(password).into(RegistrationForm.PASSWORD));
         actor.attemptsTo(Instrumented.instanceOf(SelectByVisibleTextFromTarget.class).withProperties(RegistrationForm.DAY, days));
         actor.attemptsTo(Instrumented.instanceOf(SelectByVisibleTextFromTarget.class).withProperties(RegistrationForm.MONTH, months));
         actor.attemptsTo(Instrumented.instanceOf(SelectByVisibleTextFromTarget.class).withProperties(RegistrationForm.YEAR, years));
         actor.attemptsTo(Enter.theValue(nameOnAddress).into(RegistrationForm.NAME_ON_ADDRESS));
         actor.attemptsTo(Enter.theValue(lastNameOnAddress).into(RegistrationForm.LNAME_ON_ADDRESS));
         actor.attemptsTo(Enter.theValue(address).into(RegistrationForm.ADDRESS));
         actor.attemptsTo(Enter.theValue(city).into(RegistrationForm.CITY));
         actor.attemptsTo(Enter.theValue(postcode).into(RegistrationForm.POSTCODE));
         actor.attemptsTo(Enter.theValue(phone).into(RegistrationForm.PHONE));
         actor.attemptsTo(Enter.theValue(alias).into(RegistrationForm.ALIAS));
         actor.attemptsTo(Instrumented.instanceOf(SelectByVisibleTextFromTarget.class).withProperties(RegistrationForm.STATE, state));
         actor.attemptsTo(Click.on(RegistrationForm.CREATE_FORM));


    }
    public static RegisterNewUserContinue withValues(String firstName, String lastName, String password,
                                                        String days, String months, String years, String nameOnAddress, String lastNameOnAddress,
                                                            String address, String city, String phone, String alias, String state, String postcode){
        return instrumented(RegisterNewUserContinue.class, firstName, lastName, password, days, months, years, nameOnAddress, lastNameOnAddress, address,
                                                     city, phone, alias, state, postcode);
    }
}
