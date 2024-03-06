
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            //method getMassage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//SOAL
/*Jika eksepsi terjadi maka akan masuk kedalam catch dan akan terekskusi dan mengeluarkan "Bukan angka sial"
* Jika baris 21 akan keluar karena memiliki masukan angka 13 yang dimana akan langsung menjalankan program dan mengeluarkan hasilnya "Jangan memasukan angka 13" dan "hati-hati saat memasukkan angka"*/