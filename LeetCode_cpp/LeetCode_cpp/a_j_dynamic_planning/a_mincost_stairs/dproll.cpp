#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int minCostClimbingStairs(vector<int>& cost) {
		int n = cost.size();
		int firstpre = 0; //��ǰһ��λ�����軨��
		int secondpre = 0; //��ǰ����λ�����軨��
		int cur = -1;//���������λ������Ļ���
		for (int i = 2; i <= n; i++) {
			cur = min(firstpre + cost[i - 1], secondpre + cost[i - 2]);
			secondpre = firstpre;
			firstpre = cur;
		}
		return cur;
	}
};