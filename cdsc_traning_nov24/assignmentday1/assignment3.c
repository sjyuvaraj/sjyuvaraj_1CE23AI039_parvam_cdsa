#include<stdio.h>
void main() {
    int inputNumber;
    puts("Enter the number to check if it falls between 10 and 20 and it is an Even number");
    scanf("%d", &inputNumber);
    if (inputNumber >= 10 && inputNumber <= 20 && inputNumber % 2 == 0)
        printf("The given number %d is valid", inputNumber);
    else
        printf("The given number %d is Invalid", inputNumber);
}