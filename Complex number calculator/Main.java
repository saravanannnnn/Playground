#include<iostream>
using namespace std;
int main()
{
  int x,a,b,c,d,s,t;
  cin>>x>>a>>b>>c>>d;
  if(x==1)
  {
    s=a+c;
    t=b+d;
  }
  else if(x==2)
  {
    s=a-c;
    t=b-d;
  }
  else if(x==3)
  {
    s=a*c-b*d;
    t=c*b+a*d;
  }
  else
  {
    cout<<"Invalid choice";
    return 0;
  }
  if(t>0)
  	cout<<s<<"+"<<t<<"i";
  else
    cout<<s<<t<<"i";
}