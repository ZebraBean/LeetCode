#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int minCostClimbingStairs(vector<int>& cost) {
		int n = cost.size();
		int firstpre = 0; //到前一个位置所需花费
		int secondpre = 0; //到前二个位置所需花费
		int cur = -1;//到现在这个位置所需的花费
		for (int i = 2; i <= n; i++) {
			cur = min(firstpre + cost[i - 1], secondpre + cost[i - 2]);
			secondpre = firstpre;
			firstpre = cur;
		}
		return cur;
	}
};