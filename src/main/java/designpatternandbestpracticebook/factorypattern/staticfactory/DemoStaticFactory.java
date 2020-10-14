package designpatternandbestpracticebook.factorypattern.staticfactory;

public class DemoStaticFactory {
    public static void main(String[] args) {
        VehicleStaticFactory vehicleStaticFactory = new VehicleStaticFactory();
        Vehicle bike = vehicleStaticFactory.createVehicle(VehicleType.Bike);
        Vehicle car = vehicleStaticFactory.createVehicle(VehicleType.Car);

        bike.createVehicle();
        car.createVehicle();
    }
}
