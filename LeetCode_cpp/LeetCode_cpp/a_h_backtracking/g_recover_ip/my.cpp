#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<string> ans;
	string path;
	bool isValidate(string s) {
		if (s[0] == '0' && s.size() > 1) {
			return false;
		}
		long long val = atoll(s.c_str());
		if (val > 255) {
			return false;
		}
		return true;
	}
	void backdfs(string s, int startPos, int count) {
		if (count == 4) {
			ans.emplace_back(path);
			return;
		}
		for (int i = startPos; i < s.size(); i++) {
			if (count == 3) {
				i = s.size() - 1;
			}
			string tmp = s.substr(startPos, i - startPos + 1);
			if (isValidate(tmp)) {
				int prePos = path.size();
				path += tmp;
				count++;
				if (count != 4) {
					path += '.';
				}
				backdfs(s, i + 1, count);
				path.erase(prePos);
				count--;
			} else {
				return;
			}
		}
	}

	vector<string> restoreIpAddresses(string s) {
		backdfs(s, 0, 0);
		return ans;
	}
};