#include<unordered_map>
#include<vector>
#include<iostream>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<int>> fourSum(vector<int>& nums, int target) {
		vector<vector<int>> ans;
		sort(nums.begin(), nums.end());  //从小到大排序
		for (int i = 0; i < nums.size(); i++) {
			if (nums[i] > target && nums[i] >= 0) {  //剪枝，如果数组中有元素>target，并且是正数的话，那就一定无结果了，因为我们是从小到大排序过的
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {  //对第一个数进行去重，注意第一个数的去重必须判断当前元素和前一个元素是否相等，防止漏掉一些情况，比如 1 1 -1 -1 target = 0
				continue;
			}
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums[i] + nums[j] > target && nums[i] + nums[j] >= 0) {  //剪枝，此时如果两个数的和 >target且都是整数，直接break
					break;
				}
				if (j > i + 1 && nums[j] == nums[j - 1]) {  //对第二个数进行去重，和第一个数方式一样
					continue;
				}
				int left = j + 1;  //第三个数
				int right = nums.size() - 1;  //第四个数
				while (left < right) {
					long res = long(nums[i] + nums[j] + nums[left] + nums[right]);  //注意这里要用long强转，否则会溢出
					if (res > target) {  //四数之和 > target，让right--，使得四数之和减小
						right--;
					} else if (res < target) {  //四数之和 < target，让left++，使得四数之和变大
						left++;
					} else {  //四数之和等于target，将四元组加入结果
						vector<int> temp = { nums[i],nums[j],nums[left],nums[right] };
						ans.emplace_back(temp);
						while (left < right && nums[right] == nums[right - 1]) {  //对第四个数去重
							right--;
						}
						while (left < right && nums[left] == nums[left + 1]) {  //对第三个数去重
							left++;
						}
						right--;
						left++;
					}
				}
			}
		}
		return ans;
	}
};