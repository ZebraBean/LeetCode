struct ListNode {
	int val;
	ListNode* next;
	ListNode() : val(0), next(nullptr) {}
	ListNode(int x) : val(x), next(nullptr) {}
	ListNode(int x, ListNode* next) : val(x), next(next) {}
};
class {
public:
	ListNode* reverse(ListNode* pre, ListNode* cur) {
		if (cur == nullptr) return pre;
		ListNode* temp = cur->next;
		cur->next = pre;
		// ���Ժ�˫ָ�뷨�Ĵ�����жԱȣ����µݹ��д������ʵ��������������
		// pre = cur;
		// cur = temp;
		return reverse(cur, temp);
	}
	ListNode* reverseList(ListNode* head) {
		// ��˫ָ�뷨��ʼ����һ�����߼�
		// ListNode* cur = head;
		// ListNode* pre = NULL;
		return reverse(nullptr, head);
	}
};