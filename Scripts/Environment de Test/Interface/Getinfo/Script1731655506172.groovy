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
// Import necessary packages
import com.kms.katalon.core.configuration.RunConfiguration
import java.net.InetAddress

// Retrieve and print Host Name
try {
	String hostName = InetAddress.getLocalHost().getHostName()
	println("Host Name: " + hostName)
} catch (Exception e) {
	println("Could not retrieve Host Name: " + e.message)
}

// Retrieve and print Operating System
String os = System.getProperty("os.name")
println("Operating System: " + os)

// Retrieve and print Browser (if running a Web Test)
String browser = RunConfiguration.getExecutionProperties().get("browser")
println("Browser: " + browser)

// Retrieve and print Test Suite Name
String suiteName = RunConfiguration.getExecutionSource()
println("Test Suite: " + suiteName)

// Retrieve and print Execution Profile
String executionProfile = RunConfiguration.getExecutionProfile()
println("Profile: " + executionProfile)

// Get the start time of execution
String startTime = new Date().format("yyyy-MM-dd HH:mm:ss")
println("Start Time: " + startTime)


