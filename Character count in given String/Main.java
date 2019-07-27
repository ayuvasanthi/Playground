#include<stdio.h>
int main()
{
	char a[50];
  int count=1,i,len;
      scanf("%s",a);
  for(len=0;a[len]!=0;len++);
  if(len<20)
  {
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==a[i+1])
      count++;
    else
    {
      printf("%c%d",a[i],count);
    count=1;
  }
  }  
}
  else
    printf("Invalid Input");
  return 0;
}