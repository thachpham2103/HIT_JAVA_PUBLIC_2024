package KIEMTRA.java;

public class bai2 {
    private String id;
    private String name;
    private String price;
    private int total;

    public bai2() {

    }

    public bai2(String id, String name, String price, int total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return " Prroduct " + id + " name" + name + " price " + price + " total" + total;
    }
}

