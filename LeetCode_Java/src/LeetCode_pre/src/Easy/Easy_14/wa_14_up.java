package LeetCode.Easy_14;

public class wa_14_up {

}
class Solution1 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    //如果一直想同i的值与某个字符串的长度相同了，则退出循环，防止数组发生越界
                    //或者如果某一位对不上了，也退出循环，返回当时的前i位
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}