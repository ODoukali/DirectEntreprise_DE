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
import java.io.File as File
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

boolean atLeastOneRetrySucceeded = false

def maxRetryCount = 1 // Set the maximum number of retries

for (int retryCount = 1; retryCount <= maxRetryCount; retryCount++) {
    CucumberKW.comment("Attempt $retryCount")

    try {
        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Test Cases/PréPROD/CreEnt/AuthentificationAvecNouveauCompte'), 
            [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/AVANT DE COMMENCER'), [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Indicateur et Siège'), [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Indications sur le capital'), [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Activité effectivement exercée'), [:], 
            FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Indications fiscales'), [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Dirigeants'), [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Associés'), [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/ÉTABLISSEMENTS PRÉCÉDEMMENT EXPLOITÉS'), 
            [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Indications en vue de l_affiliation à la CNSS'), 
            [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Piéce joindre'), [:], FailureHandling.STOP_ON_FAILURE)

        CucumberKW.comment('Sénario')

        WebUI.callTestCase(findTestCase('Environment de Test/Création d_entreprise/Paiement'), [:], FailureHandling.STOP_ON_FAILURE)

        // If all test cases are executed successfully, break the loop
        CucumberKW.comment('All test cases passed')

        atLeastOneRetrySucceeded = true

        break
    }
    catch (Exception e) {
        CucumberKW.comment('Test case failed. Retrying...')

        if (retryCount < maxRetryCount) {
            WebUI.delay(10)
        } else {
            CucumberKW.comment('Maximum retry count reached. Test case failed.')

            throw e
        }
    } // Add a delay between retries if needed
    // Re-throw the exception to indicate test case failure
}

if (!(atLeastOneRetrySucceeded)) {
    throw new RuntimeException('All retries failed. Test case failed.')
}

def pasteAndEnter(Robot robotInstance) {
    robotInstance.keyPress(KeyEvent.VK_CONTROL)

    robotInstance.keyPress(KeyEvent.VK_V)

    WebUI.delay(1)

    robotInstance.keyRelease(KeyEvent.VK_V)

    robotInstance.keyRelease(KeyEvent.VK_CONTROL)

    WebUI.delay(1)

    robotInstance.keyPress(KeyEvent.VK_ENTER)

    robotInstance.keyRelease(KeyEvent.VK_ENTER)

    WebUI.delay(1)
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

