public class L10_Exception_Throw {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("I don't want print 0");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Can't Divided By Zero :"+e);
        }
        catch(Exception e){
            System.out.println(e.getCause());
        }
        System.out.println(j);
        System.out.println("Ba Bay");
    }
}
