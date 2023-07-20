import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// страница где хранятся перменные и методы
public class mainPage {
    private final SelenideElement searchIcon = $x("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/button");
    private final SelenideElement searchInput = $x("//*[@id=\"search-modal\"]/div[2]/form/input[1]");
    private final SelenideElement searchButton = $x("//button[@class=\"search-submit\"]");


   public mainPage(String URL) {  // конструктор инициализации класса mainPage, внутри метод открытия URL
       Selenide.open(URL);
   }
   public void clickSearchIcon() {  // метод для клика по иконке поиска
       searchIcon.click();
   }
    public void sendSearchInput(String myQuery) { // вставляем в поисковую строку искомый текст
       searchInput.sendKeys(myQuery);
   }
    public void clickSearchButton() { // клик по кнопке поиска
        searchButton.click();
    }
}
