#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	int evalRPN(vector<string>& tokens) {
		stack<long> st;
		for (auto e : tokens) {
			if (e == "+" || e == "-" || e == "*" || e == "/") {
				int num1 = st.top();
				st.pop();
				int num2 = st.top();
				st.pop();
				if (e == "+") {
					st.push(num2 + num1);
				} else if (e == "-") {
					st.push(num2 - num1);
				} else if (e == "*") {
					st.push((long)num2 * num1);
				} else if (e == "/") {
					st.push(num2 / num1);
				}
			} else {
				st.push(stoll(e));
			}
		}
		return st.top();
	}
};