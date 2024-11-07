package baitapgiaotrinh.chuong2.truutuonghinhhoc;

public class HinhTron extends Hinh {
    private double banKinh;

    public HinhTron() {
        super();
    }

    public HinhTron(String tenHinh, double banKinh) {
        super(tenHinh);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        if (banKinh < 0) {
            System.out.println(" nhập lại R :");
            return 0;
        }
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * 2 * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return super.toString() + " tenHinh:" + getTenHinh() + " banKinh:" + getBanKinh()
                + " chuvi:" + tinhChuVi() + "dienTich:" + tinhDienTich();
    }
}
