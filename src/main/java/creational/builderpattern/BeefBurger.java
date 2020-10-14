package creational.builderpattern;

public class BeefBurger extends Burger{
    @Override
    public String name() {
        return "Beef Burger";
    }

    @Override
    public Integer price() {
        return 25000;
    }
}
