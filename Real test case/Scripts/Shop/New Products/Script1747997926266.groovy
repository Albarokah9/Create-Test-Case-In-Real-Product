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

println("Memulai aplikasi HappyDayShopping")
Mobile.startApplication('apk/HappyDayShopping.apk', true)
Mobile.delay(5) // Beri waktu aplikasi untuk dimuat sepenuhnya
println("Aplikasi berhasil dibuka.")

println("Menunggu dan mengetuk 'NEW PRODUCTS'")
Mobile.waitForElementPresent(findTestObject('New Product/android.widget.TextView - NEW PRODUCTS'), 15) // Tunggu hingga 15 detik
Mobile.tap(findTestObject('New Product/android.widget.TextView - NEW PRODUCTS'), 0)
Mobile.delay(2) // Beri waktu transisi ke halaman produk baru
println("Berhasil navigasi ke 'NEW PRODUCTS'")

println("Menunggu dan mengetuk 'NEW PRODUCTS'")
Mobile.waitForElementPresent(findTestObject('New Product/android.widget.TextView - NEW PRODUCTS'), 15) // Tunggu hingga 15 detik
Mobile.tap(findTestObject('New Product/android.widget.TextView - NEW PRODUCTS'), 0)
Mobile.delay(2) // Beri waktu transisi ke halaman produk baru
println("Berhasil navigasi ke 'NEW PRODUCTS'")

println("Menunggu dan mengetuk produk 'CollagenToner'")
Mobile.waitForElementPresent(findTestObject('New Product/android.view.CollagenToner'), 10) // Tunggu hingga 10 detik
Mobile.tap(findTestObject('New Product/android.view.CollagenToner'), 0)
Mobile.delay(2) // Beri waktu untuk halaman detail produk CollagenToner dimuat
println("Produk 'CollagenToner' dipilih.")

println("Menunggu dan mengetuk 'Edit Quantity'")
Mobile.waitForElementPresent(findTestObject('New Product/android.widget.EditText -Edit Quantity'), 10) // Tunggu hingga 10 detik
Mobile.tap(findTestObject('New Product/android.widget.EditText -Edit Quantity'), 0)
Mobile.delay(1) // Delay singkat setelah tap kolom edit

println("Mengatur kuantitas menjadi '5'")
Mobile.setText(findTestObject('New Product/android.widget.EditText -Edit Quantity'), '5', 0)
Mobile.hideKeyboard() // Sembunyikan keyboard setelah input
Mobile.delay(1) // Delay singkat setelah menyembunyikan keyboard

println("Menunggu dan mengetuk 'Add to Bag' untuk CollagenToner")
Mobile.waitForElementPresent(findTestObject('New Product/android.widget.TextView - Add to Bag'), 10) // Tunggu hingga 10 detik
Mobile.tap(findTestObject('New Product/android.widget.TextView - Add to Bag'), 0)
Mobile.delay(3) // Beri waktu untuk proses penambahan ke keranjang
println("CollagenToner berhasil ditambahkan ke keranjang.")

println("Menunggu dan mengetuk 'BackButton'")
Mobile.waitForElementPresent(findTestObject('New Product/android.widget.BackButton'), 10) // Tunggu hingga 10 detik
Mobile.tap(findTestObject('New Product/android.widget.BackButton'), 0)
Mobile.delay(2) // Beri waktu untuk kembali ke halaman sebelumnya
println("Kembali ke halaman sebelumnya.")

println("Menunggu dan mengetuk produk 'AmericanGarden'")
Mobile.waitForElementPresent(findTestObject('New Product/android.view.AmericanGarden'), 10) // Tunggu hingga 10 detik
Mobile.tap(findTestObject('New Product/android.view.AmericanGarden'), 0)
Mobile.delay(2) // Beri waktu untuk halaman detail produk AmericanGarden dimuat
println("Produk 'AmericanGarden' dipilih.")

println("Menunggu dan mengetuk 'Add to Bag' untuk AmericanGarden")
Mobile.waitForElementPresent(findTestObject('New Product/android.widget.TextView - Add to Bag'), 10) // Tunggu hingga 10 detik
Mobile.tap(findTestObject('New Product/android.widget.TextView - Add to Bag'), 0)
Mobile.delay(3) // Beri waktu untuk proses penambahan ke keranjang
println("AmericanGarden berhasil ditambahkan ke keranjang.")

println("Menunggu dan mengetuk 'Your Bag'")
Mobile.waitForElementPresent(findTestObject('New Product/android.view.ViewGroup (2) Your Bag'), 10) // Tunggu hingga 10 detik
Mobile.tap(findTestObject('New Product/android.view.ViewGroup (2) Your Bag'), 0)
Mobile.delay(3) // Beri waktu untuk halaman keranjang dimuat
println("Berhasil masuk ke halaman keranjang belanja.")

println("Menunggu dan mengetuk 'Checkout'")
Mobile.waitForElementPresent(findTestObject('New Product/android.view.ViewGroup Checkout'), 10) // Tunggu hingga 10 detik
Mobile.tap(findTestObject('New Product/android.view.ViewGroup Checkout'), 0)
Mobile.delay(5) // Beri waktu untuk proses checkout
println("Tombol 'Checkout' berhasil diklik. Menunggu transisi.")



