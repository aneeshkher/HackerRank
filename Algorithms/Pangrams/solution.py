# Enter your code here. Read input from STDIN. Print output to STDOUT

my_string = raw_input("")
my_string = my_string.upper()
count = 0
my_list = []
for c in my_string:
    if c in my_list:
        next
    else:
        if ord(c) < 91 and ord(c) > 64:
            my_list.append(c)
            count = count + 1
            if count == 26:
                print "pangram"
                exit()
print "not pangram"