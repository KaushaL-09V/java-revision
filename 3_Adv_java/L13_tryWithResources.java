//Try can be use woth finally if no catch block

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L13_tryWithResources {
    public static void main(String[] args) throws IOException {



//--------------------------Try with catch and Finally-----------------------
//        int i=0;
//        int j=0;
//
//        try{
//            j=18/i;
////            System.out.println("Bye");
//        }
////        catch (Exception e){
////            System.out.println("Something went wrong");
//////            System.out.println("Bye");
////        }
//        finally {
//            System.out.println("Bye");
//        }


//------------------------Try with only finally-----------------------
//        int num=0;
//        BufferedReader br=null;
//        try {
////            InputStreamReader in=new InputStreamReader(System.in);
//            br=new BufferedReader(new InputStreamReader(System.in));
//            num=Integer.parseInt(br.readLine());
//            System.out.println(num);
//
//        }
//        finally {
//            br.close();
//        }

//-----------------Try With Resources--------------
        int num=0;
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            num=Integer.parseInt(br.readLine());
            System.out.println(num);

        }
    }
}
