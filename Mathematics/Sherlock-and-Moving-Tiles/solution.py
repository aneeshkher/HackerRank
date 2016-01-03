# Enter your code here. Read input from STDIN. Print output to STDOUT
import math

first_line = raw_input("")

L = long(first_line.split()[0])
S1 = long(first_line.split()[1])
S2 = long(first_line.split()[2])

diagonal = L*math.sqrt(2)

q = raw_input("")

for i in range(0, int(q)):
    qi = raw_input("")
    diagonal_size = math.sqrt(long(qi))*math.sqrt(2)
    difference = diagonal - diagonal_size
    if S1 > S2:
        time = difference/(S1 - S2)
        print ("%.5f" % time)
    else:
        time = difference/(S2 - S1)
        print ("%.5f" % time)