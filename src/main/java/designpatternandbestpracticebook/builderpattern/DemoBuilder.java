package designpatternandbestpracticebook.builderpattern;

public class DemoBuilder {
    public static void main(String[] args) {
        Vehicle becak = new Vehicle.VehicleBuilder()
                .setColor("Red")
                .setWheel(3)
                .setName("Becak")
                .build();
        System.out.println(becak.toString());

        Vehicle car = new Vehicle.VehicleBuilder()
                .setColor("White")
                .setName("Car")
                .setWheel(4)
                .setEngine("Electric")
                .build();

        System.out.println(car.toString());
    }
}
