#include <stdio.h>
int main() {
	//Type your code
  int num,f,l,sum=0;
  scanf("%d",&num);
  l=num%10;
  f=num;
  while(num>=10)
  {
    num=num/10;
  }
  f=num;
  sum=f+l;
  printf("%d",sum);
    
	return 0;
}