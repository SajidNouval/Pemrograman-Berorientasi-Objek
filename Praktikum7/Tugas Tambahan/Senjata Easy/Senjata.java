public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata (String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    public String getBunyi(){
        return bunyi;
    }
    public int getPeluru(){
        return peluru;
    }
    public void menembak (){
        System.out.print(getBunyi() + " ");
        peluru -= 1;
        System.out.println("");
        System.out.println("Sisa Peluru: " + peluru);
        System.out.println("");
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}