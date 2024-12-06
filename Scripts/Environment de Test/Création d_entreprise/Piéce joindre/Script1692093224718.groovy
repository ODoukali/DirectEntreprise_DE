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

/*String STASM = generateSixDigitNumber()

String CBCD = generateSixDigitNumber()

String CNJ = generateSixDigitNumber()

println("STASM: $STASM")

println("CBCD: $CBCD")

println("CNJ: $CNJ")

WebUI.delay(5)

WebUI.executeJavaScript(('updateParams(1, \'STASM\', \'' + STASM) + '\', 0);', null)

WebUI.uploadFile(findTestObject('creation d_entreprise/ImportOblg1'), GlobalVariable.FilePath)

//WebUI.executeJavaScript("updateParams(1, 'STASM', '"+ STASM +"', 0);", null)
WebUI.delay(30)

WebUI.executeJavaScript(('updateParams(7, \'CBCD\', \'' + CBCD) + '\', 0);', null)

WebUI.uploadFile(findTestObject('creation d_entreprise/ImportOblg2'), GlobalVariable.FilePath)

//WebUI.executeJavaScript("updateParams(1, 'CBCD', '"+ CBCD +"', 0);", null)
WebUI.delay(30)

WebUI.executeJavaScript(('updateParams(11, \'CNJ\', \'' + CNJ) + '\', 0);', null)

WebUI.uploadFile(findTestObject('creation d_entreprise/ImportOblg3'), GlobalVariable.FilePath //WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Autres Pices_dossierPMFormsuivantModeModif'))
    )

//WebUI.executeJavaScript("updateParams(1, 'CNJ', '"+ CNJ +"', 0);", null)
WebUI.delay(2)*/


boolean atLeastOneRetrySucceeded = false

def maxRetryCount = 3 // Set the maximum number of retries

for (int retryCount = 1; retryCount <= maxRetryCount; retryCount++) {
	CucumberKW.comment("Attempt $retryCount")

	try {
		CucumberKW.comment('Sénario')


StringSelection ss1 = new StringSelection(GlobalVariable.FilePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null)

WebUI.click(findTestObject('creation d_entreprise/ImportOblg1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3) // Delay to ensure file dialog is open
    
Robot robot1 = new Robot()

pasteAndEnter(robot1)

// Function to perform paste action and press enter
// Upload for the first file
WebUI.delay(10)

// Upload for the second file
WebUI.click(findTestObject('creation d_entreprise/ImportOblg2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3 // Delay to ensure file dialog is open
    )

Robot robot2 = new Robot()

pasteAndEnter(robot2)

// Upload for the third file
WebUI.click(findTestObject('creation d_entreprise/ImportOblg3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3 // Delay to ensure file dialog is open
    )

Robot robot3 = new Robot()

pasteAndEnter(robot3)

WebUI.click(findTestObject('Object Repository/Page_Ajout Dossier/input_Signature et dpt_dossierFormj_id1707'))

WebUI.click(findTestObject('creation d_entreprise/CheckAcceptableBox'))

WebUI.click(findTestObject('Object Repository/Page_Rcapitulatif/input_concat(J, , accepte et j, , approuve)_222aa8'))

WebUI.delay(10)

String NumDoc = WebUI.getText(findTestObject('creation d_entreprise/getNumDoc'))

println(NumDoc)

GlobalVariable.NumDoc = NumDoc



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