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
		ListNode* cur = head;
		ListNode* curNext = nullptr;
		ListNode* pre = nullptr;
		while (cur != nullptr) {
			if (cur->next == nullptr) {
				break;
			}
			if (cur == head) {
				head = cur->next;
			}

			curNext = cur->next;
			cur->next = curNext->next;
			curNext->next = cur;
			if (pre != nullptr) {
				pre->next = curNext;
			}
			pre = cur;
			cur = cur->next;
		}
		return head;
	}
};