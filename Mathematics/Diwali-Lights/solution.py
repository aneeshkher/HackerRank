# Enter your code here. Read input from STDIN. Print output to STDOUT

test_cases = raw_input("")

for i in range (0, int(test_cases)):
    temp = raw_input("")
    tc = int(temp)
    answer = ((2**tc) - 1) % (10**5)
    print answer