abstract class Product {

    public static int productsCount = 0;

    protected int productId;

    protected String name, brand;
    protected double price;

    Product(String name, String brand, double price) {
        setName(name);
        setBrand(brand);
        setPrice(price);
        productsCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public abstract double getDiscount();

}
