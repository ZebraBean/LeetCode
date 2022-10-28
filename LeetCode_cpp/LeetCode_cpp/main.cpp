#include<iostream>
#include<cstdio>
#include<unistd.h>
#include<string>
#include<stdlib.h>
using namespace std;
int main() {
	string info = "[my_shell zebra]$ ";
	string command;
	while (true) {
		cout << info;
		getline(cin, command);
		char* arg[100];
		int count = 0;
		int start = 0;
		for (int i = 0; i < command.length(); i++) {
			if (command[i] == ' ') {
				string st = command.substr(start, i - start).c_str();
				char* temp = new char[st.length()];
				strcpy(temp, st.c_str());
				arg[count++] = temp;
				start = i + 1;
			} else if (i == command.length() - 1) {
				string st = command.substr(start, i - start + 1).c_str();
				char* temp = new char[st.length()];
				strcpy(temp, st.c_str());
				arg[count++] = temp;
			}
		}
		arg[count] = NULL;
	}
	return 0;
}