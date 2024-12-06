import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.concurrent.ThreadLocalRandom as ThreadLocalRandom
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.Random as Random
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.GregorianCalendar as GregorianCalendar
import java.security.SecureRandom as SecureRandom
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities

System.setProperty('webdriver.chrome.driver', 'C:/Users/atahiri/Downloads/Katalon_Studio_Windows_64-8.6.5/Katalon_Studio_Windows_64-8.6.5/configuration/resources/drivers/chromedriver_win32/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

//options.addExtensions(new File("C:/Users/atahiri/Downloads/extension_3_7_28_0.crx"))

options.addArguments('load-extension=C:/Users/atahiri/Downloads/Extension/mpbjkejclgfgadiemmefgebjfooflfhl/2.0.1_0')

//options.addArguments('load-extension=C:/Users/atahiri/Downloads/Extension/cfhdojbkjhnklbpkdaibdccddilifddb/3.18.1_0')

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver2 = new ChromeDriver(capabilities)

DriverFactory.changeWebDriver(driver2)

WebUI.maximizeWindow()

//WebUI.closeWindowTitle('Thank you for installing our AdBlocker')
//WebUI.closeWindowTitle("Merci d'avoir installé AdGuard !")

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://www.google.com/recaptcha/api2/demo')

WebUI.refresh()

/*
WebUI.switchToFrame(findTestObject('CAPTCHA/XPATH_NEED/Iframe'), 5)

long startTime = System.currentTimeMillis()

while (WebUI.verifyElementNotChecked(findTestObject('CAPTCHA/XPATH_NEED/Check_Captcha'), 0)) {

	if (System.currentTimeMillis() - startTime > 60000) {
		break
	}
	
	WebUI.delay(5)
	WebUI.navigateToUrl('https://www.google.com/recaptcha/api2/demo')
	WebUI.delay(5)
	WebUI.refresh()
	WebUI.switchToFrame(findTestObject('CAPTCHA/XPATH_NEED/Iframe'), 5)
    WebUI.click(findTestObject('CAPTCHA/XPATH_NEED/Check_Captcha'))
}

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('CAPTCHA/Page_Dmonstration reCAPTCHA/Btn_Afficher'))*/
