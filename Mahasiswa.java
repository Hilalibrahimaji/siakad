// Mahasiswa.java
public class Mahasiswa {
    // Atribut / properties
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Konstruktor default
    public Mahasiswa() {
        this.nama = "Belum diisi";
        this.nim = "000000";
        this.jurusan = "Belum diisi";
        this.ipk = 0.0;
    }

    // Konstruktor berparameter
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("IPK      : " + ipk);
        System.out.println("-------------------------");
    }

    // Method main untuk uji coba
    public static void main(String[] args) {
        // Objek 1 menggunakan konstruktor default
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkanData();

        Mahasiswa mhs2 = new Mahasiswa("Panca", "12345678", "Teknik Informatika", 4.00);
        mhs2.tampilkanData();
    }
}
