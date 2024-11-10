// Check if a number is Even or Odd
#include <stdio.h>
int main()
{
    short int inputNumber = 0;
    puts("Enter a number to check if it is Even");
    scanf("%d", &inputNumber);
    if (inputNumber % 2 == 0)
        printf("%d is an Even number", inputNumber);
    else
        printf("%d is an Odd number", inputNumber);
    return 0;
}