#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,d;
  scanf("%f %f",&a,&b);
  d=hypot(a,b);
  printf("%.2f",d);
  return 0;
}