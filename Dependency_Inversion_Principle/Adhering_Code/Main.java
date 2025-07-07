public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase(); // or new PostgreSQLDatabase();
        Application app = new Application(db);
        app.start();
    }
}
