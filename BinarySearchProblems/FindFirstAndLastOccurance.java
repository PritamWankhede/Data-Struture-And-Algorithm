package BinarySearchProblems;

public class FindFirstAndLastOccurance {
    public static int FirstOccurace(int[] arr){
       int start = 0;
       int end = arr.length - 1;
       int target = 5;
       int result = -1;
       while(start <= end){
         int mid = start + (end-start)/2;
         
         if(arr[mid] == target){
            result = mid;
             end = mid - 1;
         }else if(target > arr[mid]){
            start = mid + 1;
         }else{
             end = mid -1;
         }
       }
      return result;
    }
     public static int LastOccurace(int[] arr){
       int start = 0;
       int end = arr.length - 1;
       int target = 5;
       int result = -1;
       while(start <= end){
         int mid = start + (end-start)/2;
         
         if(arr[mid] == target){
            result = mid;
             start = mid + 1;
         }else if(target > arr[mid]){
            start = mid + 1;
         }else{
             end = mid -1;
         }
       }
      return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,5,5,6,7,8,9};
       // System.out.println(FirstOccurace(arr));
        System.out.println(LastOccurace(arr));
    }
}
