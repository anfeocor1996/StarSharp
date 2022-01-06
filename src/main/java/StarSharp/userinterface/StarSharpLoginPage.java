package StarSharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpLoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_Username\"]"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_Password\"]"));
    public static final Target SIGNIN_BUTTON = Target.the("button to enter the app")
            .located(By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_LoginButton\"]"));

}
