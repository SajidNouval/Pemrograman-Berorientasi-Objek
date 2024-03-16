package kendaraan;

public class Kendaraan {
    private String nama;
    private int kecepatan;
    public Kendaraan(String nama) {
        this.nama = nama;
        this.kecepatan = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Kecepatan: " + kecepatan);
    }

    public void gas(int tambahKecepatan, int durasi) {
        this.kecepatan += tambahKecepatan;
        System.out.println("Kecepatan bertambah menjadi " + this.kecepatan);
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        berhenti();
                    }
                }, durasi * 1000);
    }

    public void berhenti() {
        this.kecepatan = 0;
    }

    public void klakson() {
        System.out.println(nama + " berbunyi");
    }
}