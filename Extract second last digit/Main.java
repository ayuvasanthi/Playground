#include<stdio.h>
int main()
{
  int n,l;
  scanf("%d",&n);
  n=n%100;
  l=n/10;
  printf("%d",l);
  return 0;
}