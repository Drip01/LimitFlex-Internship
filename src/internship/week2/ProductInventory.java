package internship.week2;

public class ProductInventory {
    String name;
    double price;
    int quantity;

    public ProductInventory(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void ProductDetails() {
        System.out.println("Name: " + name + " | Price: $" + price + " | Quantity; " + quantity);
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
            System.out.println("Added: " + quantity + "units ");
        } else {
            System.out.println("Quantity to add must be positive: ");
        }
    }

    public void removeStock(int quantity) {
        if (quantity > 0 && this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println("Removed: " + quantity + "units. New quantity: " + this.quantity);
        } else if (quantity > 0) {
            System.out.println("Not enough stock to remove. " + quantity + "units");
        } else {
            System.out.println("Quantity to remove must be positive.");
        }
    }



    public static void main(String[] args) {
        ProductInventory product = new ProductInventory("Iphone", 1000, 10);
        product.ProductDetails();
        product.addStock(12);
        product.removeStock(2);
        product.ProductDetails();
    }
    }

