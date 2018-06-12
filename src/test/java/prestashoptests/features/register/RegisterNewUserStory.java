package prestashoptests.features.register;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import prestashoptests.tasks.OpenTheShopPage;
import prestashoptests.tasks.RegisterNewUserContinue;
import prestashoptests.tasks.RegisterNewUserStart;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class RegisterNewUserStory {
    Actor john = Actor.named("John");

    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;

    @Steps
    //RegisterNewUserStart registerNewUserStart;
    OpenTheShopPage openTheShopPage;
    RegisterNewUserStart registerNewUserStart;
    RegisterNewUserContinue registerNewUserContinue;

    @Before
    public void johhnCanBrowseTheWeb(){
        john.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void start_registration_of_the_new_user(){
       givenThat(john).wasAbleTo(openTheShopPage);
       when(john).attemptsTo(RegisterNewUserStart.withValue("dummy@email987.net"));
       then(john).should(eventually(seeThat(TheWebPage.title(), containsString("Login - My Store"))));
       when(john).attemptsTo(RegisterNewUserContinue.withValues("jonny", "jankovsky", "somePassword!", "2  ",
                "May ","1975  ", "jonnythesecond",
                "jankovskytwo","SomeAddress","SomeCity", "1234652652652", "aliasText to be here", "Alabama", "22333"));
       then(john).should(eventually(seeThat(TheWebPage.title(), containsString("My account - My Store"))));

    }
}
