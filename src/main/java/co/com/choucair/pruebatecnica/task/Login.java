package co.com.choucair.pruebatecnica.task;

import co.com.choucair.pruebatecnica.userinterface.LoginPage;
import groovy.util.logging.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Login implements Task {
    public static Performable onthePage() {
      return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.LOGIN_BUTTON),
                Enter.theValue("Stephany").into(LoginPage.INPUT_USERNAME),
                Enter.theValue("Romero").into(LoginPage.INPUT_USER),
                Enter.theValue("smromeros19@gmail.com").into(LoginPage.INPUT_EMAIL),
                SelectFromOptions.byValue("number:10").from(LoginPage.SELECT_MONTH),
                SelectFromOptions.byValue("number:19").from(LoginPage.SELECT_DAY),
                SelectFromOptions.byValue("number:2000").from(LoginPage.SELECT_YEAR),
                Click.on(LoginPage.NEXT_BUTTON),
                Enter.theValue("Cartagena de Indias").into(LoginPage.INPUT_CITY),
                Enter.theValue("130003").into(LoginPage.INPUT_ZIP),
                Click.on(LoginPage.CONTAINER_COUNTRY),
                Enter.theValue("Colombia").into(LoginPage.INPUT_COUNTRY),
                Click.on(LoginPage.DEVICES_BUTTON),
                Click.on(LoginPage.CONTAINER_COMPUTER),
                Enter.theValue("Windows").into(LoginPage.INPUT_COMPUTER),
                Click.on(LoginPage.CONTAINER_VERSION),
                Enter.theValue("10").into(LoginPage.INPUT_VERSION),
                Click.on(LoginPage.CONTAINER_LANGUAGE),
                Enter.theValue("Spanish").into(LoginPage.INPUT_LANGUAGE),
                Click.on(LoginPage.CONTAINER_MOBILE_DEVICE),
                Enter.theValue("Apple").into(LoginPage.INPUT_MOBILE_DEVICE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LoginPage.CONTAINER_MODEL),
                Enter.theValue("iPhone X").into(LoginPage.INPUT_MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LoginPage.CONTAINER_OS),
                Enter.theValue("iOS 13.3").into(LoginPage.INPUT_OS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LoginPage.LAST_STEP_BUTTON),
                Enter.theValue("clX!UUw$@y^3s6hgO0V7M").into(LoginPage.INPUT_PASSWORD),
                Enter.theValue("clX!UUw$@y^3s6hgO0V7M").into(LoginPage.INPUT_CONFIRM_PASSWORD),
                Click.on(LoginPage.INPUT_TERMS),
                Click.on(LoginPage.INPUT_PRIVACY),
                Click.on(LoginPage.COMPLETE_BUTTON)
                );
    }
}
