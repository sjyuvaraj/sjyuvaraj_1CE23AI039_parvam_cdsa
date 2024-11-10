#include <math.h>
#include <stdio.h>
int main()
{
    int inputNumber = 0;
    int isPrime = 1;
    puts("Enter a number to check if it is Prime");
    scanf("%d", &inputNumber);

    for (int i = 2; i <= ceil(sqrt(inputNumber)); i++)
    {
        if (inputNumber % i == 0)
        {
            isPrime = 0;
            break;
        }
    }
    if (isPrime == 1)
        printf("%d is a Prime number", inputNumber);
    else
        printf("%d is not a Prime number", inputNumber);
    return 0;
}