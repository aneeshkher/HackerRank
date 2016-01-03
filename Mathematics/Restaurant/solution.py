# Enter your code here. Read input from STDIN. Print output to STDOUT

import math

def find_gcd (a, b):
    if a > b:
        if a % b == 0:
            return b
        else:
            return find_gcd(b, a % b)
    else:
        if b % a == 0:
            return a
        else:
            return find_gcd(a, b % a)

test_cases = raw_input("")

for i in range (0, int(test_cases)):
    tc = raw_input("")
    length, breadth = map(int, tc.split())
    area = length*breadth
    gcd = find_gcd(length, breadth)
    squares_area = gcd*gcd
    squares = area/squares_area;
    print squares;