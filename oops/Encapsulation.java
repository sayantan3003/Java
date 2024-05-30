package oops;

// Here variables and methods are binding to each other
// This is the example of encapsulation
class HomoSapience   {
    private String name;
    private int age;

    // Getters
    String getName()    {
        return name;
    }

    int getAge()   {
        return age;
    }

    // Setters
    void setName(String name)   {
        this.name = name;
    }

    void setAge(int age)    {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        HomoSapience hu1 = new HomoSapience();
        hu1.setName("Sayantan");
        hu1.setAge(25);

        System.out.println(hu1.getName() + " : " + hu1.getAge());
    }
}
