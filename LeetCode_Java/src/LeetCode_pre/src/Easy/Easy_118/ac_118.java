package LeetCode.Easy_118;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/17
 * Time: 15:42
 * Description: No Description
 */
public class ac_118 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }
}
//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<Integer> preList = new ArrayList<>();
//        List<Integer> curList = new ArrayList<>();
//        List<List<Integer>> ansList = new ArrayList<>();
//        //可以不用preList有一说一，直接用ansList.get(i-1)代替
//        for (int i = 1; i <= numRows; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (j == 1 || j == i){
//                    curList.add(1);
//                }else {
//                    curList.add(preList.get(j-2)+preList.get(j-1));
//                }
//            }
//            ansList.add(curList);
//            preList = curList;
//            curList = new ArrayList<>();
//        }
//        return ansList;
//    }
//}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansList = new ArrayList<>();
        //可以不用preList有一说一，直接用ansList.get(i-1)代替
        for (int i = 1; i <= numRows; i++) {
            List<Integer> curList = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i){
                    curList.add(1);
                }else {
                    curList.add(ansList.get(i-2).get(j-2)+ansList.get(i-2).get(j-1));
                }
            }
            ansList.add(curList);
        }
        return ansList;
    }
}

