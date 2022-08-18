package orderspageKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class verifyorderspage {


	/**
	 * @author Santhosh Kumar
	 * @description It will verify both the elements value is equal
	 * @param name will pass an TestObject needed for comparison 
	 * @param expected will compare its defined name with current name
	 * @param check will print the message of of its activity
	 */
	@Keyword
	def checktitle(TestObject name,String expected,String check) {
		try {
			if (WebUI.verifyEqual(WebUI.getText(name), expected, FailureHandling.OPTIONAL)) {

				KeywordUtil.logInfo("****Verified "+check+"****")
				assert true
			}else {
				KeywordUtil.logInfo("****"+check+" not matched****")
				assert false
			}
		} catch (Exception e) {

			KeywordUtil.markFailed("****Fail to check "+check+"****")
		}
	}
	@Keyword
	def Verifytitle(TestObject Name,String Expected, String Check) {
		checktitle(Name,Expected,Check)
	}
}