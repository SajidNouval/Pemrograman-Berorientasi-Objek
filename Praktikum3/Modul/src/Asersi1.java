/*
* File      : Asersi1.java
* Deskripsi : Program untuk menunjukkan asersi
* Nama/NIM  : Sajid Nouval - 24060122140110
* */
public class Asersi1 {
    public static void main(String[] args){
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }
        //else if (x == 0){
          //  System.out.println("x adalah bilangan nol");
        //}
        else{
            assert(x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
