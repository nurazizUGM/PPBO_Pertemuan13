import java.util.ArrayList;

public class PNS extends PegawaiNegara {
    private int golongan;
    private ArrayList<Rakyat> daftarRakyat = new ArrayList<Rakyat>();

    public PNS(String nama, int gajiPook, String daerah, int golongan) {
        super(nama, gajiPook, daerah);
        this.golongan = golongan;
    }

    public void addRakyat(Rakyat rakyat) {
        if (rakyat.getPNS() != null) {
            System.out.println("Rakyat sudah terdaftar di PNS lain");
        } else if (daftarRakyat.contains(rakyat)) {
            System.out.println("Rakyat sudah terdaftar");
        } else if (!rakyat.getAlamat().equals(this.getDaerah())) {
            System.out.println("Alamat rakyat tidak sesuai dengan daerah PNS");
        } else {
            this.daftarRakyat.add(rakyat);
            rakyat.setPNS(this);
            if (rakyat.getJumlahKekayaan() < 100000000 && PegawaiNegara.getAPBN() >= 1000000) {
                this.gunakanAPBN(1000000);
                rakyat.setJumlahKekayaan(rakyat.getJumlahKekayaan() + 1000000);
                System.out.println("Memberikan bantuan ke " + rakyat.getNama());
            }
        }
    }

    public int getTunjangan() {
        return this.getGajiPokok() + this.golongan * 100000;
    }

    public void removeRakyat(Rakyat rakyat) {
        this.daftarRakyat.remove(rakyat);
        rakyat.setPNS(null);
    }

    public int getGolongan() {
        return this.golongan;
    }
}
