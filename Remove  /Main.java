#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[200];
  cin.getline(str,200);
  for(int i=0;i<strlen(str);i++)
  {
    if(str[i]=='t' && str[i+1]=='h' && str[i+2]=='e')
    {
      for(int j=i;str[j]!='\0';j++)
      {
        str[j-1]=str[j+3];
      }
    }
  }
  cout<<str;
}