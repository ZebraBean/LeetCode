struct ListNode {
	int val;
	ListNode* next;
	ListNode() : val(0), next(nullptr) {}
	ListNode(int x) : val(x), next(nullptr) {}
	ListNode(int x, ListNode* next) : val(x), next(next) {}
};
class Solution {
public:
	ListNode* swapPairs(ListNode* head) {
		ListNode* dummyHead = new ListNode(-1);
		dummyHead->next = head;
		ListNode* pre = dummyHead;
		ListNode* cur = head;
		ListNode* curNext = nullptr;
		while (cur != nullptr && cur->next != nullptr) {
			curNext = cur->next;

			pre->next = curNext;
			cur->next = curNext->next;
			curNext->next = cur;

			pre = cur;
			cur = cur->next;
		}
		return dummyHead->next;
	}
};