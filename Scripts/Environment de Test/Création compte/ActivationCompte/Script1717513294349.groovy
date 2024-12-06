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

WebUI.navigateToUrl(GlobalVariable.Url_Test)

//WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_DirectEntreprise/a_Mon compte'))
WebUI.setText(findTestObject('Object Repository/ActivationCompte/Page_Authentification/input_Login_j_id41login'), 'agentompiccompte@ompic.ma')

WebUI.setEncryptedText(findTestObject('Object Repository/ActivationCompte/Page_Authentification/input_Mot de passe_j_id41motdepasse'), 
    'RAIVpflpDOg=')

WebUI.delay(5)

WebUI.click(findTestObject('Creation de compte/XpathNeed/Connexion'))

try {
    WebUI.click(findTestObject('Creation de compte/XpathNeed/Se Déconnecter'))
}
catch (Exception e) {
    assert true
}

WebUI.scrollToPosition(555, 444)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/ActivationCompte/Page_Authentification  deux facteurs/input_Code secret_validationCodeGoogleAuthFormcode'), 
    '1234')

WebUI.delay(5)

WebUI.click(findTestObject('Creation de compte/XpathNeed/ValiderBtnAdmin'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Espace particulier/a_Gestion des comptes_link'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Espace particulier/td_Liste de tous les comptes'))

WebUI.setText(findTestObject('Object Repository/ActivationCompte/Page_Liste de tous les comptes/input_E-Mail(Login)_utilisateurProfFormmail'), 
    GlobalVariable.CaptureMail)

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Liste de tous les comptes/input_Type de compte_utilisateurProfFormrec_4af2c0'))

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Liste de tous les comptes/a_'))

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Liste de tous les comptes/input_SMS_VALIDE_utilisateurProfFormlisteUt_1e015f'))

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Dtail dinformations dun agent de validation/input_concat(Lettre d, , engagement)_utilis_0021e2'))

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Dtail dinformations dun agent de validation/input_concat(Lettre d, , engagement)_utilis_51ed6a'))

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Dtail dinformations dun agent de validation/input_concat(Lettre d, , engagement)_utilis_d3eea8'))

WebUI.navigateToUrl('https://yopmail.com/fr/')

WebUI.setText(findTestObject('Object Repository/ActivationCompte/Page_YOPmail  Email jetable - Bote de rcept_516bf6/input_Saisissez le mail jetable de votre ch_78151d'), 
    GlobalVariable.Random)

WebUI.sendKeys(findTestObject('Object Repository/ActivationCompte/Page_YOPmail  Email jetable - Bote de rcept_516bf6/input_Saisissez le mail jetable de votre ch_78151d'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/ActivationCompte/Page_Boite de rception/a_cliquer ici'), 'cliquer ici')

WebUI.switchToWindowTitle('Boite de réception')

WebUI.click(findTestObject('Object Repository/ActivationCompte/Page_Boite de rception/a_cliquer ici'))

WebUI.delay(5)

WebUI.closeWindowTitle('Boite de réception')

