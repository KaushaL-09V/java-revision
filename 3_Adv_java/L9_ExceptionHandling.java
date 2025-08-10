public class L9_ExceptionHandling {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        String str=null;
        int arr[]=new int[5];
        try{
            i=j/i;
            System.out.println(str.length());
//            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Something Went Wrong Cant't "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException :"+e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println("Bye");
    }
}
