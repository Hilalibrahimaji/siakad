public class Dosen {
    private String nama;
    private String nidn;
    private String matakuliah;

    void tampilkanInfo() {
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("NIDN          : " + nidn);
        System.out.println("Mata Kuliah   : " + matakuliah);
    }

        void mengajar() {
        System.out.println(nama + " sedang mengajar " + matakuliah);
    }
}

