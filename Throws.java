import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    static void bacaFile(String namaFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(namaFile));
        String baris;
        while ((baris = br.readLine()) != null) {
            System.out.println(baris);
        }
        br.close();
    }

    public static void main(String[] args) {
        try {
            // Memanggil method yang "throws IOException"
            bacaFile("contoh.txt");
        } catch (IOException e) {
            // Wajib ditangkap di sini karena bacaFile melempar IOException
            System.out.println("Terjadi error saat membaca file: " + e.getMessage());
        }
    }
}
