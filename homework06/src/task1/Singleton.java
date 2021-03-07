package task1;

public class Singleton {
    private static Singleton uniqueInstance; //a private static field containing a single object

    private Singleton() {
    } // constructor(private),it will not be able to return new objects

    static Singleton getInstance() { // declare the static creating method that will be used to get the singleton
        if (uniqueInstance == null) { // if the object is not yet created
            uniqueInstance = new Singleton(); // create a new object
        }
        return uniqueInstance; // return a previously created object
    }
}
