package pertemuan11;

public class Motor extends Kendaraan {
    public Motor(String merk) {
        super(merk);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Motor " + merk + " menyalakan mesin dengan kunci.");
    }
}
