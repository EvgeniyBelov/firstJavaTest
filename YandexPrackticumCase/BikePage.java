package yandexPraktikumCase;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BikePage {

    private static final SelenideElement typeOfTransport = $x("//div[@id=\"from-type-bike\"]");

    private static final SelenideElement realTypeOfTransport = $x("//div[@id=\"result-time-price\"]");


    public static void chooseTypeOfTransport() {
        typeOfTransport.click();
    }

    public static String getRealTypeOfTransport() {
        return realTypeOfTransport.getText();
    }
}