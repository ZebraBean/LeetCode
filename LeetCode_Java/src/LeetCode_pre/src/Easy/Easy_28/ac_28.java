package LeetCode.Easy_28;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/19
 * Time: 22:56
 * Description: No Description
 */
public class ac_28 {
}
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0){   //如果是空字符串，返回0
            return 0;
        }
        int ans = 0;
        int i = 0;
        int j ;
        while(ans < haystack.length()){
            i = 0;
            j = ans;
            while (j < haystack.length() && i < needle.length()){
                if (haystack.charAt(j) == needle.charAt(i)){
                    i++;
                    j++;
                }else {
                    break;
                }
            }
            if (i == needle.length()){  //如果有一次把needle比完了，那就return
                return ans;
            }
            if (j >= haystack.length()){  //如果比完以后j已经到头了，那么后面的就没必要比了，break退出即可
                break;
            }
            ans++;
        }
        return -1;
    }
}