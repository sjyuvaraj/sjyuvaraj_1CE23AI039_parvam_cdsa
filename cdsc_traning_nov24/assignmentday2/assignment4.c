#include<stdio.h>
void main(){
    char hexValue[10];
    int decimalValue = 0;
    puts("Enter a hexadecimal value");
    scanf("%s", hexValue);
    sscanf(hexValue, "%x", &decimalValue);
    printf("Decimal number is %5d\n", decimalValue);
    printf("Octal number is %5o\n", decimalValue);
    printf("Uppercase Hexadecimal is %5X\n", decimalValue);
}