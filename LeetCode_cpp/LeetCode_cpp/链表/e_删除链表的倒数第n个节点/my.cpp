struct ListNode {
	int val;
	ListNode* next;
	ListNode() : val(0), next(nullptr) {}
	ListNode(int x) : val(x), next(nullptr) {}
	ListNode(int x, ListNode* next) : val(x), next(next) {}
};
class Solution {
public:
	ListNode* removeNthFromEnd(ListNode* head, int n) {
		ListNode* dummyHead = new ListNode(-1);
		dummyHead->next = head;
		ListNode* p = dummyHead;
		ListNode* slow = dummyHead;
		while (n != 0) {
			p = p->next;
			n--;
		}
		while (p->next != nullptr) {
			p = p->next;
			slow = slow->next;
		}
		slow->next = slow->next->next;
		return dummyHead->next;
	}
};