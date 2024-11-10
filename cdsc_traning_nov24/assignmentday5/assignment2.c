//Remove duplicates from an array
#include<stdio.h>
int main(){
    int num, temp, digit;
    int arr[10]={0};
    int place=1;
    int result=0;
    printf("enter a number:");
    scanf("%d",&num);
    temp=num;
    while(temp>0){
        digit=temp % 10;
        temp=temp/10;
        if(arr[digit]==0){
            arr[digit]=1;
            result=result+digit*place;
            place=place*10;
        }
    }
    printf("number after removing the duplicate is :%d",result);
    return 0;
}