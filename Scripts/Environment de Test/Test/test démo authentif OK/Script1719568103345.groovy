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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.10.1.166:8080/Guichet/login.jsf')

WebUI.click(findTestObject('Object Repository/Page_Authentification/a_Mon compte'))

WebUI.setText(findTestObject('Object Repository/Page_Authentification/input_Login_j_id41login (2)'), 'tttttest@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Authentification/input_Mot de passe_j_id41motdepasse (2)'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Authentification/input_Mot de passe_j_id41j_id57 (2)'))

WebUI.verifyElementPresent(findTestObject('test/Page_Authentification/Page_Authentification/li_Login ou mot de passe erron'), 
    0)

WebUI.closeBrowser()

