class substraction{
    int result=12;
    public int sub(int a,int b){
        System.out.println(result);
        return a-b;
    }

}


public class L7_TypeOfVariable {
    public static void main(String[] args) {
        substraction sbsr=new substraction();
        sbsr.result=100;
        System.out.println(sbsr.sub(23,12));
        System.out.println(sbsr.sub(23,12));
    }
}
