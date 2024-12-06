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

WebUI.verifyElementText(findTestObject('Object Repository/Paiement/Page_Paiement/span_Paiement'), 'Paiement')

WebUI.click(findTestObject('Object Repository/Paiement/Page_Paiement/input_Carte bancaire_paiementFormfatouratiPm'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Paiement/Page_Paiement/span_TOTAL A PAYER EN MAD'), 'TOTAL A PAYER EN MAD*')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Paiement/input_concat(Le montant est hors frais de l_f5ff98'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Paiement/input_liste des channels_paiementFormdownlo_d2a4cc'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Paiement/a_Hakim Marwan'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Espace particulier/a_concat(Cration d, , entreprise)_link'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Espace particulier/td_Recherche des dossiers'))

WebUI.setText(findTestObject('creation d_entreprise/NumDossier'), GlobalVariable.NumDoc)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Recherche Dossier/input_dim_dossierFormrechercherDossier'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Rsultat de la recherche Dossier/a_'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Rsultat de la recherche Dossier/input_Visualiser le dossier_dossierFormlist_a8df78'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Rcapitulatif/input_Le certificat ngatif dont la date ne _31576e'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Signature et dpt/input_Oui_signatureDocumentsFormselectedSig_0a84ea'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Signature et dpt/input_Non_signatureDocumentsFormj_id51'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Signature et dpt/input_MODPM.pdf_signatureDocumentsFormj_id239'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Signature et dpt/a_concat(Cration d, , entreprise)_link'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Signature et dpt/td_Recherche des dossiers'))

WebUI.setText(findTestObject('creation d_entreprise/NumDossier'), GlobalVariable.NumDoc)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Recherche Dossier/input_dim_dossierFormrechercherDossier'))

WebUI.verifyElementText(findTestObject('Object Repository/Paiement/Page_Rsultat de la recherche Dossier/label_Sign'), 'Signé')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Rsultat de la recherche Dossier/a_'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Rsultat de la recherche Dossier/input_Visualiser le dossier_dossierFormlist_a8df78'))

WebUI.delay(5)

/*WebUI.click(findTestObject('Object Repository/Paiement/Page_Rcapitulatif/input_Le certificat ngatif dont la date ne _2fe7ce'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Signature et dpt/a_concat(Cration d, , entreprise)_link'))

WebUI.click(findTestObject('Object Repository/Paiement/Page_Signature et dpt/td_Recherche des dossiers'))

WebUI.setText(findTestObject('creation d_entreprise/NumDossier'), GlobalVariable.NumDoc)

WebUI.click(findTestObject('Object Repository/Paiement/Page_Recherche Dossier/input_dim_dossierFormrechercherDossier'))
*/

WebUI.closeBrowser()