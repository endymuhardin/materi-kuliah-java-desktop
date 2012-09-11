# Materi Kuliah Java Desktop #

## Deskripsi ##

Ini adalah repository untuk menyimpan materi kuliah tentang Java Desktop. 
Di dalamnya berisi: 

* Modul Praktikum
* Slide Presentasi Kuliah
* Contoh kode program

Modul praktikum dan slide presentasi dibuat dalam format Markdown, 
untuk kemudian dikonversi menjadi PDF atau presentasi S5 menggunakan Pandoc.
Lebih lanjut mengenai Markdown dan Pandoc bisa dibaca di [blog saya](http://software.endy.muhardin.com/aplikasi/membuat-dokumen-dengan-markdown-dan-pandoc/).

## Cara Build ##

### Prasyarat ###

Untuk melakukan build terhadap modul praktikum dan slide presentasi, Anda membutuhkan hal sebagai berikut:

* Pandoc versi 1.9.1.1 ke atas
* Texlive Xetex versi 2009-15 ke atas
* [Font Droid](http://en.wikipedia.org/wiki/Droid_fonts)

Untuk melakukan build terhadap sample-code, Anda membutuhkan hal sebagai berikut:

* Java SDK versi 1.6 ke atas (OpenJDK atau Oracle JDK tidak masalah)
* Maven versi 2.2.1 ke atas

### Modul Praktikum ###
Untuk mengkonversi modul praktikum menjadi PDF, berikut caranya:

1. Buka terminal command prompt

2. Masuk ke folder modul praktikum
    
    ```
    cd modul
    ```
    
3. Build dengan pandoc

    ```
    pandoc --template artivisi-template.tex  --variable mainfont="Droid Serif" --variable sansfont="Droid Sans" --variable monofont="Inconsolata" --variable fontsize=12pt --variable version=1.0 --latex-engine=xelatex --toc -N -o modul-java-desktop.pdf *md
    ```


### Sample Code ###
Untuk menjalankan contoh kode praktikum, berikut caranya:

1. Buka terminal command prompt

2. Masuk ke folder sample-code yang diinginkan, misalnya sesi-01
    
    ```
    cd sample-code
    cd sesi-01
    ```
    
3. Build dan Run dengan Maven

    ```
    mvn clean package exec:java -Dexec.mainClass="nama.class.yang.ingin.di.Jalankan"
    ```
    
## Cara kontribusi ##

Anda ingin berkontribusi? Baguslah kalau begitu.

Ada beberapa kontribusi yang bisa Anda lakukan, diantaranya :

*  Melakukan testing
*  Menambah/merevisi modul praktikum atau slide presentasi
*  Mengedit source code, baik untuk fix bugs maupun menambah fitur

Untuk kontribusi testing, berikut caranya :

1. Jalankan aplikasinya
2. Kalau ada error/bug yang ditemukan, silakan langsung [membuat issue baru](https://github.com/endymuhardin/materi-kuliah-java-desktop/issues/new).
Mohon mengikuti [panduan melaporkan bug](http://software.endy.muhardin.com/java/tips-melaporkan-error/), supaya mudah ditindak lanjuti oleh programmer.
Bug report maupun request fitur boleh ditulis dalam bahasa Indonesia atau Inggris.

Untuk kontribusi modul, slide, atau sample code, berikut caranya :

1. Fork repository ini menjadi repository Anda sendiri
2. Clone ke local untuk diedit
3. Editlah sesuka hati
4. Commit dan push ke repository Anda sendiri
5. Kirim pull request ke saya supaya bisa saya merge ke repository saya

