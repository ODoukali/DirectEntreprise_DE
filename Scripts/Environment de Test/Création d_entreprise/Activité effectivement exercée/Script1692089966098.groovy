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

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input__dossierFormj_id801'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/img_ACTIVITS DE SERVICES ADMINISTRATIFS ET _cb8f5a'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/img_ACTIVITS EXTRA-TERRITORIALES_creerViewA_affe48'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/img_Activits des organisations et organisme_15acdb'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/img_Activits des organisations et organisme_15acdb_1'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Activits des organisations et organis_b77c71'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_TRANSPORTS ET ENTREPOSAGE_creerViewAc_dfce60'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Activits des organisations et organis_853f0d'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_concat(Il se peut qu, , une autorisat_e745b6'))

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/textarea__dossierFormobjSocial'), 'SOMMAIRE')

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/textarea_'), 'فهرس')

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_concat(Il se peut qu, , une autorisat_43da4e'))

