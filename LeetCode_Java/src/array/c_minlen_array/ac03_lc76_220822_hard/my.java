package 数组.c_长度最小的子数组.ac03_lc76_220822_hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/23
 * Time: 12:20
 * Description: No Description
 */
public class my {
    public  String minWindow(String s, String t) {
        int minAns = Integer.MAX_VALUE;
        String ans = "";
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> hashS = new HashMap<>();
        HashMap<Character, Integer> hashT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hashT.put(t.charAt(i), hashT.getOrDefault(t.charAt(i), 0)+1);
        }
        for (; right < s.length(); right++) {
            hashS.put(s.charAt(right), hashS.getOrDefault(s.charAt(right), 0)+1);
            while (check(hashS, hashT)) {
                int len = right - left + 1;
                if (len < minAns) {
                    ans = s.substring(left, right + 1);
                    minAns = len;
                }
                hashS.put(s.charAt(left), hashS.getOrDefault(s.charAt(left), 0)-1);
                left++;
            }
        }
        return ans;
    }
    public  boolean check(HashMap<Character, Integer> hashS,HashMap<Character, Integer> hashT){
        //判断s是否包含t
        Set<Character> tSet = hashT.keySet();
        ArrayList<Character> arrayList = new ArrayList<>(tSet);
        for (int i = 0; i < hashT.size(); i++) {
            if (!hashS.containsKey(arrayList.get(i)) || hashS.get(arrayList.get(i)) < hashT.get(arrayList.get(i))) {
                return false;
            }
        }
        return true;
    }

}
