#include<iostream>
#include<map>
#include<string>
using namespace std;
int main() {
	string s;
	string t;
	getline(cin, s);
	getline(cin, t);

	map<int, bool> mapS;
	map<int, bool> mapT;
	for (int i = 0; i < t.length(); i++) {
		mapT[t[i]] = true;
	}

	for (string::iterator it = s.begin(); it != s.end(); it++) {
		if (mapT[*it] == true) {
			s.erase(it);
			it--;
		}
	}
	cout << s;
}