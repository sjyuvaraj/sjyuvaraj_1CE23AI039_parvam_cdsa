
#include<stdio.h>
#include<ctype.h>
int main(){
    char inputCharacter='\0';
    printf("Enter a single character (either to change it to UpperCase if it is lower or vice versa.\n");
    scanf("%c", &inputCharacter);
    if (inputCharacter >= 65 && inputCharacter <= 90)
        inputCharacter = tolower(inputCharacter);
    else
        inputCharacter = toupper(inputCharacter);
    printf("The changed character is %c", inputCharacter);
    return 0;
}