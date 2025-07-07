// This is the code snippet that follows the D — ependency Inversion Principle
// Here, Application depends on the Database interface, not a specific implementation.
// Sp, you can swap implementations without changing the high-level code.

interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to My Database");
    }
}

class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}

class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}

