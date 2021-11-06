import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String args[]) {

        Product[] products = {
                new Food("apple", "BrandA", 1.5, LocalDate.of(2021,6,14)),
                new Beverage("milk", "BrandM", 0.99, LocalDate.of(2022,2,2)),
                new Clothing("T-shirt", "BrandT", 15.99, "M", "violet"),
                new Appliance("laptop", "BrandL", 2345.0, "ModelL", LocalDate.of(2021,3,3), 1.125)
        };

        Cart cart = new Cart();
        cart.addProduct(products[0], 2.45);
        cart.addProduct(products[1], 3);
        cart.addProduct(products[2], 2);
        cart.addProduct(products[3], 1);

        Cashier friendlyWoman = new Cashier();
        friendlyWoman.printReceipt(cart, LocalDateTime.now());

    }

}
