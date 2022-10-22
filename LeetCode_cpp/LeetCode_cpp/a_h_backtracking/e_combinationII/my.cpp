#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<int>> ans;
	vector<int> path;
	void backdfs(vector<int>& candidates, int target, int startPos, int sum) {
		if (sum == target) {
			ans.emplace_back(path);
		} else if (sum > target) {
			return;
		}
		for (int i = startPos; i < candidates.size(); i++) {
			path.emplace_back(candidates[i]);
			backdfs(candidates, target, i + 1, sum + candidates[i]);
			path.pop_back();
			while (i < candidates.size() - 1 && candidates[i] == candidates[i + 1]) {
				i++;
			}
		}
	}
	vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
		sort(candidates.begin(), candidates.end());
		backdfs(candidates, target, 0, 0);
		return ans;
	}
};