#include<iostream>
using namespace std;
class Solution {
public:
	bool canConstruct(string ransomNote, string magazine) {
		int hash[26] = { 0 };
		for (auto c : ransomNote) {
			hash[c - 'a']++;
		}
		for (auto c : magazine) {
			hash[c - 'a']--;
		}
		for (auto i : hash) {
			if (i > 0) {
				return false;
			}
		}
		return true;
	}
};