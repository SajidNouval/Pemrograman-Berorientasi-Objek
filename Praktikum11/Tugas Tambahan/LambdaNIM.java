import java.util.HashMap;
import java.util.Map;

public class LambdaNIM {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060110", "Umam");
        mahasiswaMap.put("24060111", "Adi");
        mahasiswaMap.put("24060112", "Bambang");
        mahasiswaMap.put("24060113", "Cici");
        mahasiswaMap.put("24060114", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
