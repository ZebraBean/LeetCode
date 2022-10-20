#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int maxProfit(vector<int>& prices) {
		int maxp = 0;
		for (int i = 0; i < prices.size() - 1; i++) {
			if (prices[i + 1] > prices[i]) {
				maxp += prices[i + 1] - prices[i];
			}
		}
		return maxp;
	}
};