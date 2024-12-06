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
import java.util.Collections as Collections
import java.util.*
import java.io.File as File
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Signature et dpt_dossierFormj_id1707'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__dossierFormnombreSalaries'), '2')

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/div_concat(id(, , loadingPopupDiv, , ))_loa_f597b0'))

String dateEmp = generateRandomDateEmp()

println(dateEmp)

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver

jsExecutor2.executeScript(('document.getElementById(\'dossierForm:dateEngagementPremierSalarieInputDate\').value=\'' + dateEmp) + 
    '\';')

WebUI.delay(3)

WebUI.scrollToPosition(600, 300)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Signature et dpt_dossierFormj_id1707'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Signature et dpt_dossierFormj_id1707'))

def generateSixDigitNumber() {
    return (100000 + new Random().nextInt(900000)).toString()
}

def generateRandomDate() {
    Random random = new Random()

    int year = random.nextInt(16) + 1970

    int dayOfYear = random.nextInt(365) + 1

    GregorianCalendar calendar = new GregorianCalendar(year, 0, 1)

    calendar.add(Calendar.DAY_OF_YEAR, dayOfYear - 1)

    Date randomDate = calendar.getTime()

    SimpleDateFormat dateFormat = new SimpleDateFormat('dd/MM/yyyy')

    return dateFormat.format(randomDate)
}

def generateRandomDateEmp() {
    Random random = new Random()

    int year = random.nextInt(16) + 2010

    int dayOfYear = random.nextInt(365) + 1

    GregorianCalendar calendar = new GregorianCalendar(year, 0, 1)

    calendar.add(Calendar.DAY_OF_YEAR, dayOfYear - 1)

    Date randomDate = calendar.getTime()

    SimpleDateFormat dateFormat = new SimpleDateFormat('dd/MM/yyyy')

    return dateFormat.format(randomDate)
}

