#include<unordered_map>
#include<vector>
#include<iostream>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<int>> fourSum(vector<int>& nums, int target) {
		vector<vector<int>> ans;
		sort(nums.begin(), nums.end());  //��С��������
		for (int i = 0; i < nums.size(); i++) {
			if (nums[i] > target && nums[i] >= 0) {  //��֦�������������Ԫ��>target�������������Ļ����Ǿ�һ���޽���ˣ���Ϊ�����Ǵ�С�����������
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {  //�Ե�һ��������ȥ�أ�ע���һ������ȥ�ر����жϵ�ǰԪ�غ�ǰһ��Ԫ���Ƿ���ȣ���ֹ©��һЩ��������� 1 1 -1 -1 target = 0
				continue;
			}
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums[i] + nums[j] > target && nums[i] + nums[j] >= 0) {  //��֦����ʱ����������ĺ� >target�Ҷ���������ֱ��break
					break;
				}
				if (j > i + 1 && nums[j] == nums[j - 1]) {  //�Եڶ���������ȥ�أ��͵�һ������ʽһ��
					continue;
				}
				int left = j + 1;  //��������
				int right = nums.size() - 1;  //���ĸ���
				while (left < right) {
					long res = long(nums[i] + nums[j] + nums[left] + nums[right]);  //ע������Ҫ��longǿת����������
					if (res > target) {  //����֮�� > target����right--��ʹ������֮�ͼ�С
						right--;
					} else if (res < target) {  //����֮�� < target����left++��ʹ������֮�ͱ��
						left++;
					} else {  //����֮�͵���target������Ԫ�������
						vector<int> temp = { nums[i],nums[j],nums[left],nums[right] };
						ans.emplace_back(temp);
						while (left < right && nums[right] == nums[right - 1]) {  //�Ե��ĸ���ȥ��
							right--;
						}
						while (left < right && nums[left] == nums[left + 1]) {  //�Ե�������ȥ��
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