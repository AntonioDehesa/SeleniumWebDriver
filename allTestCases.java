package basicweb;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.media.sound.Toolkit;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

import java.awt.datatransfer.Clipboard;
import java.util.List;
import java.util.Set;
import usefulMethods.GenericMethods;

public class allTestCases {
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;
	public final int TimeDelay = 1000;
	private GenericMethods gm;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

    /*@Test
	public void test1() throws Exception {
		driver.get(baseUrl);
		// Click flights tab
		//driver.findElement(By.id("tab-flight-tab")).click();
		// Find departing field
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("d1-btn")));
		driver.findElement(By.id("d1-btn")).click();
		// Click departing field
		Thread.sleep(3000);
		// Find the date to be selected
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div/div[1]/div/form/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[5]/td[4]/button")));
		WebElement dateToSelect = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div/div[1]/div/form/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[5]/td[4]/button"));
		// Click the date
		dateToSelect.click();
	}*/
    
	/*@Test
	public void findSizeOfWindow() throws Exception
	{
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		js = (JavascriptExecutor) driver;
		//driver.get(baseUrl);
		js.executeScript("window.location= '"+ baseUrl + "';");
		//WebElement element = (WebElement) js.executeScript("return document.getElementById('name')");
		//element.sendKeys("test");
		long height,width;
		height = (long) js.executeScript("return window.innerHeight");
		width = (long) js.executeScript("return window.innerWidth");
		System.out.println("Height: " + height + " and Width: " + width);
	}*/
	
	/*@Test
	public void scrollWindow() throws Exception
	{
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		js = (JavascriptExecutor) driver;
		//driver.get(baseUrl);
		js.executeScript("window.location= '"+ baseUrl + "';");
		
		//Scroll down
		js.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(TimeDelay);
		//Scroll up
		js.executeScript("window.scrollBy(0,-1900)");
		Thread.sleep(TimeDelay);
		
		//Scroll element into view
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(TimeDelay);
		js.executeScript("window.scrollBy(0,-190)");
	}*/

	/*@Test
	public void clickTest() throws Exception
	{
		js = (JavascriptExecutor) driver;
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseUrl);
		Thread.sleep(TimeDelay);
		WebElement checkBox = driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click();", checkBox);
	}*/
	
	/*@Test
	public void clickTestFail() throws Exception
	{
		js = (JavascriptExecutor) driver;
		baseUrl = "https://www.retailmenot.com";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/button[2]")).click();
		Thread.sleep(TimeDelay);
		WebElement checkBox = driver.findElement(By.id("subscribe"));
		//checkBox.click();
		js.executeScript("arguments[0].click();", checkBox);
	}*/
	
	/*@Test
	public void switchWindows() throws Exception
	{
		driver.get(baseUrl);
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent handle = " + parentHandle);
		(driver.findElement(By.id("openwindow"))).click();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			System.out.println("ID = " + handle);
		}
	}*/
	
	/*@Test
	public void iFrameExample() throws Exception
	{
		driver.get(baseUrl);
		driver.switchTo().frame("courses-iframe");
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("python");
		//searchBox.sendKeys(Keys.RETURN);
		driver.switchTo().defaultContent();
	}*/
	
	/*@Test
	public void popUp() throws Exception
	{
		driver.get(baseUrl);
		WebElement alertButton = driver.findElement(By.id("alertbtn"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}*/
	
	/*@Test
	public void mouseHover() throws Exception
	{
		driver.get(baseUrl);
		js = (JavascriptExecutor) driver;
		gm = new GenericMethods(driver);
		WebElement mouseHoverButton = driver.findElement(By.id("mousehover"));
		gm.scrollIntoView(mouseHoverButton, js);
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHoverButton);
		WebElement topElement = driver.findElement(By.xpath("//div[@id=\"block-1069048\"]/div/div/div/div[4]/div/fieldset/div/div/a[1]"));
		actions.moveToElement(topElement);
		actions.click();
		actions.perform();
	}*/
	
	/*@Test
	public void dragAndDrop() throws Exception
	{
		baseUrl = "https://jqueryui.com/droppable/";
		driver.get(baseUrl);
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(draggable, droppable);
		//actions.build().perform();
		actions.build().perform();
	}*/
	
	/*@Test
	public void slider() throws Exception
	{
		baseUrl = "https://jqueryui.com/slider/";
		driver.get(baseUrl);
		driver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"slider\"]/span")));
		WebElement slider = driver.findElement(By.xpath("//div[@id=\"slider\"]/span"));
		Actions actions = new Actions(driver);
		actions.moveToElement(slider).dragAndDropBy(slider, 100, 0);
	}*/
	
	/*@Test
	public void keyboard() throws Exception
	{
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
		driver.findElement(By.id("user_email")).sendKeys("testing");
		driver.findElement(By.id("user_password")).sendKeys("12345678");
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
	}*/
	
	/*@Test
	public void keyCombination() throws Exception
	{
		driver.get(baseUrl);
		driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
		//Thread.sleep(2000);
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
	}*/
	
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}