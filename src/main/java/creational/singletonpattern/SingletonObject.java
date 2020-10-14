package creational.singletonpattern;

public class SingletonObject {
    private static SingletonObject instance;

    private SingletonObject(){
    }

    public static SingletonObject getInstance(){
        if(instance == null){
            showInitializingObjectMessage();
            synchronized (SingletonObject.class){
                if(instance == null){
                    instance = new SingletonObject();
                }
            }
        }else{
            showExistObjectMessage();
        }
        return instance;
    }

    public static void showInitializingObjectMessage(){
        System.out.println("initializing a singleton object");
    }

    public static void showExistObjectMessage(){
        System.out.println("Object already created");
    }
}
