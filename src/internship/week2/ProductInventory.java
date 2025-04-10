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

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setNameString (String name) {
        this.name= name;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

        public void ProductDetails() {
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
        }

    public static void main(String[] args) {
        ProductInventory product = new ProductInventory("Iphone", 1000, 10);
        product.ProductDetails();
        product.addStock(30);
        product.removeStock(30);
        product.ProductDetails();
    }
    }

