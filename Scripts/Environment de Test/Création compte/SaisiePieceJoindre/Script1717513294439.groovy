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
import java.util.GregorianCalendar
import java.awt.Robot
import java.security.SecureRandom as SecureRandom
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import java.util.Collections as Collections
import java.util.*
import java.io.File as File
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

//WebUI.scrollToElement(findTestObject('Creation de compte/XpathNeed/PJ_ScrollToElement'), 3)

StringSelection ss1 = new StringSelection(GlobalVariable.FilePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null)

WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/td_Pice dIdentit'))

WebUI.delay(3) // Delay to ensure file dialog is open

Robot robot1 = new Robot()

pasteAndEnter(robot1)

WebUI.delay(5)

WebUI.click(findTestObject('Creation de compte/XpathNeed/CheckAccepted'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

try {
    WebUI.doubleClick(findTestObject('Creation de compte/XpathNeed/Valider'))
}
catch (Exception e) {
    assert true
} 

try {
    WebUI.doubleClick(findTestObject('Creation de compte/XpathNeed/ValiderFullXpath'), FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    assert true
}

/*WebUI.switchToFrame(findTestObject('Creation de compte/XpathNeed/IframeCaptcha'), 1)

WebUI.click(findTestObject('Creation de compte/XpathNeed/CheckCaptcha'))*/
//WebUI.switchToDefaultContent()
//WebUI.delay(15)
WebUI.delay(5)

WebUI.click(findTestObject('Creation de compte/XpathNeed/AccepterContrat'), FailureHandling.STOP_ON_FAILURE)


def pasteAndEnter(Robot robotInstance) {
	
	robotInstance.keyPress(KeyEvent.VK_CONTROL)

	robotInstance.keyPress(KeyEvent.VK_V)

	WebUI.delay(1)

	robotInstance.keyRelease(KeyEvent.VK_V)

	robotInstance.keyRelease(KeyEvent.VK_CONTROL)

	WebUI.delay(1)

	robotInstance.keyPress(KeyEvent.VK_ENTER)

	robotInstance.keyRelease(KeyEvent.VK_ENTER)

	WebUI.delay(1)
}

