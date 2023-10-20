public class Singleton {
    private static volatile Singleton instance;
    private static String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (instance == null) {                     // to reduce the overhead of synchronized block
            synchronized (Singleton.class) {        // to make it thread-safe
                if (instance == null) {             // if no instance has been set
                    instance = new Singleton(data); // create a new instance
                }
            }
        }
        return instance;   // return the created instance
    }


    /*********************************************************************************
     * simpler constructor
         public static Singleton getInstance() {
            if (instance == null) {             // if no instance has been set
                instance = new Singleton(data); // create a new instance
            }
            return instance;   // return instance
        }
     **********************************************************************************/

    public synchronized String getData() {
        return data;
    }

    public synchronized void setData(String data) {
        Singleton.data = data;
    }
}
