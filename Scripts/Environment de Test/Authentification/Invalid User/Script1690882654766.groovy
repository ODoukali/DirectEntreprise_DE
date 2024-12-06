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

WebUI.delay(3)

WebUI.click(findTestObject('Invalid User/Page_Authentification/input_Mot de passe_j_id41j_id57'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Invalid User/Xpath Need/ScrollToElement'), 1)

WebUI.verifyElementText(findTestObject('Object Repository/Invalid User/Page_Authentification/li_Veuillez saisir votre loginmot de passe'), 
    'Veuillez saisir votre login/mot de passe.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Invalid User/Page_Authentification/input_Login_j_id41login'), 'wrongMail@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Invalid User/Page_Authentification/input_Mot de passe_j_id41motdepasse'), 
    'OIPVAzHzdz7tDHlZq3XbvA==')

WebUI.click(findTestObject('Object Repository/Invalid User/Page_Authentification/input_Mot de passe_j_id41j_id57'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Invalid User/Xpath Need/ScrollToElement'), 1)

WebUI.verifyElementText(findTestObject('Object Repository/Invalid User/Page_Authentification/li_Login ou mot de passe erron'), 
    'Login ou mot de passe erroné.')

