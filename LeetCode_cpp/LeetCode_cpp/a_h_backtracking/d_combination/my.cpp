#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<int>> ans;
	vector<int> path;
	void backdfs(vector<int>& candidates, int target, int nowsum, int startPos) {
		if (nowsum == target) {
			ans.emplace_back(path);
			return;
		} else if (nowsum > target) {
			return;
		}
		//开始横向遍历
		for (int i = startPos; i < candidates.size(); i++) {
			//选第一个数
			path.emplace_back(candidates[i]);
			backdfs(candidates, target, nowsum + candidates[i], i);
			path.pop_back();
		}
	}
	vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
		backdfs(candidates, target, 0, 0);
		return ans;
	}
};