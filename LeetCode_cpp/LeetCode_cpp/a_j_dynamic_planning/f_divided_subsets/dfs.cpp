#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
//class Solution {
//	unordered_map<string, bool> cache;//������---���浱ǰ����ֵ��Ӧ�ۼӺ��µ����
//public:
//	bool canPartition(vector<int>& nums)
//	{
//		//����Ԫ�ظ���С���������϶��޷��ֳ�����������
//		if (nums.size() < 2) return false;
//		//�����Ϊ������Ҳ����������
//		int Sum = accumulate(nums.begin(), nums.end(), 0);
//		if (Sum % 2 != 0) return false;
//		return dfs(0, 0, Sum / 2, nums);
//	}
//	//cursum:��ǰ�ۼӺ�  i:��ǰ����  target:Ŀ���
//	bool dfs(int cursum, int i, int target, vector<int>& nums)
//	{
//		string key = to_string(i) + '&' + to_string(cursum);
//		//��ǰ����ֵ��Ӧ�ۼӺ��µ����
//		if (cache.find(key) != cache.end()) return cache[key];
//		if (cursum == target) return true;//�ҵ�Ŀ���
//		//���ͣ�Խ��
//		if (cursum > target || i >= nums.size()) return false;
//		bool ret = dfs(cursum + nums[i], i + 1, target, nums) || dfs(cursum, i + 1, target, nums);
//		return cache[key] = ret;
//	}
//};