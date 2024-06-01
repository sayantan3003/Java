package oops;

class OuterClassForAnnonymousInnerClass   {
    void show()   {
        System.out.println("Inside show method in OuterClassForAnnonymousInnerClass.");
    }
}

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        OuterClassForAnnonymousInnerClass obj1 = new OuterClassForAnnonymousInnerClass();
        obj1.show();

        // This is Annonymous inner class
        OuterClassForAnnonymousInnerClass obj2 = new OuterClassForAnnonymousInnerClass()   {
            @Override
            void show()   {
                System.out.println("Annonymous inner class implementation.");
            }
        };

        obj2.show();
    }
}
