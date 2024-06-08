package oops;

enum PLaptop   {
    Dell(20_000), HP(40_000), Realme, Asus(30_000), Acer(50_000);

    private int price;

    private PLaptop()   {
        System.out.println("In Laptop "+ this.name());
        price = 20000;
    }

    private PLaptop(int price)  {
        this.price = price;
        System.out.println("In Laptop " + name() + ", price: " + price);
    }

    public int getprice()   {
        return price;
    }

    public void setPrice(int price)   {
        this.price = price;
    }
}

public class EnumClass2 {
    public static void main(String[] args) {
        PLaptop l1 = PLaptop.Acer;
        System.out.println(l1.getprice());

        l1.setPrice(60_000);
        System.out.println(l1 + " : " + l1.getprice());
    }
}
