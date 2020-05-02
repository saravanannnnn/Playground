#include<iostream>
using namespace std;
struct Time
{
  int h,m,s;
}t1,t2;
int main()
{
  int h,m,s;
  cin>>t1.h>>t1.m>>t1.s>>t2.h>>t2.m>>t2.s;
  if(t1.s<t2.s)
  {
    s=60+t1.s-t2.s;
    t1.m-=1;
  }
  else
  	s=t1.s-t2.s;
  if(t1.m<t2.m)
  {
    m=60+t1.m-t2.m;
    t1.h-=1;
  }
  else
  	m=t1.m-t2.m;
  h=t1.h-t2.h;
  cout<<h<<":"<<m<<":"<<s;
}