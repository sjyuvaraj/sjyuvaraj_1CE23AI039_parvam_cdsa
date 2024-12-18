#include<stdio.h>
void main ()
{
int buffer [10], produce, consume, choice=0,in = 0,out = 0,
bufsize= 10;
while (choice! =3)
{
printf("\n 1.produce 2.consume 3.exit");
printf("\n enter your choice:");
scanf("%d",&choice);
switch(choice)
{
case 1:
if((in+1)%bufsize==out)
printf("\n Buffer is full:");
else
{
printf("\n Enter the value:");
scanf("%d",&produce);
buffer[in] = produce;
in = (in+1)%bufsize;
}
break;
case 2:
if(in == out)
printf("\n Buffer is empty");
else
{
consume = buffer[out];
printf("\n The consumed value is %d", consume);
out = (out+1)%bufsize;
}
break;
}
}
}