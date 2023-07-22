package yandexPraktikumCase;

import BaseTest.baseTest;
import org.junit.Assert;
import org.junit.Test;

public class TitleTransportTest extends baseTest {
    private final static String MY_URl = "https://qa-routes.praktikum-services.ru/";
    private final static String ADDRESS_FROM = "Усачева, 3";
    private final static String ADDRESS_TO = "Комсомольский проспект, 18";
    private final static String HOURS = "15";
    private final static String MINUTES = "01";

    private final static String RESULT_TEXT_TAXI = "Такси";
    private final static String RESULT_TEXT_CAR = "Авто";
    private final static String RESULT_TEXT_FOOT = "Пешком";
    private final static String RESULT_TEXT_BIKE = "Велосипед";
    private final static String RESULT_TEXT_SCOOTER = "Самокат";


    @Test
    public void chekTaxi() {
        TransportPage TransportPage = new TransportPage(MY_URl);
        yandexPraktikumCase.TransportPage.enterHoursInput(HOURS);
        yandexPraktikumCase.TransportPage.enterMinutesInput(MINUTES);
        yandexPraktikumCase.TransportPage.enterFromInput(ADDRESS_FROM);
        yandexPraktikumCase.TransportPage.enterToInput(ADDRESS_TO);
        yandexPraktikumCase.TransportPage.chooseRouteMode();
        TaxiPage.chooseTypeOfTransport();
        String textResultTaxi = TaxiPage.getRealTypeOfTransport();
        Assert.assertTrue(textResultTaxi.startsWith(RESULT_TEXT_TAXI));
    }

    @Test
    public void chekCar() {
        TransportPage TransportPage = new TransportPage(MY_URl);
        yandexPraktikumCase.TransportPage.enterHoursInput(HOURS);
        yandexPraktikumCase.TransportPage.enterMinutesInput(MINUTES);
        yandexPraktikumCase.TransportPage.enterFromInput(ADDRESS_FROM);
        yandexPraktikumCase.TransportPage.enterToInput(ADDRESS_TO);
        yandexPraktikumCase.TransportPage.chooseRouteMode();
        CarPage.chooseTypeOfTransport();
        String textResultCar = CarPage.getRealTypeOfTransport();
        Assert.assertTrue(textResultCar.startsWith(RESULT_TEXT_CAR));
    }

    @Test
    public void chekFoot() {
        TransportPage TransportPage = new TransportPage(MY_URl);
        yandexPraktikumCase.TransportPage.enterHoursInput(HOURS);
        yandexPraktikumCase.TransportPage.enterMinutesInput(MINUTES);
        yandexPraktikumCase.TransportPage.enterFromInput(ADDRESS_FROM);
        yandexPraktikumCase.TransportPage.enterToInput(ADDRESS_TO);
        yandexPraktikumCase.TransportPage.chooseRouteMode();
        FootPage.chooseTypeOfTransport();
        String textResultFoot = FootPage.getRealTypeOfTransport();
        Assert.assertTrue(textResultFoot.startsWith(RESULT_TEXT_FOOT));
    }

    @Test
    public void chekBike() {
        TransportPage TransportPage = new TransportPage(MY_URl);
        yandexPraktikumCase.TransportPage.enterHoursInput(HOURS);
        yandexPraktikumCase.TransportPage.enterMinutesInput(MINUTES);
        yandexPraktikumCase.TransportPage.enterFromInput(ADDRESS_FROM);
        yandexPraktikumCase.TransportPage.enterToInput(ADDRESS_TO);
        yandexPraktikumCase.TransportPage.chooseRouteMode();
        BikePage.chooseTypeOfTransport();
        String textResultFoot = BikePage.getRealTypeOfTransport();
        Assert.assertTrue(textResultFoot.startsWith(RESULT_TEXT_BIKE));
    }

    @Test
    public void chekScooter() {
        TransportPage TransportPage = new TransportPage(MY_URl);
        yandexPraktikumCase.TransportPage.enterHoursInput(HOURS);
        yandexPraktikumCase.TransportPage.enterMinutesInput(MINUTES);
        yandexPraktikumCase.TransportPage.enterFromInput(ADDRESS_FROM);
        yandexPraktikumCase.TransportPage.enterToInput(ADDRESS_TO);
        yandexPraktikumCase.TransportPage.chooseRouteMode();
        ScooterPage.chooseTypeOfTransport();
        String textResultFoot = ScooterPage.getRealTypeOfTransport();
        Assert.assertTrue(textResultFoot.startsWith(RESULT_TEXT_SCOOTER));
    }

}









