#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  string fnum;
  int flag=0;
  cin>>fnum;
  cout<<"Floating part is : ";
  for(int i=0;i<fnum.length();i++){
    if(flag==1)
      cout<<fnum.at(i);
    else
      if(fnum.at(i)=='.')
        flag=1;
  }
}
