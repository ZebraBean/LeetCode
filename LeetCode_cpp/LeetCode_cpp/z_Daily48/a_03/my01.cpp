//#include <iostream>
//using namespace std;
//
//int main() {
//	string str;
//	string maxStr = "";
//	int maxLen = 0;
//	cin >> str;
//	int i = 0;
//	while (i < str.length()) {
//		if (str[i] <= '9' && str[i] >= '0') {
//			int len = 0;
//			int start = i;
//			while (str[i] <= '9' && str[i] >= '0') {
//				len++;
//				i++;
//			}
//			if (len > maxLen) {
//				maxLen = len;
//				maxStr = str.substr(start, len);
//			}
//		} else {
//			i++;
//		}
//	}
//	cout << maxStr;
//}
//// 64 Î»Êä³öÇëÓÃ printf("%lld")