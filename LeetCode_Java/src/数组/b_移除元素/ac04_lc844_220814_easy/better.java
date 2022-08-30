package 数组.b_移除元素.ac04_lc844_220814_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/14
 * Time: 18:02
 * Description: No Description
 */
public class better {
    public boolean backspaceCompare(String s, String t) {
        int sN = s.length(), tN = t.length();
        int i = sN - 1, j = tN - 1;
        int skipS = 0, skipT = 0;
        while (i >= 0 || j >= 0)
        {
            // 先找到 s 中第一个需要比较的字符（即去除 # 影响后的第一个待比较字符）
            while (i >= 0)
            {
                if (s.charAt(i) == '#')
                {
                    skipS ++;
                    i --;
                }
                else if (skipS > 0)
                {
                    skipS --;
                    i --;
                }
                else
                {
                    break;
                }
            }
            // 再找到 t 中第一个需要比较的字符（即去除 # 影响后的第一个待比较字符）
            while (j >= 0)
            {
                if (t.charAt(j) == '#')
                {
                    skipT ++;
                    j --;
                }
                else if (skipT > 0)
                {
                    skipT --;
                    j --;
                }
                else
                {
                    break;
                }
            }
            // 然后开始比较,注意有下面这个 if 条件的原因是：如果 index = 0 位置上为 '#'，则 i, j 会为 -1
            // 而 index = -1 的情况应当处理。
            if (i >= 0 && j >= 0)
            {
                // 如果待比较字符不同，return false
                if (s.charAt(i) != t.charAt(j))
                    return false;
            }
            // (i >= 0 && j >= 0) 为 false 情况为
            // 1. i < 0 && j >= 0
            // 2. j < 0 && i >= 0
            // 3. i < 0 && j < 0
            // 其中，第 3 种情况为符合题意情况，因为这种情况下 s 和 t 都是 index = 0 的位置为 '#' 而这种情况下
            // 退格空字符即为空字符，也符合题意，应当返回 True。
            // 但是，情况 1 和 2 不符合题意，因为 s 和 t 其中一个是在 index >= 0 处找到了待比较字符，另一个没有找到
            // 这种情况显然不符合题意，应当返回 False，下式便处理这种情况。
            else if (i >= 0 || j >= 0)
                return false;
            i--;
            j--;
        }
        return true;
    }
}
