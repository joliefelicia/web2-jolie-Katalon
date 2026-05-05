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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/login')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/input_UserName'), 'joliefeliciaa')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/input_Password'), '123456789$abcD')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/button_Password_login'))

WebUI.click(findTestObject('Page_DEMOQA/form/button_gotoStore'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/input_Type to search'), 'richard')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/register bookstore/a_Git Pocket Guide'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/register bookstore/button_addNewRecordButton'))

