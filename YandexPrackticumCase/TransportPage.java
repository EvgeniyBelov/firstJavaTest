package yandexPraktikumCase;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TransportPage {
    private static final SelenideElement hoursInput = $x("//input[@id=\"form-input-hour\"]");
    private static final SelenideElement minutesInput = $x("//input[@id=\"form-input-minute\"]");
    private static final SelenideElement fromInput = $x("//input[@id=\"form-input-from\"]");
    private static final SelenideElement toInput = $x("//input[@id=\"form-input-to\"]");
    private static final SelenideElement routeMode = $x("//div[@id=\"form-mode-custom\"]");

    public TransportPage (String URL) {
        Selenide.open(URL);
    }
    public static void enterHoursInput(String S){
        hoursInput.setValue(S);
    }
    public static void enterMinutesInput(String S){
        minutesInput.setValue(S);
    }
    public static void enterFromInput(String S) {
        fromInput.setValue(S);
    }
    public static void enterToInput(String S) {
        toInput.setValue(S);
    }
    public static void chooseRouteMode() {
        routeMode.click();
    }




}