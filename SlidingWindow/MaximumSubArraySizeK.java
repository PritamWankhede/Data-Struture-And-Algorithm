// package SlidingWindow;
import java.util.*;

public class MaximumSubArraySizeK {
    public static int findMaximumSubArray(int[] arr, int k){
     int i=0;
     int j=0;
     int sum=0;
     int maxSum = Integer.MIN_VALUE;

     while(j<arr.length){
       sum += arr[j];

       if(j-i+1 <k){
        j++;
       }else if(j-i+1 == k){
         maxSum = Math.max(sum, maxSum);
         sum-=arr[i];
         i++;
         j++;
       }

     }

    return maxSum;
}
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,5,6,9,8,4};
        int k=3;
        System.out.println(findMaximumSubArray(arr,k));
    }
}
