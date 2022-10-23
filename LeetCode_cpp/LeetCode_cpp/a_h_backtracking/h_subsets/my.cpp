#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<int>> ans;
	vector<int> path;
	void backdfs(vector<int>& nums, int startPos) {
		ans.emplace_back(path);
		for (int i = startPos; i < nums.size(); i++) {
			path.emplace_back(nums[i]);
			backdfs(nums, i + 1);
			path.pop_back();
		}
	}
	vector<vector<int>> subsets(vector<int>& nums) {
		backdfs(nums, 0);
		return ans;
	}
};