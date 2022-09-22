struct ListNode {
	int val;
	ListNode* next;
	ListNode() : val(0), next(nullptr) {}
	ListNode(int x) : val(x), next(nullptr) {}
	ListNode(int x, ListNode* next) : val(x), next(next) {}
};
class Solution {
public:
	ListNode* getIntersectionNode(ListNode* headA, ListNode* headB) {
		int lenA = 0;
		int lenB = 0;
		ListNode* pa = headA;
		ListNode* pb = headB;
		while (pa != nullptr) {
			pa = pa->next;
			lenA++;
		}
		while (pb != nullptr) {
			pb = pb->next;
			lenB++;
		}
		pa = headA;
		pb = headB;
		if (lenA > lenB) {
			int c = lenA - lenB;
			while (c) {
				pa = pa->next;
			}
		} else {
			int c = lenB - lenA;
			while (c) {
				pb = pb->next;
			}
		}
		while (pa != nullptr) {
			if (pa == pb) {
				return pa;
			}
			pa = pa->next;
			pb = pb->next;
		}
		return nullptr;
	}
};