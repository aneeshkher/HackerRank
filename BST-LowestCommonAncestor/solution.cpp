/*
Node is defined as 

typedef struct node
{
   int data;
   node * left;
   node * right;
}node;

*/

#include<stdlib.h>

using namespace std;

node *first, *second;

node* insert_list (node *root, int data) {
    if (!root) {
        root = (node*)malloc(sizeof(node));
        root->right = NULL;
        root->data = data;
        root->left = NULL;
        return root;
    } else {
        node *temp;
        temp = root;
        
        while (temp->right) {
            temp = temp->right;
        }
        
        temp->right = (node*)malloc(sizeof(node));
        temp->right->right = NULL;
        temp->right->left = NULL;
        temp->right->data = data;
        return root;
    }
}

node* search (node *root, int data, node *list) {
    
    list = insert_list(list, root->data);
    if (root->data == data) {
        return list;
    } else if (data > root->data) {
        return search(root->right, data, list);
    } else {
        return search(root->left, data, list);
    }
}

node *normal_search (node *root, int data) {
    if (root->data == data) {
        return root;
    } else if (data > root->data) {
        return normal_search(root->right, data);
    } else {
        return normal_search(root->left, data);
    }
}

void print_list (node *list) {
    node *temp;
    temp = list;
    cout << "List -> ";
    while (temp) {
        cout << " " << temp->data << " ";
        temp = temp->right;
    }
    cout << endl;
}

node * lca(node * root, int v1,int v2)
{
    node *first, *second;
    first = NULL;
    second = NULL;
   
    first = search(root, v1, first);
    second = search(root, v2, second);

    node *t1, *t2;
    t1 = first;
    t2 = second;
    
    int common;
    while (t1->data == t2->data) {
        common = t1->data;
        if (!t1->right || !t2->right) {
            break;
        }
        t1 = t1->right;
        t2 = t2->right;
    }
    
    node *final_ans;
    final_ans = normal_search(root, common);
    
    return final_ans;
}

