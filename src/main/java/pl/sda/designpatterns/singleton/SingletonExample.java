package pl.sda.designpatterns.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();
        System.out.println("Ta sama instancja eager: " + (eagerInitializedSingleton1 == eagerInitializedSingleton2));

        LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();
        System.out.println("Ta sama instancja lazy: " + (lazyInitializedSingleton1 == lazyInitializedSingleton2));

        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println("Ta sama instancja thread-safe: " + (threadSafeSingleton1 == threadSafeSingleton2));
    }
}
