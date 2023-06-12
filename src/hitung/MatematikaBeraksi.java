package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Matematika teddy = new Matematika(5,0);
        System.out.println("Hasil Penjumlahan: "+teddy.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+teddy.setPengurangan());
        System.out.println("Hasil Perkalian: "+teddy.setPerkalian());
        System.out.println("Hasil Pembagian: "+teddy.setPembagian());
    }
}
