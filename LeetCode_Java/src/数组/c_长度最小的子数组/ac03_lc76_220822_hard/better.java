package 数组.c_长度最小的子数组.ac03_lc76_220822_hard;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/29
 * Time: 9:08
 * Description: No Description
 */
public class better {
    public  String minWindow(String s, String t) {
        int left = 0;
        int right = 0;

        HashMap<Character, Integer> winMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sLen = s.length();
        int tLen = t.length();
        int minLen = sLen + 1;
        int minLeft = 0;
        int minRight = 0;
        int distance = 0; //滑动窗口中包含的t中字母的个数
        for (int i = 0; i < tLen; i++) {
            tMap.put(tChars[i], tMap.getOrDefault(tChars[i], 0) + 1);
        }
        while (right < sLen){
            if (tMap.getOrDefault(sChars[right],0) == 0){
                right++;
                continue;
            }
            if (winMap.getOrDefault(sChars[right], 0) < tMap.getOrDefault(sChars[right], 0)) {
                distance++;  //如果当前滑动窗口中对应字母的个数小于t字符序列里面字母的个数,那就表示当前滑动窗口中包含了一个t中的一个字母
            }
            winMap.put(sChars[right], winMap.getOrDefault(sChars[right], 0) + 1);

            while (distance == tLen){
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                    minRight = right;
                }
                if (tMap.getOrDefault(sChars[left],0) == 0){
                    left++;
                    continue;
                }
                if (winMap.getOrDefault(sChars[left], 0).equals(tMap.get(sChars[left]))) {
                    distance--;
                }
                winMap.put(sChars[left], winMap.get(sChars[left]) - 1);
                left++;
            }
            right++;
        }
        if (minLen == sLen + 1) {
            return "";
        }
        return s.substring(minLeft, minRight+1);
    }
}
