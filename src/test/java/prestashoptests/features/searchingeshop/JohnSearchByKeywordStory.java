package prestashoptests.features.searchingeshop;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import prestashoptests.tasks.OpenTheApplication;
import prestashoptests.tasks.OpenTheShopPage;
import prestashoptests.tasks.Search;
import prestashoptests.tasks.SearchShop;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class JohnSearchByKeywordStory {

    Actor john = Actor.named("John");

    @Managed(uniqueSession = true)
    public WebDriver currentBrowser;

    @Steps
    OpenTheShopPage openTheShopPage;

    @Before
    public void johnCanBrowseTheWeb() {
        john.can(BrowseTheWeb.with(currentBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() {

        givenThat(john).wasAbleTo(openTheShopPage);

        when(john).attemptsTo(SearchShop.forTheTerm("Dresses"));

        then(john).should(eventually(seeThat(TheWebPage.title(), containsString("Search - My Store"))));

    }
}