#include<stdio.h>
int main()
{
long n,r,q;
long  int a[100],i=1,j;
  scanf("%d",&n);
  q=n;
  while(n>0)
  {
    a[i++]=q % 8;
    q=q/8;
  }
  for(j=i-1;j>0;j--)
    printf("%d",a[j]);
  return 0;
}