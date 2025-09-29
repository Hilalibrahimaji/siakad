public class Throw {
    static double bagi(int a, int b) {
        if (b == 0) {
            // Kita melempar Exception manual kalau pembagi nol
            throw new ArithmeticException("Tidak bisa membagi dengan nol!");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Hasil: " + bagi(10, 2)); // normal
            System.out.println("Hasil: " + bagi(5, 0));  // akan melempar exception
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Program selesai dijalankan.");
        }
    }
}
