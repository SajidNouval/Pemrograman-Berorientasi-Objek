/*
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Nama/NIM  : Sajid Nouval - 24060122140110
 * */
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

//SOAL
/*Untuk inputan tidak boleh nol dan kesalahannya akan membuat output bilangan negatif, jika input bernilai nol maka asersi akan terus gagal, solusinya dengan menginisialisasi jari jarinya*/