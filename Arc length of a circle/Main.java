#include<stdio.h>
int main()
{
  float rad,ang;
  scanf("%f %f",&rad,&ang);
  float result=2*3.14*rad;
  float result1=result*(ang/360);
  printf("%.2f",result1);
  return 0;
}