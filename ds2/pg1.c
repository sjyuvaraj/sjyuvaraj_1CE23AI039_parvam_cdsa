#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int n = 7;
typedef struct {
char *Dname;
int dt;
char *act;
} calendar;
calendar *cal;
void create() {
cal = (calendar*)malloc(n * sizeof(calendar));
}
void read() {
int i;
for (i = 0; i < n; i++) {
cal[i].Dname = (char*)malloc(n * sizeof(char)); 
printf("Enter the day=");
scanf("%s", cal[i].Dname);
printf("Enter the date=");
scanf("%d", &cal[i].dt);
fflush(stdin);
cal[i].act = (char*)malloc(n * sizeof(char)); 

printf("Enter the activity of the day=");
scanf("%s", cal[i].act);
printf("\n");
}
}
void display() {
int i;
for (i = 0; i < n; i++) {
printf("Day=%s\n Date=%d\n activity=%s\n\n", cal[i].Dname, cal[i].dt, cal[i].act);
}
}
int main() {
create();
read();
display();
return 0;
}