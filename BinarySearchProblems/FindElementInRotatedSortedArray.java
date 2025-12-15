package BinarySearchProblems;

public class FindElementInRotatedSortedArray {
    public static int ElementInRotatedArray(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == k){
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                if (k >= arr[start] && k < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }  else {
                if (k > arr[mid] && k <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int k=1;
        System.out.println(ElementInRotatedArray(arr,k));
    }
}