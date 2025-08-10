public class Pr_1_LinearSearch {

    public static void main(String[] args) {

        int arr[] = {2,4,5,6,7,8};

        int target = 10;

        int result = linearSearch(arr,target);

        System.out.println(result!=-1?("Element found at index "+result):"Element not found");

    }

    private static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
