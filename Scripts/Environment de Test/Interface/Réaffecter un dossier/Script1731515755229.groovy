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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://172.17.98.44:42300/interfaceCreation/')

WebUI.setText(findTestObject('Object Repository/Interface_Creation_Test/Page_Interface CREOL/input_Login_loginFormlogin'), 
    'Agent_Siege_DGI')

WebUI.setEncryptedText(findTestObject('Object Repository/Interface_Creation_Test/Page_Interface CREOL/input_Password_loginFormmotdepasse'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Interface_Creation_Test/Page_Interface CREOL/input_Password_loginFormj_id34'))

WebUI.setText(findTestObject('Object Repository/Interface_Creation_Test/Page_Accueil/input_Code secret_validationCodeGoogleAuthFormcode'), 
    '123')

WebUI.click(findTestObject('Object Repository/Interface_Creation_Test/Page_Accueil/input_Code secret_validationCodeGoogleAuthF_5f6fed'))

WebUI.click(findTestObject('Object Repository/Interface_Creation_Test/Page_Resultat recherche Tlprocdure/label_x'))

WebUI.setText(findTestObject('Object Repository/Interface_Creation_Test/Page_Resultat recherche Tlprocdure/input_N de dossier_teleProcedureFormnumDossier'), 
    '524849')

WebUI.scrollToPosition(0, 9999)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Interface_Creation_Test/Page_Resultat recherche Tlprocdure/input_Recherche avance_teleProcedureFormrec_626dcc'))

WebUI.scrollToPosition(0, 9999)

WebUI.click(findTestObject('Object Repository/Interface_Creation_Test/Page_Resultat recherche Tlprocdure/a_'))

WebUI.click(findTestObject('Object Repository/Interface_Creation_Test/Page_Resultat recherche Tlprocdure/input_Reaffecter'))

WebUI.scrollToPosition(0, 9999)

WebUI.delay(6)

