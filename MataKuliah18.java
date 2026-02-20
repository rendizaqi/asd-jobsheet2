public class MataKuliah18 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah18() {
    }

    public MataKuliah18(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS " + nama + " berhasil diubah.");
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam saat ini tidak mencukupi.");
        }
    }
}