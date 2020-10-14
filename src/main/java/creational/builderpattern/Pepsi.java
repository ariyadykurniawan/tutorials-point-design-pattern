package creational.builderpattern;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Integer price() {
        return 7000;
    }
}
