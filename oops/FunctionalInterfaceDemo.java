package oops;

// SAM - Single abstract method interface or functional interface
// Single method in an interface
@FunctionalInterface
interface FuncInterface   {
    void show();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        FuncInterface fi = new FuncInterface() {
            @Override
            public void show() {
                System.out.println("It's a legend show.");
            }
        };

        fi.show();
    }
}
