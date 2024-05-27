// ----------------------------------------------- Nomor 1 ----------------------------------------------------------------
public class Karyawan {

	private String nama;
	private String departemen;
	private String posisi;
	private int nomorId;

	public Karyawan() {}

	public Karyawan(String nama, int nomorId) {
		this.nama = nama;
		this.nomorId = nomorId;
	}

	public Karyawan(String nama, int nomorId, String departemen, String posisi) {
		this.nama = nama;
		this.nomorId = nomorId;
		this.departemen = departemen;
		this.posisi = posisi;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setDepartemen(String departemen) {
		this.departemen = departemen;
	}

	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}

	public void setNomorId(int nomorId) {
		this.nomorId = nomorId;
	}

	public String getNama() {
		return nama;
	}

	public String getDepartemen() {
		return departemen;
	}

	public String getPosisi() {
		return posisi;
	}

	public int getNomorId() {
		return nomorId;
	
}
// ----------------------------------------------- Nomor 1 ----------------------------------------------------------------

// ----------------------------------------------- Nomor 2 ----------------------------------------------------------------
  public class Mahasiswa {

	private String nama;
	private int totalSkor;
	private int banyakKuis;

	public Mahasiswa(String nama) {
		this.nama = nama;
		totalSkor = 0;
		banyakKuis = 0;
	}

	public String getNama() {
		return nama;
	}

	public int getBanyakKuis() {
		return banyakKuis;
	}

	public int getTotalSkor() {
		return totalSkor;
	}

	public void addSkor(int skor) {
		totalSkor += skor;
		banyakKuis++;
	}

	public double getAverageSkor() {
	    // Rata-rata: tot / n
		return (double) totalSkor * banyakKuis;
	}
}
// ----------------------------------------------- Nomor 2 ----------------------------------------------------------------

// ----------------------------------------------- Nomor 3 ----------------------------------------------------------------
/**
    Class RekeningBank mensimulasikan sebuah rekening bank.
**/
public class RekeningBank
{
	public static int noRekTerakhir = 1001;

	private double saldo;
	private int nomorRekening = noRekTerakhir;

	/**
		Constructor ini menetapkan saldo awal
		ke 0.0.
	**/
	public RekeningBank() {
		saldo = 0.0;
		
		noRekTerakhir++;
	}

	/**
		Constructor ini menetapkan saldo awal
		ke nilai yang diberikan sebagai argument.
		@param saldoAwal Saldo awal.
	**/
	public RekeningBank(double saldoAwal) {
		saldo = saldoAwal;

		noRekTerakhir++;
	}

	/**
		Method deposit menaruh sejumlah uang
		ke rekening.
		@param jumlah Jumlah yang ditambahkan ke
					  field saldo.
	**/
	public void deposit(double jumlah) {
		saldo = saldo + jumlah;
	}

	/**
		Method withdraw menarik sejumlah uang
		dari rekening.
		@param jumlah Jumlah yang dikurangi dari
					  field saldo.
	**/
	public void withdraw(double jumlah) {
		if (saldo >= jumlah) {
			saldo = saldo - jumlah;
		}
		else {
			System.out.println("Dana tidak mencukupi.");
		}
	}

	/**
		Method setSaldo menetapkan saldo dari rekening.
		@param s Nilai untuk disimpan ke field saldo.

	**/
	public void setSaldo(double s) {
		saldo = s;
	}

	/**
		Method getSaldo mengembalikan saldo rekening.
		@return Nilai dalam field saldo.
	**/
	public double getSaldo() {
		return saldo;
	}

	public int getNomorRekening() {
		return nomorRekening;
	}
}
// ----------------------------------------------- Nomor 3 ----------------------------------------------------------------

// ----------------------------------------------- Nomor 4 ----------------------------------------------------------------
public class Line {

	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public double getSlope() {
		return (double) (p1.getY() - p1.getY()) / (p2.getX() - p1.getX());
	}

	@Override
	public String toString() {
		return "[" + p1.toString() + ", " + p2.toString() + "]";
	}
}
// ----------------------------------------------- Nomor 4 ----------------------------------------------------------------
