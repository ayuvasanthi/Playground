#include<stdio.h>
int main()
{
 char a[100];
  int len;
  scanf("%[^\n]s",a);
  for(len=0;a[len]!='\0';len++);
  printf("%d",len);
  return 0;
}