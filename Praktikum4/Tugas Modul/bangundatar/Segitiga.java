//Sajid Nouval - 24060122140110

package bangundatar;
import poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuasSegitiga(){
        return alas * tinggi * 0.5;
    }

    public void printInfoSegitiga(){
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
