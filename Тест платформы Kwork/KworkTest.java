package SecondJavaTest;

import BaseTest.baseTest;
import org.junit.Assert;
import org.junit.Test;

public class KworkTest extends baseTest {
    private final static String MY_URL = "https://kwork.ru/user/naprimer13";
    private final static String MY_SPECIALUTY = "QA Engineer";
    private final static String MY_NAME = "Евгений";

    @Test
    public void chekSpeciality() {
        KworkPage KworkPage = new KworkPage(MY_URL);
        String cS = KworkPage.getSpecialityLocator();
        Assert.assertTrue(cS.contains(MY_SPECIALUTY));

    }

    @Test
    public void chekName () {
        KworkPage KworkPage = new KworkPage(MY_URL);
        String cN = KworkPage.getNameLocator();
        Assert.assertTrue(cN.contains(MY_NAME));

    }

}





