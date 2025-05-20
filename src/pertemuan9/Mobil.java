package pertemuan9;

public class Mobil extends Kendaraan {
	private int jumlahPintu;
	
	public Mobil(String merek, int tahun, int jumlahPintu) {
		super(merek, tahun);
		this.jumlahPintu = jumlahPintu;
	}
	
	public void infoMobil() {
		infoKendaraan();
		System.out.println("Jumlah Pintu: " + jumlahPintu);
	}
}