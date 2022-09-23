#include<unordered_map>
#include<vector>
#include<iostream>
using namespace std;
class Solution {
public:
	vector<int> twoSum(vector<int>& nums, int target) {
		unordered_map<int, int> hashMap;
		for (int i = 0; i < nums.size(); i++) {
			auto it = hashMap.find(target - nums[i]);
			if (it == hashMap.end()) {
				hashMap[nums[i]] = i;
			} else {
				return{ i,it->second };
			}
		}
		return {};
	}
};