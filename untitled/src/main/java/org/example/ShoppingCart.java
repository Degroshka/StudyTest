package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    private final List<Product> items = new ArrayList<>();
    private double discountPercent = 0;

    public void addItem(Product product) {
        if (product == null) throw new IllegalArgumentException("Product cannot be null");
        items.add(product);
    }

    public void removeItem(Product product) {
        if (!items.remove(product)) {
            throw new IllegalArgumentException("Product not found in cart");
        }
    }

    public void setDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
        this.discountPercent = percent;
    }

    public double getTotalPrice() {
        double total = items.stream().mapToDouble(Product::getPrice).sum();
        return total * (1 - discountPercent / 100.0);
    }

    public int getItemCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public List<Product> getItems() {
        return Collections.unmodifiableList(items);
    }
}
