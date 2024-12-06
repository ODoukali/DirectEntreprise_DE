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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.google.zxing.BinaryBitmap
import com.google.zxing.MultiFormatReader
import com.google.zxing.Result
import com.google.zxing.client.j2se.BufferedImageLuminanceSource
import com.google.zxing.common.HybridBinarizer
import com.google.zxing.NotFoundException
import com.google.zxing.FormatException
import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import java.io.File

WebUI.openBrowser('') // open your web application

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://en.wikipedia.org/wiki/QR_code') // navigate to the page with the QR code

// take a screenshot of the QR code
String qrCodePath = '/html[1]/body[1]/div[2]/div[1]/div[3]/main[1]/div[3]/div[3]/div[1]/figure[1]/a[1]/img[1]'

WebUI.delay(5)

WebUI.takeScreenshot(qrCodePath)

// load the screenshot into a BufferedImage
BufferedImage bufferedImage = ImageIO.read(new File(qrCodePath))

// convert the image to a binary bitmap source
BufferedImageLuminanceSource source = new BufferedImageLuminanceSource(bufferedImage)
BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source))

// read the QR code
Result result = null
try {
    result = new MultiFormatReader().decode(bitmap)
} catch (NotFoundException | FormatException e) {
    e.printStackTrace()
}

if (result != null) {
    String barcodeText = result.getText()
	println(barcodeText)
	WebUI.navigateToUrl(barcodeText)
}

WebUI.delay(5)

WebUI.closeBrowser()