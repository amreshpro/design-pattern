
class Singleton {

    private static volatile Singleton instance;
    private String data;

    // make private constructor so that no one call from outside
    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = Singleton.instance;
                // to prevent access of two thread at same time we wrap it inside synchronize block
                if (result == null) {   // but now , even if the instance was created , every thread has to wait before returning it. So to fix this use double check
                    result = instance = new Singleton(data);
                }
            }
        }
        return result;
    }
}

public class SingletonPattern {

    public static void main(String[] args) {
        System.out.println("SingletonPattern");
        // Singleton singleton = new SingletonPattern();error
        Singleton singleton = Singleton.getInstance("Amresh");

    }
}
