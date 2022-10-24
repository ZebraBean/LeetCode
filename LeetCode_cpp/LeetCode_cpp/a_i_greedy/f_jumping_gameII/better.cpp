#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int jump(vector<int>& nums) {
		// if(nums.size() ==1){
		//     return 0;
		// }
		int count = 0;
		int nowCover = 0;
		int nextCover = 0;
		for (int i = 0; i <= nowCover; i++) {
			if (nowCover >= nums.size() - 1) {
				return count;
			}
			nextCover = max(nextCover, nums[i] + i);
			if (i == nowCover) {
				count++;
				nowCover = nextCover;
			}
		}
		return count;
	}
};