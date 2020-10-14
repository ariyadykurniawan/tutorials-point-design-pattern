package creational.builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal beefMeal = mealBuilder.prepareBeefMeal();
        System.out.println("Beef meal");
        beefMeal.showItem();
        System.out.println("Total Cost : "+ beefMeal.getCost());

        System.out.println();

        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("Chicken meal");
        chickenMeal.showItem();
        System.out.println("Total Cost : "+chickenMeal.getCost());

    }
}
