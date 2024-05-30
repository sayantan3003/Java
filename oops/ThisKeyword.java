package oops;

class BonManus   {
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
    void setName(String name, BonManus obj)   {
        // name here is a local variable, preference is given to local variable
        // name = name;
        obj.name = name;
    }

    void setName(String name)   {
        this.name = name;
    }

    // this -> refers to current object
    void setAge(int age)    {
        this.age = age;
    }

    // Instance methods
    void show()   {
        System.out.println(this.name + " : " + age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        BonManus hu1 = new BonManus();
        // This is not the correct way
        hu1.setName("Sayantan", hu1);
        hu1.setAge(25);

        hu1.show();

        hu1.setName("Das");

        hu1.show();
    }
}
