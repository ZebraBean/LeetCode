package Medium.Medium_373;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/2/1
 * Time: 0:25
 * Description: No Description
 */
public class ac_best {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (o1, o2)->{
            return nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]];
        });
        //我们放到优先队列里面的是数组下标对，排序的话还是小根堆
        List<List<Integer>> ans = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        // 优化：最多入队 k 个就可以了，因为提示中 k 的范围较小，这样可以提高效率，
        // 后面大的肯定不用比较了，答案就在前面这些小的地方，这里时间上就差了很多
        //这里i,0相当于分成了i层，刚开始的小
        for (int i = 0; i < Math.min(m, k); i++) {
            pq.offer(new int[]{i,0});
        }
        // 最多弹出 k 次
        while (k-- > 0 && !pq.isEmpty()) {
            int[] idxPair = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[idxPair[0]]);
            list.add(nums2[idxPair[1]]);
            ans.add(list);
            // 将 index2 加 1 之后继续入队
            //每次入队的都是当前未入堆的最小的元素，然后自动和堆里面剩下的元素比较，把最小的放在堆顶供使用
            if (idxPair[1] + 1 < n) {
                pq.offer(new int[]{idxPair[0], idxPair[1] + 1});
            }
        }

        return ans;
    }
}




//作者：LeetCode-Solution
//        链接：https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/solution/cha-zhao-he-zui-xiao-de-kdui-shu-zi-by-l-z526/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。