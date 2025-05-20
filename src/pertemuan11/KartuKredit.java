package pertemuan11;

public class KartuKredit implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Membayar Rp" + jumlah + " via Kartu Kredit.");
    }
}
