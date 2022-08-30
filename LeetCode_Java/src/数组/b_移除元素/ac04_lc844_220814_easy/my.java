package 数组.b_移除元素.ac04_lc844_220814_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/14
 * Time: 13:41
 * Description: No Description
 */
public class my {
    public boolean backspaceCompare(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int sLen = change(ss);
        int tLen = change(tt);
        if (sLen != tLen) {
            return false;
        }
        for (int i = 0; i < sLen; i++) {
            if (ss[i] != tt[i]) {
                return false;
            }
        }
        return true;
    }

    public static int change(char[] a){
        int fastIndex = 0;
        int slowIndex = 0;
        for (; fastIndex < a.length; fastIndex++) {
            if (a[fastIndex] == '#') {
                if (slowIndex > 0) {
                    slowIndex--;
                }
            } else {
                a[slowIndex] = a[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
