package pertemuan11;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        Tabung tabung = new Tabung(10, 5);

        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + (int) lingkaran.getJari2());
        System.out.println("luas:" + lingkaran.luas());

        System.out.println("== Tabung ==");
        System.out.println("jari2: " + (int) tabung.getJari2() + ", Tinggi:" + (int) tabung.getTinggi());
        System.out.println("luas:" + tabung.luas());
    }
}
