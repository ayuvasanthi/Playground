#include<stdio.h>
int main()
{
 int n,s,f,l;
  scanf("%d",&n);
  f=n/10;
  l=n%10;
  s=f+l;
  printf("%d",s);
  return 0;
}