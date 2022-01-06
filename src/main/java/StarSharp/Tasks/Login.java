package StarSharp.Tasks;

import StarSharp.model.TheData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static StarSharp.userinterface.StarSharpLoginPage.*;

public class Login implements Task {

    private List <TheData> withthedata;

    public Login(List<TheData> withthedata) {
        this.withthedata = withthedata;
    }

    public static Login onThePage(List<TheData> withthedata) {
        return Tasks.instrumented(Login.class, withthedata);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(withthedata.get(0).getStrUsername()).into(INPUT_USER),
                         Enter.theValue(withthedata.get(0).getStrPassword()).into(INPUT_PASSWORD),
                         Click.on(SIGNIN_BUTTON)
        );

    }
}
