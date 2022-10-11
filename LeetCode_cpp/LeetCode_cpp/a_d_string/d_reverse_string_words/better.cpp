#include<vector>
#include<algorithm>
#include<string>
using namespace std;
class Solution {
public:
	void removeSpace(string& s) {
		int slow = 0;
		int fast = 0;
		while (fast < s.size() && s[fast] == ' ') {
			fast++;
		}
		//fastһ������ĸ��ͷ��
		while (fast < s.size()) {
			if (s[fast] == ' ' && s[fast] == s[fast - 1]) {
			} else {
				s[slow++] = s[fast];
			}
			fast++;
		}
		//���Ҫ���пո�ᱻ������
		if (s[slow - 1] == ' ') {
			s.resize(slow - 1);
		} else {
			s.resize(slow);
		}
	}
	string reverseWords(string s) {
		removeSpace(s);
		reverse(s.begin(), s.end());
		int start = 0;
		for (int i = 0; i < s.size(); i++) {
			if (s[i] == ' ') {
				reverse(s.begin() + start, s.begin() + i);
				start = i + 1;
			}
		}
		reverse(s.begin() + start, s.end());
		return s;
	}
};