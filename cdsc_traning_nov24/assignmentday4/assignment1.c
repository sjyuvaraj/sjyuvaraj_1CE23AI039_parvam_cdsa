#include <stdio.h>
void printFibonacci(int n) {
    int first = 1, second = 2, next;
    if (n >= 1) printf("%d ", first);  
    if (n >= 2) printf("%d ", second);  
    for (int i = 3; i <= n; i++) {
        next = first + second;
        printf("%d ", next);
        first = second; 
        second = next; 
    }
}
int main() {
    int n;
    printf("Enter the number of terms in the Fibonacci series: ");
    scanf("%d", &n);
    printf("Fibonacci series: ");
    printFibonacci(n);
    return 0;
}