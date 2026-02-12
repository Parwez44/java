import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    String isbn;
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    Book searchByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (Book b : books) {
            System.out.println("Title: " + b.title +
                    ", Author: " + b.author +
                    ", ISBN: " + b.isbn);
        }
    }
}

public class qn1 {

    public static void main(String[] args) {

        Library lib = new Library();

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("\n Library Menu ");
                System.out.println("1. Add Book");
                System.out.println("2. Search Book by Title");
                System.out.println("3. Display All Books");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        Book b = new Book();

                        System.out.print("Enter Title: ");
                        b.title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        b.author = sc.nextLine();

                        System.out.print("Enter ISBN: ");
                        b.isbn = sc.nextLine();

                        lib.addBook(b);
                        System.out.println("Book Added Successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Title to Search: ");
                        String searchTitle = sc.nextLine();

                        Book result = lib.searchByTitle(searchTitle);

                        if (result != null) {
                            System.out.println("Book Found:");
                            System.out.println(result.title + ", " +
                                    result.author + ", " +
                                    result.isbn);
                        } else {
                            System.out.println("Book Not Found.");
                        }
                        break;

                    case 3:
                        lib.displayAllBooks();
                        break;

                    case 4:
                        System.out.println("Exiting Program...");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 4);
        }
    }
}
