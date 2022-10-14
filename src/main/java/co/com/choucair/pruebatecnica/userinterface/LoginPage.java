package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target INPUT_USERNAME = Target.the("Where do we write the user name")
            .located(By.id("firstName"));

    public static final Target INPUT_USER = Target.the("Where do we write the user last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Where do we write the email")
            .located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("Where do we write the month")
            .located(By.cssSelector("select#birthMonth"));

    public static final Target SELECT_DAY = Target.the("Where do we write the day")
            .located(By.cssSelector("select#birthDay"));

    public static final Target SELECT_YEAR = Target.the("Where do we write the year")
            .located(By.cssSelector("select#birthYear"));


    public static final Target NEXT_BUTTON = Target.the("Button to go to the next page")
            .located(By.xpath("//a[@class='btn btn-blue']"));

    public static final Target INPUT_CITY = Target.the("Where do we write the city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("Where do we write the zip")
            .located(By.id("zip"));

    public static final Target CONTAINER_COUNTRY = Target.the("Where do we write the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    public static final Target INPUT_COUNTRY = Target.the("Where do we write the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target DEVICES_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target CONTAINER_COMPUTER = Target.the("Where do we write the computer")
           .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div"));

    public static final Target INPUT_COMPUTER = Target.the("Where do we write the computer")
          .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTAINER_VERSION = Target.the("Where do we write the version")
           .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div"));

    public static final Target INPUT_VERSION = Target.the("Where do we write the version")
         .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));

    public static final Target CONTAINER_LANGUAGE = Target.the("Where do we write the year")
           .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div"));

    public static final Target INPUT_LANGUAGE = Target.the("Where do we write the computer")
       .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));

    public static final Target CONTAINER_MOBILE_DEVICE = Target.the("Where do we write the year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));

    public static final Target INPUT_MOBILE_DEVICE = Target.the("Where do we write the year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTAINER_MODEL = Target.the("Where do we write the year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));

    public static final Target INPUT_MODEL = Target.the("Where do we write the year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target CONTAINER_OS = Target.the("Where do we write the year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));

    public static final Target INPUT_OS = Target.the("Where do we write the year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target LAST_STEP_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Where do we write the zip")
            .located(By.id("confirmPassword"));

    public static final Target INPUT_TERMS = Target.the("Check terms")
            .located(By.id("termOfUse"));

    public static final Target INPUT_PRIVACY = Target.the("Where do we write the zip")
            .located(By.id("privacySetting"));

    public static final Target COMPLETE_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//a[@class='btn btn-blue']"));




}
