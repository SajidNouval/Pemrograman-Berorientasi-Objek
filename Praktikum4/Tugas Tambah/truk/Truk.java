package truk;
import kendaraan.*;
public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas Muatan (kg): " + kapasitasMuatan);
        System.out.println("Berat Muatan (kg): " + beratMuatan);
    }

    public void muatBarang(int berat) {
        int totalBerat = beratMuatan + berat;
        if (totalBerat <= kapasitasMuatan) {
            beratMuatan = totalBerat;
            System.out.println("Berat muatan bertambah menjadi " + beratMuatan + " kg.");
        } else {
            System.out.println("Kapasitas muatan terlampaui. Barang tidak dapat dimuat.");
        }
    }

    @Override
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Honk Honk!");
    }
}
