#include<unordered_map>
#include<vector>
#include<iostream>
using namespace std;
class Solution {
public:
	vector<int> twoSum(vector<int>& nums, int target) {
		vector<int> ans;
		unordered_map<int, int> hashMap;
		for (int i = 0; i < nums.size(); i++) {
			if (hashMap.find(target - nums[i]) != hashMap.end()) {
				hashMap[nums[i]] = i;
			} else {
				ans[0] = i;
				ans[1] = hashMap[target - nums[i]];
			}
		}
		return ans;
	}
};