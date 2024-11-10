#include <math.h>
#include <stdio.h>

int checkPrime(int number)
{
    int isPrime = 1;
    for (int i = 2; i <= ceil(sqrt(number)); i++)
    {
        if (number % i == 0)
        {
            isPrime = 0;
            break;
        }
    }
    return isPrime;
}

int main()
{
    int m = 0, n = 0;
    puts("Enter values for M and N (M < N)");
    scanf("%d%d", &m, &n);
    printf("Prime numbers between %d and %d are \n", m, n);
    for (int i = m; i <= n; i++)
    {
        if (checkPrime(i) == 1)
            printf("%-5d", i);
    }
    return 0;
}