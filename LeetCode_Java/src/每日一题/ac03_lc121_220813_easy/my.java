package 每日一题.ac03_lc121_220813_easy;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/13
 * Time: 8:19
 * Description: No Description
 */
public class my {
//    public int maxProfit(int[] prices) {
//        int maxP = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                if (prices[j] - prices[i] > maxP) {
//                    maxP = prices[j] - prices[i];
//                }
//            }
//        }
//        return maxP;
//    }
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int currentProfit = 0;  //在前面i天最低的时候买入，如果当天卖出，能获得的利润
        for (int i = 0; i < prices.length-1; i++) {
            int gap = prices[i + 1] - prices[i];
            if (currentProfit >= 0) {
                //只要今天卖出不亏，说明我们之前买入的那一天还是前面i天最低的，
                // 都有可能是最大利润，更新最大利润
                currentProfit += gap;
                if (currentProfit < 0) {
                    //一旦亏了，说明当天的价格比前面i天都低，所以重置currentProfit，表示在当天买入
                    currentProfit = 0;
                }
            }
            if (currentProfit > maxP) {
                maxP = currentProfit;
            }
        }
        return maxP;
    }
}
