package pertemuan9;

public class Kendaraan {
	private String merek;
	private int tahun;
	
	public Kendaraan (String merek, int tahun) {
		this.merek = merek;
		this.tahun = tahun;
	}
	
	public void infoKendaraan() {
		System.out.println("Merek: " + merek);
		System.out.println("Tahun: " + tahun);
	}
}