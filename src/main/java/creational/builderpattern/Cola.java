package creational.builderpattern;

public class Cola extends ColdDrink{
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public Integer price() {
        return 7000;
    }
}
