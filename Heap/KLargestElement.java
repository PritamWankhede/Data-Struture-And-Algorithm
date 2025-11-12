import java.util.*;

public class KLargestElement {
    public static List<Integer> findKlargestElement(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       
        for(int num : arr){
            minHeap.add(num);
          if(minHeap.size() > k){
             minHeap.poll();
          }  
        }
      
       List<Integer> list = new ArrayList<>(minHeap);
       list.sort(Collections.reverseOrder());
       return list;
    }

   public static void main(String[] args) {
        int[] arr = {1,5,8,9,6,5,4,1,2,3,1,0,5,10};
        int k=3;
        System.out.println(findKlargestElement(arr,k));
    }
}
