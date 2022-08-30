package LeetCode.Easy_14;

public class wa_14 {


    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null)
            return "";
        String ans = "";
        boolean flag = true;
        int i = 0;
        char temp;
        StringBuilder stringBuilder = new StringBuilder();
        while(flag == true && i < minLength(strs)){
            temp = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != temp){
                    flag = false;
                    break;
                }
            }
            if (flag == false){
                break;
            }
//            ans += strs[0].charAt(i);
            stringBuilder.append(strs[0].charAt(i));
            ans = stringBuilder.toString();
            i++;
        }
        return ans;
    }

    public static int minLength(String[] strs){
        int ans = 9999999;
        for (int i = 0; i < strs.length; i++) {
            ans = Math.min(ans,strs[i].length());
        }
        return ans;
    }
}
