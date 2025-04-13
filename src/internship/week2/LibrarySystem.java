package internship.week2;

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public void displayBook () {
        System.out.println("Title: " + title + " | Author: " + author + " | Available: " + (isAvailable ? "yes" : "no"));
    }

    public void borrowing() {
        if (isAvailable) {
            System.out.println("You have borrowed " + title + author + ".");
            isAvailable = false;
        } else {
            System.out.println(title + " " + author + " is not available");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            System.out.println("You have returned " + title + " " + author + " ");
            isAvailable = true;
        }else {
            System.out.println(title + " " + author + " is now available");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Ali goes to school", " by Drip");
        book.displayBook();
        book.borrowing();
        book.displayBook();
        book.borrowing();
        book.borrowing();
        book.borrowing();
        book.borrowing();
        book.displayBook();
        book.returnBook();
        book.returnBook();
        book.returnBook();
        book.borrowing();
        book.borrowing();

    }
}


