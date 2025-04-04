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

    public void borrowing() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed " + title + author + ".");
        } else {
            System.out.println(title + " " + author + "is not available");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned " + title + " " + author + " ");
        }
        else {
            System.out.println(title + " " + author + "Is now available");
        }
    }
    public void displayBook () {
        Book book = new Book("Ali goes to school", "Drip");
        System.out.println("Title: " + title + " | Author: " + author + " | Available: " + (isAvailable ? "yes" : "no"));
        book.borrowing();
        book.returnBook();
        book.displayBook();
    }
}


