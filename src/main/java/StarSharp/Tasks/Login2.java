package StarSharp.Tasks;

import StarSharp.model.TheData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static StarSharp.userinterface.StarSharpLoginPage.*;

public class Login2 implements Task {

    private List <TheData> withthedata;

    public Login2(List<TheData> withthedata) {
        this.withthedata = withthedata;
    }


    public static Login2 onThePage(List<TheData> withthedata) {
        return Tasks.instrumented(Login2.class, withthedata);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(withthedata.get(0).getStrUsername2()).into(INPUT_USER),
                Enter.theValue(withthedata.get(0).getStrPassword2()).into(INPUT_PASSWORD),
                Click.on(SIGNIN_BUTTON)
        );
    }
}
