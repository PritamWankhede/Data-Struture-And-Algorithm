package BinarySearchProblems;

public class FindElementInSortedArray{
    public static int ElementInSortedArray(int[] arr, int k){
          int start = 0;
          int end = arr.length - 1;
          while(start <= end){
              int mid = start + (end-start)/2;

              if(arr[mid] == k){
                  return mid;
              } else if(arr[mid] < k) {
                  start = mid + 1;
              }else{
                  end = mid - 1;
              }
          }
          return -1;
    }

    public static void main(String[] args){
        int[] arr = {7,8,9,10,11,12,13,14};
        int k=9;
        System.out.println(ElementInSortedArray(arr,k));
    }
}