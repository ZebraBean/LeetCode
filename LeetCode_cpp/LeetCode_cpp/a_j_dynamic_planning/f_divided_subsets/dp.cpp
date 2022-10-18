#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	bool canPartition(vector<int>& nums) {
		vector<int> dp(10005, 0);
		//dp[i][j] 0-i个物品，当容量为j的时候最大v
		//这里物品是数字，j是容量,v是数字对应的值，w是也是数字对应的值
		//我们要求的是dp[j]，也就是能凑成的子集总和<=j的最大的子集总和，如果总和=dp[j]表示找到了一个总和为j的子集
		int sum = 0;
		for (auto num : nums) {
			sum += num;
		}
		if (sum % 2 != 0) {
			return false;
		}
		int n = sum / 2;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = n; j >= nums[i]; j--) {
				dp[j] = max(dp[j], dp[j - nums[i]] + nums[i]);
			}
		}
		return dp[n] == n;
	}
};