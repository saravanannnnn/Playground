#include<iostream>
using namespace std;
struct student
{
    char name[50];
    int roll,marks;
};
int main() 
{
  struct student s;
  cin.getline(s.name,50);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"\nStudent Details";
  cout<<"\nName: "<<s.name;
  cout<<"\nRoll: "<<s.roll;
  cout<<"\nMarks: "<<s.marks;
}