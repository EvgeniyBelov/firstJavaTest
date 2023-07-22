package SecondJavaTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class KworkPage {
    public KworkPage(String URL) {
        Selenide.open(URL);
    }

    private final SelenideElement specialtyLocator = $x("//div[@class=\"break-word user-profession m-hidden mt10\"]");
    private final SelenideElement nameLocator = $x("//div[@class=\"user-fullname m-hidden mt10\"]");

    public String getSpecialityLocator() {
        return specialtyLocator.getText();
    }
    public String getNameLocator(){
        return nameLocator.getText();
    }
}

