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

WebUI.navigateToUrl('https://yopmail.com/fr/')

WebUI.refresh()

WebUI.delay(10)

WebUI.setText(findTestObject('Help/Page_YOPmail  Email jetable - Bote de rcept_516bf6/input_Saisissez le mail jetable de votre ch_78151d (1)'), 
    GlobalVariable.Random)

WebUI.delay(10)

WebUI.click(findTestObject('Help/Page_YOPmail  Email jetable - Bote de rcept_516bf6/i_ (1)'))

WebUI.switchToFrame(findTestObject('Creation de compte/XpathNeed/IframeConfirm'), 2)

WebUI.delay(5)

String Var = WebUI.getText(findTestObject('Help/Testing/Page_Boite de rception/div_dqsdqsdQSDqsdqsdqsdQSDqsdqsdqsdQSDqsdqs_211bc0'), 
    FailureHandling.STOP_ON_FAILURE)

println(Var)

String href = WebUI.getAttribute(findTestObject('Help/Gogle/Page_Boite de rception/a_Cliquer ici'), 'href')

println(href)

GlobalVariable.URL_Activation = href

def replaceBaseUrl(String href) {
	String newBaseUrl = "http://10.10.1.166:8080"
	String oldBaseUrl = "http://10.10.2.101:8080"
	
	return href.replace(oldBaseUrl, newBaseUrl)
}

String newHref = replaceBaseUrl(href)

println newHref

GlobalVariable.URL_Activation = newHref

WebUI.navigateToUrl(newHref)