#include<stdio.h>
int main()
{
  char n;
  scanf("%c",&n);
  if(isupper(n))
    putchar(tolower(n));
  else
    putchar(toupper(n));
  return 0;
}
  