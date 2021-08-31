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

WebUI.openBrowser('http://automationpractice.com/')

WebUI.click(findTestObject('MouseHoverObjects/Page_My Store/a_Faded Short Sleeve T-shirts'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Blouse - My Store/Button_Add to cart'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Blouse - My Store/Button_Proceed to checkout'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('MouseHoverObjects/Page_Faded Short Sleeve T-shirts - My Store/button_Cart'))

WebUI.takeScreenshot("C:/Users/RAMESH/Downloads/Download-Sample-Site/screenshots/screenshot1.png")

WebUI.delay(2)

WebUI.click(findTestObject('MouseHoverObjects/Page_Faded Short Sleeve T-shirts - My Store/MouseHover_Check out'))

WebUI.delay(2)

WebUI.click(findTestObject('MouseHoverObjects/Page_Order - My Store/CountNoof_1 Product'))

WebUI.delay(2)

WebUI.closeBrowser()

