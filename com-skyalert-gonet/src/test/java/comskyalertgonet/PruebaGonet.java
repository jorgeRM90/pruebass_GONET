package comskyalertgonet;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PruebaGonet {
	
	@Test
	void navegacionPagina() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url= "https://skyalert.mx/";
		
		
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[5]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[5]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Inicio')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='displaydataButtonPop']")).click();
		//div[@id='htphw']//button[@id='displaydataButtonPop']
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"
				+ "/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"
				+ "/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/div[1]/input[1]")).sendKeys("Juan Perez");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"
				+ "/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"
				+ "/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/input[1]")).sendKeys("juan@prueba.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/input[1]")).sendKeys("SkyAlert_Casa");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[6]/div[1]/span[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[6]/div[1]/span[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("5562100000");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[7]/div[1]/span[1]/div[1]/select[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'11 a 50 empleados')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-buttonpopup[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[7]/div[1]/span[1]/div[1]/select[1]")).click();
	}

}
