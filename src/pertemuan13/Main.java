package pertemuan13;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.suara(); // Output: Meow
        anjing.suara(); // Output: Bark

        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();

        mobil.bergerak(); // Output: Mobil bergerak
        sepeda.bergerak(); // Output: Sepeda bergerak
    }
}
