package 每日一题.ac03_lc121_220813_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/13
 * Time: 9:22
 * Description: No Description
 */
public class better {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
