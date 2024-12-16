#include <stdio.h>
#include <stdlib.h>
#define MAX_EMPLOYEES 100
#define TABLE_SIZE 10
struct Employee {
int key;
};
struct HashEntry {
struct Employee employee;
int isOccupied;
};
void initializeHashTable(struct HashEntry hashTable[], int size) {
for (int i = 0; i < size; i++) {
hashTable[i].isOccupied = 0;
}
}
int hashFunction(int key, int size) {
return key % size;
}
void insert(struct HashEntry hashTable[], int size, struct Employee employee) {
int key = employee.key;
int index = hashFunction(key, size);
while (hashTable[index].isOccupied) {
index = (index + 1) % size; 
if (index == hashFunction(key, size)) {
printf("Hash table is full. Cannot insert employee with key %d.\n", key);
return;
}
}
hashTable[index].employee = employee;
hashTable[index].isOccupied = 1;
printf("Employee with key %d inserted at index %d\n", key, index);
}
void displayHashTable(struct HashEntry hashTable[], int size) {
printf("\nHash Table:\n");
printf("Index\tKey\n");
for (int i = 0; i < size; i++) {
printf("%d\t", i);
if (hashTable[i].isOccupied) {
printf("%d\n", hashTable[i].employee.key);
} else
{
printf("Empty\n");
}
}
}
int main() {
struct HashEntry hashTable[TABLE_SIZE];
struct Employee employees[MAX_EMPLOYEES];
int n; 
printf("Enter the number of employee records: ");
scanf("%d", &n);
printf("Enter the employee records (key only):\n");
for (int i = 0; i < n; i++) {
printf("Employee %d key: ", i + 1);
scanf("%d", &employees[i].key);
}
initializeHashTable(hashTable, TABLE_SIZE);
for (int i = 0; i < n; i++) {
insert(hashTable, TABLE_SIZE, employees[i]);
}
displayHashTable(hashTable, TABLE_SIZE);
return 0;
}
