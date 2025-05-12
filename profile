abstract public class Profile {

    protected int accountId;
    protected String accountHolder;
    private OperationHandler operationData;

    public void executeTask(OperationHandler newTask) {
        operationData = newTask;
        recordTaskLog(newTask);
        operationData.runAction();
    }

    public void displayAccountInfo() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + accountHolder);
    }

    protected void recordTaskLog(OperationHandler task) {
        System.out.println("Task " + task.getClass().getSimpleName() + " is being executed.");
    }
}


public class Administrator extends Profile {

    private String secureKey;

    public Administrator(int id, String holder, String key) {
        accountId = id;
        accountHolder = holder;
        secureKey = key;
    }

    public void updateSecureKey(String newKey) {
        secureKey = newKey;
        System.out.println("Admin secure key has been successfully updated.");
    }
}


public interface OperationHandler {
    public void runAction();
}


public class RemoveData implements OperationHandler {

    @Override
    public void runAction() {
        System.out.println("Record successfully removed.");
    }
}


public class ProgramLauncher {

    public static void main(String[] args) {
        Administrator currentAdmin = new Administrator(9001, "Rebecca", "admin@2025!");
        Client currentClient = new Client(7823, "Michael");

        currentAdmin.executeTask(new ModifyData());
        currentClient.executeTask(new DisplayData());

        currentAdmin.displayAccountInfo();
        currentClient.displayAccountInfo();

        currentAdmin.updateSecureKey("newSecure@2025!");
        currentClient.modifyUserName("Mike");

        currentAdmin.executeTask(new PrintReport());
    }
}


public class ModifyData implements OperationHandler {

    @Override
    public void runAction() {
        System.out.println("Information updated correctly.");
    }
}


public class Client extends Profile {

    public Client(int id, String holder) {
        accountId = id;
        accountHolder = holder;
    }

    public void modifyUserName(String newName) {
        accountHolder = newName;
        System.out.println("User name has been changed to: " + accountHolder);
    }
}


public class DisplayData implements OperationHandler {

    @Override
    public void runAction() {
        System.out.println("Displaying current records.");
    }
}


public class PrintReport implements OperationHandler {

    @Override
    public void runAction() {
        System.out.println("Printing data report...");
    }
}
