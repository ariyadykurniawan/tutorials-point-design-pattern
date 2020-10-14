package designpatternandbestpracticebook.factorypattern.factorymethod;

public class TruckFactory extends VehicleMethodFactory{

    @Override
    protected Vehicle createVehicle(VehicleSize size) {
        return new Truck();
    }
}
