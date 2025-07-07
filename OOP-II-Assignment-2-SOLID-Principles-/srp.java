public class srp {

    // Data class - holds book info
    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    // Printer class - handles displaying book details
    static class BookPrinter {
        public void print(Book book) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }

    // Saver class - handles saving book
    static class BookSaver {
        public void saveToFile(Book book) {
            System.out.println("Saving book '" + book.getTitle() + "' to file.");
        }
    }

    // Main method - entry point
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");

        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();

        printer.print(book);
        saver.saveToFile(book);
    }
}
