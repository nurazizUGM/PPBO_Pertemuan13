import java.util.ArrayList;

public class Gubernur extends PegawaiNegara {
    private ArrayList<PNS> daftarPNS = new ArrayList<PNS>();

    public Gubernur(String nama, int gajiPokok, String daerah) {
        super(nama, gajiPokok, daerah);
    }

    public void addPNS(PNS pns) {
        if (!pns.getDaerah().equals(this.getDaerah())) {
            System.out.println("Alamat PNS tidak sesuai dengan daerah Gubernur");
        } else {
            this.daftarPNS.add(pns);
        }
    }

    public int getTunjangan() {
        return this.getGajiPokok() + this.daftarPNS.size() * 100000;
    }

    public void removePNS(PNS pns) {
        this.daftarPNS.remove(pns);
    }
}
