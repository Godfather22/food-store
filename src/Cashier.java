import java.time.LocalDateTime;

public class Cashier {

    void printReceipt(Cart cart, LocalDateTime timestamp) {

        System.out.println("Date: " + timestamp.toString() + "\n---Products---\n\n");

        double totalSum = 0.0;
        double totalDiscount = 0.0;
        double finalPay = 0.0;

        int contentsCount = cart.size();
        for (int i = 0; i < contentsCount; ++i) {

            Product pr = cart.getProduct(i);
            double price = pr.getPrice();
            double quantity = cart.getProductQuantity(pr.getProductId());

            System.out.println(pr.getName() + " - " + pr.getBrand());
            System.out.println(quantity + " x $" + String.format("%.2f", price) + " = $" +  String.format("%.2f", price * quantity));

            double discount = pr.getDiscount();
            double newPrice = price;
            if (discount != 0) {
                newPrice -= discount * price;
                System.out.println("#discount " + (int) (discount * 100) + "% $" + String.format("%.2f", newPrice));
            }

            System.out.println();

            totalSum += price;
            totalDiscount += discount * price;
            finalPay += (newPrice == 0 ? price : newPrice);

        }

        System.out.println("-----------------------------------------------------------------------------------\n");

        System.out.println("SUBTOTAL: $" + String.format("%.2f", totalSum));
        System.out.println("DISCOUNT: $" + String.format("%.2f", totalDiscount));
        System.out.println("\nTOTAL: $" + String.format("%.2f", finalPay));

    }

}
