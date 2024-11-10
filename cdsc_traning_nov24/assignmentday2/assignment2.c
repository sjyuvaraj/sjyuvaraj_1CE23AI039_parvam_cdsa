#include<stdio.h>
void main(){
    float inputNumber = 0.0;
    int tempNumber = 0;
    puts("Enter a floating point number to typecast it to integer");
    scanf("%f", &inputNumber);
    if (inputNumber >= -1000.0 && inputNumber <= 1000.0){
        tempNumber = inputNumber;
        printf("The floating point number is %0.2f and the number after type casting it is %d", inputNumber, tempNumber);
    }
    else
        puts("Enter a value between -1000.0 and 1000.0");
}
