package oops;

/**
 * Lambda expression can only be used wth functional interface
 * When calling a function/method by passing parameters, we can pass lambda expression also that means
 * Lambda expression as an argument
 */

@FunctionalInterface
interface Lambda   {
    public void show();
}

@FunctionalInterface
interface Lambda1   {
    public String dance();
}

@FunctionalInterface
interface Lambda2   {
    public String sing(String singer);
}

@FunctionalInterface
interface Lambda3   {
    public void walk(int steps);
}

@FunctionalInterface
interface Lambda4   {
    public void sleep(String name, int from);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Annonymous inner class
        Lambda l1 = new Lambda() {
            @Override
            public void show() {
                System.out.println("show method is implemented in annonymous inner class.");
            }
        };

        l1.show();


        // Lambda Expression -> take nothing, return nothing
        Lambda l2 = () -> System.out.println("show method is implemented in lambda expression.");

        l2.show();

        // Lambda Expression -> take nothing, return something
        Lambda1 l3 = () -> "Dancing like a cat";

        l3.dance();

        // Lambda Expression -> take something, return something
        Lambda2 l4 = singer -> singer + " is singing";

        l4.sing("Arijit");

        // Lambda Expression -> take something, return nothing
        Lambda3 l5 = steps -> System.out.println("Walk " + steps + " steps.");

        l5.walk(1000);

        // Multiple input, multi line, different name of i/p parameters from interface
        Lambda4 l6 = (n, f) -> {
            System.out.println(n + " is sleeping from "+ f + " PM.");
            System.out.println("He wakes up at " + (f + 6)%12 + " AM.");
        };

        l6.sleep("Ramesh", 10);
    }
}
