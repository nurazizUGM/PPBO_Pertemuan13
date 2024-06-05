import java.util.ArrayList;
import java.util.List;

public class DPRD extends PegawaiNegara {
    private int jumlahKunjungan;
    private ArrayList<Aspirasi> daftarAspirasi = new ArrayList<>();

    public DPRD(String nama, int gajiPokok, String daerah) {
        super(nama, gajiPokok, daerah);
    }

    public void tambahAspirasi(Rakyat rakyat, String aspirasi) {
        Aspirasi a = new Aspirasi(aspirasi, rakyat);
        this.daftarAspirasi.add(a);
        System.out.println("Aspirasi berhasil diajukan");
    }

    public void removeAspirasi(Aspirasi aspirasi) {
        this.daftarAspirasi.remove(aspirasi);
    }

    public void kunjungan() {
        this.jumlahKunjungan++;
    }

    public List<Aspirasi> getDaftarAspirasi() {
        return this.daftarAspirasi;
    }

    public int getTunjangan() {
        return this.getGajiPokok() + this.jumlahKunjungan * 1000000;
    }
}
