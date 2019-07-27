#include<stdio.h>

int main()
{
  char a[100];
  int count=0,i;
  scanf("%[^\n]s",a);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==' ')
      count++;
  }
  count=count+1;
  printf("%d",count);
  return 0;
}