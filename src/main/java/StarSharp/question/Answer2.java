package StarSharp.question;

import StarSharp.userinterface.StarSharpMapping;
import StarSharp.userinterface.StarSharpMapping2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer2 implements Question<Boolean> {
    private String question2;

    public Answer2(String question2){
        this.question2 = question2;
    }
    public static Answer2 toThe(String question2) {
        return new Answer2(question2);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String nameMeeting= Text.of(StarSharpMapping2.NAMEOK_MEETING).viewedBy(actor).asString();
        if (nameMeeting.contains(question2)){
            result=true;
        }else {
            result =false;
        }
        return result;
    }


}
