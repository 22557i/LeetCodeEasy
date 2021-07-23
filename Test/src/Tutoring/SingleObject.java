package Tutoring;

public class SingleObject {
    //Singleton design pattern单例模式
    private static SingleObject instance;
    private SingleObject(){

    }
    public static synchronized SingleObject getInstance(){
        if(instance==null)
            instance = new SingleObject();
        return instance;
    }
}
