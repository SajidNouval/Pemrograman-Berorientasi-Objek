package walimahasiswa;

public class walimahasiswa {
    // Atribut
    private String nomorHp;
    private String alamat;

    // Constructor
    public walimahasiswa(String nomorHp, String alamat) {
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    // nomorHp
    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    // alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return nomorHp + ", " + alamat;
    }
}