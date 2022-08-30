package Medium.Medium_373;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/31
 * Time: 16:16
 * Description: No Description
 */
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Info> bigHeap = new PriorityQueue<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                Info info = new Info(nums1[i],nums2[j]);
                if (bigHeap.size() < k) {
                    bigHeap.add(info);
                }else if (info.sum <= bigHeap.element().sum){
                    bigHeap.remove();
                    bigHeap.add(info);
                }else break;
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        while(!bigHeap.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Info info = bigHeap.remove();
            list.add(info.num1);
            list.add(info.num2);
            ans.add(list);
        }
        List<List<Integer>> ans2 = new ArrayList<>();
        for (int i = ans.size()-1; i >= 0; i--) {
            ans2.add(ans.get(i));
        }
        return ans2;
    }
}
class Info implements Comparable<Info> {
    int num1;
    int num2;
    int sum;
    public Info(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = num1+num2;
    }

    @Override
    public int compareTo(Info o) {
        return o.sum-this.sum;
    }
}