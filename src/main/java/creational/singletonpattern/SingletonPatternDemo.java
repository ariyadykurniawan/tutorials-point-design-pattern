package creational.singletonpattern;

/*This pattern involves a single class which is responsible to create an object
while making sure that only single object gets created. This class provides a way to
access its only object which can be accessed directly without need to instantiate the object of the class.*/

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        SingletonObject object = SingletonObject.getInstance();

        //test object has been create
        SingletonObject object1 = SingletonObject.getInstance();

    }
}
