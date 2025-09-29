import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> daftarmurid = new ArrayList<String>();
        daftarmurid.add("Budi");
        daftarmurid.add("Siti");
        daftarmurid.add("Andi");
        daftarmurid.add("Dewi");
        daftarmurid.add("Joko");
        for (int i = 0; i < daftarmurid.size(); i++) {
            System.out.println("Murid ke-" + (i + 1) + ": " + daftarmurid.get(i));
        }
    }
}
