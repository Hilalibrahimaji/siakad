public class TryCatchFinally {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3};

        try {
            // Kode yang berpotensi error
            System.out.println("Angka ke-4: " + angka[3]); // index 3 tidak ada
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangani error
            System.out.println("Terjadi error: indeks array di luar batas!");
        } finally {
            // Kode di sini akan selalu dijalankan
            System.out.println("Bagian finally selalu dieksekusi, meskipun ada error.");
        }

        System.out.println("Program tetap berjalan setelah blok try-catch-finally.");
    }
}
