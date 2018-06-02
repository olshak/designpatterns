package pl.sda.designpatterns.singleton;

public class DoubleCheckedThreadSafeSingleton {

    private static volatile DoubleCheckedThreadSafeSingleton instance;

    private DoubleCheckedThreadSafeSingleton() {
    }

    public static DoubleCheckedThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

}