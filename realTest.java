import org.junit.Assert;
import org.junit.Test;

public class realTest extends baseTest { //наследуемся от baseTest
    private  final static String MY_URL = "https://trofimovdigital.ru/";
    // Приватная переменная, доступная только в этом классе, неизменяемая
    private  final static String MY_QUERY = "java class";

    @Test
    public void chekId1(){
        mainPage mainPage =  new mainPage(MY_URL); // создания экз. класса mainPage и передача в аргумент MY_URL
        mainPage.clickSearchIcon();
        mainPage.sendSearchInput(MY_QUERY);
        mainPage.clickSearchButton();
        searchPage searchPage = new searchPage(); // создаем экз. класса searchPage
        String id1 = searchPage.getId1ArticleTitles();//  в переменную id записываем найденный id первой статьи
        Assert.assertTrue(id1.contains("post-5502")); /* сравнение значения переменной id
        с искомым заголовком */
    }

    @Test
    public void chekId2(){
        mainPage mainPage =  new mainPage(MY_URL); // создания экз. класса mainPage и передача в аргумент MY_URL
        mainPage.clickSearchIcon();
        mainPage.sendSearchInput(MY_QUERY);
        mainPage.clickSearchButton();
        searchPage searchPage = new searchPage(); // создаем экз. класса searchPage
        String id2 = searchPage.getId2ArticleTitles();//  в переменную id записываем найденный id первой статьи
        Assert.assertTrue(id2.contains("post-4498")); /* сравнение значения переменной id
        с искомым заголовком */
    }

    @Test
    public void chekId3(){
        mainPage mainPage =  new mainPage(MY_URL); // создания экз. класса mainPage и передача в аргумент MY_URL
        mainPage.clickSearchIcon();
        mainPage.sendSearchInput(MY_QUERY);
        mainPage.clickSearchButton();
        searchPage searchPage = new searchPage(); // создаем экз. класса searchPage
        String id3 = searchPage.getId3ArticleTitles();//  в переменную id записываем найденный id первой статьи
        Assert.assertTrue(id3.contains("post-516")); /* сравнение значения переменной id
        с искомым заголовком */
    }

    @Test
    public void chekId4(){
        mainPage mainPage =  new mainPage(MY_URL); // создания экз. класса mainPage и передача в аргумент MY_URL
        mainPage.clickSearchIcon();
        mainPage.sendSearchInput(MY_QUERY);
        mainPage.clickSearchButton();
        searchPage searchPage = new searchPage(); // создаем экз. класса searchPage
        String id4 = searchPage.getId4ArticleTitles();//  в переменную id записываем найденный id первой статьи
        Assert.assertTrue(id4.contains("post-410")); /* сравнение значения переменной id
        с искомым заголовком */
    }
    @Test
    public void chekId5(){
        mainPage mainPage =  new mainPage(MY_URL); // создания экз. класса mainPage и передача в аргумент MY_URL
        mainPage.clickSearchIcon();
        mainPage.sendSearchInput(MY_QUERY);
        mainPage.clickSearchButton();
        searchPage searchPage = new searchPage(); // создаем экз. класса searchPage
        String id5 = searchPage.getId5ArticleTitles();//  в переменную id записываем найденный id первой статьи
        Assert.assertTrue(id5.contains("post-1189")); /* сравнение значения переменной id
        с искомым заголовком */
    }

}
