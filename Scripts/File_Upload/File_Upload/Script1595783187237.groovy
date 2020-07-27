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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://csvdemomockappp.bundlewallet.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/h1_CSV Invoice Parser'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/p_Simple invoice generator allows you to up_e570c6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/p_Please select the CSV file with report to_852f01'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/a_Click Here'))

//Pass the path of the file
WebUI.uploadFile(findTestObject('Invoice_parser_OR/Page_Invoice Record Application/Page_Invoice Record Application/input_Specify File_statement-file'), 
    'C:\\Users\\MOba\\Katalon Studio\\BillableHours_Web\\TestFile\\test (1).csv')

WebUI.click(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/button_Parse Invoice File'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/div_CSV File has been parsed successfully s_3c7a7b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/th_SN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/th_Company'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/th_Invoice Value'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/td_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/td_Google'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/td_N240000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/td_2'), 0)

WebUI.click(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/a_Facebook'))

WebUI.click(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/a_Back to Result'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/td_N240000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/td_N50000'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/div_CSV File has been parsed successfully s_3c7a7b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/div_CSV Invoice Parser          Simple invo_dd3cf1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/h1_CSV Invoice Parser'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/h1_CSV Invoice Parser'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/p_Simple invoice generator allows you to up_e570c6'), 
    0)

WebUI.click(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/a_Facebook'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/p_Company Facebook'), 
    0)

WebUI.click(findTestObject('Object Repository/Invoice_parser_OR/Page_Invoice Record Application/a_Parse New File'))

WebUI.closeBrowser()

