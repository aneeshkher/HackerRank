# Enter your code here. Read input from STDIN. Print output to STDOUT

number_of_rocks = input()

rock1 = raw_input()
gems = []
final = []
for c in rock1:
    if c in gems:
        continue
    else:
        gems.append(c)
        final.append(c)

for z in xrange(1, number_of_rocks):
    rock = raw_input()
    for c in gems:
        if c in rock:
            continue
        else:
            if c in final:
                final.remove(c)
                if len(final) == 0:
                    print len(final)
                    exit()
print len(final)
