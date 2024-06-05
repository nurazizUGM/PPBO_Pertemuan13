//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Membuat objek PNS
        PNS pns1 = new PNS("Budi", 5000000, "Jakarta", 1);
        PNS pns2 = new PNS("Andi", 4000000, "Jakarta", 2);
        PNS pns3 = new PNS("Caca", 3000000, "Surabaya", 3);

        // Membuat objek Gubernur
        Gubernur gubernur1 = new Gubernur("Joko", 10000000, "Jakarta");
        Gubernur gubernur2 = new Gubernur("Ahmad", 9000000, "Bandung");

        // Menambahkan PNS ke Gubernur
        gubernur1.addPNS(pns1);
        gubernur1.addPNS(pns2);
        gubernur2.addPNS(pns3);
        gubernur1.bayarPajak(2000000);
        System.out.println();

        // Membuat objek Rakyat
        Rakyat rakyat1 = new Rakyat("Joko", "Jakarta", 100000000);
        Rakyat rakyat2 = new Rakyat("Budi", "Jakarta", 8000000);

        // Mengatur PNS untuk Rakyat
        pns1.addRakyat(rakyat1);
        pns2.addRakyat(rakyat2);
        System.out.println();

        System.out.println("APBN: " + PegawaiNegara.getAPBN());
        // Rakyat membayar pajak
        rakyat1.bayarPajak(500000);
        rakyat2.bayarPajak(400000);
        System.out.println();

        // Menampilkan jumlah APBN
        System.out.println("APBN: " + PegawaiNegara.getAPBN());
    }
}