#include <stdio.h>

int strLen(const char ptr[10])
{
    int i = 0;
    for (; ptr[i] != '\0'; i++)
        ;
    return i;
}
// *(ptr + i)

int main(int argCount, char *args[])
{
    printf("User given string is %s \n", args[1]);
    puts(args[0]);
    printf("Length of %s is %d characters", args[1], strLen(args[1]));
}