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

println("Memulai Tes Aplikasi Mobile")

println("Memulai aplikasi mobile 'HappyDayShopping'")
// Pastikan path APK benar. 'true' akan mereset data aplikasi setiap kali tes dijalankan.
Mobile.startApplication('apk/HappyDayShopping.apk', true)
Mobile.delay(5) // Memberi waktu aplikasi untuk dimuat sepenuhnya dan menampilkan UI awal.
println("Aplikasi 'HappyDayShopping' berhasil dibuka.")

println("Menunggu dan mengetuk 'PROMOTIONS'")
// Menunggu elemen 'PROMOTIONS' muncul hingga 15 detik.
Mobile.waitForElementPresent(findTestObject('Promotions/android.widget.TextView - PROMOTIONS'), 15)
Mobile.tap(findTestObject('Promotions/android.widget.TextView - PROMOTIONS'), 0)
Mobile.delay(2) // Memberi waktu untuk transisi UI ke halaman promosi.
println("Berhasil navigasi ke bagian PROMOTIONS.")

println("Menunggu dan mengetuk produk 'DynamiteCandy'")
// Menunggu elemen produk 'DynamiteCandy' muncul hingga 10 detik.
Mobile.waitForElementPresent(findTestObject('Promotions/android.view.ViewGroup-DynamiteCandy'), 10)
Mobile.tap(findTestObject('Promotions/android.view.ViewGroup-DynamiteCandy'), 0)
Mobile.delay(2) // Memberi waktu untuk halaman detail produk dimuat.
println("Produk 'DynamiteCandy' dipilih.")

println("Menunggu dan mengetuk elemen detail produk (ViewGroup (1))")
// Menunggu elemen 'ViewGroup (1)' (mungkin overlay/galeri) muncul hingga 10 detik.
Mobile.waitForElementPresent(findTestObject('Promotions/android.view.ViewGroup (1)'), 10)
Mobile.tap(findTestObject('Promotions/android.view.ViewGroup (1)'), 0)
Mobile.delay(2) // Memberi waktu setelah tap, jika ada overlay/popup yang muncul.
println("Tampilan detail produk lebih lanjut terbuka.")

println("Mengatur kuantitas produk menjadi '5' pada kolom 'Edit Jumlah'")
// Menunggu kolom kuantitas 'Edit Jumlah' muncul hingga 10 detik.
Mobile.waitForElementPresent(findTestObject('Promotions/Edit Jumlah'), 10)
Mobile.setText(findTestObject('Promotions/Edit Jumlah'), '5', 0)
Mobile.hideKeyboard() // Menyembunyikan keyboard setelah input.
Mobile.delay(1) // Delay singkat setelah input dan hide keyboard.
println("Kuantitas diatur menjadi 5.")

println("Menunggu dan mengetuk 'Add to Bag'")
// Menunggu tombol 'Add to Bag' muncul hingga 10 detik.
Mobile.waitForElementPresent(findTestObject('Promotions/android.widget.TextView - Add to Bag'), 10)
Mobile.tap(findTestObject('Promotions/android.widget.TextView - Add to Bag'), 0)
Mobile.delay(3) // Memberi waktu untuk proses penambahan ke keranjang dan animasi.
println("Produk berhasil ditambahkan ke keranjang.")

println("Menunggu dan mengetuk 'Your Bag' (untuk pergi ke keranjang belanja)")
// Menunggu elemen 'Your Bag' muncul hingga 10 detik.
Mobile.waitForElementPresent(findTestObject('Promotions/android.view.ViewGroup (2) Your Bag'), 10)
Mobile.tap(findTestObject('Promotions/android.view.ViewGroup (2) Your Bag'), 0)
Mobile.delay(3) // Memberi waktu halaman keranjang dimuat.
println("Berhasil masuk ke halaman keranjang belanja.")

println("Menunggu dan mengetuk 'Checkout'")
// Menunggu tombol 'Checkout' muncul hingga 10 detik.
Mobile.waitForElementPresent(findTestObject('Promotions/android.view.ViewGroup Checkout'), 10)
Mobile.tap(findTestObject('Promotions/android.view.ViewGroup Checkout'), 0)
Mobile.delay(5) // Memberi waktu untuk proses checkout.
println("Tombol 'Checkout' berhasil diklik.")

Mobile.waitForElementPresent(findTestObject('Promotions/android.widget.Button - Go to your shopping cart'), 30) // Penambahan tunggu
Mobile.tap(findTestObject('Promotions/android.widget.Button - Go to your shopping cart'), 0)
Mobile.delay(3) // Tambah delay setelah klik

Mobile.waitForElementPresent(findTestObject('Promotions/android.widget.TextView - If you have any inquiries or updates pls whatsap us at 94617563'), 15) // Penambahan tunggu
Mobile.getText(findTestObject('Promotions/android.widget.TextView - If you have any inquiries or updates pls whatsap us at 94617563'),
	0)
Mobile.delay(10) // Tambah delay setelah getText

println("Menutup aplikasi mobile")
Mobile.closeApplication()
println("Tes Aplikasi Mobile Selesai")

