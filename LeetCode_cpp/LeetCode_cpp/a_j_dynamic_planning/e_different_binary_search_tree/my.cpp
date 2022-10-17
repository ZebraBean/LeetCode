#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;

//答案对，思路有问题
//class Solution {
//public:
//	int numTrees(int n) {
//		vector<int> dp(n + 1, 0);
//		//dp[i]表示从1-i可以组成的互不相同的二叉树的数量
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