// Follows the Liskov Substitution Principle by making the parent class generic and having the subclass divided into two categories, now only engine-capable vehicles get passed to code that calls hasEngine().

public class vehicle2 {
    public Integer numberOfWheels(){
        return 2;
    }
}
public class EngineVehicle extends vehicle2{
    public Boolean hasEngine(){
        return true;
    }

}

public class Car extends EngineVehicle {
    @Override
    public Integer numberOfWheels(){
        return 4;
    }
    public Boolean hasEngine(){
        return true;
    }

}

public class Bicycle extends vehicle2{
}

public static void main(String[] args) {
}
    

