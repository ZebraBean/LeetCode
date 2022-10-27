#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
#include<stack>
using namespace std;
class Solution {
public:
	string removeDuplicates(string s) {
		stack<int> st;
		for (int i = 0; i < s.size(); i++) {
			if (!st.empty()) {
				int top = st.top();
				if (top == s[i]) {
					st.pop();
				} else {
					st.push(s[i]);
				}
			} else {
				st.push(s[i]);
			}
		}
		string ans(st.size(), '\0');
		for (int i = ans.size() - 1; i >= 0; i--) {
			ans[i] = st.top();
			st.pop();
		}
		return ans;
	}
};