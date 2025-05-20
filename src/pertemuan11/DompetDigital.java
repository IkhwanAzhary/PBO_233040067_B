package pertemuan11;

public class DompetDigital implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Membayar Rp" + jumlah + " via Dompet Digital.");
    }
}
