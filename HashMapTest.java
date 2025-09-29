public class HashMapTest {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> nilaiMurid = new java.util.HashMap<>();
        nilaiMurid.put("Budi", 85);
        nilaiMurid.put("Siti", 90);
        nilaiMurid.put("Andi", 78);
        nilaiMurid.put("Dewi", 88);
        nilaiMurid.put("Joko", 92);

        for (String key : nilaiMurid.keySet()) {
            System.out.println("Nilai " + key + ": " + nilaiMurid.get(key));
        }
    }
    
}
