#include<stdio.h>
int main()
{
  int a,b,lcm;
  scanf("%d%d",&a,&b);
  lcm=(a>b)?b:a;
  while(1)
  {
  if(lcm%a==0&&lcm%b==0)
  {
    printf("%d",lcm);
  break;
  }
    lcm++;
  }
  return 0;
}