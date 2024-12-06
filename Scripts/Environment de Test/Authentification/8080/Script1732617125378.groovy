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
import java.io.File as File
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

StringSelection ss1 = new StringSelection(GlobalVariable.FilePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.navigateToUrl('http://10.10.1.166:8080/Guichet/login.jsf')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Authentification/input_Inscription_j_id41j_id63'))

WebUI.delay(2)

// Click on the button to activate the file upload dialog
WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/Page_Cration De Compte/td_Pice dIdentit'))

WebUI.delay(4)

// Get the current WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Create an Actions object for keyboard actions
Actions actions = new Actions(driver)

// Simulate pressing Ctrl+V to paste the file path
actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform()

// Simulate pressing Enter to confirm the file selection
actions.sendKeys(Keys.ENTER).perform()
WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/Page_Cration De Compte/td_new ProgressBar(demandeAdhesionAnonymeFo_c600b3'))

//WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/Page_Cration De Compte/input_Supprimer tout_demandeAdhesionAnonyme_fbe7b2'))


def uploadFileUsingKeyboard(TestObject uploadButtonLocator) {
	// Click on the upload button/input field to activate it
	WebUI.click(uploadButtonLocator)
	
	// Get the current WebDriver
	WebDriver driver = DriverFactory.getWebDriver()
	
	// Create an Actions object for simulating keyboard input
	Actions actions = new Actions(driver)
	
	// Simulate pressing Ctrl+V to paste the file path (requires the path to be copied beforehand)
	actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform()
	
	// Simulate pressing Enter to confirm the file upload
	actions.sendKeys(Keys.ENTER).perform()
}