#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>
using namespace std;
struct Goods
{
	string _name;  // 名字
	double _price; // 价格
	int _evaluate; // 评价

	Goods(string str, string price, string evaluate)
	{
		cout << "first";
	}
	Goods(initializer_list<string> l) {
		cout << "second";
	}
};

int main() {
	Person p;
	Teacher t;

	p = t;
	Person& pr = s;
	Person* pt = &s;

	return 0;
}
class Person {
};
class Teacher : public Person
{
protected:
	int _num; //教师编号
};

Person(const Person& p)
	: _name(p._name)
{
	cout << "Person(const Person& p)" << endl;
}

Teacher(const Teacher& s)
	:Person(s)
	, _num(s._num)
{
	cout << "Teacher(const Teacher& s)" << endl;
}
Teacher& operator=(const Teacher& s)
{
	if (this != &s)
	{
		Person::operator=(s);
		_num = s._num;
	}

	cout << "Teacher& operator=(const Teacher& s)" << endl;

	return *this;
}
class A
{
	//friend class B;
public:
	static A CreateObj()
	{
		return A();
	}
}

class Person
	...
	class Student : virtual public Person
	...
	class Teacher : virtual public Person
	...
	class Assistant : public Student, public Teacher
	...