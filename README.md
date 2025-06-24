# **📊 System Penjualan Alat Pancing**

Aplikasi Java console-based untuk sistem penjualan alat pancing, dibuat sebagai tugas UTS Pemrograman Visual. Tujuannya untuk melatih konsep dasar pemrograman berorientasi objek, input/output, serta kontrol alur (percabangan & perulangan).


## **📌 Fitur Utama**

- Tampilan menu berbasis teks untuk navigasi
- Input data pelanggan atau transaksi (String, Integer)
- Pengelolaan data aritmatika (hitung total, diskon, dsb.)
- Logika percabangan kompleks (if majemuk & bersarang)
- Struktur data sederhana (array / List)
- Atribut utama seperti:
    - No. Urut
    - NIM
    - Nama
    - Detail menu, dsb.


## **💻 Cara Menjalankan**

1. Pastikan sudah install JDK 8+ dan javac sudah bekerja.
2. Clone repo ini:

```graphql
git clone https://github.com/SyaiYesMom/System-Penjualan-Alat-Pancing.git
cd System-Penjualan-Alat-Pancing
```

3. Compile file Java:

```graphql
javac ViadarFishing.java
```

4. Jalankan program:

```graphql
java ViadarFishing
```


## **🧩 Struktur Proyek**

```graphql
.
├── ViadarFishing.java    # Entry point aplikasi
└── README.md             # Dokumentasi (kamu!)
```

**- ViadarFishing.java**

Berisi logika utama: menampilkan menu, baca input, proses pesanan, perhitungan, dan output ke console.


## **🚀 Bagaimana Aplikasi Bekerja**

**1.Tampilkan Menu Utama**
Pengguna memilih opsi (misal: tambah data, lihat transaksi, keluar).

Input Data
Program meminta input pengguna seperti NIM, nama, harga/jumlah, dsb.

Proses Logika
Kalkulasi total biaya, penerapan kondisi (diskon atau validasi input).

Tampilkan Output
Ringkasan transaksi dicetak ke console, lalu kembali ke menu.
