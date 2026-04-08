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
