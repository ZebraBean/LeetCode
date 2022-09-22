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
		ListNode* fast = dummyHead;
		ListNode* slow = dummyHead;
		ListNode* pre = nullptr;
		while (n != 0) {
			fast = fast->next;
			n--;
		}
		while (fast != nullptr) {
			pre = slow;
			fast = fast->next;
			slow = slow->next;
		}
		pre->next = slow->next;
		delete(slow);
		slow = nullptr;
		return dummyHead->next;
	}
};