package pertemuan11;

public abstract class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public abstract void nyalakanMesin();

    public void info() {
        System.out.println("Merk kendaraan: " + merk);
    }
}
