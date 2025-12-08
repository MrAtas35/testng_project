import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTesti {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    @Parameters ({"browser"})
    @BeforeClass
    public void init(String browser){
        switch (browser){
            case "firefox":driver=new FirefoxDriver();
            driver.manage().window().maximize();break;


        }
    }
    @Test(groups = {"smoke"})
    public void loginWithValidData(){


    }
    @Test(groups = {"smoke"})
    public void loginWithInValidData(){


    }
    @Test(groups = {"smoke"})
    public void searchProduct(){

    }
    @Parameters({"name","email"})
    public void contactUs(){

    }

}
