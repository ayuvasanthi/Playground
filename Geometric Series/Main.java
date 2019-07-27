#include<stdio.h>
int main()
{
  int n,i;
  int f=1,s=1;
  scanf("%d",&n);
  if(n%2==1)
  {
    for(i=1;i<(n+1)/2;i++)
    {
      f=f*2;
    }
    printf("%d",f);
  }
  else
  {
    for(i=1;i<n/2;i++)
      s=s*3;
    printf("%d",s);
  }
  return 0;
}