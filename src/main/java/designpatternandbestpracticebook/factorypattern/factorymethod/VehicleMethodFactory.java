package designpatternandbestpracticebook.factorypattern.factorymethod;

import designpatternandbestpracticebook.factorypattern.staticfactory.VehicleType;

public abstract class VehicleMethodFactory {
    protected abstract Vehicle createVehicle(VehicleSize size);
    public Vehicle orderVehicle(VehicleSize size, VehicleColor color){
        Vehicle vehicle = createVehicle(size);
        vehicle.setColor(color);
        vehicle.testVehicle();

        return vehicle;

    }
}
