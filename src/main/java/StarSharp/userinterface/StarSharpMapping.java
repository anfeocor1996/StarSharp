package StarSharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpMapping extends PageObject {

    public static final Target ORGANIZATION_MENU = Target.the("shows the organization menu")
            .located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[1]/a/span"));
    public static final Target BUSINESSUNIT_OPTION = Target.the("shows the business units option")
            .located(By.xpath("//*[@id=\"nav_menu1_3_1\"]/li[1]/a/span"));
    public static final Target NEWBUSINESSUNIT_BUTTON = Target.the("button to create the business unit")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target INPUT_NAME = Target.the("where do we write the name of business unit")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]"));
    public static final Target SAVE_BUSINESSUNIT = Target.the("where do we save bussines unit")
            .located(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div/div/div[1]/div/span"));
    public static final Target NAME_BUSINESSUNIT = Target.the("where do we extract course name")
            .located(By.xpath("//*[@id=\"GridDiv\"]"));


}
