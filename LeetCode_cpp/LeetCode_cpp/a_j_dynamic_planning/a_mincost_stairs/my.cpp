#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int minCostClimbingStairs(vector<int>& cost) {
		//dp[i]表示爬到i的最低花费
		//dp[i] = min dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]
		vector<int> dp(cost.size() + 1, 0);
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i < dp.size(); i++) {
			dp[i] = min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
		}
		return dp[dp.size() - 1];
	}
};