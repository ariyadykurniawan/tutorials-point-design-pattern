package creational.builderpattern;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Integer price() {
        return 20000;
    }
}
