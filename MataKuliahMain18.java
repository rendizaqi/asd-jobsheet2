public class MataKuliahMain18 {
    public static void main(String[] args) {
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "ALSD18";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah18 mk2 = new MataKuliah18("BD18", "Basis Data", 2, 4);

        System.out.println("=== DATA MATA KULIAH AWAL ===");
        mk1.tampilInformasi();
        System.out.println("-----------------------------");
        mk2.tampilInformasi();

        System.out.println("\n=== MELAKUKAN PERUBAHAN DATA ===");
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk2.kurangiJam(1);

        System.out.println("\n=== DATA MATA KULIAH SETELAH UPDATE ===");
        mk1.tampilInformasi();
        System.out.println("-----------------------------");
        mk2.tampilInformasi();
        
        System.out.println("\n--- Tes Kurangi Jam Berlebih pada MK2 ---");
        mk2.kurangiJam(10);
    }
}