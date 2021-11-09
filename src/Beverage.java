import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Beverage extends Product {

    private LocalDate expireDate;

    Beverage(String name, String brand, double price, LocalDate expireDate) {
        super(name, brand, price);
        productId = Product.productsCount;
        this.expireDate = expireDate;
    }

    @Override
    public double getDiscount() {
        long difference = DAYS.between(expireDate, LocalDate.now());

        if (difference == 0)
            return 0.5;
        if (difference <= 5)
            return  0.05;

        return 0.0;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
}
