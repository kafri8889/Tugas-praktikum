-- No 2: Buatlah tabel dengan nama pegawai
create table pegawai(
    id int(5) not null primary key,
    nama varchar(20) not null,
    alamat varchar(20) not null,
    gaji int(10) not null
);

-- No 3: Masukkan data-data berikut ini
insert into pegawai values
    (100, 'Arif', 'Surabaya', 10000),
    (101, 'Andi', 'Jakarta', 14000),
    (102, 'Burhan', 'Malang', 12000),
    (103, 'Fikri', 'Madiun', 15000),
    (104, 'Fariz', 'Malang', 17000),
    (105, 'Sigit', 'Surabaya', 20000),
    (106, 'Ifan', 'Kediri', 16000),
    (107, 'Hanif', 'Yogyakarta', 12000),
    (108, 'Zakiuddin', 'Surabaya', 21000);

-- No 4: Hapuslah record dengan ID 100
delete from pegawai where id = 100;

-- No 5: Update data untuk ID 101 dan 102 sbb
update pegawai set nama = 'Naila', alamat = 'Surabaya', gaji = 10000 where id = 101;
update pegawai set nama = 'Rafi', alamat = 'Semarang', gaji = 14000 where id = 102;

-- No 6: Buat perintah SQL berikut ini untuk menampilkan:

-- 6_a: Semua kolom dari tabel pegawai
select * from pegawai;

-- 6_b: Kolom nama dan gaji dari tabel pegawai
select nama, gaji from pegawai;

-- 6_c: Kolom nama dan alamat yang mempunyai nama dengan awalan F
select nama, alamat from pegawai where nama like 'F%';

-- 6_d: Kolom nama dan alamat yang mempunyai nama dengan akhiran n
select nama, alamat from pegawai where nama like '%n';

-- 6_e: Kolom nama dan gaji yang mempunyai gaji diatas 15000
select nama, gaji from pegawai where gaji > 15000;

-- 6_f: Kolom nama, alamat dan gaji yang bergaji diatas 13000 dan beralamat di Surabaya
select nama, alamat, gaji from pegawai where alamat = 'Surabaya' and gaji > 13000;

-- 6_g: Kolom nama, gaji dengan range gaji antara 15000 ~ 20000
select nama, gaji from pegawai where gaji between 15000 and 20000;

-- 6_h: Gaji max, min,rata2 dari tabel pegawai > select max(gaji), min(gaji), avg(gaji) from pegawai
select max(gaji) as gaji_maksimum, min(gaji) as gaji_minimum, avg(gaji) as gaji_rata_rata from pegawai;
