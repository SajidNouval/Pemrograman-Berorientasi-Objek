package main;
import orang.orang;
import mahasiswa.mahasiswa;
import walimahasiswa.walimahasiswa;

public class Main {
    public static void main(String[] args) {
            System.out.println("");
            orang orang1 = new orang("Sajid Nouval", "16969");
            walimahasiswa walimahasiswa1 = new walimahasiswa("0816969", "Bogor no.69");
            mahasiswa mahasiswa1 = new mahasiswa("24060122140110", "Informatika", walimahasiswa1);

            System.out.println("Nama: " + "(" + orang1 + ")");
            System.out.println("Wali Mahasiswa: " + "(" + walimahasiswa1 + ")");
            System.out.println("ID Mahasiswa: " + "(" + mahasiswa1 + ")");

            System.out.println("");

            orang1.setNama("Umam Jamaludin ELmar Elric Alexandra Raja ke 17");
            orang1.setNik("12345");
            walimahasiswa1.setAlamat("Atlantis");
            walimahasiswa1.setNomorHp("0811234");
            mahasiswa1.setNim("24060122169696");
            mahasiswa1.setJurusan("Sastra Arab");
            System.out.println("Nama: " + "(" + orang1 + ")");
            System.out.println("Wali Mahasiswa: " + "(" + walimahasiswa1 + ")");
            System.out.println("ID Mahasiswa: " + "(" + mahasiswa1 + ")");

            System.out.println("");

            orang orang2 = new orang("Arganz", "54321");
            walimahasiswa walimahasiswa2 = new walimahasiswa("08154321", "Depok");
            mahasiswa mahasiswa2 = new mahasiswa("24069", "Padepokan Depok", walimahasiswa2);

            System.out.println("Nama: (" + orang2.getNama() + ", " + orang2.getNik() + ")");
            System.out.println("Wali Mahasiswa: (" + walimahasiswa2.getNomorHp() + ", " + walimahasiswa2.getAlamat() + ")");
            System.out.println("ID Mahasiswa: (" + mahasiswa2.getNim() + ", " + mahasiswa2.getJurusan() + ", " + walimahasiswa2 + ")");
        }
}