package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductExceptSelf {
      public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int n = nums.length;
        arr[0] = 1;
      
        for(int i=1; i<n ; i++){
            arr[i] = arr[i-1] * nums[i-1];
        }

       int right = 1;
       for (int i = n - 1; i >= 0; i--) {
        arr[i] = arr[i] * right;
        right = right * nums[i];
     }
      return arr;
    }


    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int[] res = productExceptSelf(arr);
        System.out.print(Arrays.toString(res));
    }
}
