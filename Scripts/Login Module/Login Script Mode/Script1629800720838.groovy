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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_Blouse - My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'ramesh.gupta@pyramidconsultancyinc.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr_id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Ramesh ')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'Gupta')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '31', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '1991', true)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_January_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_January_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_January_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'Pyramid IT')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'New Street PO Box')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'), 'Delhi')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'New Delhi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '70001')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_Your addressFirst name Last name Compan_7ccadc'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/textarea_Additional information_other'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '9910356145')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__alias'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias'), 'Home Address')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.closeBrowser()

