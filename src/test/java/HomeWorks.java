import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {

    WebDriver  wd;

    @BeforeClass
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        wd = new ChromeDriver(options);
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void cssLocators(){
        // by tag name
        WebElement el= wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));
        WebElement xElement =wd.findElement(By.xpath("//button"));

        WebElement el1= wd.findElement(By.tagName("body"));
        WebElement element1 = wd.findElement(By.cssSelector("body"));
        WebElement e1 = wd.findElement(By.xpath("//body"));

        WebElement el2= wd.findElement(By.tagName("div"));
        WebElement element2 = wd.findElement(By.cssSelector("div"));
        WebElement e2 = wd.findElement(By.xpath("//div"));

        WebElement el3= wd.findElement(By.tagName("h1"));
        WebElement element3 = wd.findElement(By.cssSelector("h1"));
        WebElement e3 = wd.findElement(By.xpath("//h1"));

        WebElement el4= wd.findElement(By.tagName("a"));
        WebElement element4 = wd.findElement(By.cssSelector("a"));
        WebElement e4 = wd.findElement(By.xpath("//a"));

        WebElement el5= wd.findElement(By.tagName("form"));
        WebElement element5 = wd.findElement(By.cssSelector("form"));
        WebElement e5 =wd.findElement(By.xpath("//form"));

        WebElement el6= wd.findElement(By.tagName("input"));
        WebElement element6 = wd.findElement(By.cssSelector("input"));
        WebElement e6 =wd.findElement(By.xpath("//input"));

        // by class
        WebElement element7 = wd.findElement(By.className("container"));
        WebElement element8 = wd.findElement(By.cssSelector(".container"));
        WebElement xelement1  = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement element9 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element10 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement e7 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement element11 = wd.findElement(By.className("active"));
        WebElement element12 = wd.findElement(By.cssSelector(".active"));
        WebElement el15 = wd.findElement(By.xpath("//*[@class='active']"));

        //By id

        WebElement element13 = wd.findElement(By.id("root"));
        WebElement element14 = wd.findElement(By.cssSelector("#root"));
        WebElement el8 = wd.findElement(By.xpath("//*[@id= 'root']"));

        // by attribute
        WebElement  element15 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement e9 = wd.findElement(By.xpath("//*[@id= 'root']"));

        WebElement  element16 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement e10 = wd.findElement(By.xpath("//*[@href ='/home']"));

        WebElement  element17 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement element18 = wd.findElement(By.name("email"));
        WebElement e11 = wd.findElement(By.xpath("//*[@name= 'email']"));


        // one of elements find by attribute ==> start & end & contains value
        WebElement element19 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el9 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        //Start
        WebElement element20 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement el10 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));


        WebElement element21 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement e12 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));
        // contains
        WebElement element22 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement el11 = wd.findElement(By.xpath("//input[contains(@placeholder,'ss')]"));
        wd.findElement(By.xpath("//a[3]"));

    }

    @Test
    public void classwork(){
        // parent
        WebElement el =wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 =wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 =wd.findElement(By.xpath("//h1/.."));

        // ancestor предки
        WebElement el3 =wd.findElement(By.xpath("//h1/ancestor::*")); // all
        WebElement el4 =wd.findElement(By.xpath("//h1/ancestor::div")); // two options
        WebElement el5 =wd.findElement(By.xpath("//h1/ancestor::div[2]")); // one option

        // ancestor and self (plus one more)
        WebElement el6= wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement >list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling

        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));
        //preceding-sibling
        WebElement el7=wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        List<WebElement> list2=wd.findElements(By.xpath("//a[@href='/login']/preceding-sibling::a"));



    }

    @Test
    public void classwork2(){

        WebElement element = wd.findElement(By.cssSelector("[name='login']"));

        String text =element.getText(); // get from innerText
        System.out.println(text);

        WebElement form =wd.findElement(By.xpath("//form"));
        String  textForm =form.getText();
        System.out.println("**************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String  textall = html.getText();
        System.out.println("**************");
        System.out.println(textall);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text br--->"+br.getText());
    }
}
