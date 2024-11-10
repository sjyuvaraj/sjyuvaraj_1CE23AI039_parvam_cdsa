#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    char data[16];
    struct Node *link;
} Node;

void deleteAllNodes(Node *head)
{
    Node *temp = head;
    if (temp == NULL)
        return;
    if (temp->link == NULL)
    {
        free(temp);
        return;
    }
    Node *temp2 = temp;
    while (temp != NULL)
    {
        temp2 = temp;
        free(temp2);
        temp = temp->link;
    }
    free(temp2);
}

Node *insertAtFront(Node *first) // call by value
{
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->link = NULL;
    printf("Enter data of the node: ");
    scanf("%s", newNode->data);
    if (first == NULL) // check if list is empty
        return newNode;
    newNode->link = first;
    return newNode;
}

Node *insertAtRear(Node *first) // call by value
{
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->link = NULL;
    printf("Enter data of the node: ");
    scanf("%s", newNode->data);
    if (first == NULL) // check if list is empty
        return newNode;
    if (first->link == NULL)
    {
        first->link = newNode;
        return first;
    }
    Node *temp = first;
    while (temp->link != NULL)
        temp = temp->link;
    temp->link = newNode;
    return first;
}

void deleteFromFront(Node **head) // call by address
{
    if (*head == NULL)
    {
        puts("List is empty");
        return;
    }
    Node *temp = *head;    // copy address of 1st node into temp
    *head = (*head)->link; // make head point to 2nd node. Note that we are accessing the actual head
    printf("Node with data %s is deleted \n", temp->data);
    free(temp);
}

Node *deleteFromRear(Node *head) // call by value
{
    if (head == NULL)
    {
        puts("List is empty");
        return head;
    }
    if (head->link == NULL)
    {
        printf("Node with data %s is deleted \n", head->data);
        free(head);
        return NULL;
    }
    Node *temp = head;
    while (temp->link->link != NULL) // check if next node is last node
        temp = temp->link;           // traverse to the next node
    printf("Node with data %s is deleted \n", temp->link->data);
    free(temp->link);  // delete last node
    temp->link = NULL; // make the last but node as the last node
    return head;
}

void displayList(const Node *head)
{
    if (head == NULL)
    {
        puts("List is empty");
        return;
    }
    puts("List elements are");
    while (head != NULL)
    {
        printf("%s   ", head->data);
        head = head->link;
    }
}

int main()
{
    Node *head = NULL;
    int choice = 0, numberOfOperations = 15;
    do
    {
        printf("\n1:InsertFront 2:InsertRear 3:DeleteFront 4:DeleteRear 5:Display 6:Exit.  Your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            head = insertAtFront(head);
            break;
        case 2:
            head = insertAtRear(head);
            break;
        case 3:
            deleteFromFront(&head);
            break;
        case 4:
            head = deleteFromRear(head);
            break;
        case 5:
            displayList(head);
            break;
        case 6:
            numberOfOperations = 0;
            break;
        default:
            puts("Invalid choice given");
        }
        numberOfOperations--;
    } while (numberOfOperations >= 0);
    deleteAllNodes(head);
    puts("End of program");
    return 0;
}