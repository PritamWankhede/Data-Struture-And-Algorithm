import java.util.*;

public class FrequencySort {
    public static List<Map.Entry<Integer, Integer>>  findFrequencySort(int[] arr){
      Map<Integer,Integer> map = new HashMap<>();

      for(int num : arr){
        map.put(num, map.getOrDefault(num,0)+1);
      }

      PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(
        (a,b) -> a.getValue() - b.getValue()
      );
  
     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        minHeap.offer(entry);
     }

      List<Map.Entry<Integer,Integer>> result = new ArrayList<>(minHeap);
      
      result.sort((a,b) -> b.getValue() - a.getValue());

      return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2,3,4,5,5,5,5,4,8};
        System.out.print(findFrequencySort(arr));
    }
}