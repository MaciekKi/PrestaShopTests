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
import prestashoptests.tasks.LoginAsAUser;
import prestashoptests.tasks.OpenTheShopPage;
import prestashoptests.tasks.RegisterNewUserContinue;
import prestashoptests.tasks.RegisterNewUserStart;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class LogInAsExistingUserStory {
    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheShopPage openTheShopPage;


    @Before
    public void johhnCanBrowseTheWeb(){
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void should_be_able_to_log_in(){
        givenThat(anna).wasAbleTo(openTheShopPage);
        when(anna).attemptsTo(LoginAsAUser.withValue("anna@anna.com", "test123"));
        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("My account - My store"))));

    }
}
