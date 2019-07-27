#include<stdio.h>
int main()
{
  int n,bv,dv=0,b=1,r;
  scanf("%d",&n);
  bv=n;
  while(n>0)
  {
    r=n%10;
    dv=dv+r*b;
    n=n/10;
    b=b*2;
  }
  printf("%d",dv);
  return 0;
}