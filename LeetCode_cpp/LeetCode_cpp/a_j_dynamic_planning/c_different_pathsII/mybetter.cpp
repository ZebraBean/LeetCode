#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
		int m = obstacleGrid.size();
		int n = obstacleGrid[0].size();
		vector<int> dproll(n, 0);
		for (int i = 0; i < n; i++) {
			if (obstacleGrid[0][i] == 0) {
				dproll[i] = 1;
			} else {
				break;
			}
		}
		for (int i = 1; i < m; i++) {
			//��Ҫ������ʵ���ڵ�һ�����棬��������ʯͷֱ����0���У���Ϊ��һ�к͵�һ���ǲ���ʹ�õ��ƹ�ʽ�ģ������������ÿһ�еĵ�һ�г�ʼ��һ�¾���
			//��һ�������������Ϊ��һ�ж���1�����������һ��Ĭ�ϾͶ���1����������ĵ�һ�в�һ������1
			//�����ǰ�еĵ�һ��������ʯͷ��������Ϊ0
			if (obstacleGrid[i][0] == 1) {
				dproll[0] = 0;
			}
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 1) {
					dproll[j] = 0;
				} else {
					dproll[j] += dproll[j - 1];
				}
			}
		}
		//�������ַ�ʽҲ���ԣ��ڶ���ѭ���ӵ�һ��λ�ÿ�ʼ�����������һ��λ�ò���ʯͷ���ǾͲ�������
		//for (int i = 1; i < m; i++) {
		//	for (int j = 0; j < n; j++) {
		//		if (obstacleGrid[i][j] == 1) {
		//			dproll[j] = 0;
		//		} else if (j != 0) {
		//			dproll[j] += dproll[j - 1];
		//		}
		//	}
		//}
		return dproll[n - 1];
		//dp[j] = dp[j]+dp[j-1]�����o[i][j-1] == 1����dp[i]�Ͳ���
	}
};