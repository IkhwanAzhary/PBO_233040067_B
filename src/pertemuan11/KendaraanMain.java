package pertemuan11;

public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan motor = new Motor("Honda");

        mobil.nyalakanMesin();
        motor.nyalakanMesin();
    }
}
