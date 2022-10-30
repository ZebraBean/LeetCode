#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
#include<queue>
using namespace std;
class Solution {
public:
	struct myless {
		bool operator()(const pair<int, int>& p1, const pair<int, int>& p2) const {
			return p1.second > p2.second;
		}
	};
	vector<int> topKFrequent(vector<int>& nums, int k) {
		if (nums.size() == 1) {
			return nums;
		}
		sort(nums.begin(), nums.end());
		priority_queue<pair<int, int>, vector<pair<int, int>>, myless> pq;
		vector<int> ans;
		int i = 0;
		while (i < nums.size()) {
			int count = 1;
			while (i < nums.size() - 1 && nums[i] == nums[i + 1]) {
				count++;
				i++;
			}
			if (pq.size() < k) {
				pq.push(pair<int, int>{nums[i], count});
			} else {
				if (pq.top().second < count) {
					pq.pop();
					pq.push(pair<int, int>{nums[i], count});
				}
			}
			i++;
		}
		while (!pq.empty()) {
			ans.push_back(pq.top().first);
			pq.pop();
		}
		return ans;
	}
};