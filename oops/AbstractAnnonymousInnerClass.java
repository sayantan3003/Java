package oops;

abstract class AAICImplementation   {
    abstract void show();
}

public class AbstractAnnonymousInnerClass {
    public static void main(String[] args) {
        // Abstract annonymous inner class
        AAICImplementation obj = new AAICImplementation() {
            @Override
            void show()   {
                System.out.println("Implementing abstract annonymous inner class.");
            }
        };

        obj.show();
    }
}
