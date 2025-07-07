public class violatessrp {

    // This class does too much: data, printing, and saving
    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void printDetails() {
            System.out.println("Title: " + title + ", Author: " + author);
        }

        public void saveToFile() {
            System.out.println("Saving book '" + title + "' to file.");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");

        book.printDetails();
        book.saveToFile();
    }
}
