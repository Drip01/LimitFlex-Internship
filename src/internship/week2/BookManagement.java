package internship.week2;

public class BookManagement{
    String title;
    String author;
    double price;

    public BookManagement(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void BookDetails() {
        System.out.println("Title: " + title + " | Author: " + author + " | Price: " + price);
    }

    public void ApplyDiscount(double discountPercentage){
        if( discountPercentage >= 0 && discountPercentage < 100){
            price -= (price * discountPercentage / 100);
            System.out.println("Discount Applied: " + "$" + price);
        } else {
            System.out.println("Invalid internship.account.Account ");
        }
    }

    public static void main(String[] args){
        BookManagement book = new BookManagement("Ali goes to school", "Mr Drip", 600);
        book.BookDetails();
        book.ApplyDiscount(1000);
    }
}

