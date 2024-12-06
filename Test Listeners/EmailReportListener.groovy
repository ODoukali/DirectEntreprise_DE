import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import javax.mail.*
import javax.mail.internet.*
import javax.activation.*
import java.nio.file.Paths

class EmailReportListener {
    @AfterTestSuite
    def sendReport(TestSuiteContext testSuiteContext) {
        // Ensure that the report has been generated before sending it
        waitForReportGeneration()
        
        sendEmailAfterSuiteExecution(testSuiteContext)
    }

    private void waitForReportGeneration() {
        // Sleep or wait for the report to be generated (adjust time as necessary)
        Thread.sleep(5000)  // Adjust the sleep time to match your report generation time
    }

    def sendEmailAfterSuiteExecution(TestSuiteContext testSuiteContext) {
        // Your existing email sending logic
        // Ensure that the report path is correct
        String reportPath = RunConfiguration.getReportFolder() + "20241115_122459/Interface/20241115_122459"

        // Create email with report as attachment
        sendEmailWithAttachment(reportPath)
    }

    private void sendEmailWithAttachment(String reportPath) {
        String recipient = "doukaliomarpro@gmail.com"
        String sender = "odoukali@omnidata.ma"
        String smtpHost = "smtp.office365.com"
        String smtpPort = "25"
        String username = "odoukali@omnidata.ma"
        String password = "Cabebfe.9090"

        Properties props = new Properties()
        props.put("mail.smtp.auth", "true")
        props.put("mail.smtp.starttls.enable", "true")
        props.put("mail.smtp.host", smtpHost)
        props.put("mail.smtp.port", smtpPort)

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password)
            }
        })

        try {
            MimeMessage message = new MimeMessage(session)
            message.setFrom(new InternetAddress(sender))
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient))
            message.setSubject("Katalon Test Report")

            // Attach the report
            MimeBodyPart attachmentPart = new MimeBodyPart()
            attachmentPart.attachFile(reportPath)
            Multipart multipart = new MimeMultipart()
            multipart.addBodyPart(attachmentPart)

            // Add body text
            MimeBodyPart textPart = new MimeBodyPart()
            textPart.setText("The test suite has finished execution. Please find the report attached.")
            multipart.addBodyPart(textPart)

			
            message.setContent(multipart)
            Transport.send(message)
            println("Email sent successfully with the test report.")
        } catch (MessagingException e) {
            e.printStackTrace()
        }
    }
}