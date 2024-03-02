package Praktikum2;
//Sajid Nouval - 24060122140110

class Titik {
    //Atribut
    private double absis, ordinat;
    private static double counterTitik;

    //Constructor
    Titik() {
        this.absis = 0;
        this.ordinat = 0;
        this.counterTitik++;
    }

    Titik(double a, double b) {
        this.absis = a;
        this.ordinat = b;
        this.counterTitik++;
    }

    //Absis
    void setAbsis(double a) {
        this.absis = a;
    }

    double getAbsis() {
        return this.absis;
    }

    //Ordinat
    void setOrdinat(double b) {
        this.ordinat = b;
    }

    double getOrdinat() {
        return this.ordinat;
    }

    //CounterTitik
    static double getcounterTitik() {
        return counterTitik;
    }

    //getJarakPusat
    public double getJarakPusat(){
        return Math.sqrt((this.absis * this.absis) + (this.ordinat * this.ordinat));
    }

    public void refleksiX(Titik titik){
        this.ordinat = titik.getOrdinat();
        this.ordinat *= -1;
        titik.setOrdinat(ordinat);
    }
    public void refleksiY(Titik titik){
        this.absis = titik.getAbsis();
        this.absis *= -1;
        titik.setAbsis(absis);
    }
    public void getRefleksiX(Titik titik){
        refleksiX(titik);

    }
    public void getRefleksiY(Titik titik){
        refleksiY(titik);
    }
}