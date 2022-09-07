#include<iostream>
#include<map>
#include<vector>
#include<algorithm>
#include<string>
using namespace std;
int main() {
	string s;
	vector<string> a;
	while (cin >> s)
	{
		int i = 0;
		string temp;
		while (i < s.length())
		{
			if (s[i] != ',')
			{
				temp += s[i];
			}
			else
			{
				a.push_back(temp);
				temp = "";
			}
			i++;
		}
		a.push_back(temp);
		sort(a.begin(), a.end());
		for (int i = 0; i < a.size(); i++)
		{
			if (i != a.size() - 1)
			{
				cout << a[i] << ',';
			}
			else
			{
				cout << a[i] << endl;
			}
		}
		a.clear();
	}

	return 0;
}