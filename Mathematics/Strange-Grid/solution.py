# Enter your code here. Read input from STDIN. Print output to STDOUT

import math

line = raw_input("")
r, c = map(int, line.split())

if r % 2 == 0:
    answer = (int(r/2) - 1)*10 + 1 + (c - 1)*2
else:
    answer = int(math.floor(r/2))*10 + (c - 1)*2
print answer