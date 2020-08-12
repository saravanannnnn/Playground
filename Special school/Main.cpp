#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str1,str2;
  cin>>str1>>str2;
  for(int i=0,j=str2.length()-1;i<str1.length(),j>=0;i++,j--)
    if(str1[i]!=str2[j])
    {
      cout<<"It is wrong";
      return 0;
    }
  cout<<"It is correct";
}
