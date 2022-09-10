// #include<iostream>
// #include<map>
// #include<vector>
// #include<algorithm>
// #include<string>
// using namespace std;
// void print(vector<string>& strs) {
// 	for (int i = 0; i < strs.size(); i++) {
// 		if (i == 0) cout << strs[i];
// 		else cout << ' ' << strs[i];
// 	}
// 	cout << '\n';
// }
//
// int main() {
// 	vector<string> strs;
// 	string str;
// 	while (cin >> str) {
// 		strs.push_back(str);
// 		if (cin.get() == '\n') {
// 			sort(strs.begin(), strs.end());
// 			print(strs);
// 			strs.clear();
// 		}
// 	}
// 	return 0;
// }