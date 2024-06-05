package oops;

/**
 * We are using interfaces for loosely coupled things
 * Interface is not class
 * By default, every methods in interface is <public abstract>
 * In which class you are implementing interface, you have to give all method definations otherwise it becomes an abstract class
 */

 // Instead of <abstract class Computer> and extending it in child class.
 // Remember: we can extend only one class but implement multiple interfaces
interface Computer   {
    // By default all variables inside interface are 
    // final and static
    String os = "Windows 11";
    int memoryInGB = 16;

    void code();
}

class Laptop implements Computer   {
    @Override
    public void code() {
        System.out.println("Coding in Laptop.");
    }
}

class Desktop implements Computer   {
    @Override
    public void code() {
        System.out.println("Coding in Desktop.");
    }
}

class Developer   {
    void buildingApp(Computer comp)   {
        comp.code();
    }
}

public class Interface {
    public static void main(String[] args) {
        Developer dev1 = new Developer();

        // Now we can pass both Laptop and Desktop object
        dev1.buildingApp(new Laptop());
        dev1.buildingApp(new Desktop());

        System.out.println(Laptop.os);
        System.out.println(Desktop.memoryInGB);
    }
}
