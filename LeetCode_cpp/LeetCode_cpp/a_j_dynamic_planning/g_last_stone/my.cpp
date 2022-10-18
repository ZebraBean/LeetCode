#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int lastStoneWeightII(vector<int>& stones) {
		//dp[i][j]��ʾ��0-i��������ѡ���ϣ�����Ϊj�ı���������װ�µ����ּ��ϵ����ֵ
		//�����������ѹ����dp[j]
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