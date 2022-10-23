#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
private:
	vector<string> result;// ��¼���
	string path;
	// startIndex: ��������ʼλ�ã�pointNum:��Ӷ��������
	void backtracking(string& s, int startIndex, int pointNum) {
		if (pointNum == 3) { // ��������Ϊ3ʱ���ָ�����
			// �жϵ��Ķ����ַ����Ƿ�Ϸ�������Ϸ��ͷŽ�result��
			if (isValid(s, startIndex, s.size() - 1)) {
				path += s.substr(startIndex, s.size() - startIndex);
				result.emplace_back(path);
			}
			return;
		}
		for (int i = startIndex; i < s.size(); i++) {
			if (isValid(s, startIndex, i)) { // �ж� [startIndex,i] ���������Ӵ��Ƿ�Ϸ�
				string tmp = s.substr(startIndex, i - startIndex + 1);
				int prePos = path.size();
				path += tmp;
				path += '.';
				pointNum++;
				backtracking(s, i + 1, pointNum);
				pointNum--;                         // ����
				path.erase(prePos);         // ����ɾ��
			} else return; // ���Ϸ���ֱ�ӷ���
		}
	}
	// �ж��ַ���s������ֱ�����[start, end]����ɵ������Ƿ�Ϸ�
	bool isValid(const string& s, int start, int end) {
		if (start > end) {
			return false;
		}
		if (s[start] == '0' && start != end) { // 0��ͷ�����ֲ��Ϸ�
			return false;
		}
		int num = 0;
		for (int i = start; i <= end; i++) {
			if (s[i] > '9' || s[i] < '0') { // �����������ַ����Ϸ�
				return false;
			}
			num = num * 10 + (s[i] - '0');
			if (num > 255) { // �������255�˲��Ϸ�
				return false;
			}
		}
		return true;
	}
public:
	vector<string> restoreIpAddresses(string s) {
		result.clear();
		if (s.size() < 4 || s.size() > 12) return result; // ���Ǽ�֦��
		backtracking(s, 0, 0);
		return result;
	}
};