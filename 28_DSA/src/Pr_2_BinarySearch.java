

public class Pr_2_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8};

        int target = 5;

        int result = binarySearch(arr,target);

        System.out.println(result!=-1?("Element found at index "+result):"Element not found");
    }

    public static int binarySearch(int arr[],int target){
        int left=0;
        int right=arr.length;

        while (left<=right){
            int mid=(left+right)/2;

            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
