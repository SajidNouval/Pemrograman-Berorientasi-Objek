/*
 * File      : Asersi2.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama/NIM  : Sajid Nouval - 24060122140110
 * */
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
