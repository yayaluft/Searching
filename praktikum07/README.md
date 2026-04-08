## Sequential Search
1.	Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
2.	Jelaskan fungsi break pada kode program di bawah ini! 
3.	Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
4.	Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
5.	Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
### Jawaban:
1. Method tampilPosisi hanya mencetak indeks/posisi ditemukannya data sedangkan tampilDataSearch mencetak seluruh data mahasiswa (NIM, nama, kelas, ipk) pada indeks tersebut.
2. Break tersebut berfungsi untuk mengehentikan loop setelah data ditemukan, sehingga program tidak melanjutkan pengecekan elemen berikutnya yang tidak diperlukan.
3. variabel posisi berfungsi menyimpan indeks array posisi data ditemukan. Nilai awalnya -1 sebagai tanda jika data belum ditemukan.
4. Program akan menampilkan data pertama yang ditemukan. Karena apabila kondisi listMhs[j].ipk == cari telah terpenuhi akan menjalankan break dan posisi lain tidak akan dicari lagi.
5. Loop akan terus berjalan sampai akhir array. Jika ada data yang sama, maka data yang ditampilkan adalah data paling terakhir.

## Binary Search
1.	Tunjukkan pada kode program yang mana proses divide dijalankan!
2.	Tunjukkan pada kode program yang mana proses conquer dijalankan!
3.	Apa fungsi left, right, dan mid?
4.	Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
5.	Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
6.	Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
7.	Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.

### Jawaban:
1. Proses divide berada pada kode ```mid = (left+right)/2``` array dibagi menjadi dua dengan menghitung indeks mid dari left hingga right.
2. Proses conquer pada kondisi ```if (cari == listMhs[mid].ipk)``` apabila benar program mengembalikan data mid. Jika false lanjut ke kondisi else if (listMhs[mid].ipk>cari) apabila true  program akan mencari array dari kiri arah mid-1. Apabila false program akan mencari dari mid+1 hingga ke right.
3.  - left : batas indeks paling kiri
- right : batas indeks paling tengah
- mid : indeks tengah hasil dari (left+right)/2
4. Program tetap berjalan tanpa error, akan tetapi hasilnya bisa salah. Jika data tidak diurutkan, keputusan ke kiri/kanan bisa salah sehingga data yang benar bisa dikembalikan sebagai -1 (tidak ditemukan).
5. Tidak sesuai karena program menampilkna "IPK 3.2 tidak ditemukan". Saya mengganti kondisi ```else if (listMhs[mid].ipk > cari)``` menjadi ```else if (listMhs[mid].ipk < cari)```
6. Ketika kondisi right >= left tidak terpenuhi, pencarian sudah habis tanpa menemukan data dan method mengembalikan -1 atau "tidak ditemukan".
7. Sudah saya modifikasi.