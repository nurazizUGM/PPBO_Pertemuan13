import java.util.Random;

public class PegawaiNegara {
    private int nip;
    private String nama;
    private int gajiPokok;
    private String daerah;

    private static int APBN = 0;

    public PegawaiNegara(String nama, int gajiPokok, String daerah) {
        this.nip = new Random().nextInt(9999999);
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.daerah = daerah;
    }

    public void terimaPajak(int jumlahPajak) {
        PegawaiNegara.tambahAPBN(jumlahPajak);
    }

    public void bayarPajak(int jumlahPajak) {
        PegawaiNegara.tambahAPBN(jumlahPajak);
    }

    public int getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public int getGajiPokok() {
        return this.gajiPokok;
    }

    public String getDaerah() {
        return this.daerah;
    }

    public static void tambahAPBN(int jumlah) {
        PegawaiNegara.APBN += jumlah;
    }

    public void gunakanAPBN(int jumlahPengeluaran) {
        PegawaiNegara.APBN -= jumlahPengeluaran;
    }

    public static int getAPBN() {
        return PegawaiNegara.APBN;
    }
}
