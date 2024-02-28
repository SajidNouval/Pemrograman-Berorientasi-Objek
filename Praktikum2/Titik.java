package Praktikum2;

public class Titik {
    //Atribut
    private double absis;
    private double ordinat;
    //private double jarak;
    //Static inc numberOfPoints;

    //konstruktor
    //Membuat objek titik dengan inisialisasi nilai absis dan ordinat
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //Membuat objek titik dengan inisiasi absis 0 dan ordinat 0
    public Titik(){
        this(0,0);
    }
    //Method
    //Fungsi selektor untuk mendapatkan nilai atribut absis
    public double getOrdinat(){
        return this.ordinat;
    }
    //Fungsi selektor untuk mendapatkan nilai atribut ordinat
    public double getAbsis(){
        return this.absis;
    }
    //FUngsi selektor untuk menghitung jarak sebuah titik dengan titik pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    //Prosedur untuk mengeset nilai atribut absis dengan nilai yang baru
    public void setAbsis(double absis){
        this.absis = absis;
    }
    //Prosedur untuk mengeset nilai atribut ordinat dengan nilai yang baru
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    public void refleksiX(Titik titik){
        double ordinat = titik.getOrdinat();
        ordinat *= -1;
        titik.getOrdinat(ordinat);
        //this.absis = this.ordinat * -1;
    }
    public void refleksiY(Titik titik){
        double absis = titik.getAbsis();
        absis *= -1;
        titik.getAbsis(absis);
        //this.ordinat = this.absis * -1;
    }
    public Titik getRefleksiX(){
        Titik titik;
        refleksiX(titik);
        //Titik titik = new Titik(-absis, ordinat);
        //return titik;
    }
    public Titik getRefleksiY(){
        Titik titik;
        refleksiY(titik);
        //Titik titik = new Titik(absis, -ordinat);
        //return titik;
    }
}

