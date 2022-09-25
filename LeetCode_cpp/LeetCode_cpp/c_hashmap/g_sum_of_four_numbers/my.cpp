#include<unordered_map>
#include<vector>
#include<iostream>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<int>> fourSum(vector<int>& nums, int target) {
		vector<vector<int>> ans;
		sort(nums.begin(), nums.end());
		for (int i = 0; i < nums.size(); i++) {
			if (nums[i] > target && nums[i] >= 0) {
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums[i] + nums[j] > target && nums[i] + nums[j] >= 0) {
					break;
				}
				if (j > i + 1 && nums[j] == nums[j - 1]) {
				}
			}
		}
	}
};