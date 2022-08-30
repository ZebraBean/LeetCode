package Medium.Medium_03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/18
 * Time: 0:12
 * Description: No Description
 */
public class ac {
    public static void main(String[] args) {
        String s = "aa";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Map<Character, Integer> index = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < len; right++) {
            char c = s.charAt(right);
            //如果有重复的，则要考虑是否更新左边界，如果是这次重复的位置是因为滑动窗口外边
            //的引起的，那就什么也不做（相当于滑动窗口内部没有重复）
            //如果在滑动窗口内部，则需要更新滑动窗口左边界的值
            if (index.containsKey(c)) {
                int lastIndex = index.get(c);
                if (lastIndex + 1 > left) {
                    left = lastIndex + 1;
                }
            }
            index.put(c, right);
            //put方法如果c已经存在，则会更新原来c所对应的值
            //要不断更新新的元素和旧元素最近一次出现的位置
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}