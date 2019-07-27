#include<stdio.h>
int main()
{
  int a[20],i,n,e,count=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&e);
   for(i=1;i<=n;i++)
   {
  if(a[i]==e)
  {
    printf("%d",i);
    count++;
   }
   }
   if(count==0)
     printf("%d isn't present in the array.",e);
  return 0;
}
