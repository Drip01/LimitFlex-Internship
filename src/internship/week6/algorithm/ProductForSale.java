package internship.week6.algorithm;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty) {
        return qty * price;
    }

    public void printPricedItem(int qty) {

        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",
                qty, price, description, type);
    }

    public abstract void showDetails();
}

class ArtObject extends ProductForSale {

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beautiful reproductive");
        System.out.printf("The price of the is $%6.2f %n", price);
        System.out.println(description);
    }
}
