# Enter your code here. Read input from STDIN. Print output to STDOUT

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
    x1, y1, x2, y2 = map(int, tc.split());
    gcd1 = find_gcd(x1, y1)
    gcd2 = find_gcd(x2, y2)
    if gcd1 == gcd2:
        print "YES"
    else:
        print "NO"