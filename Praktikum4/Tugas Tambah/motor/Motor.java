package motor;
import kendaraan.*;
public class Motor extends Kendaraan {
    private int cc;

    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas Mesin (cc): " + cc);
    }

    public int hitungHorsepower(int angka) {
        if (angka < 15 || angka > 17) {
            System.out.println("Angka harus dalam rentang 15 hingga 17.");
            return 0;
        }
        return angka * cc;
    }

    @Override
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Womp Womp!");
    }
}
