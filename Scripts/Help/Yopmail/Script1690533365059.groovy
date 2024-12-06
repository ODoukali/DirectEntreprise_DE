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
import java.security.SecureRandom as SecureRandom
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

//WebUI.openBrowser('https://yopmail.com/fr/')
//WebUI.maximizeWindow()
String Radom = generateRandomString()

WebUI.setText(findTestObject('Help/Yopmail/Page_YOPmail  Email jetable - Bote de rcept_516bf6/input_Saisissez le mail jetable de votre ch_78151d'), 
    Radom)

WebUI.click(findTestObject('Help/Yopmail/Page_YOPmail  Email jetable - Bote de rcept_516bf6/i_'))

WebUI.click(findTestObject('Help/Yopmail/Page_Boite de rception/i_'))

WebUI.click(findTestObject('Help/Yopmail/Page_Boite de rception/i__1'))

WebUI.click(findTestObject('Help/Yopmail/Page_Boite de rception/input__msgto'))

WebUI.setText(findTestObject('Help/Yopmail/Page_Boite de rception/input_concat(No need to type , , yopmail.co_32273b'), 'Confirmer l\'inscription')

WebUI.setText(findTestObject('Help/Yopmail/Page_Boite de rception/input__msgto'), 'alt.b9-3v2fxyy@yopmail.com')

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Help/XPath/frame'), 1)

/*// Store your text into a variable
def message = """
Bonjour Mme/M. A,
Nous avons le plaisir de vous informer que votre compte a été créé.
Afin de pouvoir l'activer veuillez vous rendre au lien suivant :
Un code de confirmation vous sera envoyé sur votre mobile : +212613543594
Les informations de connexion sont : <a href='http://www.google.com'>Cliquer ici</a>
Login = hanae980@yopmail.com
Plateforme de création et d'accompagnement des entreprises en ligne.
"""
//WebUI.setText(findTestObject('Help/XPath/Msg'), message)*/
def var = '//div[@class=\'hc\' and @id=\'msgbody\']'

def message = '\nBonjour Mme/M. A,</br>\nNous avons le plaisir de vous informer que votre compte a été créé.</br>\nAfin de pouvoir l\'activer veuillez vous rendre au lien suivant :</br>\nUn code de confirmation vous sera envoyé sur votre mobile : +212613543594</br>\nLes informations de connexion sont : <a href=\'http://www.google.com\'>Cliquer ici</a></br>\nLogin = hanae980@yopmail.com</br>\nPlateforme de création et d\'accompagnement des entreprises en ligne.</br>\n'

message = message.replaceAll('\n', '\\\\n' // replace newline characters with literal \n
    )

def js = """
    var xpath = "$var";
    var message = "$message";
    var iterator = document.evaluate(xpath, document, null, XPathResult.UNORDERED_NODE_ITERATOR_TYPE, null );
    var element = iterator.iterateNext();
    if (element) {
        element.innerHTML = "<body>" + message + "</body>";
    }
"""

WebUI.executeJavaScript(js, null)

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Help/Yopmail/Page_Boite de rception/input_concat(No need to type , , yopmail.co_32273b'), 'Confirmer l\'inscription')

/*
WebDriver driver = DriverFactory.getWebDriver()

// Create an object of JavascriptExecutor interface and cast driver to it.
JavascriptExecutor js = ((driver) as JavascriptExecutor)


WebUI.delay(3)

 Check if page is loaded completely
while (js.executeScript('return document.readyState').toString().equals('complete')) {
    WebUI.delay(1)
}

WebDriverWait wait = new WebDriverWait(driver, 20)

WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//*[@id=\'msgbody\']')))

// Get the WebDriver and execute the JavaScript
js.executeScript(('arguments[0].innerText = \'' + message) + '\'', element)
*/
WebUI.click(findTestObject('Help/Yopmail/Page_Boite de rception/button_Envoyer')) //WebUI.closeBrowser()

def generateRandomString() {
    SecureRandom rand = new SecureRandom()

    String characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

    String randomString = ''

    for (int i = 0; i < 5; i++) {
        randomString += (characters[rand.nextInt(characters.length())])
    }
    
    return randomString
}

