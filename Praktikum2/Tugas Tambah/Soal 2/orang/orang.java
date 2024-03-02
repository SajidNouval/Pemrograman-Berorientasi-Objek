package orang;

public class orang {
    // Atribut
    private String nama;
    private String nik;

    // Constructor
    public orang(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    // nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // nik
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return nama + ", " + nik;
    }
}