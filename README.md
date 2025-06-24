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
├── ViadarFishing.java
└── README.md
```

**- ViadarFishing.java**

Berisi logika utama: menampilkan menu, baca input, proses pesanan, perhitungan, dan output ke console.


## **🚀 Bagaimana Aplikasi Bekerja**

**1.Tampilkan Menu Utama**

Pengguna memilih opsi (misal: tambah data, lihat transaksi, keluar).

**2.Input Data**

Program meminta input pengguna seperti NIM, nama, harga/jumlah, dsb.

**3.Proses Logika**

Kalkulasi total biaya, penerapan kondisi (diskon atau validasi input).

**4.Tampilkan Output**

Ringkasan transaksi dicetak ke console, lalu kembali ke menu.


## **🛠 Teknologi & Konsep**

- Bahasa: Java
- Konsep terapan:
    - Input/output via Scanner
    - TIpe data primitif & String
    - Percabangan: if, else if, nested if
    - Perulangan: while / for (apabila digunakan)
    - Menu interaktif berbasis console


## **✨ Cara Kontribusi**

1. Fork repo ini
2. Buat branch baru (ex: fitur-nama-baru)
3. Commit perubahan dengan pesan jelas
4. Push branch dan ajukan pull request


## **📄 Lisensi**

Proyek ini untuk kebutuhan tugas akademik. Bebas digunakan & dikembangkan, jangan lupa sertakan atribusi.


## **🙌 Terima Kasih!**

Semoga README ini membantu. Kalau ada tambahan fitur (misal: simpan file, GUI sederhana), README ini bisa diperbarui—silakan modifikasi sesuai kebutuhan 😊
