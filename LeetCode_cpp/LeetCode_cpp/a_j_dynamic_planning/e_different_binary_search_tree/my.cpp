#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;

//�𰸶ԣ�˼·������
//class Solution {
//public:
//	int numTrees(int n) {
//		vector<int> dp(n + 1, 0);
//		//dp[i]��ʾ��1-i������ɵĻ�����ͬ�Ķ�����������
//		dp[1] = 1;
//		for (int i = 2; i <= n; i++) {
//			dp[i] = 2 * dp[i - 1];
//			for (int j = 1; j <= i - 2; j++) {
//				dp[i] += dp[j] * dp[i - 1 - j];
//			}
//		}
//		return dp[n];
//	}
//};