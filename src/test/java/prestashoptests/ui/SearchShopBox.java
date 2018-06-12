package prestashoptests.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchShopBox extends PageObject {
    public static Target SEARCH_ITEM = Target.the("search box").located(By.name("search_query"));
}
