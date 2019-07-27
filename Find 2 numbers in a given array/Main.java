#include<stdio.h>
int main()
{
  	int a,b,n,arr[100],i,count1=0,count2=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  scanf("%d%d",&a,&b);
   for(i=0;i<n;i++)
   {
     if(a==arr[i])
     {
       printf("Element 1 index = %d",i);
    count1++;
     }
      }
  if(count1==0)
    printf("Element 1 index = -1");
   for(i=0;i<n;i++)
   {
     if(b==arr[i])
     {
       printf("\nElement 2 index = %d",i);
    count2++;
     }
   }
  if(count2==0)
    printf("\nElement 2 index = -1");
  return 0;
}