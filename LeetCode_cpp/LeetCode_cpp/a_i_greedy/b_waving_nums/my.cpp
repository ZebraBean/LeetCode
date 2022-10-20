#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int wiggleMaxLength(vector<int>& nums) {
		int count = 1;
		int i = 1;
		while (i < nums.size()) {
			if (nums[i] - nums[i - 1] > 0) {
				while (i < nums.size() && nums[i] - nums[i - 1] >= 0) {
					i++;
				}
				count++;
			} else if (nums[i] - nums[i - 1] < 0) {
				while (i < nums.size() && nums[i] - nums[i - 1] <= 0) {
					i++;
				}
				count++;
			} else {
				i++;
			}
		}
		return count;
	}
};