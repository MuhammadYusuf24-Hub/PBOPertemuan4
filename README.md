# PBOPertemuan4
Bahasa pemrograman Java merupakan salah satu bahasa populer yang mendukung paradigma Object-Oriented Programming (OOP). Java juga memiliki library khusus yaitu JDBC (Java Database Connectivity) yang memungkinkan aplikasi Java untuk berkomunikasi langsung dengan berbagai database, termasuk PostgreSQL.  

Pada praktikum ini, dibuat sebuah program sederhana untuk mengelola data minuman kekinian. Data minuman meliputi atribut seperti id_minuman, nama, kategori, harga, dan ukuran. Program ini dibuat dengan pendekatan class terpisah untuk setiap operasi (Insert, Select, Update, Delete), serta sebuah class utama untuk menampilkan menu. Melalui praktikum ini, mahasiswa diharapkan dapat memahami cara menghubungkan Java dengan PostgreSQL sekaligus mengimplementasikan konsep OOP dalam membangun aplikasi berbasis database.
# Java Database Connectivity (JDBC)
JDBC adalah API (Application Programming Interface) pada Java yang memungkinkan aplikasi Java berinteraksi dengan database. Dengan JDBC, program dapat melakukan operasi seperti koneksi ke database, eksekusi query, hingga pengolahan data hasil query.
# PostgreSQL 
PostgreSQL adalah sistem manajemen basis data relasional open-source yang kuat, mendukung standar SQL lengkap dan fitur canggih seperti transaksi, foreign key, dan extensibility.
# CRUD (Create, Read, Update, Delete)
CRUD adalah empat operasi dasar yang digunakan dalam pengelolaan database:  
a.	Create (Insert Data) digunakan untuk menambahkan data baru ke dalam tabel.  
b.	Read (Select Data) digunakan membaca atau menampilkan data dari tabel.  
c.	Update digunakan  mengubah data yang sudah ada.  
d.	Delete digunakan menghapus data yang tidak diperlukan.  
# Struktur Program pada Project
a.	Koneksi.java: class untuk koneksi ke PostgreSQL  
b.	Create.java: class untuk membuat tabel minuman   
c.	Insert.java: class untuk menambahkan data minuman  
d.	Select.java: class untuk menampilkan data dari table  
e.	Update.java: class untuk mengubah data  
f.	Delete.java: class untuk menghapus data  
g.	MainTest.java: class utama (menampilkan menu & menjalankan program)  


