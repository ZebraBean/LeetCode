//链接：https://ac.nowcoder.com/acm/contest/5657/I
//来源：牛客网
//
//输入
//复制
//a c bb
//f dddd
//nowcoder
//输出
//复制
//a bb c
//dddd f
//nowcoder
//#include<iostream>
//#include<map>
//#include<vector>
//#include<algorithm>
//#include<string>
//using namespace std;
//
//	int main() {
//		string s;
//		vector<string> a(105);
//		int len = 0;
//
//		while (cin >> s)
//		{
//			a[len++] = s;
//			if (cin.get() == '\n')
//			{
//				sort(a.begin(), a.begin() + len);
//				for (int i = 0; i < len; i++)
//				{
//					if (i != len - 1)
//					{
//						cout << a[i] << ' ';
//					}
//					else
//					{
//						cout << a[i] << endl;
//					}
//				}
//			}
//			a.clear();
//			a.resize(105);
//		}
//	}