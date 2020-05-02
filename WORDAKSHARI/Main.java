#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50][50];int i;
  for(i=0;i<50;i++)
  {
    cin.getline(a[i],50);
    if(!(strcmp(a[i],"####")))
      break;
  }
  cout<<a[0]<<endl;
  for(int j=0;j<i;j++)
    if(a[j][strlen(a[j])-1]==a[j+1][0])
      cout<<a[j+1]<<endl;
}