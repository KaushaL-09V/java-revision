class MyException extends Exception{
    public MyException(String str) {
        super(str);
    }
}

public class L11_CustomException {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new MyException("I don't want to print 0 ");
            }
        }catch (MyException e){
            System.out.println("Arithmatic Exception"+e);
        }catch (Exception e){
            System.out.println("Exception occure");
        }
    }
}
