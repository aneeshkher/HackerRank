#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int test_cases, i, cycles, j;
    int height = 1;
    scanf("%d",&test_cases);
    int A[test_cases];
    int answer[test_cases];
    for (i = 0; i<test_cases; i++) {
        scanf("%d", &A[i]);
    }

    for (i = 0; i<test_cases; i++) {
        cycles = A[i];
        if (cycles == 0) {
            answer[i] = 1;
            continue;
        }
        height = 1;
        //printf("Cycles: %d\n",cycles);
        for (j = 1; j<=cycles; j++) {
            if (j%2 == 1) {
                //printf("Inside ODD. Cycle number: %d\n",j);
                height = height * 2;
                //printf(" Height after: %d\n", height);
            } else {
                //printf("Inside EVEN. Cycle number: %d\n",j);
                height++;
                //printf(" Height after: %d\n", height);
            }
        }
        answer[i] = height;
    }

    for (i = 0; i< test_cases; i++) {
        printf("%d\n", answer[i]);
    }

    return 0;
}