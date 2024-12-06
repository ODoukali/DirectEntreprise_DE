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
import utils.DateUtils as DateUtils
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import java.util.Random as Random

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.directentreprise.ma/')

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_DirectEntreprise/a_Mon compte'))

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Authentification/input_Login_login-formlogin'), 'doukaliomarpro@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Authentification/input_Mot de passe_login-formmotdepasse'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Authentification/input_Mot de passe_login-formj_id58'))

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Authentification  deux facteurs/input_Code secret_validationCodeGoogleAuthFormcode'), 'P')

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Authentification  deux facteurs/input_Code secret_validationCodeGoogleAuthF_9c6b20'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Espace particulier/a_concat(Cration d, , entreprise)_link'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Espace particulier/td_Personne physique'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Espace particulier/td_Nouveau dossier'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Recherche Dossier/input_commerant_dossierFormdirecteur'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Recherche Dossier/input_Oui_dossierFormassistanceChambreCommerce'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Recherche Dossier/input__dossierFormsous_enseigne'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Recherche Dossier/input_Non_dossierFormsuivant'))

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmnom'), 'KHALIDI')

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmprenom'), 
    'KHALID')

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmnumPasseport'), 
    'F33445')

//WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmdateValPieceIdInputDate'),  '')
//WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmdateValPieceIdInputDate'))
//WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_Today'))
WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Lieu de dlivrance_dossierFormmlieuDelivrance'), 
    'CASABLANCA')

//WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmdateNaissanceInputDate'), '')
//WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmdateNaissanceInputDate'))
//WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_novembre, 2024'))
//WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_'))
//WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_1992'))
//WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/span_OK'))
//WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/td_18'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_AfghanistanAfrique du SudAlbanieAlgr_3f9578'), 
    '150', true)

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmvilleNaissance'), 
    'CASABLANCA')

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/textarea__dossierFormmadresse1Pp'), 
    'CASABLANCA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_Agadir Ida Ou TananeAl HaouzAl Hocei_033512'), 
    '50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_Al-FidaAnfaAssoukhour AssawdaAn-Choc_d721e0'), 
    '2218', true)

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Rgime matrimonial du commerant trange_fc0e5d'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Le nom sous lequel le commerce est ex_2f9048'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmnumCertNegatifEnseigne'), 
    '2712583')

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmj_id180'))

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/textarea__dossierFormmadresse1'), 
    'TEST')

WebUI.doubleClick(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/span_'), 'عنوان')

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_Agadir Ida Ou TananeAl HaouzAousserd_af819f'), 
    '64', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_Agdal RiyadHassanSouissiTouargaYacou_2c619b'), 
    '3697', true)

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Code postal_dossierFormmcodePostalSiege'), 
    '20202')

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_Contrat de bailCertificat de proprit_536877'), 
    '2040', true)

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmdateDebContratInputDate'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_Today'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormmdateFinContratInputDate'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_Today'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Today_dossierFormmsuivant'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Origine du fonds_dossierFormsuivant'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_concat(Date de commencement d, , expl_b551f5'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_Today'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Ajouter activit_dossierFormj_id58'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/img_Recherche par mot cl_creerViewActiviteP_6af387'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/img_ACTIVITS DE SERVICES ADMINISTRATIFS ET _d97d87'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/img_Activits administratives et autres acti_1b1f6c'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/img_Activits administratives_creerViewActiv_944293'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Photocopie, prparation de documents e_c114bf'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_TRANSPORTS ET ENTREPOSAGE_creerViewAc_dfce60'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Oui_dossierFormlisteActivitePrim0actPriReg'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Origine du fonds_dossierFormsuivant'))

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Nom_dossierFormnomFondPouvoir'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Prnom_dossierFormprenomFondPouvoir'), 
    'TEST')

/*WebUI.delay(2)

String date = generateRandomDate()

println(date)

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor jsExecutor = ((driver) as JavascriptExecutor)

jsExecutor.executeScript(('document.getElementById(\'gerantPersPhysPopUpForm:dateNaissanceInGerantPersPhysInputDate\').value=\'' + 
    date) + '\';')*/

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Date de naissance_dossierFormdateNais_f2bf75'), 
    '12/12/1992')

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Date de naissance_dossierFormdateNais_f2bf75'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_novembre, 2024'))

WebUI.doubleClick(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_1982'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_OK'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/td_24'))

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Lieu de naissance_dossierFormlieuNais_d6db31'), 
    'CASABLANCA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_AfghanistanAfrique du SudAlbanieAlgr_3f9578_1'), 
    '2000', true)

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_concat(Numro de la pice d, , identit)_03b0f0'), 
    'R45586')

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Date de fin de validit_dossierFormdat_d33085'), 
    '')

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Date de fin de validit_dossierFormdat_d33085'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/div_Today'))

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/textarea_Adresse_dossierFormadresse1FondPouvoir'), 
    'TEST')

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_AfghanistanAfrique du SudAlbanieAlgr_3f9578_1_2'), 
    '150', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_Agadir Ida Ou TananeAl HaouzAl Hocei_033512_1'), 
    '50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_Al-FidaAnfaAssoukhour AssawdaAn-Choc_d721e0_1'), 
    '2218', true)

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Origine du fonds_dossierFormsuivant'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Origine du fonds_dossierFormsuivant'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Origine du fonds_dossierFormsuivant'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Origine du fonds_dossierFormsuivant'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_De plein droitHors champSur optionTo_5561ec'), 
    '885', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_Au dbit lencaissement'), 
    '1450033', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/select_CPURNSRsultat net rel'), 
    '13911', true)

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Origine du fonds_dossierFormsuivant'))

WebUI.setText(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input__dossierFormnombreSalaries'), 
    '15')

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Origine du fonds_dossierFormsuivant'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/u_Slectionner'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/u_Slectionner'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Ajout Dossier/input_Slectionner_dossierFormsuivantModeModif'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Rcapitulatif/input_concat(J, , accepte et j, , approuve)_b0e04d'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Rcapitulatif/input_concat(J, , accepte et j, , approuve)_185b63'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Paiement/input_Carte bancaire_paiementFormfatouratiPm'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Paiement/input_concat(Le montant est hors frais de l_f5ff98'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Paiement/a_concat(Cration d, , entreprise)_link'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Paiement/span_concat(Cration d, , entreprise)_close'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Paiement/a_concat(Cration d, , entreprise)_link'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Paiement/td_Personne physique'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Paiement/td_Personne physique'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Paiement/td_Recherche des dossiers'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Recherche Dossier/input_dim_dossierFormrechercherDossierProfessinnel'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Rsultat de la recherche Dossier/a_'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Rsultat de la recherche Dossier/input_Prt pour signature_dossierFormlisteDo_df86db'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Rcapitulatif/input_Pices jointes_dossierFormpiecesASigner'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Signature et dpt/input_Oui_signatureDocumentsFormselectedSig_0a84ea'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Signature et dpt/input_Non_signatureDocumentsFormj_id51'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Signature et dpt/input_CBCPF_29_11_2024.pdf_signatureDocumen_6e4843'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Signature et dpt/input_RECAP.pdf_signatureDocumentsFormsigne_21668d'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Signature et dpt/input_MODPP.pdf_signatureDocumentsFormsigne_66bfeb'))

WebUI.click(findTestObject('Object Repository/Preprod/Creation entreprise/Personne physique/Page_Signature et dpt/input_MODPP.pdf_signatureDocumentsFormj_id143'))

/*def generateRandomDate() {
	Random random = new Random()

	int year = random.nextInt(16) + 1970

	int dayOfYear = random.nextInt(365) + 1

	GregorianCalendar calendar = new GregorianCalendar(year, 0, 1)

	calendar.add(Calendar.DAY_OF_YEAR, dayOfYear - 1)

	Date randomDate = calendar.getTime()

	SimpleDateFormat dateFormat = new SimpleDateFormat('dd/MM/yyyy')

	return dateFormat.format(randomDate)
}*/
