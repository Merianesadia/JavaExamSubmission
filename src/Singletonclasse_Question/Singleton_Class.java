package Singletonclasse_Question;

public class Singleton_Class {


    static Singleton_Class obj = new Singleton_Class();

    private Singleton_Class(){

    }
    public static Singleton_Class getInstance(){
        return obj;
    }

    public static void demo(){
        System.out.println(" Hello");
    }
}
