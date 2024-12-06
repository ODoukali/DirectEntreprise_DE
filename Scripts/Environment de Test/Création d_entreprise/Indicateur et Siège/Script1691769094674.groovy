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

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__dossierFormice'), '123456789012345')

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input__dossierFormj_id101'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/textarea__dossierFormadresse1'), 'RES XXXX IMM B1 APRT 01 CASABLANCA MAARIF ')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/button_'), 'عنوان')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ajout Dossier/select_Agdal RiyadHassanSouissiTouargaYacou_2c619b'), 
    '3699', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ajout Dossier/select_Contrat de bailContrat de domiciliat_e39592'), 
    '11681', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ajout Dossier/select_Acte authentiqueActe authentique tab_54770f'), 
    '10846', true)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input__dossierFormdatePvInputDate'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/td_9'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Signature et dpt_dossierFormj_id473'))

