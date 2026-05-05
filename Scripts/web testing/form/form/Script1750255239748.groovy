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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/form/input_First Name'), 0)

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/input_First Name'), first_name)

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/input_Last Name'), last_name)

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/input_nameexample.com'), email)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/label_Female'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/input_Mobile Number'), mobile_number)

WebUI.doubleClick(findTestObject('Object Repository/Page_DEMOQA/form/input_dateOfBirthInput'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/input_dateOfBirthInput'))

//WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/div_Choose Wednesday, June 14th, 2000'))
WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/label_subjects-label'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/div_subjects-auto-complete_value-container subje'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/input_subjectsInput'), 'maths')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/div_react-select-2-option-0'))

WebUI.check(findTestObject('Object Repository/Page_DEMOQA/form/label_Reading'))

WebUI.check(findTestObject('Page_DEMOQA/form/label_Sports'))

WebUI.check(findTestObject('Object Repository/Page_DEMOQA/form/label_Music'))

WebUI.uploadFile(findTestObject('Object Repository/Page_DEMOQA/form/input_uploadPicture'), file)

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/form/textarea_Current Address'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/div_Select State'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/div_react-select-3-option-1'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/div_Select City'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/div_react-select-3-option-1'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form/button_submit'))

WebUI.delay(10)

WebUI.closeBrowser()

