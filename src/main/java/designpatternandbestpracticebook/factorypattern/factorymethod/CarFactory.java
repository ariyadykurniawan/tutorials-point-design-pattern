package designpatternandbestpracticebook.factorypattern.factorymethod;

import designpatternandbestpracticebook.factorypattern.staticfactory.VehicleType;

public class CarFactory extends VehicleMethodFactory{
    @Override
    protected Vehicle createVehicle(VehicleSize size) {
        if(size.equals(VehicleSize.Small))
            return new HatchbackCar();
        if(size.equals(VehicleSize.Large))
            return new MpvCar();
        else return null;
    }
}
