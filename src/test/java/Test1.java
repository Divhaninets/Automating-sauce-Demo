import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

   public class Test1 {

    WebDriver driver;

    @Test
    public void a_FirstTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://saucedemo.com");


        Thread.sleep(1000);

        WebElement ausername = driver.findElement(By.id("user-name"));
        WebElement apassword = driver.findElement(By.id("password"));
        WebElement alogin = driver.findElement(By.id("login-button"));

        ausername.sendKeys("Wrong Username");
        Thread.sleep(1000);
        apassword.sendKeys("secret_sauce");
        Thread.sleep(1000);
        alogin.click();
        Thread.sleep(2000);

        WebElement alusername = driver.findElement(By.id("user-name"));
        WebElement alpassword = driver.findElement(By.id("password"));

        //How to do  a backspace
        ausername.sendKeys(Keys.CONTROL,"Wrong Username",Keys.DELETE);
        Thread.sleep(1000);
        apassword.sendKeys(Keys.CONTROL,"secret_sauce",Keys.DELETE);
        Thread.sleep(1000);




        Thread.sleep(1000);

        WebElement cusername = driver.findElement(By.id("user-name"));
        WebElement cpassword = driver.findElement(By.id("password"));
        WebElement clogin = driver.findElement(By.id("login-button"));


        cusername.sendKeys("standard_user");
        Thread.sleep(1000);
        cpassword.sendKeys("WrongPassword");
        Thread.sleep(1000);
        clogin.click();
        Thread.sleep(2000);

        WebElement clusername = driver.findElement(By.id("user-name"));
        WebElement clpassword = driver.findElement(By.id("password"));

        //How to do  a backspace
        ausername.sendKeys(Keys.CONTROL,"standard_user",Keys.DELETE);
        Thread.sleep(1000);
        apassword.sendKeys(Keys.CONTROL,"WrongPassword",Keys.DELETE);
        Thread.sleep(1000);



        Thread.sleep(1000);

        WebElement busername = driver.findElement(By.id("user-name"));
        WebElement bpassword = driver.findElement(By.id("password"));
        WebElement blogin = driver.findElement(By.id("login-button"));

        busername.sendKeys("standard_user");
        Thread.sleep(1000);
        bpassword.sendKeys("secret_sauce");
        Thread.sleep(1000);
        blogin.click();
        Thread.sleep(2000);

    }

    @Test
    public void b_SecondTest() throws InterruptedException {

        //click title
        WebElement ClickTitle = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        ClickTitle.click();
        Thread.sleep(2000);

        //click "add to cart"
        WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        AddToCart.click();
        Thread.sleep(2000);

        //click on cart icon
        WebElement ClickOnCartIcon = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        ClickOnCartIcon.click();
        Thread.sleep(2000);

        //click on continue shopping
        WebElement ClickOnContinueShopping = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
        ClickOnContinueShopping.click();
        Thread.sleep(2000);


    }

    @Test
    public void c_ThirdTest() throws InterruptedException {

        //click picture
        WebElement ClickTitle = driver.findElement(By.xpath("//*[@id=\"item_0_img_link\"]/img"));
        ClickTitle.click();
        Thread.sleep(2000);

        //click "add to cart"
        WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        AddToCart.click();
        Thread.sleep(2000);

        //click on cart icon
        WebElement ClickOnCartIcon = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        ClickOnCartIcon.click();
        Thread.sleep(2000);

        //click on continue shopping
        WebElement ClickOnContinueShopping = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
        ClickOnContinueShopping.click();
        Thread.sleep(2000);

    }

    @Test
    public void d_ForthTest() throws InterruptedException {


        //click "add to cart"
        WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        AddToCart.click();
        Thread.sleep(2000);

        //click on cart icon
        WebElement ClickOnCartIcon = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        ClickOnCartIcon.click();
        Thread.sleep(2000);

        //click on "Sauce labs bolt T-shirt"
        WebElement BoltTshirt = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
        BoltTshirt.click();
        Thread.sleep(2000);

        //click on Remove from cart
        WebElement RemoveCart = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]"));
        RemoveCart.click();
        Thread.sleep(2000);

        //click on back to product
        WebElement BackToProduct = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
        BackToProduct.click();
        Thread.sleep(2000);

    }

    @Test
    public void e_FifthTest() throws InterruptedException {


        //click "Sort by"
        WebElement SortBy = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        SortBy.click();
        Thread.sleep(2000);

        WebElement ZtoA = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
        ZtoA.click();
        Thread.sleep(2000);

        WebElement lowtoHigh = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]"));
        lowtoHigh.click();
        Thread.sleep(2000);

        WebElement HightoLow = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]"));
        HightoLow.click();
        Thread.sleep(2000);

        WebElement AtoZ = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[1]"));
        AtoZ.click();
        Thread.sleep(2000);


    }


    @Test
    public void f_SixthTest() throws InterruptedException {

        //click on cart icon
        WebElement ClickOnCartIcon = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        ClickOnCartIcon.click();
        Thread.sleep(2000);

        //click on Checkout
        WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        Checkout.click();
        Thread.sleep(2000);

        //Checkout information
        WebElement Name = driver.findElement(By.id("first-name"));
        WebElement LastName = driver.findElement(By.id("last-name"));
        WebElement Postal = driver.findElement(By.id("postal-code"));

        Name.sendKeys("Divhani");
        Thread.sleep(1000);
        LastName.sendKeys("Netshiombo");
        Thread.sleep(1000);
        Postal.sendKeys("1449");
        Thread.sleep(1000);
        WebElement Continue = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        Continue.click();
        Thread.sleep(2000);

        //click on Finish
        WebElement Finish = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
        Finish.click();
        Thread.sleep(2000);

        //click on Back to Home Page
        WebElement BackToHomePage = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
        BackToHomePage.click();
        Thread.sleep(2000);

    }

    @Test
    public void g_seventhTest() throws InterruptedException {

        //click on menu
        WebElement Menu = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
        Menu.click();
        Thread.sleep(2000);

        //click on Logout
        WebElement Logout = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        Logout.click();
        Thread.sleep(2000);
        driver.close();

    }




    }

