# Enter your code here. Read input from STDIN. Print output to STDOUT

import math

test_cases = raw_input("")

for j in range(0, int(test_cases)):
    temp = raw_input("")
    tc = long(temp)
    divisors = 0;
    #last = long(math.floor(tc/2)) + 1
    root = math.floor(math.sqrt(tc))
    i = 2;
    while (i <= root):
        if tc % i == 0:
            if i % 2 == 0:
                divisors = divisors + 1
            if i != tc/i:
                if (tc/i) % 2 == 0:
                    divisors = divisors + 1
        i = i + 1
    
    if tc % 2 == 0:
        print divisors + 1
    else:
        print divisors
    