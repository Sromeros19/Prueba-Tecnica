package co.com.choucair.pruebatecnica.task;



import co.com.choucair.pruebatecnica.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Register implements Task {

    private RegisterPage RegisterPage;

   public static Performable onthePage() {
       return Tasks.instrumented(Register.class);
   }

  @Override
   public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(RegisterPage));
   }
}
