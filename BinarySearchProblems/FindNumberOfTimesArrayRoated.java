package BinarySearchProblems;

public class FindNumberOfTimesArrayRoated {
    public static int RotatedArray(int[] arr){
      int start = 0;
      int end = arr.length - 1;

      while(start <= end) {
       if(arr[start] <= arr[end]){
           return start;
       }

       int mid = start + (end - start)/2;
       int next = (mid + 1) % arr.length;
       int prev = (mid - 1 + arr.length) % arr.length;

        if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
            return mid;
        }

        if(arr[mid] >=  arr[start]){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
      }
      return -1;
    }

    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,1,2,3,4,5};
        System.out.println(RotatedArray(arr));
    }
}


