#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
#include<queue>
#include<unordered_map>
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
		priority_queue<pair<int, int>, vector<pair<int, int>>, myless> pq;
		unordered_map<int, int> umap;
		vector<int> ans;
		int i = 0;
		for (int i = 0; i < nums.size(); i++) {
			umap[nums[i]]++;
		}

		for (auto it = umap.begin(); it != umap.end(); it++) {
			if (pq.size() < k) {
				pq.push(*it);
			} else {
				if (pq.top().second < it->second) {
					pq.pop();
					pq.push(*it);
				}
			}
		}

		while (!pq.empty()) {
			ans.push_back(pq.top().first);
			pq.pop();
		}
		return ans;
	}
};