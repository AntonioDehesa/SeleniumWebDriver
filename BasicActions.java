package basicweb;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class BasicActions {
	public static int TimeDelay = 1000;
	
	WebDriver driver;
	String baseURL = "https://letskodeit.teachable.com/p/practice";
	@BeforeEach
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterEach
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws Exception
	{
		driver.get(baseURL);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[1]/fieldset/label[1]/input")));
		WebElement radioBMW = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[1]/fieldset/label[1]/input"));
		
		radioBMW.click();
		Thread.sleep(TimeDelay);
		WebElement radioBenz = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[1]/fieldset/label[2]/input"));
		WebElement radioHonda = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[1]/fieldset/label[3]/input"));
		radioBenz.click();
		Thread.sleep(TimeDelay);
		radioHonda.click();
		Thread.sleep(TimeDelay);
		
		
		WebElement DropdownList = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/fieldset/select"));
		Select listSelect = new Select(DropdownList);
		listSelect.selectByIndex(0);
		Thread.sleep(TimeDelay);
		listSelect.selectByValue("benz");
		Thread.sleep(TimeDelay);
		listSelect.selectByVisibleText("Honda");
		Thread.sleep(TimeDelay);
		
		WebElement multipleSelect = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[3]/fieldset/select"));
		Select mSelect = new Select(multipleSelect);
		mSelect.selectByIndex(0);
		Thread.sleep(TimeDelay);
		mSelect.selectByValue("orange");
		Thread.sleep(TimeDelay);
		mSelect.selectByVisibleText("Peach");
		Thread.sleep(TimeDelay);
		
		(driver.findElement(By.cssSelector("#bmwcheck"))).click();
		(driver.findElement(By.cssSelector("#hondacheck"))).click();
		(driver.findElement(By.cssSelector("#benzcheck"))).click();
		
		//Cambiar entre pestañas
		/*WebElement tab = driver.findElement(By.id("opentab"));
		tab.click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		System.out.println("Titulo de la pagina actual: " + driver.getTitle());
		Thread.sleep(TimeDelay);
		driver.switchTo().window(tabs.get(1));
		System.out.println("Titulo de la pagina actual: " + driver.getTitle());*/
		
		//Cambiar entre ventanas y pestañas
		(driver.findElement(By.id("opentab"))).click();
		WebElement windowOpener = driver.findElement(By.id("openwindow"));
		windowOpener.click();
		ArrayList<String> windows = new ArrayList<String> (driver.getWindowHandles());
		for(String window : windows)
		{
			driver.switchTo().window(window);
			System.out.println("Titulo de la pagina actual: " + driver.getTitle());
			Thread.sleep(TimeDelay);
		}
	}
}
