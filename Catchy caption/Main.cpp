#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  static char str[100];
  int w=1;
  cin.getline(str,100);
  for(int i=0;str[i]!='\0';i++)
    if(str[i]==' ')
      w++;
  if(w<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   
}
