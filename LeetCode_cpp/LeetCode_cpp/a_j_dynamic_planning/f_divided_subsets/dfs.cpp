#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
//class Solution {
//	unordered_map<string, bool> cache;//缓存器---保存当前索引值对应累加和下的真假
//public:
//	bool canPartition(vector<int>& nums)
//	{
//		//数组元素个数小于两个，肯定无法分成两个子序列
//		if (nums.size() < 2) return false;
//		//数组和为奇数，也不满足条件
//		int Sum = accumulate(nums.begin(), nums.end(), 0);
//		if (Sum % 2 != 0) return false;
//		return dfs(0, 0, Sum / 2, nums);
//	}
//	//cursum:当前累加和  i:当前索引  target:目标和
//	bool dfs(int cursum, int i, int target, vector<int>& nums)
//	{
//		string key = to_string(i) + '&' + to_string(cursum);
//		//当前索引值对应累加和下的真假
//		if (cache.find(key) != cache.end()) return cache[key];
//		if (cursum == target) return true;//找到目标和
//		//超和，越界
//		if (cursum > target || i >= nums.size()) return false;
//		bool ret = dfs(cursum + nums[i], i + 1, target, nums) || dfs(cursum, i + 1, target, nums);
//		return cache[key] = ret;
//	}
//};