package btnvbuoi5;

import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;

    public Address() {

    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào commune:");
        commune = sc.nextLine();
        System.out.println(" nhập vào district:");
        district = sc.nextLine();
        System.out.println(" nhập vào city:");
        city = sc.nextLine();
    }

    public void xuat() {
        System.out.println(" commune:" + commune + " district:" + district + " city:" + city);
    }
}
