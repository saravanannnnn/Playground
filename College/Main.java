#include<iostream>
using namespace std;
struct College
{
  char name[100],city[100];
  int establishmentYear;
  float passPercentage;
};
int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  struct College c[n];
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>c[i].name;
    cout<<"\nEnter city";
    cin>>c[i].city;
    cout<<"\nEnter year of establishment";
    cin>>c[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>c[i].passPercentage;
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1<<"\nName:"<<c[i].name<<"\nCity:"<<c[i].city<<"\nYear of establishment:"<<c[i].establishmentYear<<"\nPass percentage:"<<c[i].passPercentage;
  }
}