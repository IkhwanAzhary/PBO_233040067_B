package pertemuan9;

public class Motor extends Kendaraan {
	private boolean jumlahRoda;
	
	public Motor(String merek, int tahun, boolean jumlahRoda) {
		super(merek, tahun);
		this.jumlahRoda = jumlahRoda;
	}
	
	public void infoMotor() {
		infoKendaraan();
		System.out.println("Ada Roda Dua: " + (jumlahRoda ? "Ya" : "Tidak"));
	}
}