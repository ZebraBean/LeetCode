package 每日一题.ac02_lc290_220811_easy;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/11
 * Time: 21:18
 * Description: No Description
 */
public class ZdefeatTest {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "aa aa aa aa";
        System.out.println(wordPattern(a,b));
    }
    public static boolean wordPattern(String pattern, String s) {
        boolean ans = true;
        HashMap<Character, String> hashMap = new HashMap<>();
        int j = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (j >= s.length()) {
                ans = false;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (j < s.length() && s.charAt(j) != ' ') {
                stringBuffer.append(s.charAt(j));
                j++;
            }
            j++;
            String part = stringBuffer.toString();
            if (!hashMap.containsKey(pattern.charAt(i))) {
                //没有模板，给上对应的模板
                if (hashMap.containsValue(part)) {
                    ans = false;
                    break;
                }
                hashMap.put(pattern.charAt(i), part);
            } else if (!hashMap.get(pattern.charAt(i)).equals(part)) {
                //有模板了，当前的键值对与模板的键值对对不上
                ans = false;
            }
        }
        if (j < s.length()){
            ans = false;
        }
        return ans;
    }
}
