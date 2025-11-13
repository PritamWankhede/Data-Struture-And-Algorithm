import java.util.*;
public class SortKSortedArray {
   
    public static List<Integer> sortArray(int[] arr,int k){
       List<Integer> list = new ArrayList<>();
       PriorityQueue<Integer> minHeap = new PriorityQueue<>();

       for(int num : arr){
         minHeap.add(num);

         if(minHeap.size() > k){
            list.add(minHeap.poll());
         }
       }

       while(!minHeap.isEmpty()){
        list.add(minHeap.poll());
       }

        return list;
    }

    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,7,8};
         int k=4;
         System.out.println(sortArray(arr,k));
    }
}
