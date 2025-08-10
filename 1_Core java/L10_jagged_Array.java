public class L10_jagged_Array {
    public static void main(String[] args) {
//        int nums[][]=new int[3][];
//        nums[0]=new int[3];
//        nums[1]=new int[4];
//        nums[2]=new int[2];
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//                nums[i][j]=(int)(Math.random()*10);
//            }
//        }for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//                System.out.print(nums[i][j]);
//            }
//            System.out.println();
//        }

        //-----------------3D_Array-------------


        int num3[][][]=new int[5][3][4];
        for(int i=0;i<num3.length;i++){
            for(int j=0;j<num3[i].length;j++){
                for(int k=0;k<num3[i][j].length;k++){
                    num3[i][j][k]=(int)(Math.random()*10);
                }
            }
        }for(int i=0;i<num3.length;i++){
            for(int j=0;j<num3[i].length;j++){
                for(int k=0;k<num3[i][j].length;k++){
                    System.out.print(num3[i][j][k]+"  ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
