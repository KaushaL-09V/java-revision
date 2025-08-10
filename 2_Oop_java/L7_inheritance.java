public class L7_inheritance {
    public static void main(String[] args) {
        L7_3_Calc calc=new L7_3_Calc();
        int sum=calc.add(12,12);
        int sub=calc.sub(12,12);
        int mul=calc.mul(12,12);
        int div=calc.div(12,12);
        double power=calc.power(2,6);
        System.out.println(sum +" "+sub);
        System.out.println(mul +" "+div);
        System.out.println("Power: "+power);
    }
}
