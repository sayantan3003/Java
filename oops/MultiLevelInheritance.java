package oops;

// Multi level Inheritance Calculator -> ScientificCalculator -> AdvCalc
class AdvCalc  extends ScientificCalculator {
    int pow(int base, int pow)   {
        return (int) Math.pow(base, pow);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj1.add(12, 5) + " " + obj1.mul(9, 6) + " " + obj1.pow(3, 4));
    }
}
