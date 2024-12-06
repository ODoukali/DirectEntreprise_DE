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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.security.SecureRandom as SecureRandom
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import java.util.*
import java.io.File as File
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Veuillez cliquer sur cet icne pour aj_89bb85'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Homme_gerantPersPhysPopUpFormgenre'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ajout Dossier/select_Co-GrantGrant'), '81', true)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormdateDebutInputDate'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/td_9_1'))

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormnomInGerantPersPhys'), 
    GlobalVariable.GetName)

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormprenomInGeran_daf565'), 
    GlobalVariable.GetFirstName)

PlaceGenerator Place = new PlaceGenerator()

//lie de naissance
WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormvilleNaissInG_58aca0'), 
    '' + Place.getplace())

def translator = new NameTranslator()

def arabicName = translator.translateToArabic(GlobalVariable.GetName)

def arabicFirstName = translator.translateToArabic(GlobalVariable.GetFirstName)

println(arabicName)

println(arabicFirstName)

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormnomArInGerant_9eeac2'), 
    '' + arabicName)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormvilleNaissInG_58aca0'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormprenomArInGer_89ce7d'), 
    '' + arabicFirstName)

WebUI.delay(2)

String date = generateRandomDate()

println(date)

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor jsExecutor = (JavascriptExecutor) driver

jsExecutor.executeScript(('document.getElementById(\'gerantPersPhysPopUpForm:dateNaissanceInGerantPersPhysInputDate\').value=\'' + 
    date) + '\';')

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormnumPieceIdInG_4cb696'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/textarea__Adress'), 'Rue Aîn-Chock, Quartier Al-Fida, Casablanca, Maroc')

WebUI.delay(3)

WebUI.setText(findTestObject('creation d_entreprise/Ar_Adress'), 'شارع عين شوك، حي الفداء، الدار البيضاء، المغرب')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/textarea__Adress'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/select_Agadir Ida Ou TananeAl HaouzAl Hocei_033512'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/select_Al-FidaAnfaAssoukhour AssawdaAn-Choc_d721e0'))

WebUI.click(findTestObject('creation d_entreprise/Province'))

WebUI.delay(3)

WebUI.click(findTestObject('creation d_entreprise/Commune'))

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormnumPieceIdInG_4cb696'), 
    'qs123122')

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormdateValPieceI_6b6248'))

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/td_30'))

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormtelephoneInGe_564cdb'), 
    '0698543267')

WebUI.setText(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormemailInGerant_fd3329'), 
    'qsdqsd@sfdfs.vom')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Ajout Dossier/input__gerantPersPhysPopUpFormemailInGerant_fd3329'), 
    2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Oui_ou_Non_Selected_Non'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/ValiderFormulaireDirigeants'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Signature et dpt_dossierFormj_id1707'))


class PlaceGenerator {
	List<String> place
	Random random
	PlaceGenerator() {
		place = ["Maroc", "France", "UK", "USA", "China", "Russia", "Egypt", "Mexico", "spain"]
		Collections.shuffle(place)
		random = new Random()
	}

	String getplace() {
		if (place.size() == 0) {
			return "Tous les place ont été utilisés"
		}
		return place.remove(random.nextInt(place.size()))
	}
}

class NameTranslator {
	Map<String, String> translationMapping

	NameTranslator() {
		translationMapping = [
	"Amina": "أمينة",
	"Yasmin": "ياسمين",
	"Samir": "سمير",
	"Tariq": "طارق",
	"Fatima": "فاطمة",
	"Hakim": "حكيم",
	"Salima": "سليمة",
	"Jamal": "جمال",
	"Leila": "ليلى",
	"Khalid": "خالد",
	"Zahra": "زهرة",
	"Nadia": "نادية",
	"Rashid": "راشد",
	"Imran": "عمران",
	"Sara": "سارة",
	"Zayn": "زين",
	"Hana": "هناء",
	"Sofian": "سفيان",
	"Naima": "نعيمة",
	"Karim": "كريم",
	"Salma": "سلمى",
	"Farid": "فريد",
	"Noor": "نور",
	"Faisal": "فيصل",
	"Mariam": "مريم",
	"Ilyas": "إلياس",
	"Nour": "نور",
	"Hamza": "حمزة",
	"Zainab": "زينب",
	"Malik": "مالك",
	"Yasmine": "ياسمين",
	"Mohamed": "محمد",
	"Noura": "نورة",
	"Bilal": "بلال",
	"Selma": "سلمى",
	"Omar": "عمر",
	"Fouad": "فؤاد",
	"Lina": "لينا",
	"Rafiq": "رفيق",
	"Amira": "أميرة",
	"Jasmine": "ياسمين",
	"Yusuf": "يوسف",
	"Meryem": "مريم",
	"Kamal": "كمال",
	"Nadia": "نادية",
	"Ali": "علي",
	"Sana": "سناء",
	"Ibrahim": "إبراهيم",
	"Said": "سعيد",
	"Leyla": "ليلى",
	"Zara": "زارا",
	"Adel": "عادل",
	"Houda": "هدى",
	"Anis": "أنيس",
	"Salah": "صلاح",
	"Sabrina": "سابرينا",
	"Ismael": "إسماعيل",
	"Hanan": "حنان",
	"Samia": "سامية",
	"Abdel": "عبد ال",
	"Sofia": "صفية",
	"Ziad": "زياد",
	"Farah": "فرح",
	"Hassan": "حسن",
	"Rania": "رانيا",
	"Mehdi": "مهدي",
	"Wafa": "وفاء",
	"Adnan": "عدنان",
	"Soraya": "سرايا",
	"Ammar": "عمار",
	"Nadia": "نادية",
	"Hussein": "حسين",
	"Mouna": "مونا",
	"Ahmed": "أحمد",
	"Samira": "سميرة",
	"Walid": "وليد",
	"Younes": "يونس",
	"Lamia": "لمياء",
	"Aziz": "عزيز",
	"Dalia": "داليا",
	"Rahma": "رحمة",
	"Musa": "موسى",
	"Layla": "ليلى",
	"Jamila": "جميلة",
	"Marwan": "مروان",
	"Loubna": "لبنى",
	"Ayoub": "أيوب",
	"Dounia": "دنيا",
	"Rami": "رامي",
	"Samar": "سمر",
	"Najwa": "نجوى",
	"Badr": "بدر",
	"Ines": "إيناس",
	"Nasser": "ناصر",
	"Amal": "أمل",
	"Yazid": "يزيد",
	"Saida": "سايدة",
	"Idris": "إدريس",
	"Nawal": "نوال",
	"Amin": "أمين"
]
	}

	String translateToArabic(String name) {
		return translationMapping.getOrDefault(name, "Translation Not Found")
	}
}


def generateSixDigitNumber() {
    return (100000 + new Random().nextInt(900000)).toString()
}

def generateRandomDate() {
    Random random = new Random()

    int year = random.nextInt(16) + 1970

    int dayOfYear = random.nextInt(365) + 1

    GregorianCalendar calendar = new GregorianCalendar(year, 0, 1)

    calendar.add(Calendar.DAY_OF_YEAR, dayOfYear - 1)

    Date randomDate = calendar.getTime()

    SimpleDateFormat dateFormat = new SimpleDateFormat('dd/MM/yyyy')

    return dateFormat.format(randomDate)
}

def generateRandomDateEmp() {
    Random random = new Random()

    int year = random.nextInt(16) + 2010

    int dayOfYear = random.nextInt(365) + 1

    GregorianCalendar calendar = new GregorianCalendar(year, 0, 1)

    calendar.add(Calendar.DAY_OF_YEAR, dayOfYear - 1)

    Date randomDate = calendar.getTime()

    SimpleDateFormat dateFormat = new SimpleDateFormat('dd/MM/yyyy')

    return dateFormat.format(randomDate)
}

