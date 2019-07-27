#include <stdio.h>
int main() {
	int n,l,t;
  scanf("%d",&n);
    l=n%10;
  while(n>10)
    n=n/10;
  printf("%d",n+l);
	return 0;
}