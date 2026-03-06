import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book Class
class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public void display() {
        System.out.println("ISBN: " + isbn +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}

// Library Class
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.display();
        }
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                book.display();
            }
        }
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Success! Book borrowed.");
                } else {
                    System.out.println("Sorry, this book is currently checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

// Main Class
public class DigitalBookshelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Initialize 3 default books
        library.addBook(new Book("978-01", "Java Basics", "James Gosling"));
        library.addBook(new Book("978-02", "OOP Concepts", "Bjarne Stroustrup"));
        library.addBook(new Book("978-03", "Data Structures", "Mark Allen Weiss"));

        int choice;

        do {
            System.out.println("\n===== Digital Bookshelf Menu =====");
            System.out.println("1. View All Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    library.displayAllBooks();
                    break;

                case 2:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    library.borrowBook(isbn);
                    break;

                case 3:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}
