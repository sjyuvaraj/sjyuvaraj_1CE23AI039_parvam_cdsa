#include<stdio.h>
int main() {
	int inputNumber = 0, remainderDigit = 0, sumOfDigits = 0, tempNumber = 0;
	puts("Enter a number (+ve integer) to find sum of its digits");
	scanf("%d", &inputNumber);
	tempNumber = inputNumber;
	while(inputNumber > 0) {
		remainderDigit = inputNumber % 10;
		sumOfDigits += remainderDigit;
		inputNumber = inputNumber / 10;
	}
	printf("Sum of digits of %d is %d", tempNumber, sumOfDigits);
	return 0;
}
