#include<iostream>
#include<vector>
#include<set>
using namespace std;
class Solution {
public:
	vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
		int hash[1005] = { 0 };
		vector<int> ans;
		for (auto num : nums1) {
			hash[num]++;
		}
		for (auto num : nums2) {
			if (hash[num] > 0) {
				hash[num]--;
				ans.emplace_back(num);
			}
		}
		return ans;
	}
};