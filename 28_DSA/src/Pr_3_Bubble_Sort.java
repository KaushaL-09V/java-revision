public class Pr_3_Bubble_Sort {
    public static void main(String[] args) {
        int arr[]= {8,6,9,2,4,5};

        int arr2[] = bubbleSort(arr);

        for(int i:arr2){
            System.out.print(i+" ");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
