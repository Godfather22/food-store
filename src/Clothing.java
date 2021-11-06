import java.util.Calendar;

public class Clothing extends Product {

    private String size, color;

    Clothing(String name, String brand, double price, String size, String color) {
        super(name, brand, price);
        productId = Product.productsCount;
        this.size = size;
        this.color = color;
    }

    @Override
    public double getDiscount() {
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DAY_OF_WEEK);
        if (currentDay >= Calendar.MONDAY && currentDay <= Calendar.FRIDAY)
            return 0.1;

        return 0.0;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
