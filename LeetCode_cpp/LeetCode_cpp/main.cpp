#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>

using namespace std;

void test(int a[]) {
	//���ַ����Ǿ��Դ���ģ������ڴ��ε�ʱ������ָ�봫�ݵģ���ʱ��a��ָ�룬���������飬��Χ�ǲ�ȷ���ġ�
	//��ΧforҲû������
	for (int i = 0; i < sizeof(a) / sizeof(int); i++) {
		cout << a[i];
	}
}
int main() {
	int a = 0x01020304;
	int ans[5] = { 0 };

	return 0;
}