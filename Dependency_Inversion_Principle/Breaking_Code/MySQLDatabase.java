// This is the code snippet that violates the D — ependency Inversion Principle  
// Here, Application directly depends on a concrete class
// And so, to use a different database, we would have to modify the Application class.

class MySQLDatabase {
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}

class Application {
    private MySQLDatabase database;

    public Application() {
        this.database = new MySQLDatabase();  // tightly coupled to MySQL
    }

    public void start() {
        database.connect();
    }
}
