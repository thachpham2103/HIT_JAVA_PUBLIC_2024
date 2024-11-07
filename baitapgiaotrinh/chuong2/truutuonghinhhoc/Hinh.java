package baitapgiaotrinh.chuong2.truutuonghinhhoc;

public abstract class Hinh {
    protected String tenHinh;

    public abstract double tinhChuVi();

    public abstract double tinhDienTich();

    public Hinh() {

    }

    public Hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
}

