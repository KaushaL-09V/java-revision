import java.security.PrivateKey;
import java.util.Objects;

class Laptop{
    String model;
    int price;

    public String toString(){
//        return "Hey";

        return model+" :"+price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}


public class L12_ObjectClassEqualstoStringhashcode {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.model="MacBook";
        obj.price=1000;
        Laptop obj2=new Laptop();
        obj2.model="MacBook";
        obj2.price=1000;


        System.out.println(obj.toString());
        System.out.println(obj.equals(obj2));
    }
}
