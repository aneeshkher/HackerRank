# Enter your code here. Read input from STDIN. Print output to STDOUT

import math

test_cases = raw_input("")

for i in range(0, int(test_cases)):
    temp = raw_input("")
    tc = long(temp)
    answer = tc**2 % (10**9 + 7)
    print answer