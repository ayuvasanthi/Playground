#include <stdio.h>
#include<math.h>
int main()
{
  	int b,p,a;
  scanf("%d%d",&b,&p);
  if(p>=0)
  {
  a=pow(b,p);
  printf("%d",a);
  }
  else
    printf("Wrong input");
    return 0;
}