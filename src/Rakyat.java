public class Rakyat {
    private String nama;
    private String alamat;
    private int jumlahKekayaan;
    private PNS pns;

    public Rakyat(String nama, String alamat, int jumlahKekayaan) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahKekayaan = jumlahKekayaan;
    }

    public void bayarPajak(int jumlahPajak) {
        if (this.pns == null) {
            System.out.println("Rakyat belum terdaftar");
        } else if (this.jumlahKekayaan < jumlahPajak) {
            System.out.println("Pajak terlalu besar, uang tidak cukup");
        } else {
            this.jumlahKekayaan -= jumlahPajak;
            this.pns.terimaPajak(jumlahPajak);
            System.out.println("Pajak berhasil dibayar");
        }
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public int getJumlahKekayaan() {
        return this.jumlahKekayaan;
    }

    public PNS getPNS() {
        return this.pns;
    }

    public void setPNS(PNS pns) {
        this.pns = pns;
    }

    public void setJumlahKekayaan(int jumlahKekayaan) {
        this.jumlahKekayaan = jumlahKekayaan;
    }
}
