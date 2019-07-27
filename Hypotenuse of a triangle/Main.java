#include<stdio.h>
#include<math.h>
int main()
{
  float o,a,h;
  scanf("%f%f",&o,&a);
  h=sqrt(pow(o,2)+pow(a,2));
  printf("%.2f",h);
  return 0;
}