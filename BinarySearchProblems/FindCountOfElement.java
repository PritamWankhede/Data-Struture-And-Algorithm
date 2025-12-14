package BinarySearchProblems;

public class FindCountOfElement {
    public static int CountElement(int[] arr,int target){
       int first = firstOccurance(arr,target);
       int last = lastOccurance(arr, target);
       int result = last - first + 1;
       return result;
    }

    public static int firstOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
               ans = mid;
               start = mid + 1;
            }else if(arr[start] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,3,3,3,4,5};
        int target = 3;
        System.out.println(CountElement(arr, target));
    }
}
