class Calculator{
    public int addition(int a,int b){
        return a+b;
    }
    public float addition(float a,float b){
        return a+b;
    }
    public  int addition(int a,int b,int c){
        return a+b+c;
    }
}

public class L6_Method_Overloading {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.addition(12,45));
        System.out.println(cal.addition(12.45f,45.2f));
        System.out.println(cal.addition(12,24,58));
    }
}
