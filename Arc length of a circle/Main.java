#include<stdio.h>
int main()
{
  float r,a,l;
  scanf("%f%f",&r,&a);
  l=(float)(a*2*3.14*r)/360;
  printf("%.2f",l);
  return 0;
}