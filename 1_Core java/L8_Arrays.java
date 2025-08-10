import java.util.Scanner;
public class L8_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//  -----------1st typ to define the array------------
//        int inum[]={12,23,43,5,6,8,23};
//        float fnum[]={12.0f,23.4f,23.6f};
//        System.out.println(inum[2]);
//        inum[2]=23;
//        System.out.println(inum[2]);


//-----------2nd type to define the array------------
        int numi[]=new int[4];          //Once we creat and set length by default it contain 0 values
//        System.out.println(numi[2]);
//        numi[1]=34;
//        numi[3]=12;
//        System.out.println(numi[3]);

        System.out.println("Enter the vlaue of the array:");
        for(int i=0;i<numi.length;i++){
            numi[i]=sc.nextInt();
        }for(int i=0;i<numi.length;i++){
            System.out.print(numi[i]+" ");
        }

        for(int i:numi){
            System.out.println(i);
        }
    }
}
