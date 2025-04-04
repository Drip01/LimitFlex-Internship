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
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void applyDiscount(double discountPercentage){
        if(discountPercentage >= 0 && discountPercentage < 100){
            price -= (price * discountPercentage / 100);
            System.out.println("Discount Applied: " + "$" + price);
        } else {
            System.out.println("Invalid Account ");
        }
    }
    public void BookDetails(){
        System.out.println("Title " + title);
        System.out.println("Author " + author);
        System.out.println("Price $" + price);
    }
    public static void main(String[] args){
        BookManagement book = new BookManagement("Ali goes to school", "Mr Drip", 600);
        book.BookDetails();
        book.applyDiscount(50);
    }
}

