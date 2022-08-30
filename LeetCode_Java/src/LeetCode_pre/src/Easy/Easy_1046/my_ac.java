package Easy.Easy_1046;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/2/1
 * Time: 13:50
 * Description: No Description
 */
public class my_ac {
}
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> bigHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < stones.length; i++) {
            bigHeap.add(stones[i]);
        }
        while (true){
            if (bigHeap.size() == 1){
                return bigHeap.remove();
            }
            int t1 = bigHeap.remove();
            int t2 = bigHeap.remove();
            bigHeap.add(Math.abs(t1-t2));
        }
    }
}