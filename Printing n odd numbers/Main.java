#include <stdio.h>
int main() {
	int num,i,j;
  scanf("%d",&num);
  for(i=1,j=1;j<=num;i=i+2,j++)
  {
    if(i%2==1)
    {
    printf("%d\n",i);
    }
  }
	return 0;
}