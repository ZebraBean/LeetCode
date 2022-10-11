#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<int>> ans;
	vector<int> path;
	void backtracking(int n, int k, int startIndex) {  //��ǰ�㼰�������Ĵ���
		if (k == path.size()) {
			ans.emplace_back(path);
			return;
		}
		for (int i = startIndex; i <= n; i++) {
			if (path.size() + n - i + 1 < k) {  //��֦
				break;
			}
			path.emplace_back(i);
			backtracking(n, k, i + 1);
			path.pop_back();
		}
	}
	vector<vector<int>> combine(int n, int k) {
		backtracking(n, k, 1);
		return ans;
	}
};