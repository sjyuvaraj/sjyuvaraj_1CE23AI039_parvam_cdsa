#include <stdio.h>
#define size 5
void insertq(int[], int);
void deleteq(int[]);
void display(int[]);
int front = -1;
int rear = -1;
int main() {
int n, ch;
int queue[size];
do {
printf("\n\n Circular Queue:\n1. Insert \n2. Delete\n3. Display\n0. Exit");
printf("\nEnter Choice 0-3? : ");
scanf("%d", &ch);
switch (ch) {
case 1:
printf("\nEnter number: ");
scanf("%d", &n);
insertq(queue, n);
break;
case 2:
deleteq(queue);
break;
case 3:
display(queue);
break;
case 0:
printf("Exiting...\n");
break;
default:
printf("Invalid choice, try again.\n");
}
} while (ch != 0);
}
void insertq(int queue[], int item) {
if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
printf("Queue is full\n");
return;
}
else if (rear == -1) {
rear = front = 0;
}
else if (rear == size - 1 && front > 0) {
rear = 0;
}
else {
rear++;
}
queue[rear] = item;
printf("%d inserted into queue\n", item);
}
void deleteq(int queue[]) {
if (front == -1) {
printf("Queue is empty\n");
return;
}
printf("\n%d deleted", queue[front]);
if (front == rear) {
front = rear = -1; 
}
else if (front == size - 1) {
front = 0;
}
else {
front++;
}
}
void display(int queue[]) {
int i;
if (front == -1) {
printf("Queue is empty\n");
return;
}
printf("Queue elements: ");
if (front > rear) {
for (i = front; i < size; i++) {
printf("%d ", queue[i]);
}
for (i = 0; i <= rear; i++) {
printf("%d ", queue[i]);
}
} else {
for (i = front; i <= rear; i++) {
printf("%d ", queue[i]);
}
}
printf("\n");
}