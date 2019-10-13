import java.util.*;

public class ShoppingCart {
    private ArrayList items;

    public ShoppingCart() {
        items = new ArrayList();
    }

    public double getBalance() {
        double balance = 0.00;
        for (Iterator i = items.iterator(); i.hasNext();) {
            Product item = (Product) i.next();
            balance += item.getPrice();
        }
        return balance;
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public void removeItem(Product item) throws ProductNotFoundException {
        if (!items.remove(item)) {
            throw new ProductNotFoundException();
        }
    }

    public int getItemCount() {
        return items.size();
    }

    public void empty() {
        items.clear();
    }
}

public class Product {
    private String title;
    private double price;

    public Product(String t, double p) {
        this.title = t;
        this.price = p;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice() {
        return price;
    }

    public boolean equals(Object o) {
        if (o instanceof Product) {
            Product p = (Product) o;
            return p.getTitle().equals(title);
        }
        return false;
    }
}

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException() {
        super();
    }
}