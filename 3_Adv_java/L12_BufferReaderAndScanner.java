import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class L12_BufferReaderAndScanner {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
//        int num=System.in.read();           //Gives Ascii Value(0-255) {a->97}    //Throw IOException
//        System.out.println(num-48);

//        InputStreamReader in=new InputStreamReader(System.in);
//        BufferedReader bf=new BufferedReader(in);
//        int num=Integer.parseInt(bf.readLine());
//        System.out.println(num);
//        bf.close();

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
    }
}