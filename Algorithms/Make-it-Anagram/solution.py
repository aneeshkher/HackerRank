# Enter your code here. Read input from STDIN. Print output to STDOUT

if __name__ == '__main__':
    line1 = raw_input().strip()
    line2 = raw_input().strip()
    
    str1 = list(line1)
    str2 = list(line2)
    fin_str1 = list(line1)
    fin_str2 = list(line2)
    
    len1 = len(str1)
    len2 = len(str2)
    
    for i in xrange(0, len(str1)):
        for j in xrange(0, len(str2)):
            if str1[i] == str2[j]:
                str1[i] = '?'
                str2[j] = '?'
                break
    count = 0
    for i in xrange(0, len(str1)):
        if str1[i] != '?':
            count = count + 1
    for i in xrange(0, len(str2)):
        if str2[i] != '?':
            count = count + 1
    print count
                