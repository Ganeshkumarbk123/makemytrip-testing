package mypackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        String exepath ="C:\\Users\\Asus\\Downloads\\chromedriver_win32/chromedriver.exe";
        
        System.setProperty("webdriver.chrome.driver", exepath);
 
          
          WebDriver driver = new ChromeDriver();
      
          driver.navigate().to(" https://www.makemytrip.com/railways/");  
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/label/span")).click();
          Thread.sleep(2000);
          driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.rsw.widgetOpen > div > div.rsw_inputBox.selectRailCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input")).sendKeys("Delhi");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"toCity\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.rsw.widgetOpen > div > div.rsw_inputBox.selectRailCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input")).sendKeys("Lucknow");
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"travelDate\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[6]")).click();
          Thread.sleep(2000);
          
          
          driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[3]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a")).click();
	}

}
