struct ListNode {
	int val;
	ListNode* next;
	ListNode() : val(0), next(nullptr) {}
	ListNode(int x) : val(x), next(nullptr) {}
	ListNode(int x, ListNode* next) : val(x), next(next) {}
};

class {
public:
	ListNode* reverseList(ListNode* head) {
		ListNode* cur = head;
		ListNode* pre = nullptr;
		ListNode* curNext = nullptr;
		while (cur != nullptr) {
			curNext = cur->next;
			cur->next = pre;
			pre = cur;
			cur = curNext;
		}
		return pre;
	}
};