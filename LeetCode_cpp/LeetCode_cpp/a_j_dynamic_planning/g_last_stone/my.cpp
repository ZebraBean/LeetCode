#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int lastStoneWeightII(vector<int>& stones) {
		//dp[i][j]表示从0-i个数里面选集合，容量为j的背包最多可以装下的数字集合的最大值
		//这里滚动数组压缩成dp[j]
		vector<int> dp(1505, 0);
		int sum = 0;
		for (auto num : stones) {
			sum += num;
		}
		int target = sum / 2;
		if (sum % 2 != 0) {
			target++;
		}
		for (int i = 0; i < stones.size(); i++) {
			for (int j = target; j >= stones[i]; j--) {
				dp[j] = max(dp[j], dp[j - stones[i]] + stones[i]);
			}
		}
		cout << dp[target];
		return abs(dp[target] - (sum - dp[target]));
	}
};