//#include<iostream>
//#include<vector>
//#include<string>
//#include<algorithm>
//using namespace std;
///**
// * Definition for a binary tree node.
// * struct TreeNode {
// *     int val;
// *     TreeNode *left;
// *     TreeNode *right;
// *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
// *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
// *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
// * };
// */
//class Solution {
//public:
//    TreeNode* invertTree(TreeNode* root) {
//        if (root == nullptr) {
//            return nullptr;
//        }
//        stack<TreeNode*> st;
//        TreeNode* cur = root;
//        while (cur != nullptr || !st.empty()) {
//            while (cur != nullptr) {
//                swap(cur->left, cur->right);
//                st.push(cur);
//                cur = cur->left;
//            }
//            TreeNode* top = st.top();
//            st.pop();
//            cur = top->right;
//
//        }
//        return root;
//    }
//};