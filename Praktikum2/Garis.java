package Praktikum2;
//Sajid Nouval - 24060122140110
public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Garis(){
        this(new Titik(), new Titik());
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public double getPanjang(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double getGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy/dx;
    }

    public Garis getRefleksiY(){
        Titik t1RefleksiY = new Titik(titikAwal.getAbsis(), -titikAwal.getOrdinat());
        Titik t2RefleksiY = new Titik(titikAkhir.getAbsis(), -titikAkhir.getOrdinat());
        return new Garis(t1RefleksiY, t2RefleksiY);
    }

    public boolean isTegakLurus(Garis g){
        return Math.abs(this.getGradien() * g.getGradien()) == 1;
    }
}