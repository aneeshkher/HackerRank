#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int IsSquare(int);

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int test_cases;
    //scanf("%d", &test_cases);
    scanf("%d *[^\n]", &test_cases);

    int i = 0;
    for (i = 0; i < test_cases; i++) {
        char input[256];
        fgets(input, sizeof(input), stdin);
        char *first;
        first = strtok(input, " ");
        char *second;
        second = strtok(NULL, " ");

        int first_int, second_int;
        sscanf(first, "%d", &first_int);
        sscanf(second, "%d", &second_int);

        float sqrt1 = sqrt(first_int);
        float sqrt2 = sqrt(second_int);

        int lim1 = ceil(sqrt1);
        int lim2 = floor(sqrt2);

        int count = lim2 - lim1 + 1;
        
        printf("%d\n", count);

    }
    return 0;
}

int
IsSquare (int n) {
    int i;
    for (i = 0; i*i <= n; i++) {
        if (i*i == n) {
            return 1;
        }
    }
    
    return 0;
}
