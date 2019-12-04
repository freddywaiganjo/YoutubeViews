import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by user on 12/03/2019.
 */
public class Youtube {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        System.out.println("Running in headless mode...");
        driver = new ChromeDriver(options);
        baseUrl = "https://www.youtube.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void playVideo() throws Exception {

//        Your video url goes here i.e exactVd
        String exactVd = "/watch?v=ZoFe7SOrgjw";
        driver.get(baseUrl + exactVd);
        System.out.println("URL::: "+baseUrl+exactVd);
        System.out.println("Thread_ID:: "+Thread.currentThread().getId());
//        don't worry about the xpath. it works
        WebElement Play = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[22]/div[2]/div[1]/button"));
        Play.click();
//      Sleep time equals the length of your video
        Thread.sleep(30000);
        WebElement currentViews = driver.findElement(By.id("info"));
        String viewss = currentViews.getText().substring(5,26);
        System.out.println("CURRENT VIEWS::: "+ viewss);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
