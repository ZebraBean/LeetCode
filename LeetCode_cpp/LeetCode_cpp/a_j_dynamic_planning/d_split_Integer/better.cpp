#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int integerBreak(int n) {
		vector<int> dp(n + 1, 0);
		for (int i = 2; i <= n; i++) {
			int curNum = 1;
			for (int j = 1; j < i; j++) {
				int m = max(j * (i - j), j * dp[i - j]);
				if (m > curNum) {
					curNum = m;
				}
			}
			dp[i] = curNum;
		}
		return dp[n];
	}
};