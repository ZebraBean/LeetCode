#include<iostream>
#include<vector>
#include<set>
using namespace std;
class Solution {
public:
	vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
		int hash[1000] = { 0 };
		set<int> tempSet;
		vector<int> ans;
		for (auto num : nums1) {
			hash[num]++;
		}
		for (auto num : nums2) {
			if (hash[num] != 0) {
				tempSet.insert(num);
			}
		}
		ans.assign(tempSet.begin(), tempSet.end());
		return ans;
	}
};