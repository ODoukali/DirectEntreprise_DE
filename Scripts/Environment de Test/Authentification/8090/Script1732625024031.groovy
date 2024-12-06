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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.Robot
import java.awt.event.KeyEvent

// Set the file path to clipboard
String filePath = GlobalVariable.FilePath
println("File path to upload: " + filePath)

StringSelection ss1 = new StringSelection(filePath)
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null)
println("Clipboard updated successfully.")

// Open browser and navigate to the page
//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://10.10.1.166:8080/Guichet/login.jsf')
//WebUI.maximizeWindow()
//WebUI.delay(2)

// Authenticate (if needed) and navigate to the upload section
//WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Authentification/input_Inscription_j_id41j_id63'))
//WebUI.delay(2)

// Click the file upload button
WebUI.click(findTestObject('Object Repository/Creation de compte/Page_Cration De Compte/Page_Cration De Compte/td_Pice dIdentit'))
WebUI.click(findTestObject('Object Repository/Page_Cration De Compte/td_Pice dIdentit'))
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/Page_Cration De Compte/td_new ProgressBar(demandeAdhesionAnonymeFo_c600b3'))
WebUI.delay(5) // Wait for the dialog to appear

// Use Robot to paste the file path and press Enter
Robot robot = new Robot()
robot.delay(3000) // Allow dialog to appear
robot.keyPress(KeyEvent.VK_CONTROL)
robot.keyPress(KeyEvent.VK_V)
robot.delay(3000)
robot.keyRelease(KeyEvent.VK_V)
robot.keyRelease(KeyEvent.VK_CONTROL)
robot.delay(1000) // Short delay before pressing Enter
robot.keyPress(KeyEvent.VK_ENTER)
robot.keyRelease(KeyEvent.VK_ENTER)
println("File path pasted and Enter pressed.")
WebUI.delay(5) // Wait for upload to complete

WebUI.click(findTestObject('Object Repository/Page_Cration De Compte/input_Supprimer tout_demandeAdhesionAnonyme_1e55dd'))
WebUI.click(findTestObject('Object Repository/Page_Cration De Compte/input_Supprimer tout_demandeAdhesionAnonyme_fbe7b2'))
WebUI.click(findTestObject('Object Repository/Page_Cration De Compte/ConfimerMonchoix'))
WebUI.delay(2)





