package prestashoptests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import prestashoptests.ui.GoogleSearchPage;
import prestashoptests.ui.PrestaHomePage;

public class OpenTheShopPage implements Task {

    PrestaHomePage prestaHomePage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(prestaHomePage)
        );
    }
}