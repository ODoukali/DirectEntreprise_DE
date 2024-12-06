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
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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

/*System.setProperty('webdriver.chrome.driver', 'C:/Users/atahiri/Downloads/Katalon_Studio_Windows_64-8.6.5/Katalon_Studio_Windows_64-8.6.5/configuration/resources/drivers/chromedriver_win32/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

//options.addExtensions(new File("C:/Users/atahiri/Downloads/extension_3_7_28_0.crx"))
options.addArguments('load-extension=C:/Users/atahiri/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh/4.8.0_0')

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver2 = new ChromeDriver(capabilities)

DriverFactory.changeWebDriver(driver2)

WebUI.delay(3)

WebUI.maximizeWindow()*/

WebUI.navigateToUrl(GlobalVariable.URL_Activation)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SMS/Page_Validation du code sms/input_Code sms_validationCodeGoogleAuthFormcode'), 
    '123')

// Navigate to the page or set up your test up to the point where you need to execute the JavaScript function
// Execute the JavaScript function directly
WebUI.executeJavaScript("updateParams('LE', '"+ GlobalVariable.CaptureMail +"');", null)

// Add a delay to make sure the JavaScript executes and any subsequent operations tied to it get a chance to run
WebUI.delay(5)

// Continue with the rest of your test steps
//WebUI.delay(20)

// Get the current WebDriver instance from Katalon Studio
WebDriver driver = DriverFactory.getWebDriver()

// Find the file input element using its XPath (or other locators)
WebElement fileInput = driver.findElement(By.xpath('/html[1]/body[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/input[1]'))

// Provide the path to the file you want to upload using sendKeys()
fileInput.sendKeys(GlobalVariable.FilePath)

// Navigate to the page or set up your test up to the point where you need to execute the JavaScript function
// Execute the JavaScript function directly
WebUI.executeJavaScript("updateParams('LE', '"+ GlobalVariable.CaptureMail +"');", null)

WebUI.delay(3)

WebUI.click(findTestObject('Creation de compte/XpathNeed/ValideSMS'))

// Add a delay to make sure the JavaScript executes and any subsequent operations tied to it get a chance to run
WebUI.delay(5)

// Continue with the rest of your test steps
//WebUI.uploadFile(findTestObject('Creation de compte/XpathNeed/UploadFile'), 'C:\\Users\\atahiri\\Downloads\\PECEA\\simple.pdf')
/*
String email = "alt.tw-7o32f7y1@yopmail.com"
String encodedEmail = encodeEmail(email)
println(encodedEmail)  // Should print: alt.r7-6of821z8%40yopmail.com

// Create a list of TestObjectProperty objects for the parameters
List<TestObjectProperty> restParameters = new ArrayList<TestObjectProperty>()
restParameters.add(new TestObjectProperty('code', ConditionType.EQUALS, 'LE'))
restParameters.add(new TestObjectProperty('ice', ConditionType.EQUALS, encodedEmail))

// ... Add more parameters if needed

// Create the RequestObject
RequestObject request = new RequestObject()
request.setRestUrl('http://10.10.2.101:8080/Guichet/upload')
request.setHttpHeaderProperties([ // Assuming you have headers to set; if not, remove this line
	new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/x-www-form-urlencoded'),
	new TestObjectProperty('Accept', ConditionType.EQUALS, 'application/json')
])

request.setRestParameters(restParameters)

ResponseObject response = WS.sendRequest(request)




/*
String script = """
function validateFileUpload() {
	// Get the file upload progress bar.
	var progressBar = document.querySelector(".resumable-progress");
	
	// Check if the progress bar is visible.
	if (progressBar.style.display === "none") {
	// The file has been uploaded, so execute the JavaScript function.
	setIsFileUploaded(true);
	} else {
	// The file is still uploading, so wait until it is finished before executing the JavaScript function.
	setTimeout(validateFileUpload, 1000);
	}
	}
	// Call the validateFileUpload() function when the page loads.
	window.onload = validateFileUpload;
"""
WebUI.executeJavaScript(script, null)

/*WebDriver driver = DriverFactory.getWebDriver()
// Get the file input element using WebDriver
//WebElement fileInputElement = driver.findElement(By.xpath('//input[@type=\'file\' and @multiple=\'multiple\' and @style=\'display: none;\' and @autocomplete=\'no\']'))
//WebElement fileInputElement = driver.findElement(By.cssSelector("#upLE > input[type=file]"))
// Set the value of the file input element directly
//fileInputElement.sendKeys('C:\\Users\\atahiri\\Downloads\\simple.pdf')
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Creation de compte/XpathNeed/UploadFile'), 3)

//WebUI.uploadFileWithDragAndDrop(findTestObject('Creation de compte/XpathNeed/UploadFile'), 'C:\\Users\\atahiri\\Downloads\\simple.pdf')
WebUI.delay(3)

try {
    WebUI.uploadFile(findTestObject('SMS/UPload/File'), 'C:\\Users\\atahiri\\Downloads\\simple.pdf')
}
catch (Exception e) {
    assert true
} 

try {
    WebUI.click(findTestObject('SMS/UPload/File'))
}
catch (Exception e) {
    assert true
} 

try {
    WebUI.click(findTestObject('SMS/UPload/id'))
}
catch (Exception e) {
    assert true
} 

WebUI.delay(3)

try {
    WebUI.uploadFile(findTestObject('SMS/UPload/id'), 'C:\\Users\\atahiri\\Downloads\\simple.pdf')
}
catch (Exception e) {
    assert true
} 
*/
//WebUI.delay(60)
//WebUI.navigateToUrl('http://10.10.2.101:8080/Guichet/pages/smsCode/validationSms.jsf')
WebUI.verifyElementText(findTestObject('Object Repository/SMS/Page_Validation du code sms/span_Lactivation de votre compte est en cou_39db1c'), 
    'L\'activation de votre compte est en cours. Vous serez notifiés dès qu\'elle sera opéré afin de poursuivre votre authentification.')

WebUI.click(findTestObject('Object Repository/SMS/Page_Validation du code sms/input_OK_confirmAdhesionformPieceJointeferm_4a0d9f'))

