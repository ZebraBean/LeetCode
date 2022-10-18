#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	bool canPartition(vector<int>& nums) {
		vector<int> dp(10005, 0);
		//dp[i][j] 0-i����Ʒ��������Ϊj��ʱ�����v
		//������Ʒ�����֣�j������,v�����ֶ�Ӧ��ֵ��w��Ҳ�����ֶ�Ӧ��ֵ
		//����Ҫ�����dp[j]��Ҳ�����ܴճɵ��Ӽ��ܺ�<=j�������Ӽ��ܺͣ�����ܺ�=dp[j]��ʾ�ҵ���һ���ܺ�Ϊj���Ӽ�
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