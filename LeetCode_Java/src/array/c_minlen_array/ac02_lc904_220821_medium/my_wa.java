package 数组.c_长度最小的子数组.ac02_lc904_220821_medium;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/21
 * Time: 22:32
 * Description: No Description
 */
public class my_wa {
    public int totalFruit(int[] fruits) {
        int ans = -1;
        int leftIndex = 0;
        int rightIndex = 0;
        int fruitCount = 0;
        int firstFruit = -1;
        int secondFruit = -1;
        int thirdFruit = -1;
        for (; rightIndex < fruits.length; rightIndex++) {
            if (firstFruit == -1) {
                firstFruit = fruits[rightIndex];
            } else if (secondFruit == -1 && fruits[rightIndex] != firstFruit) {
                secondFruit = fruits[rightIndex];
            } else if (fruits[rightIndex] == firstFruit || fruits[rightIndex] == secondFruit) {
                //do nothing
            } else {
                int p = rightIndex-1;
                thirdFruit = fruits[rightIndex];
                while (fruits[p] == secondFruit) {
                    p--;
                }
                leftIndex = p+1;
                firstFruit = secondFruit;
                secondFruit = thirdFruit;
            }
            fruitCount = rightIndex - leftIndex+1;
            if (fruitCount > ans) {
                ans = fruitCount;
            }
        }
        return ans;
    }
}
