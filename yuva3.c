// Program to implement strrev()
#include <stdio.h>

char *strCpy(char *destination, const char *source)
{
    int i = 0;
    for (; source[i] != '\0'; i++)
    {
        destination[i] = source[i];
    }
    destination[i] = '\0';
    return destination;
}

int strLen(const char myString[])
{
    int i = 0;
    for (; myString[i] != '\0'; i++)
        ;
    return i;
}

char *strRev(char *my_string)
{
    int j = strLen(my_string) - 1;
    char temp = '\0';
    for (int i = 0; i < j; i++, j--)
    {
        temp = my_string[i];
        my_string[i] = my_string[j];
        my_string[j] = temp;
    }
    return my_string;
}

int main(int argCount, char *args[])
{
    char userString[32] = ""; // {'\0'}
    strCpy(userString, args[1]);
    printf("User given string is %s \n", userString);
    strRev(userString);
    printf("Reversed user string is %s", userString);
}