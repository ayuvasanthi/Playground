#include<stdio.h>
int main()
{
 char a1[100],a2[100],a3[100];
  int i;
  scanf("%s%s%s",a1,a2,a3);
  for(i=0;a1[i]!='\0';i++)
  {
    if(a1[i]=='a'||a1[i]=='e'||a1[i]=='i'||a1[i]=='o'||a1[i]=='u'||a1[i]=='A'||a1[i]=='E'||a1[i]=='I'||a1[i]=='O'||a1[i]=='U')
    {
      a1[i]='$';
    }
  }
  for(i=0;a2[i]!='\0';i++)
  {
    if(!(a2[i]=='a'||a2[i]=='e'||a2[i]=='i'||a2[i]=='o'||a2[i]=='u'||a2[i]=='A'||a2[i]=='E'||a2[i]=='I'||a2[i]=='O'||a2[i]=='U'))
    {
      a2[i]='#';
    }
  }
  for(i=0;a3[i]!='\0';i++)
  {
    if(a3[i]>='a' && a3[i]<='z')
    {
      a3[i]=a3[i]-32;
    }
  }  
int len;
for(len=0;a1[len]!='\0';len++);
{
  for(i=0;a2[i]!='\0';i++)
  {
    a1[len++]=a2[i];
  }
   for(i=0;a3[i]!='\0';i++)
   {
     a1[len++]=a3[i];
   }
a1[len]='\0';
printf("%s",a1);
}
}