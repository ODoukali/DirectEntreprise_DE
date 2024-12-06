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
import java.util.Random as Random
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.GregorianCalendar as GregorianCalendar
import java.security.SecureRandom as SecureRandom
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import java.util.Collections as Collections
import java.util.*

WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Authentification/input_Inscription_j_id41j_id63'))

NameGenerator Name = new NameGenerator()

NameGenerator FirstName = new NameGenerator()

WebUI.setText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormnom'), 
    '' + Name.getName())

GlobalVariable.GetName = Name.getName()


WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormisHomme'))

WebUI.setText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormprenom'), 
    '' + FirstName.getName())

GlobalVariable.GetFirstName = FirstName.getName()

println GlobalVariable.GetFirstName + GlobalVariable.GetName

String cinN = generateRandomCinNumber()

String cinL = generateRandomCinLetters()

WebUI.setText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormnumPasseport'), 
    ('' + cinL) + cinN)

String phone = generateRandomPhoneNumber()

WebUI.setText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input_land Islands_phone'), '6' + 
    phone)

WebUI.setText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormadresseSteMere'), 
    'RES XXX APRT 01 IMM C14 CASABLANCA AIN CHOCK')

String date = generateRandomDate()

println(date)

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor jsExecutor = (JavascriptExecutor) driver

jsExecutor.executeScript(('document.getElementById(\'demandeAdhesionAnonymeForm:dateNaissanceInputDate\').value=\'' + date) + 
    '\';')

WebUI.selectOptionByValue(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/select_AfghanistanAfrique du SudAlbanieAlgr_3f9578'), 
    '150', true)

WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/select_casablanca'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/select_Al-FidaAnfaAssoukhour AssawdaAn-Choc_d721e0'))

WebUI.setText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormlogin'), 
    '' + GlobalVariable.CaptureMail)

WebUI.setEncryptedText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormmotdepasse'), 
    '9ghG3marKq70PdGAmYnxZA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormmotdepasse_089d39'), 
    '9ghG3marKq70PdGAmYnxZA==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/select_Comment sappelle votre animal de com_dce567'), 
    '7380', true)

WebUI.setText(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input__demandeAdhesionAnonymeFormreponse'), 
    'SAW')

WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/input_Supprimer tout_btn btn-suivant btn-ne_dcf575'))

def generateRandomCinNumber() {
    Random random = new Random()

    def result = ''

    result += (random.nextInt(9) + 1)

    for (int i = 1; i < 6; i++) {
        result += random.nextInt(10)
    }
    
    return result
}

def generateRandomCinLetters() {
    SecureRandom rand = new SecureRandom()

    String characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

    String randomString = ''

    for (int i = 0; i < 3; i++) {
        randomString += (characters[rand.nextInt(characters.length())])
    }
    
    return randomString
}

def generateRandomPhoneNumber() {
    Random random = new Random()

    def result = ''

    for (int i = 0; i < 8; i++) {
        result += random.nextInt(10)
    }
    
    return result
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


class NameGenerator {
	List<String> names
	Random random

	NameGenerator() {
		names = ["Amina", "Yasmin", "Samir", "Tariq", "Fatima", "Hakim", "Salima", "Jamal", "Leila", "Khalid",
				 "Zahra", "Nadia", "Rashid", "Imran", "Sara", "Zayn", "Hana", "Sofian", "Naima", "Karim",
				 "Salma", "Farid", "Noor", "Faisal", "Mariam", "Ilyas", "Nour", "Hamza", "Zainab", "Malik",
				 "Yasmine", "Mohamed", "Noura", "Bilal", "Selma", "Omar", "Fouad", "Lina", "Rafiq", "Amira",
				 "Jasmine", "Yusuf", "Meryem", "Kamal", "Nadia", "Ali", "Sana", "Ibrahim", "Said", "Leyla",
				 "Zara", "Adel", "Houda", "Anis", "Salah", "Sabrina", "Ismael", "Hanan", "Samia", "Abdel",
				 "Sofia", "Ziad", "Farah", "Hassan", "Rania", "Mehdi", "Wafa", "Adnan", "Soraya", "Ammar",
				 "Nadia", "Hussein", "Mouna", "Ahmed", "Samira", "Walid", "Younes", "Lamia", "Aziz", "Dalia",
				 "Rahma", "Musa", "Layla", "Jamila", "Marwan", "Loubna", "Ayoub", "Dounia", "Rami", "Samar",
				 "Najwa", "Badr", "Ines", "Nasser", "Amal", "Yazid", "Saida", "Idris", "Nawal", "Amin"]
		Collections.shuffle(names)
		random = new Random()
	}

	String getName() {
		if (names.size() == 0) {
			return "Tous les noms ont été utilisés"
		}
		return names.remove(random.nextInt(names.size()))
	}
}