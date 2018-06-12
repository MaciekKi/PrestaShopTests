package prestashoptests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import prestashoptests.ui.SearchShopBox;

public class SearchShop implements Task {

    private final String searchItem;

    protected SearchShop(String searchItem) {
        this.searchItem = searchItem;
    }

    @Step("SearchShop for #searchItem")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(searchItem)
                        .into(SearchShopBox.SEARCH_ITEM)
                        .thenHit(ENTER)
        );
    }

    public static SearchShop forTheTerm(String searchItem) {
        return instrumented(SearchShop.class, searchItem);
    }

}
