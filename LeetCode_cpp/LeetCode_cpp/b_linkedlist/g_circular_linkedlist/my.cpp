#include<iostream>
#include<map>
using namespace std;
struct ListNode {
	int val;
	ListNode* next;
	ListNode() : val(0), next(nullptr) {}
	ListNode(int x) : val(x), next(nullptr) {}
	ListNode(int x, ListNode* next) : val(x), next(next) {}
};
class Solution {
public:
	ListNode* detectCycle(ListNode* head) {
		map<ListNode*, int> hash;
		ListNode* p = head;
		while (p != nullptr) {
			if (hash.find(p) == hash.end()) {
				//没找到
				hash[p] = 1;
			} else {
				//找到了
				return p;
			}
			p = p->next;
		}
		return nullptr;
	}
};