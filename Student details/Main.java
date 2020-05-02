#include<iostream>
#include<string.h>
using namespace std;
struct Student
{
  char name[30]; char department[20]; int yearOfStudy; float cgpa;
  int n;
};
int main()
{
  int n;
  cout<<"Enter the number of students";
  cin>>n;
  Student s[n],temp;
  for(int i=0;i<n;i++)
  {
    s[i].n=i+1;
    cout<<"\nEnter the details of student "<<i+1<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter department";
    cin>>s[i].department;
    cout<<"\nEnter year of study";
    cin>>s[i].yearOfStudy;
    cout<<"\nEnter cgpa";
    cin>>s[i].cgpa;
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(strcmp(s[i].name,s[j].name)>0)
      {
        temp=s[i];
        s[i]=s[j];
        s[j]=temp;
      }
    }
  }
  cout<<"\nDetails of students";
  for(int i=0;i<n;i++)
  {
    cout<<"\nStudent "<<i+1<<"\nName:"<<s[i].name<<"\nDepartment:"<<s[i].department<<"\nYear of study:"<<s[i].yearOfStudy<<"\nCGPA:"<<s[i].cgpa;
  }
}