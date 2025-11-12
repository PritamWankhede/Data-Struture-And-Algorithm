import java.util.*;

public class KthSmallestElement {
    public static int findKthSmallest(int[] arr, int k){
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
      
      for(int num : arr){
         maxHeap.add(num);
         if(maxHeap.size() > k){
            maxHeap.poll();
         }
      }
        return maxHeap.poll();
    }


    public static void main(String[] args) {
        int[] arr = {8,6,5,4,2,6,7,10,5,6,7,8,9,5,4,6,2,3,20};
        int k=4;
        System.out.print(findKthSmallest(arr,k));
    }
}
