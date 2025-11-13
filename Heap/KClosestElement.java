import java.util.*;

public class KClosestElement {
    static class Pair {
        int diff;
        int value;

        Pair(int diff, int value) {
            this.diff = diff;
            this.value = value;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = buildMaxHeap(arr, k, x);

        List<Integer> list = new ArrayList<>();
        for (Pair p : maxHeap) {
            list.add(p.value);
        }

        Collections.sort(list);
        return list;
    }

    private PriorityQueue<Pair> buildMaxHeap(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
            (a, b) -> a.diff == b.diff ? b.value - a.value : b.diff - a.diff
        );

        for (int num : arr) {
            int diff = Math.abs(num - x);
            maxHeap.offer(new Pair(diff, num));

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap;
    }

    public static void main(String[] args) {
        KClosestElement obj = new KClosestElement();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        System.out.println(obj.findClosestElements(arr, k, x));
    }
}
