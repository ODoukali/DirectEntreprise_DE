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

WebUI.navigateToUrl('http://172.17.98.44:7070/guichetGit/')

WebUI.click(findTestObject('Object Repository/test/Page_DirectEntreprise/a_Mon compte'))

WebUI.click(findTestObject('Object Repository/test/Page_Authentification/input_Login_login-formlogin'))

WebUI.doubleClick(findTestObject('Object Repository/test/Page_Authentification/input_Login_login-formlogin'))

WebUI.setText(findTestObject('Object Repository/test/Page_Authentification/input_Login_login-formlogin'), 'alt.yu-fbrimfj@yopmail.com')

WebUI.click(findTestObject('Object Repository/Page_Authentification/label_Mot de passe'))

WebUI.setEncryptedText(findTestObject('test/Page_Authentification/input_Mot de passe_login-formmotdepasse'), '9ghG3marKq70PdGAmYnxZA==')

not_run: WebUI.click(findTestObject('Object Repository/test/Page_Authentification/input_Mot de passe_login-formj_id58'))

not_run: WebUI.closeBrowser()

