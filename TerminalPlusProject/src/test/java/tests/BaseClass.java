package tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.security.auth.x500.X500Principal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
static AppiumDriver<MobileElement> driver;//write <WebElement> for web application and <MobileElement> for mobile native application testing 
//static AppiumDriver<WebElement> driver;
	@BeforeTest
	public void setup() {
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("plateformName", "Android");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(CapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(CapabilityType.VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Tab A");
		caps.setCapability(MobileCapabilityType.UDID, "R52M80NXYTL");
		caps.setCapability("appPackage", "com.veristerminal");
		caps.setCapability("appActivity", "com.veristerminal.MainActivity");		
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.APP, "/Users/shailendra/eclipse-workspace/TP.apk");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		URL url = new URL("http://192.168.5.68:4723/wd/hub");// to use if you want to automate mobile application 
		//driver = new AppiumDriver<MobileElement> driver;
		driver= new AppiumDriver<MobileElement>(url,caps);////use this when you want to automate native  application
		//driver = new AppiumDriver<WebElement>(url, caps);//use this when you want to automate web application
		//driver = new AndroidDriver<WebElement>(url, caps);
		//driver = new IOSDriver<WebElement>(url,caps);

		System.out.println("Application started");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement allowPermission1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		allowPermission1.click();
		System.out.println("Able to click on permission one");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
MobileElement allowPermission2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
allowPermission2.click();
System.out.println("Able to click on permission two");

driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	
MobileElement domainpicker=(MobileElement) driver.findElementByAccessibilityId("domainPicker");
domainpicker.click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

MobileElement authrorizationId=(MobileElement) driver.findElementByAccessibilityId("Authorization ID");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

authrorizationId.sendKeys("TYPE7");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	System.out.println("enter authorization id");

	
	
	MobileElement authrorizationCode=(MobileElement) driver.findElementByAccessibilityId("Authorization Code");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	authrorizationCode.sendKeys("1");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	System.out.println("enter authorization code");

	MobileElement loginButton=(MobileElement) driver.findElementByAccessibilityId("LOGIN");
	loginButton.click();
	
	System.out.println("Login Successfully");
	
//	Thread.sleep(10000);
	//-----------------
	// Switching to Alert        
  /*  Alert alert = driver.switchTo().alert();		
    		
    // Capturing alert message.    
    String alertMessage= driver.switchTo().alert().getText();		
    		
    // Displaying alert message		
    System.out.println(alertMessage);	
    Thread.sleep(5000);
    		
    // Accepting alert		
    alert.dismiss();		
	
	//click on May be later button 
	MobileElement maybeLater = (MobileElement)driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView\n");
	maybeLater.click();
	System.out.println("Click on may be later alert button");
*/
	//Click on Check in button
	MobileElement clickOnCheckInButton = (MobileElement)driver.findElementByAccessibilityId("Check-In");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	clickOnCheckInButton.click();
	System.out.println("Click on Check in button");

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//Enter your mobile number
	MobileElement entertMobileNo=(MobileElement) driver.findElementByAccessibilityId("Enter mobile number");
	entertMobileNo.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Enter your mobile number");

	MobileElement d1=(MobileElement) driver.findElementByAccessibilityId("9");
	d1.click();
	MobileElement d2=(MobileElement) driver.findElementByAccessibilityId("0");
	d2.click();
	MobileElement d3=(MobileElement) driver.findElementByAccessibilityId("3");
	d3.click();
	MobileElement d4=(MobileElement) driver.findElementByAccessibilityId("5");
	d4.click();
	MobileElement d5=(MobileElement) driver.findElementByAccessibilityId("1");
	d5.click();
	d5.click();
	d5.click();
	d4.click();
	d5.click();
	d5.click();
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("mobile number entered successfully");

	//Click on next button 
	MobileElement clickonNextButton=(MobileElement) driver.findElementByAccessibilityId("Next");
	clickonNextButton.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Click on Next after enter the mobile number");

	//Enter OTP
	

//	MobileElement enterOPT=(MobileElement) driver.findElementByAccessibilityId("Please enter OTP sent to : +919035111511");
//	enterOPT.click();
//	MobileElement enterOPT=(MobileElement) driver.findElementByAccessibilityId("_");
	System.out.println("enterOtp elemens");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Enter the guard pin ");
	d1.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	d2.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	d3.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	d4.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	d5.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("guard pin entered successfully ");

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	//click on Proceed Unverified
	MobileElement proceedUnverified=(MobileElement) driver.findElementByAccessibilityId("Proceed Unverified");
	proceedUnverified.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	System.out.println("Clicked on proceed verified");

	//Select visitor Category
	
	MobileElement clickonVisitorWorlfow=(MobileElement) driver.findElementByAccessibilityId("Visitor");
	clickonVisitorWorlfow.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Select category ");

	//Click on profile picture.
	
	
	MobileElement clickonProfilePic=(MobileElement) driver.findElementByAccessibilityId("Click Image");
	clickonProfilePic.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Click on user image");

	//click on Next button to take profile pic
	MobileElement clickonNextButtonOfProfilePic=(MobileElement) driver.findElementByAccessibilityId("Next");
	clickonNextButtonOfProfilePic.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Click on nex button of user image");

	//Enter host name (Whom To Meet)
	MobileElement hostname=(MobileElement) driver.findElementByAccessibilityId("Whom To Meet");
	hostname.sendKeys("Shailendra");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Click on whome to meet button ");

	//Click on Unable to find someone?
	
	MobileElement clickonUnabletoFind=(MobileElement) driver.findElementByAccessibilityId("Unable to find someone?");
	clickonUnabletoFind.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Click on unable to find someone");

	//Click  on next button at meeting with screen 
	MobileElement clickonNext=(MobileElement) driver.findElementByAccessibilityId("Next");
	clickonNext.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	System.out.println("Click on Next button of meeting with ");

	


		}catch(Exception exp){
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is :" +exp.getMessage());
			exp.printStackTrace();
		}

	}
	@Test
	public void sampleTest() {
		System.out.println("I am inside sample Test ");
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
	

}
