import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class searchPage {
    private final ElementsCollection articleTitles = $$x("//div//article");

    public String getId1ArticleTitles() {
        return articleTitles.get(0).getAttribute("id");
        // возвращает id из первой статьи(все статьи на странице упакованы в коллекцию articleTitles)
    }

    public String getId2ArticleTitles() {
        return articleTitles.get(1).getAttribute("id");
    }

    public String getId3ArticleTitles() {
        return articleTitles.get(2).getAttribute("id");
    }

    public String getId4ArticleTitles() {
        return articleTitles.get(3).getAttribute("id");
    }

    public String getId5ArticleTitles() {
        return articleTitles.get(4).getAttribute("id");
    }




}



