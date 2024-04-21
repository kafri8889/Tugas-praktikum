-- 1. Buatlah 2 tabel yaitu Pegawai ,Departemen yang saling berhubungan yang memiliki field-field sbb
create table departemen(
    id_dep varchar(5) not null primary key,
    nama varchar(20) not null
);

create table pegawai(
    id_peg int(5) not null primary key,
    nama varchar(20) not null,
    alamat varchar(20) not null,
    id_dep int(5) not null,
    foreign key (id_dep) references departemen(id_dep)
);

-- 2. Isikan data untuk kedua tabel diatas
-- Tabel pegawai
insert into pegawai values
    (100, 'Arif', 'Surabaya', 'A001'),
    (101, 'Andi', 'Jakarta', 'A002'),
    (102, 'Burhan', 'Malang', 'A003');

-- Tabel departemen
insert into departemen values
    ('A001', 'IT'),
    ('A002', 'Produksi'),
    ('A003', 'HRD'),
    ('A004', 'Engineering');

-- 3. Buatlah perintah SQL berikut
-- 3_a: Menampilkan nama pegawai, alamat pegawai dan nama departemen
select pegawai.nama, pegawai.alamat, departemen.nama as departemen
from pegawai inner join departemen on pegawai.id_dep = departemen.id_dep;

-- 3_b: Menampilkan id pegawai, nama pegawai dan nama departemen
select pegawai.id_peg as id, pegawai.nama, departemen.nama as departemen
from pegawai inner join departemen on pegawai.id_dep = departemen.id_dep;
