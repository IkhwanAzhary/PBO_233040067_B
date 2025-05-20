package pertemuan11;

public class PembayaranMain {
    public static void main(String[] args) {
        Pembayaran p1 = new DompetDigital();
        Pembayaran p2 = new KartuKredit();

        p1.prosesPembayaran(100000);
        p2.prosesPembayaran(250000);
    }
}
