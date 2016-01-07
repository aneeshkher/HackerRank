# Enter your code here. Read input from STDIN. Print output to STDOUT
test_cases = input()

for z in xrange(0, test_cases):
    str = raw_input()
    flag = 0
    for i in xrange(0, len(str) - 1):
        if abs(ord(str[i + 1]) - ord(str[i])) != abs(ord(str[len(str) - 2 - i]) - ord(str[len(str) - 1 - i])):
            print "Not Funny"
            flag = 1
            break
    if flag == 0:        
        print "Funny"
    else:
        flag = 0