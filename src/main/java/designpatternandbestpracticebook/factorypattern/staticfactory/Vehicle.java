package designpatternandbestpracticebook.factorypattern.staticfactory;

public class Vehicle {
    String name;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void createVehicle(){
        System.out.println("create Vehicle "+getName());
    }
}
