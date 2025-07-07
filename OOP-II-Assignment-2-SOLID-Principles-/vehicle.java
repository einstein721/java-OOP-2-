//Violates the Liskov Substitution Principle, because the subclass bicycle does not have an engine so it is not usable in place of its parent class without causing errors or unexpected behavior.

public class vehicle {
    public Boolean hasEngine(){
        return true;
    }
    public Integer numberOfWheels(){
        return 2;
    }
}


public class Car extends vehicle {
    @Override
    public Integer numberOfWheels(){
        return 4;
    }

}

public class Bicycle extends vehicle{
    public Boolean hasEngine(){
        return null;
    }
}

public static void main(String[] args) {
}