import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Mobile.startApplication('apk/HappyDayShopping.apk', true)

Mobile.delay(5)

Mobile.tap(findTestObject('Promotions/android.widget.TextView - PROMOTIONS'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Promotions/android.view.ViewGroup-DynamiteCandy'), 0)

Mobile.delay(2)

Mobile.waitForElementPresent(findTestObject('Promotions/android.view.ViewGroup (1)'), 10)

Mobile.tap(findTestObject('Promotions/android.view.ViewGroup (1)'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Promotions/Edit Jumlah'), '5', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Promotions/android.widget.TextView - Add to Bag'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Promotions/android.view.ViewGroup (2) Your Bag'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Promotions/android.view.ViewGroup Checkout'), 0)

Mobile.delay(5)

// ketika tap checkout diarahkan ke web browser dan harus click 'Promotions/android.widget.Button - Go to your shopping cart'
Mobile.tap(findTestObject('Promotions/android.widget.Button - Go to your shopping cart'), 0)

Mobile.getText(findTestObject('Promotions/android.widget.TextView - If you have any inquiries or updates pls whatsap us at 94617563'), 
    0)

Mobile.closeApplication()

