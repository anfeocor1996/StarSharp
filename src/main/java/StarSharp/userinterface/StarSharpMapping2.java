package StarSharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpMapping2 extends PageObject {
    public static final Target MEETING_MENU = Target.the("shows the meeting menu")
            .located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a/span"));
    public static final Target MEETINGS_OPTION = Target.the("shows the meeting option")
            .located(By.xpath("//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span"));
    public static final Target NEWMEETING_BUTTON = Target.the("button to create the meeting")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target NAME_MEETING = Target.the("where do we write the name of meeting")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]"));
    public static final Target DIV_MEETINGTYPE = Target.the("div Meeting Type")
            .located(By.xpath("//*[@id=\"select2-chosen-6\"]"));
    public static final Target INPUT_MEETINGTYPE = Target.the("where do we write the name of meeting type")
            .located(By.xpath("//*[@id=\"s2id_autogen6_search\"]"));
    public static final Target INPUT_MEETINGNUMBER = Target.the("where do we write the meeting Number")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[3]/input"));
    public static final Target CALENDARSTAR_BUTTON = Target.the("button to select the calendar star date")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/button/i"));
    public static final Target SELECT_MONTH = Target.the("select month")
            .located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
    public static final Target SELECT_YEAR = Target.the("select year")
            .located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
    public static final Target SELECT_DAY = Target.the("select day")
            .located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a"));
    public static final Target TIME_STARDATE = Target.the("time of star date")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/select"));
    public static final Target CALENDAREND_BUTTON = Target.the("button to select the calendar end date")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/button/i"));
    public static final Target SELECTEND_MONTH = Target.the("select month")
            .located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
    public static final Target SELECTEND_YEAR = Target.the("select year")
            .located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
    public static final Target SELECTEND_DAY = Target.the("select day")
            .located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a"));
    public static final Target TIME_ENDDATE = Target.the("time of star date")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/select"));
    public static final Target SELECT_LOCATION = Target.the("where do we select location")
            .located(By.xpath("//*[@id=\"select2-chosen-7\"]"));
    public static final Target CREATE_LOCATION = Target.the("where do we create location")
            .located(By.xpath("//*[@id=\"s2id_autogen7_search\"]"));
    //public static final Target NAME_LOCATION = Target.the("where do we write the name of location")
      //      .located(By.xpath("/html/body/div[7]/div[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input"));
    //public static final Target SAVELOCATION_BUTTON= Target.the("button to save location")
      //      .located(By.xpath("/html/body/div[8]/div[2]/div/div[1]/div/div/div/div[1]/div/span"));

    public static final Target LOCATION_OPTION = Target.the("where do we select location option")
            .located(By.xpath("//*[@id=\"nav_menu1_3_2\"]/li[3]/a/span"));
    public static final Target NEWLOCATION_BUTTON = Target.the("button to create a new location")
            .located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target NAME_LOCATION = Target.the("button to create a new location")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingLocationDialog4_Name\"]"));
    public static final Target SAVE_LOCATION = Target.the("button to create a new location")
            .located(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div/div/div[1]/div/span"));


    public static final Target SELECT_UNIT = Target.the("where do we select unit")
            .located(By.xpath("//*[@id=\"select2-chosen-8\"]"));
    public static final Target UNIT = Target.the("unit")
            .located(By.xpath("//*[@id=\"s2id_autogen8_search\"]"));
    public static final Target SELECT_ORGANIZER = Target.the("where do we select organizer")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[8]/div[1]/a/span[1]"));
    public static final Target CREATE_ORGANIZER = Target.the("where do we create organizer")
            .located(By.xpath("//*[@id='s2id_autogen9_search']"));
    public static final Target ORGANIZER_TITTLE = Target.the("where do we write the organizer tittle")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog33_Title\"]"));
    public static final Target ORGANIZER_NAME = Target.the("where do we write the organizer name")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog33_FirstName\"]"));
    public static final Target ORGANIZER_LASTNAME = Target.the("where do we write the organizer last name")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog33_LastName\"]"));
    public static final Target ORGANIZER_EMAIL = Target.the("where do we write the organizer email")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog33_Email\"]"));
    public static final Target SAVE_ORGANIZER = Target.the("where do we save the organizer")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog33_Toolbar\"]/div/div/div/div[1]/div/span"));
    public static final Target SELECT_REPORTER = Target.the("where do we select reporter")
            .located(By.xpath("//*[@id=\"select2-chosen-10\"]"));
    public static final Target REPORTER = Target.the("reporter")
            .located(By.xpath("//*[@id=\"s2id_autogen10_search\"]"));
        public static final Target SELECT_ATTENDEELIST = Target.the("where do we select attendee list")
            .located(By.xpath("//*[@id=\"select2-chosen-12\"]"));
    public static final Target ATTENDEELIST = Target.the("attendeelist")
            .located(By.xpath("//*[@id=\"s2id_autogen12_search\"]" ));
    public static final Target SAVE_MEETING = Target.the("button to save meeting")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]/div/span"));
    public static final Target NAMEOK_MEETING = Target.the("where do we write the name of meeting")
            .located(By.xpath("/html/body/main/section/div"));











}
