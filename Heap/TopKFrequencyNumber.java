import java.util.*;

public class TopKFrequencyNumber {

   public static List<Integer> FindTopKFrequencyNumber(int[] arr, int k){
     HashMap<Integer,Integer> map = new HashMap<>();

     for(int num : arr){
        map.put(num, map.getOrDefault(num, 0)+1);
     }

      PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        minHeap.offer(entry);
        if(minHeap.size() > k){
            minHeap.poll();
        }
     }

      List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

       Collections.reverse(result);
        return result;
   }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,7,4,5,8,4,2,3,1,4,5,6,7,9};
        int k=3;
        System.out.println(FindTopKFrequencyNumber(arr,k));
    }
}
