# 📱 Mobile Testing - HappyDayShopping App

Ini adalah proyek pengujian mobile automation menggunakan **Katalon Studio** pada aplikasi Android `HappyDayShopping.apk`. Fokus pengujian adalah simulasi real-case pada fitur belanja produk.

---

## 🛠 Tools & Teknologi

- **Testing Tools**: Katalon Studio
- **Platform**: Android
- **File APK**: `apk/HappyDayShopping.apk`
- **Bahasa Script**: Groovy

---

## 🎯 Tujuan

Mengotomasi pengujian fungsi utama seperti:
- Navigasi ke menu *Promotions* dan *New Products*
- Memilih produk
- Mengatur kuantitas
- Menambahkan ke keranjang
- Checkout

---

## ✅ Ringkasan Hasil Test Suite

**Nama Suite**: `Suite Test`  
**Tanggal Eksekusi**: 23 Mei 2025  
**Total Test Case**: 2  
**Status**: 2 Passed | 0 Failed | 0 Skipped  
**Durasi**: 2 menit 31 detik

---

### 🧪 Test Case 1: AddProductFlashSale

- Buka aplikasi
- Masuk ke menu `Promotions`
- Pilih produk `DynamiteCandy`
- Atur jumlah: 5
- Tambahkan ke keranjang
- Checkout  
✅ *Passed*

---

### 🧪 Test Case 2: New Products

- Masuk ke menu `New Products`
- Pilih `CollagenToner` dan `AmericanGarden`
- Atur jumlah & tambahkan ke keranjang
- Checkout  
✅ *Passed*

---

## 📁 Struktur Folder
```plaintext
Project/
├── apk/
│   └── HappyDayShopping.apk
├── Test Suites/
│   └── Suite Test
├── Test Cases/
│   └── Shop/
│       ├── AddProductFlashSale
│       └── New Products
├── Object Repository/
│   ├── Promotions/
│   └── New Product/
```
## 📌 Catatan

Proyek ini ditujukan untuk keperluan portofolio pengujian mobile automation. Tidak untuk distribusi ulang tanpa izin.
