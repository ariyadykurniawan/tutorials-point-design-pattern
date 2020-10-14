package designpatternandbestpracticebook.builderpattern;

public class Vehicle {
    private String name;
    private String color;
    private Integer wheel;
    private String engine;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getWheel() {
        return wheel;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "{'name' : " +"'" + getName() + "',"+
                "'color' : "+ "'"+ getColor() + "',"+
                "'wheel' : "+ "'" + getWheel() + "',"+
                "'enginee' : "+ "'" + getEngine() + "'"+
                "}";
    }

    public static class VehicleBuilder{
        private String name;
        private String color;
        private Integer wheel;
        private String engine;

        public VehicleBuilder setName(String name){
            this.name = name;
            return this;
        }

        public VehicleBuilder setColor(String color){
            this.color = color;
            return this;
        }

        public VehicleBuilder setWheel(Integer wheel){
            this.wheel = wheel;
            return this;
        }

        public VehicleBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public Vehicle build(){
            Vehicle vehicle = new Vehicle();
            vehicle.name = this.name;
            vehicle.color = this.color;
            vehicle.engine = this.engine;
            vehicle.wheel = this.wheel;
            return vehicle;
        }
    }
}
