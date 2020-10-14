package creational.builderpattern;

public class MealBuilder {
    public Meal prepareChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Cola());
        return meal;
    }

    public Meal prepareBeefMeal(){
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
