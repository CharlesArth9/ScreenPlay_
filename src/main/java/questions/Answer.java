package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.SearchCoursePage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String nameCourse = Text.of(SearchCoursePage.VERIFY_COURSE).viewedBy(actor).asString();

    if(question.equalsIgnoreCase(nameCourse)) {
            result = true;
        } else {
            result = false;
            }
            return result;
        }
}
