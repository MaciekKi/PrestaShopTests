package prestashoptests.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class RegistrationFormStartPage extends PageObject {
    /**
     * SignIn to be clicked in the task
     */
    public static Target SIGNIN_BUTTON = Target.the("SignIn button").located(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));

    /**
     * email to be entered in the task page (for registration and for login
     */
    public static Target EMAIL_TEXTBOX = Target.the("email field").located(By.xpath("//*[@id='email_create']"));

    /**
     * login email text field
     */

    public static Target EMAIL_TEXTBOX_FOR_LOGIN = Target.the("email field for login").located(By.xpath("//*[@id='email']"));

    public static Target PASSWORD_TEXTBOX_FOR_LOGIN = Target.the("password for login").located(By.xpath("//*[@id='passwd']"));


    /**
     * submit button to be clicked after email entered
     */
    public static Target SUBMIT_BUTTON = Target.the("submit email button").located(By.xpath("//*[@id='SubmitCreate']"));

    public static Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//*[@id='SubmitLogin']"));
}
