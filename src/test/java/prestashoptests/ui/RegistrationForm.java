package prestashoptests.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {



    public static Target GENDER= Target.the("gender").located(By.name("id_gender"));
    /**
     * Entering customer credentials and data
     * Customer first name
     */
    public static Target FIRST_NAME = Target.the("first name").located(By.xpath("//*[@id='customer_firstname']"));

    /**
     * Customer last name
     */
    public static Target LAST_NAME = Target.the("last name").located(By.xpath("//*[@id='customer_lastname']"));

    /**
     * Password
     */
    public static Target PASSWORD= Target.the("password").located(By.xpath("//*[@id='passwd']"));

    /**
     * Date of birth block
     */
    public static Target DAY= Target.the("day of month").located((By.xpath("//*[@id='days']")));


    public static Target MONTH= Target.the("month").located((By.xpath("//*[@id='months']")));

    public static Target YEAR= Target.the("month").located((By.xpath("//*[@id='years']")));

    /**
     * Address block
     */
    public static Target NAME_ON_ADDRESS= Target.the("name on address").located(By.xpath("//*[@id='firstname']"));

    public static Target LNAME_ON_ADDRESS= Target.the("last name on address").located(By.xpath("//*[@id='lastname']"));

    public static Target ADDRESS= Target.the("address").located(By.xpath("//*[@id='address1']"));

    public static Target CITY= Target.the("city").located(By.xpath("//*[@id='city']"));

    public static Target STATE= Target.the("state").located(By.xpath("//*[@id='id_state']"));

    public static Target POSTCODE= Target.the("postal code").located(By.xpath("//*[@id='postcode']"));

    public static Target PHONE= Target.the("phone").located(By.xpath("//*[@id='phone_mobile']"));

    public static Target ALIAS= Target.the("alias").located(By.xpath("//*[@id='alias']"));

    public static Target CREATE_FORM= Target.the("create account").located(By.xpath("//*[@id='submitAccount']"));

}
