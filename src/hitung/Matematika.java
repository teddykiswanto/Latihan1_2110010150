package hitung;

public class Matematika {
    //membuat variable
    private double bil1,bil2;
    
    //membuat constuctor
    public Matematika(double bil1,double bil2){
        this.bil1=bil1;
        this.bil2=bil2;
    }
    
    //membuat method setPenjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
}
