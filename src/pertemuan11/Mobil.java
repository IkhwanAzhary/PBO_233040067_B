package pertemuan11;

public class Mobil extends Kendaraan {
    public Mobil(String merk) {
        super(merk);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mobil " + merk + " menyalakan mesin dengan tombol.");
    }
}
