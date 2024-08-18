package KIEMTRA.java;

public class baitoStr extends bai2 {
    private String hangSanXuat;
    private int boNho;

    public baitoStr(String id, String name, String price, int total, String hangSanXuat, int boNho) {
        super(id, name, price, total);
        this.hangSanXuat = hangSanXuat;
        this.boNho = boNho;

    }
    public String toString (){
        return super.toString()+" hangSanXuat"+hangSanXuat+" boNho"+boNho;
    }
}
