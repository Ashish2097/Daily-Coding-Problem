#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* npx;
};

struct node* XOR(struct node *a, struct node *b) {
    return (struct node*)((unsigned int) (a) ^ (unsigned int) (b));
}

void insert(struct node **head_ref, int data) {
    //make new node
    struct node *new_node = (struct node *) malloc(sizeof(struct node));
    new_node->data = data;
    //insert it in the beginning by setting its npx = head^null---------NULL---(new)---head-...
    new_node->npx = XOR(*head_ref, NULL);
    //if list was not empty ..npx of head must be changed .......new----(head)-----next
    if(*head_ref != NULL) {
        struct node* next = XOR((*head_ref)->npx, NULL);
        (*head_ref)->npx = XOR(new_node, next);
    }
    // reseting head
    *head_ref = new_node;
}

void printList(struct node *head) {
    struct node *curr = head;
    struct node *prev = NULL;
    struct node *next;

    while(curr != NULL) {
        printf("%d ", curr->data);
        next = XOR(prev, curr->npx);
        prev = curr;
        curr = next;
    }
}
int main()
{
    struct node *head = NULL;
    insert(&head, 10);
    insert(&head, 20);
    insert(&head, 30);
    insert(&head, 40);

    printList(head);
    return 0;
}