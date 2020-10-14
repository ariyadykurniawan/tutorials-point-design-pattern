package designpatternandbestpracticebook.factorypattern.factorymethod;

public class Vehicle {
    String name;
    VehicleColor color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleColor getColor() {
        return color;
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }

    public void testVehicle(){
        System.out.println("create Vehicle "+getName() +" with color "+getColor());
    }
}
