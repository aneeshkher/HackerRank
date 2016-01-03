# Enter your code here. Read input from STDIN. Print output to STDOUT

import math

test_cases = raw_input("")

for i in range(0, int(test_cases)):
    tc = raw_input("")
    n, k = map(int, tc.split())
    
    my_list = range(n)
    list2 = range(n)
    if n % 2 == 0:
        count = 0
        for j in range(1, n, 2):
            list2[j] = my_list[count]
            count = count + 1
        count = n - 1;
        for j in range(0, n - 1, 2):
            list2[j] = my_list[count]
            count = count - 1
    else:
        count = 0
        for j in range(1, n - 1, 2):
            list2[j] = my_list[count]
            count = count + 1
        count = n - 1
        for j in range(0, n, 2):
            list2[j] = my_list[count]
            count = count - 1
    for j in range(n):
        if list2[j] == k:
            print j
            break;
        