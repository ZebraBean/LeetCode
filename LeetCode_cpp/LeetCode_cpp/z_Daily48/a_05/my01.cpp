//#include <algorithm>
//#include <iostream>
//#include <map>
//#include <string>
//#include <vector>
//using namespace std;
//int main() {
//	string s;
//	string t;
//	int ans = 0;
//	while (cin >> s) {
//		cin >> t;
//		ans = 0;
//		for (int i = 0; i <= s.length(); i++) {
//			string tar = s.substr(0, i) + t + s.substr(i, s.length());
//			int left = 0;
//			int right = tar.length() - 1;
//			while (left < right) {
//				if (tar[left] != tar[right]) {
//					break;
//				}
//				left++;
//				right--;
//			}
//			if (left >= right) {
//				ans += 1;
//			}
//		}
//		cout << ans << endl;
//	}
//	return 0;
//}