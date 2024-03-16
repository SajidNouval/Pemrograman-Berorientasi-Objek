package mobil;
import kendaraan.*;
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu " + nomorPintu + " mobil terbuka.");
    }

    @Override
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Vroom Vroom!");
    }
}
