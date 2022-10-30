#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
#include<deque>
using namespace std;

//单调队列
class Solution {
public:
	class MyQueue {
	public:
		deque<int> deq;
		void push(int x) {
			while (!deq.empty() && deq.back() < x) {
				deq.pop_back();
			}
			deq.push_back(x);
		}
		void pop(int x) {
			if (!deq.empty() && deq.front() == x) {
				deq.pop_front();
			}
		}
		int front() {
			return deq.front();
		}
	};
	vector<int> maxSlidingWindow(vector<int>& nums, int k) {
		MyQueue myqueue;
		vector<int> ans;
		for (int i = 0; i < k; i++) {
			myqueue.push(nums[i]);
		}
		int leftPos = 0;
		ans.push_back(myqueue.front());
		for (int i = k; i < nums.size(); i++) {
			myqueue.pop(nums[leftPos++]);
			myqueue.push(nums[i]);
			ans.push_back(myqueue.front());
		}
		return ans;
	}
};