package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the
            ("Botón de ingreso a Choucair Academy").located(By.xpath("//nav[@id='nav-menu']/ul[2]/li/a"));

    public static final Target INPUT_USARNAME = Target.the
            ("Botón de ingreso a Choucair Academy").located(By.cssSelector("input#username"));

    public static final Target INPUT_PASSWORD = Target.the
            ("Botón de ingreso a Choucair Academy").located(By.cssSelector("input#password"));

    public static final Target SIGN_UP_BUTTON = Target.the
            ("Botón de ingreso a Choucair Academy").located(By.cssSelector("div[class*='sign-up'] button"));

    /*public static final Target SEARCH_COURSES = Target.the
            ("Botón de ingreso a Choucair Academy").located(By.cssSelector("input#coursesearchbox"));*/


}
