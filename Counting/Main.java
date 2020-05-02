#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[200];int v=0,c=0,w=0,d=0,s=0;
  cin.getline(str,500);
  for(int i=0;i<strlen(str);i++)
  {
    if(str[i]==' ')
      w++;
    else if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
      v++;
    else if(str[i]>='0' && str[i]<='9')
      d++;
    else if((str[i]>='A' && str[i]<='Z') || (str[i]>='a' && str[i]<='z'))
      c++;
    else
      s++;
  }
    cout<<"Vowels:"<<v;
    cout<<"\nConsonants:"<<c;
    cout<<"\nWhite Spaces:"<<w;
    cout<<"\nDigits:"<<d;
    cout<<"\nSymbols:"<<s;
}