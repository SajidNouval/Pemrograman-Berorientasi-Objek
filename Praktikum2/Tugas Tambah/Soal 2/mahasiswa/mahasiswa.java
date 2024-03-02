package mahasiswa;
import walimahasiswa.walimahasiswa;
public class mahasiswa {
    // Atribut
    private String nim;
    private String jurusan;
    private walimahasiswa wali;

    // Constructor
    public mahasiswa(String nim, String jurusan, walimahasiswa wali) {
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    // nim
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // jurusan
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return nim + ", " + jurusan + ", " + wali;
    }
}
