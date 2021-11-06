import java.time.LocalDate;
import java.util.Calendar;

public class Appliance extends Product {

    private String model;
    private LocalDate prodDate;
    private double weight;

    Appliance(String name, String brand, double price, String model, LocalDate prodDate, double weight) {
        super(name, brand, price);
        productId = Product.productsCount;
        this.model = model;
        this.prodDate = prodDate;
        this.weight = weight;
    }

    @Override
    public double getDiscount() {
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DAY_OF_WEEK);
        if (currentDay == Calendar.SATURDAY || currentDay == Calendar.SUNDAY)
            return 0.05;

        return 0.0;
    }
}
