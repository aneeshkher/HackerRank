#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int FindSmallest(int *, int);
void CutSticks(int *, int, int, int *);
void PrintArray(int *, int);

int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    int arr_i;
    for(arr_i = 0; arr_i < n; arr_i++){
       scanf("%d",&arr[arr_i]);
    }

    int remaining = n;
    while (remaining > 0) {
        printf("%d", remaining);
        //PrintArray(arr, n);
        //printf(" - Remaining: %d ", remaining);
        printf("\n");
        int smallest = FindSmallest(arr, n);
        CutSticks(arr, smallest, n, &remaining);
    }
    return 0;
}


void
CutSticks (int *arr, int cut, int n, int *rem)
{
    int i;
    for (i = 0; i < n; i++) {
        arr[i] = arr[i] - cut;
        if (arr[i] == 0) {
            *rem = *rem - 1;
        }
    }

}

int
FindSmallest (int *arr, int n)
{
    int i, smallest;
    
    for (i = 0; i < n; i++) {
        if (arr[i] > 0) {
            smallest = arr[i];
            break;
        }
    }

    for (i = 0; i < n; i++) {
        if ((arr[i] < smallest) && (arr[i] > 0)) {
            smallest = arr[i];
        }
    }
    return smallest;
}

void
PrintArray (int *arr, int n)
{
    int i;
    printf(" - ");
    for (i = 0; i < n; i++) {
        printf(" %d ", arr[i]);
    }
    //printf("\n");
}

