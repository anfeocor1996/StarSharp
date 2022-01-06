package StarSharp.Tasks;

import StarSharp.model.TheData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static StarSharp.userinterface.StarSharpMapping.*;

public class CreateBussinesUnit implements Task {
    private List<TheData> withthedata;

    public CreateBussinesUnit(List<TheData> withthedata) {
        this.withthedata = withthedata;

    }

    public static CreateBussinesUnit onThePage(List<TheData> withthedata) {
        return Tasks.instrumented(CreateBussinesUnit.class, withthedata);
    }


    //public static CreateBussinesUnit onThePage() {
      //  return Tasks.instrumented(CreateBussinesUnit.class);



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                         Click.on(ORGANIZATION_MENU),
                         Click.on(BUSINESSUNIT_OPTION),
                         Click.on(NEWBUSINESSUNIT_BUTTON),
                         Enter.theValue(withthedata.get(0).getStrNameBusinessUnit()).into(INPUT_NAME),
                         Click.on(SAVE_BUSINESSUNIT)
                );

    }
}
