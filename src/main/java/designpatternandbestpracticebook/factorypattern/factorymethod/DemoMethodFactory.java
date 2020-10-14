package designpatternandbestpracticebook.factorypattern.factorymethod;

public class DemoMethodFactory {
    public static void main(String[] args) {
        VehicleMethodFactory carFactory = new CarFactory();
        carFactory.orderVehicle(VehicleSize.Large, VehicleColor.Black);
        VehicleMethodFactory truckFactory = new TruckFactory();
        truckFactory.orderVehicle(VehicleSize.Large, VehicleColor.Green);
        VehicleMethodFactory vehicleFactory = new VehicleMethodFactory() {
            @Override
            protected Vehicle createVehicle(VehicleSize size) {
                return null;
            }
        }
    }
}
