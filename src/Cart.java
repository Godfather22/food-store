import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> contents;
    private double[] productsQuantities;

    Cart() {
        contents = new ArrayList<>();
        productsQuantities = new double[100];
    }

    void addProduct(Product pr, double quantity) {

        int id = pr.getProductId();

        contents.add(pr);
        productsQuantities[id] = quantity;

    }

    Product getProduct(int index) {
        return contents.get(index);
    }

    double getProductQuantity(int index) {
        return productsQuantities[index];
    }

    int size() {
        return contents.size();
    }

    boolean isEmpty() {
        return size() == 0;
    }

}
