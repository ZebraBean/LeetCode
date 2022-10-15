#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int uniquePaths(int m, int n) {
		vector<int> dproll(n, 0);
		for (int i = 0; i < n; i++) {
			dproll[i] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dproll[j] = dproll[j - 1] + dproll[j];
			}
		}
		return dproll[n - 1];
	}
};