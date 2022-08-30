package LeetCode.Easy_13;

import java.util.HashMap;
import java.util.Map;

public class wa_13 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.romanToInt("LVIII"));
    }
}
     class Solution {
        public int romanToInt(String s) {
            Map<Character,Integer> hash = new HashMap<Character,Integer>();
            hash.put('I', 1);
            hash.put('V', 5);
            hash.put('X', 10);
            hash.put('L', 50);
            hash.put('C', 100);
            hash.put('D', 500);
            hash.put('M', 1000);

            int ans =0;
            int i = 0;
            while (i < s.length()){
                if(i == s.length()-1){   //防止后面s[i+1]越界
                    ans += hash.get(s.charAt(i));
                    break;
                }else if (hash.get(s.charAt(i)) < hash.get(s.charAt(i+1))){  //如果小值在大值左边，则相当于减去小值
                         ans -= hash.get(s.charAt(i));
                    }else {
                    ans += hash.get(s.charAt(i));
                }
                i++;
            }
            return ans;
        }
    }