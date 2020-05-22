package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target UNIVERSIDAD_CHOUCAIR = Target.the
            ("Ingreso a universidad Choucair")
                    .located(By.cssSelector("div#universidad strong"));

    public static final Target SEARCH_COURSES = Target.the
            ("campo para buscar cursos")
                    .located(By.cssSelector("input#coursesearchbox"));

    public static final Target BUTTON_GO = Target.the
            ("Botón para realizar busqueda de curso")
                    .located(By.cssSelector("fieldset button[class*='btn btn-secondary']"));

    public static final Target COURSE = Target.the
            ("curso resultado de la busqueda")
                    .located(By.cssSelector("div.course-title h4"));

    public static final Target VERIFY_COURSE = Target.the
            ("curso resultado de la busqueda")
                    .located(By.xpath("//h1[contains(text(),'Metodología Bancolombia')]"));

}
