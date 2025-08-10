import java.util.Scanner;
public class L9_multidimentionalArray {
    public static void main(String[] args) {
        int nums[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
//                nums[i][j]=(int)(Math.random()*100);
                nums[i][j]=(int)(Math.random()*10);
            }
        }
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//                System.out.print(nums[i][j]+"  ");
//            }
//            System.out.println();
//        }


        for(int n[]:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
