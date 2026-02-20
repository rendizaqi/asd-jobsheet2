public class MahasiswaMain18 {
    public static void main(String[] args) {
        Mahasiswa18 mhs1 = new Mahasiswa18();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        Mahasiswa18 mhs2 = new Mahasiswa18("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        Mahasiswa mhs3 = new Mahasiswa18("Muhammad Rendy Azrul Zaqi", "34567654", 3.75, "SIB 1B");

        System.out.println("--- Data Mahasiswa 1 ---");
        mhs1.tampilkanInformasi();
        
        System.out.println("\n--- Data Mahasiswa 2 ---");
        mhs2.tampilkanInformasi();

        System.out.println("\n--- Data Mahasiswa 3 ---");
        mhs3.tampilkanInformasi();

    }
}