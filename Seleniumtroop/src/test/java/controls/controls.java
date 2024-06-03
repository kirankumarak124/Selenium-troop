package controls;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class controls {

	ExtentReports extentreports = new ExtentReports();
	ExtentHtmlReporter sparkreporter = new ExtentHtmlReporter("Loginpage.html");
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void beforeTest() {
		extentreports.attachReporter(sparkreporter);

	}

	@Test
	public void testcase01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:8083/user/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
		Thread.sleep(800);
		String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
		Assert.assertEquals("Web1 Std", a);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("doo 2");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@data-name='doo 2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(500);
		String b=driver.findElement(By.xpath("//div[@class='coordinates-btn']")).getText();
		Assert.assertEquals("Co-ordinates", b);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-order='3']")).click();
		Thread.sleep(500);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDisable']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
		Thread.sleep(500);
		String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		Assert.assertEquals("Updated!", c);
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("doo 2");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@data-name='doo 2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(500);
		String d=driver.findElement(By.xpath("//div[@class='coordinates-btn']")).getText();
		Assert.assertEquals("", d);
		
		
		ExtentTest test = extentreports.createTest("Disable Co-Ordinates");
		test.log(Status.INFO, "Chrome browser launched successfully");
		test.info("Navigate to URL");
		test.info("UserName: Web1 std");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.pass(a);
		test.info("Search any user");
		test.info("Click on user profile");
		test.pass(b);
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on Co-Ordinates");
	    test.info("Click on disable button");
	    test.info("Click on save button");
	    test.pass(c);
	    test.info("Click on Chats icon");
	    test.info("Search any user");
	    test.info("Click on user profile");
		test.info("Expected Resultl:: It should not display Co-Ordinates option");
		test.pass(d);
		test.log(Status.PASS, "Actual results:: It not displaying Co-Ordinates option");
		test.pass("Test case: Test case passed");
		Thread.sleep(200);
		driver.close();
	}
		@Test
		public void testcase02() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("doo 2");
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-name='doo 2']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("//div[@class='coordinates-btn']")).getText();
			Assert.assertEquals("", b);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioEnable']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", c);
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("doo 2");
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-name='doo 2']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
			Thread.sleep(500);
			String d=driver.findElement(By.xpath("//div[@class='coordinates-btn']")).getText();
			Assert.assertEquals("Co-ordinates", d);
			
			
			ExtentTest test = extentreports.createTest("Enable Co-Ordinates");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Search any user");
			test.info("Click on user profile");
			test.pass(b);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on enable button");
		    test.info("Click on save button");
		    test.pass(c);
		    test.info("Click on Chats icon");
		    test.info("Search any user");
		    test.info("Click on user profile");
			test.info("Expected Resultl:: It should display Co-Ordinates option");
			test.pass(d);
			test.log(Status.PASS, "Actual results:: It displaying Co-Ordinates option");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
	}
		
		@Test
		public void testcase03() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//label[@for='coordinatesRoleCheckbox2']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", c);
			
			
			ExtentTest test = extentreports.createTest("Disable the user permission in Co-Ordinates");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on Disable the user permission");
		    test.info("Click on save button");
			test.info("Expected Resultl:: It should save the changes");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It is saving the changes");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		@Test
		public void testcase04() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//label[@for='coordinatesRoleCheckbox2']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", c);
			
			
			ExtentTest test = extentreports.createTest("Enable the user permission in Co-Ordinates");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on Enable the user permission");
		    test.info("Click on save button");
			test.info("Expected Resultl:: It should save the changes");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It is saving the changes");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		@Test
		public void testcase05() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting any filter click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should take all days by defaulty");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It taking all days by defaulty");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		
		@Test
		public void testcase06() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeCancelBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting any filter click on Cancle button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on Cancle button");
			test.info("Expected Resultl:: It should take current filter by defaulty");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It taking current filter by defaulty");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		
		
		@Test
		public void testcase07() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Please select week days!", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting week days click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select week days! text");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select week days! text");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		
		@Test
		public void testcase08() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Please select from timezone!", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting timezone click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select from timezone!");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select from timezone!");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		@Test
		public void testcase09() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']")).click();
			Thread.sleep(500);
			
			WebElement CourseElement = driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']"));

			Select CourseNameDropdown = new Select(CourseElement);

			List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();

			for (WebElement option : CourseNameDropdownOptions) {
				System.out.println(option.getText());
			}
			CourseNameDropdown.selectByValue("Asia/Kolkata");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Please select from time!", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting fromtime click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Select the timezone");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select from time!!");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select from time!!");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		@Test
		public void testcase10() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']")).click();
			Thread.sleep(500);
			
			WebElement CourseElement = driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']"));

			Select CourseNameDropdown = new Select(CourseElement);

			List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();

			for (WebElement option : CourseNameDropdownOptions) {
				System.out.println(option.getText());
			}
			CourseNameDropdown.selectByValue("Asia/Kolkata");
			Thread.sleep(1000);
			WebElement fromTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesFromTime']"));
	        fromTimeInput.clear();
	        fromTimeInput.sendKeys("09:50 AM");
	        Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Please select to time!", c);
			
			ExtentTest test = extentreports.createTest("User-Without selecting totime click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Select the timezone");
		    test.info("Select the from time");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select to time!");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select to time!");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
//		2
		
		
		@Test
		public void testcase11() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web2 mpt std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web2 Mpt Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']")).click();
			Thread.sleep(500);
			
			WebElement CourseElement = driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']"));

			Select CourseNameDropdown = new Select(CourseElement);

			List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();

			for (WebElement option : CourseNameDropdownOptions) {
				System.out.println(option.getText());
			}
			CourseNameDropdown.selectByValue("Asia/Kolkata");
			Thread.sleep(1000);
			WebElement fromTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesFromTime']"));
//	        fromTimeInput.clear();
	        fromTimeInput.sendKeys("09:50 AM");
	        Thread.sleep(500);
	        WebElement toTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesToTime']"));
//	        toTimeInput.clear();
	        toTimeInput.sendKeys("05:00 PM");
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='coordinatesToTime']")).click();
            Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//span[@class='selected-text'])[1]")).getText();
			Assert.assertEquals("Day Range", c);
			Thread.sleep(500);
			String d=driver.findElement(By.xpath("(//div[@class='date-selection-text'])[1]")).getText();
			Assert.assertEquals("We 09:50am-05:00pm", d);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String e=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", e);
			
			ExtentTest test = extentreports.createTest("User-Select day filter and click on save");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Select the timezone");
		    test.info("Select the from time");
		    test.info("Select totime");
		    test.info("Click on apply button");
		    test.pass(c);
		    test.pass(d);
		    test.info("Click on save button");
			test.info("Expected Resultl:: It should save the day filter");
			test.pass(e);
			test.log(Status.PASS, "Actual results:: It is savinge the day filter");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
				
		

		@Test
		public void testcase12() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web2 mpt std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web2 Mpt Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@class='selected-text'])[1]")).getText();
			Assert.assertEquals("Day Range", b);
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//div[@class='date-selection-text'])[1]")).getText();
			Assert.assertEquals("We 09:50am-05:00pm", c);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@class='selected-text'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioAllDaySelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String d=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", d);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String e=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", e);
			
			ExtentTest test = extentreports.createTest("User-Select all day if day filter is placed");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on day range in users");
		    test.pass(b);
		    test.info("Click on all days");
		    test.info("Click on apply button");
		    test.pass(c);
		    test.info("Click on save button");
			test.info("Expected Resultl:: It should save the all day filter");
			test.pass(d);
			test.log(Status.PASS, "Actual results:: It is savinge the all day filter");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		
		
		@Test
		public void testcase13() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']")).click();
			Thread.sleep(500);
			
			WebElement CourseElement = driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']"));

			Select CourseNameDropdown = new Select(CourseElement);

			List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();

			for (WebElement option : CourseNameDropdownOptions) {
				System.out.println(option.getText());
			}
			CourseNameDropdown.selectByValue("Asia/Kolkata");
			Thread.sleep(1000);
			WebElement fromTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesFromTime']"));
	        fromTimeInput.sendKeys("09:50 AM");
	        Thread.sleep(500);
	        WebElement toTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesToTime']"));
	        toTimeInput.sendKeys("05:00 PM");
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='coordinatesToTime']")).click();
            Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeCancelBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", c);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String d=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", d);
			
			
			ExtentTest test = extentreports.createTest("User-Select day filter and click on cancle and save");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Select the timezone");
		    test.info("Select the from time");
		    test.info("Click on cancle button");
			test.info("Expected Resultl:: It should display previous filter");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying previous filter");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}
		
		
		
		
		
		@Test
		public void testcase14() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//label[@for='coordinatesRoleCheckbox2']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", c);
			
			
			ExtentTest test = extentreports.createTest("Disable the user permission in Co-Ordinates");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on Disable the user permission");
		    test.info("Click on save button");
			test.info("Expected Resultl:: It should save the changes");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It is saving the changes");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		@Test
		public void testcase15() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//label[@for='coordinatesRoleCheckbox2']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", c);
			
			
			ExtentTest test = extentreports.createTest("Enable the user permission in Co-Ordinates");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on Enable the user permission");
		    test.info("Click on save button");
			test.info("Expected Resultl:: It should save the changes");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It is saving the changes");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		@Test
		public void testcase16() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting any filter click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should take all days by defaulty");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It taking all days by defaulty");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		
		@Test
		public void testcase17() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeCancelBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting any filter click on Cancle button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on Cancle button");
			test.info("Expected Resultl:: It should take current filter by defaulty");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It taking current filter by defaulty");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		
		
		@Test
		public void testcase18() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Please select week days!", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting week days click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select week days! text");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select week days! text");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		
		@Test
		public void testcase19() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Please select from timezone!", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting timezone click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select from timezone!");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select from timezone!");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		@Test
		public void testcase20() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']")).click();
			Thread.sleep(500);
			
			WebElement CourseElement = driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']"));

			Select CourseNameDropdown = new Select(CourseElement);

			List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();

			for (WebElement option : CourseNameDropdownOptions) {
				System.out.println(option.getText());
			}
			CourseNameDropdown.selectByValue("Asia/Kolkata");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Please select from time!", c);
			
			
			ExtentTest test = extentreports.createTest("User-Without selecting fromtime click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Select the timezone");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select from time!!");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select from time!!");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		@Test
		public void testcase21() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']")).click();
			Thread.sleep(500);
			
			WebElement CourseElement = driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']"));

			Select CourseNameDropdown = new Select(CourseElement);

			List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();

			for (WebElement option : CourseNameDropdownOptions) {
				System.out.println(option.getText());
			}
			CourseNameDropdown.selectByValue("Asia/Kolkata");
			Thread.sleep(1000);
			WebElement fromTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesFromTime']"));
	        fromTimeInput.clear();
	        fromTimeInput.sendKeys("09:50 AM");
	        Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Please select to time!", c);
			
			ExtentTest test = extentreports.createTest("User-Without selecting totime click on apply button");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Select the timezone");
		    test.info("Select the from time");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select to time!");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select to time!");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
//		2
		
		
		@Test
		public void testcase22() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web2 mpt std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web2 Mpt Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']")).click();
			Thread.sleep(500);
			
			WebElement CourseElement = driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']"));

			Select CourseNameDropdown = new Select(CourseElement);

			List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();

			for (WebElement option : CourseNameDropdownOptions) {
				System.out.println(option.getText());
			}
			CourseNameDropdown.selectByValue("Asia/Kolkata");
			Thread.sleep(1000);
			WebElement fromTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesFromTime']"));
//	        fromTimeInput.clear();
	        fromTimeInput.sendKeys("09:50 AM");
	        Thread.sleep(500);
	        WebElement toTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesToTime']"));
//	        toTimeInput.clear();
	        toTimeInput.sendKeys("05:00 PM");
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='coordinatesToTime']")).click();
            Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//span[@class='selected-text'])[1]")).getText();
			Assert.assertEquals("Day Range", c);
			Thread.sleep(500);
			String d=driver.findElement(By.xpath("(//div[@class='date-selection-text'])[1]")).getText();
			Assert.assertEquals("We 09:50am-05:00pm", d);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String e=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", e);
			
			ExtentTest test = extentreports.createTest("User-Select day filter and click on save");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Select the timezone");
		    test.info("Select the from time");
		    test.info("Select totime");
		    test.info("Click on apply button");
		    test.pass(c);
		    test.pass(d);
		    test.info("Click on save button");
			test.info("Expected Resultl:: It should save the day filter");
			test.pass(e);
			test.log(Status.PASS, "Actual results:: It is savinge the day filter");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
				
		

		@Test
		public void testcase23() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web2 mpt std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web2 Mpt Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@class='selected-text'])[1]")).getText();
			Assert.assertEquals("Day Range", b);
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//div[@class='date-selection-text'])[1]")).getText();
			Assert.assertEquals("We 09:50am-05:00pm", c);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@class='selected-text'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioAllDaySelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeApplyBtn']")).click();
			Thread.sleep(500);
			String d=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", d);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String e=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", e);
			
			ExtentTest test = extentreports.createTest("User-Select all day if day filter is placed");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on day range in users");
		    test.pass(b);
		    test.info("Click on all days");
		    test.info("Click on apply button");
		    test.pass(c);
		    test.info("Click on save button");
			test.info("Expected Resultl:: It should save the all day filter");
			test.pass(d);
			test.log(Status.PASS, "Actual results:: It is savinge the all day filter");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}	
		
		
		
		@Test
		public void testcase24() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Desktop/chromedriver-linux64");
			driver.manage().window().maximize();
			driver.get("http://192.168.2.55:8083/user/login");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Web1 std");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456",Keys.ENTER);	
			Thread.sleep(800);
			String a=driver.findElement(By.xpath("//div[@class='toolbar-name']")).getText();
			Assert.assertEquals("Web1 Std", a);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-order='3']")).click();
			Thread.sleep(500);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='page-tab'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@data-value='Co-ordinates']")).click();
			Thread.sleep(500);
			String b=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", b);
			Thread.sleep(500);
			driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='permissionCoordinatesRadioDayRangeSelection']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='day-wrapper'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']")).click();
			Thread.sleep(500);
			
			WebElement CourseElement = driver.findElement(By.xpath("//select[@id='coordinatesTimezonesList']"));

			Select CourseNameDropdown = new Select(CourseElement);

			List<WebElement> CourseNameDropdownOptions = CourseNameDropdown.getOptions();

			for (WebElement option : CourseNameDropdownOptions) {
				System.out.println(option.getText());
			}
			CourseNameDropdown.selectByValue("Asia/Kolkata");
			Thread.sleep(1000);
			WebElement fromTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesFromTime']"));
	        fromTimeInput.sendKeys("09:50 AM");
	        Thread.sleep(500);
	        WebElement toTimeInput = driver.findElement(By.xpath("//input[@id='coordinatesToTime']"));
	        toTimeInput.sendKeys("05:00 PM");
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='coordinatesToTime']")).click();
            Thread.sleep(500);
			driver.findElement(By.xpath("//div[@id='coordinatesTimeCancelBtn']")).click();
			Thread.sleep(500);
			String c=driver.findElement(By.xpath("(//span[@data-value='e30='])[1]")).getText();
			Assert.assertEquals("All Days", c);
			driver.findElement(By.xpath("(//input[@class='btn btn-default submit-btn'])[14]")).click();
			Thread.sleep(500);
			String d=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
			Assert.assertEquals("Updated!", d);
			
			
			ExtentTest test = extentreports.createTest("User-Select day filter and click on cancle and save");
			test.log(Status.INFO, "Chrome browser launched successfully");
			test.info("Navigate to URL");
			test.info("UserName: Web1 std");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.pass(a);
			test.info("Click on dashboard");
			test.info("Click on controls");
			test.info("Click on Co-Ordinates");
		    test.info("Click on all days in users");
		    test.pass(b);
		    test.info("Click on day range");
		    test.info("Select the day");
		    test.info("Select the timezone");
		    test.info("Select the from time");
		    test.info("Click on apply button");
			test.info("Expected Resultl:: It should display Please select to time!");
			test.pass(c);
			test.log(Status.PASS, "Actual results:: It displaying Please select to time!");
			test.pass("Test case: Test case passed");
			Thread.sleep(200);
			driver.close();
		
		}
		
		
		
		
		
	@AfterTest
	public void afterTest() {
	extentreports.flush();
	}

}
