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
import com.google.zxing.BinaryBitmap as BinaryBitmap
import com.google.zxing.MultiFormatReader as MultiFormatReader
import com.google.zxing.Result as Result
import com.google.zxing.client.j2se.BufferedImageLuminanceSource as BufferedImageLuminanceSource
import com.google.zxing.common.HybridBinarizer as HybridBinarizer
import com.google.zxing.NotFoundException as NotFoundException
import com.google.zxing.FormatException as FormatException
import javax.imageio.ImageIO as ImageIO
import java.awt.image.BufferedImage as BufferedImage
import java.io.File as File


String href = "http://10.10.2.101:8080/Guichet/activationCompteServletNewProcess?a=10c78673460510fecabb4f2a5c5027d100950911d5e42c5cde344011ce65fc4e"
String newHref = replaceBaseUrl(href)

println newHref

WebUI.openBrowser(newHref)

WebUI.maximizeWindow()

String srcData1 = WebUI.getAttribute(findTestObject('Page_Compte activ/img_Compte activ_img-responsive'), 'src')

// Extract only the base64 part by replacing the prefix
String base64Data1 = srcData1.replace('data:image/png;base64,', '')

String base64Data = base64Data1.replace('%0A', '')

println(base64Data)

// Decode Base64 to Image
byte[] imageBytes = Base64.decoder.decode(base64Data)

InputStream is = new ByteArrayInputStream(imageBytes)

BufferedImage bufferedImage = ImageIO.read(is)

// Convert the image to a binary bitmap source
BufferedImageLuminanceSource source = new BufferedImageLuminanceSource(bufferedImage)

BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source))

// Decode the QR code
Result result = null

try {
    result = new MultiFormatReader().decode(bitmap)
}
catch (NotFoundException e) {
    e.printStackTrace()
} 
catch (FormatException e) {
    e.printStackTrace()
} 

if (result != null) {
    String barcodeText = result.getText()

    println(barcodeText)

    if (barcodeText.contains('otpauth://totp/')) {
        assert true
    } else {
        assert false
    }
}

WebUI.delay(5)

WebUI.scrollToPosition(888, 444)

WebUI.click(findTestObject('Creation de compte/XpathNeed/Se connecter QR'))

def replaceBaseUrl(String href) {
	String newBaseUrl = "http://10.10.1.166:8080"
	String oldBaseUrl = "http://10.10.2.101:8080"
	
	return href.replace(oldBaseUrl, newBaseUrl)
}
