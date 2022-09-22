#include<iostream>
using namespace std;
class MyLinkedList {
public:
	struct Node {
		int val;
		Node* next;
		Node(int v) {
			val = v;
			next = nullptr;
		}
	};
	Node* linkedList;
	int len;

	MyLinkedList() {
		linkedList = new Node(-1);
		len = 0;
	}

	int get(int index) {
		if (len <= index) {
			return -1;
		}
		Node* p = linkedList->next;
		for (int i = 0; i < index; i++) {
			p = p->next;
		}
		return p->val;
	}

	void addAtHead(int val) {
		Node* node = new Node(val);
		node->next = linkedList->next;
		linkedList->next = node;
		len++;
	}

	void addAtTail(int val) {
		Node* p = linkedList;
		while (p->next != nullptr) {
			p = p->next;
		}
		Node* node = new Node(val);
		p->next = node;
		len++;
	}

	void addAtIndex(int index, int val) {
		if (index > len) {
			return;
		} else if (index < 0) {
			addAtHead(val);
			return;
		}
		Node* p = linkedList;
		for (int i = 0; i < index; i++) {
			p = p->next;
		}
		Node* node = new Node(val);
		node->next = p->next;
		p->next = node;
		len++;
	}

	void deleteAtIndex(int index) {
		if (index >= 0 && index < len) {
			Node* p = linkedList;
			for (int i = 0; i < index; i++) {
				p = p->next;
			}
			p->next = p->next->next;
			len--;
		}
	}
};