import java.util.Scanner;

enum Laptop{
    Macbook(2000),
    Xps(2200),
    Thickpad,
    Surface(1800);

    private int price;

    private Laptop() {
        System.out.println("In Private laptop"+this.name());
        price=1200;
    }

    Laptop(int price) {
        this.price = price;
        System.out.println("In Default laptop"+this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class L3_EnumClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Laptop l=Laptop.Macbook;
//        System.out.println(l);
//        System.out.println(l.getPrice());

        for(Laptop lap:Laptop.values()){
//            System.out.println("Enter the Price of "+lap.name());
//            lap.setPrice(sc.nextInt());
            System.out.println(lap+" : "+lap.getPrice());
        }

    }
}
