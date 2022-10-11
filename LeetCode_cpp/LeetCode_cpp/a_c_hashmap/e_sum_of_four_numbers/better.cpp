#include<unordered_map>
#include<vector>
#include<iostream>
#include<algorithm>
using namespace std;
class Solution {
public:
	int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
		int ans = 0;
		int n = nums1.size();
		unordered_map<int, int> hash;
		for (auto a : nums1) {
			for (auto b : nums2) {
				hash[a + b]++;
			}
		}

		for (auto a : nums3) {
			for (auto b : nums4) {
				auto it = hash.find(-(a + b));
				if (it != hash.end()) {
					ans += it->second;
				}
			}
		}
		return ans;
	}
};