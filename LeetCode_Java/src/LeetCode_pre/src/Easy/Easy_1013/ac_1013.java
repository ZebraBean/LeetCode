package Easy.Easy_1013;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/12/19
 * Time: 17:00
 * Description: No Description
 */
public class ac_1013 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{18,12,-18,18,-19,-1,10,10};
        System.out.println(solution.canThreePartsEqualSum(arr));

    }
}
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0){  //如果不能整除3，那就一定不能被平分成三段
            return false;
        }
        int temp = 0;  //每一次记录1/3
        int count = 0;  //count=2的时候表示可以平均分成三段

        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (temp == sum/3){
                temp = 0;
                count++;
                if (count == 3){  //这里必须等于3才行，等于2不够，有-1,1，-1,1的情况
                    return true;
                }
            }
        }

        return false;
    }
}