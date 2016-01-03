#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    long int input[2];
    for (int i = 0; i < 2; i++) {
        scanf("%ld", &input[i]);
    }
    
    if (input[0] % 2 == 0) {
        long int answer = (input[0]/2 - 1)*10 + 1 + (input[1] - 1)*2;
        printf("%ld\n", answer);
    } else {
        long int answer = (input[0]/2)*10 + (input[1] - 1)*2;
        printf("%ld\n", answer);
    }
    
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
