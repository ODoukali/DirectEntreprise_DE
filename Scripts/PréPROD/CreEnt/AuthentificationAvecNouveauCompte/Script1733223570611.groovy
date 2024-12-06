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

/*System.setProperty('webdriver.chrome.driver', 'C:/Users/atahiri/Downloads/Katalon_Studio_Windows_64-8.6.5/Katalon_Studio_Windows_64-8.6.5/configuration/resources/drivers/chromedriver_win32/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

//options.addExtensions(new File("C:/Users/atahiri/Downloads/extension_3_7_28_0.crx"))
options.addArguments('load-extension=C:/Users/atahiri/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh/4.8.0_0')

//options.addArguments('load-extension=C:/Users/atahiri/Downloads/Extension/cfhdojbkjhnklbpkdaibdccddilifddb/3.18.1_0')
DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver3 = new ChromeDriver(capabilities)

DriverFactory.changeWebDriver(driver3)
*/
WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.directentreprise.ma/login.jsp')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_DirectEntreprise/a_Mon compte'))

WebUI.setText(findTestObject('Object Repository/Page_Authentification/input_Login_j_id41login'), 'doukaliomarpro@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Authentification/label_Mot de passe'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Authentification/input_Mot de passe_j_id41motdepasse'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Authentification/input_Mot de passe_j_id41j_id57'))

try {
    WebUI.click(findTestObject('Creation de compte/XpathNeed/Se Déconnecter'))
}
catch (Exception e) {
    assert true
} 

WebUI.setText(findTestObject('Object Repository/Page_Authentification  deux facteurs/input_Code secret_validationCodeGoogleAuthFormcode'), 
    '1234')

WebUI.click(findTestObject('Object Repository/Page_Authentification  deux facteurs/input_Code secret_validationCodeGoogleAuthF_9c6b20'))

WebUI.click(findTestObject('Object Repository/Page_Espace particulier/a_concat(Cration d, , entreprise)_link'))

WebUI.click(findTestObject('Object Repository/Page_Espace particulier/td_Personne morale'))

WebUI.click(findTestObject('Object Repository/Page_Espace particulier/td_Nouveau dossier'))

