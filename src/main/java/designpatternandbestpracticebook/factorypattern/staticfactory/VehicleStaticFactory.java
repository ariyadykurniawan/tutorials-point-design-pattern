package designpatternandbestpracticebook.factorypattern.staticfactory;

public class VehicleStaticFactory {
    public Vehicle createVehicle(VehicleType type){
        if(type.equals(VehicleType.Bike))
            return new Bike();
        if(type.equals(VehicleType.Car))
            return new Car();
        else return null;
    }
}
