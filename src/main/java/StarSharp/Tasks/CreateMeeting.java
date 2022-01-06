package StarSharp.Tasks;

import StarSharp.model.TheData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static StarSharp.userinterface.StarSharpMapping2.*;

public class CreateMeeting implements Task {

    private List<TheData> withthedata;

    public CreateMeeting(List<TheData> withthedata) {
        this.withthedata = withthedata;
    }


    public static CreateMeeting onThePage(List<TheData> witthedata) {
        return Tasks.instrumented(CreateMeeting.class, witthedata);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MEETING_MENU),
                Click.on(LOCATION_OPTION),
                Click.on(NEWLOCATION_BUTTON),
                Enter.theValue(withthedata.get(0).getStrNameLocation()).into(NAME_LOCATION),
                Click.on(SAVE_LOCATION),
                Click.on(MEETINGS_OPTION),
                Click.on(NEWMEETING_BUTTON),
                Enter.theValue(withthedata.get(0).getStrNamemeeting()).into(NAME_MEETING),
                Click.on(DIV_MEETINGTYPE),
                Enter.theValue(withthedata.get(0).getStrMeetingtype()).into(INPUT_MEETINGTYPE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MEETINGTYPE),
                Hit.the(Keys.ENTER).into(INPUT_MEETINGTYPE),
                Enter.theValue(withthedata.get(0).getStrMeetingnumber()).into(INPUT_MEETINGNUMBER),
                Click.on(CALENDARSTAR_BUTTON),
                SelectFromOptions.byVisibleText(withthedata.get(0).getStrMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(withthedata.get(0).getStrYear()).from(SELECT_YEAR),
                Click.on(SELECT_DAY),
                SelectFromOptions.byVisibleText(withthedata.get(0).getStrTimestardate()).from(TIME_STARDATE),
                Click.on(CALENDAREND_BUTTON),
                SelectFromOptions.byVisibleText(withthedata.get(0).getStrMonth2()).from(SELECTEND_MONTH),
                SelectFromOptions.byVisibleText(withthedata.get(0).getStrYear2()).from(SELECTEND_YEAR),
                Click.on(SELECTEND_DAY),
                SelectFromOptions.byVisibleText(withthedata.get(0).getStrTimeenddate()).from(TIME_ENDDATE),
                Click.on(SELECT_LOCATION),
                Enter.theValue(withthedata.get(0).getStrLocation()).into(CREATE_LOCATION),
                Hit.the(Keys.ENTER).into(CREATE_LOCATION),
                Click.on(SELECT_UNIT),
                Enter.theValue(withthedata.get(0).getStrUnit()).into(UNIT),
                Hit.the(Keys.ARROW_DOWN).into(UNIT),
                Hit.the(Keys.ENTER).into(UNIT),
                Click.on(SELECT_ORGANIZER),
                Enter.theValue(withthedata.get(0).getStrRandom()).into(CREATE_ORGANIZER),
                Hit.the(Keys.ENTER).into(CREATE_ORGANIZER),
                Enter.theValue(withthedata.get(0).getStrName()).into(ORGANIZER_TITTLE),
                Enter.theValue(withthedata.get(0).getStrName2()).into(ORGANIZER_NAME),
                Enter.theValue(withthedata.get(0).getStrLastname()).into(ORGANIZER_LASTNAME),
                Enter.theValue(withthedata.get(0).getStrEmail()).into(ORGANIZER_EMAIL),
                Click.on(SAVE_ORGANIZER),
                Click.on(SELECT_REPORTER),
                Enter.theValue(withthedata.get(0).getStrNamecomplete()).into(REPORTER),
                Hit.the(Keys.ENTER).into(REPORTER),
                Click.on(SELECT_ATTENDEELIST),
                Enter.theValue(withthedata.get(0).getStrNamecomplete2()).into(ATTENDEELIST),
                Hit.the(Keys.ENTER).into(ATTENDEELIST),



                Click.on(SAVE_MEETING)

















                );

    }
}
