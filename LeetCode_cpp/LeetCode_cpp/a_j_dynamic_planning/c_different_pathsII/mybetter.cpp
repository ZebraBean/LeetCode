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
			//主要问题其实出在第一列上面，其他列有石头直接置0就行，因为第一行和第一列是不能使用递推公式的，我们这里针对每一行的第一列初始化一下就行
			//第一个组合问题是因为第一列都是1，滚动数组第一列默认就都是1，但是这里的第一列不一定都是1
			//如果当前行的第一列上面有石头，将其置为0
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
		//下面这种方式也可以，第二层循环从第一个位置开始遍历，如果第一个位置不是石头，那就不做处理。
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
		//dp[j] = dp[j]+dp[j-1]，如果o[i][j-1] == 1，那dp[i]就不变
	}
};