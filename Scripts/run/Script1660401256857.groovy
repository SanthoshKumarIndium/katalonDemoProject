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

WebUI.callTestCase(findTestCase('weborders/browser/TC001_OpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/verify/TC003_VerifyUrl'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/loginpage/TC004_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/verify/TC010_VerifyLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/homepage/TC005_GotoOrderspage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/verify/TC011_VerifyOrdersPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/orderspage/TC006_ProductInformation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/orderspage/TC007_AddressInformation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/orderspage/TC008_PaymentInformation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/verify/TC012_VerifyOrderPlaced'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/viewAllOrderspage/TC009_ViewAllOrders'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('weborders/browser/TC002_CloseBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

