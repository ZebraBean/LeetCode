#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
#include<queue>
using namespace std;

class MyStack {
public:
	MyStack() {
	}

	void push(int x) {
		q1.push(x);
	}

	int pop() {
		int toPop = q1.back();
		int size = q1.size();
		while (size-- > 1) {
			q1.push(q1.front());
			q1.pop();
		}
		q1.pop();
		return toPop;
	}

	int top() {
		return q1.back();
	}

	bool empty() {
		return q1.empty();
	}
private:
	queue<int> q1;
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */