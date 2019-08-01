#include<stdio.h>
int main()
{
  //Type your code here
  int a,l,f,s;
  scanf("%d",&a);
  l=a%10;
    f=a;
  while(a>=10)
  {
    a=a/10;
  }
  f=a;
  s=f+l;
  printf("%d",s);
}