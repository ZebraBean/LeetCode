//#include<vector>
//#include<string>
//using namespace std;
//class Solution {
//public:
//	ListNode* swapPairs(ListNode* head) {
//		if (head == nullptr) {
//			return nullptr;
//		}
//		ListNode* pre = nullptr;
//		ListNode* cur = head;
//		ListNode* curNext = head->next;
//		if (curNext != nullptr) {
//			head = head->next;
//		}
//		while (cur != nullptr && curNext != nullptr) {
//			ListNode* temp = curNext->next;
//			cur->next = temp;
//			curNext->next = cur;
//			if (pre != nullptr)
//				pre->next = curNext;
//
//			pre = cur;
//			cur = temp;
//			if (temp != nullptr)
//				curNext = temp->next;
//		}
//
//		return head;
//	}
//};