# Enter your code here. Read input from STDIN. Print output to STDOUT

import sys

def rotate(a, b, c, d, matrix = []):
    temp = matrix[a][b]
    for i in xrange(a, b, -1):
        matrix[i][b] = matrix[i - 1][b]
        
    for i in xrange(b, c):
        matrix[b][i] = matrix[b][i + 1] 
        
    for i in xrange(b, a):
        matrix[i][c] = matrix[i + 1][c]
        
    for i in xrange(c, b + 1, -1):
        matrix[a][i] = matrix[a][i - 1]
        
    matrix[a][b + 1] = temp
    
    return matrix

first_line = raw_input()
M, N, R = map(int, first_line.split())

matrix = []
for z in xrange(0, M):
    row_raw = raw_input()
    row = map(int, row_raw.split())
    matrix.append(row)

rotations = 0
iterator = 0
if min(M, N) == M:
    rotations = 2 * N + 2 * (M - 2)
    iterator = M/2
else:
    rotations = 2 * M + 2 * (N - 2)
    iterator = N/2
if M == N:
    rotations = 2 * M + 2 * (N - 2)
    iterator = M/2


for k in xrange(1, iterator + 1):
    mult = k - 1
    rotations = 2 * (max(N,M) - 2*mult) + 2 * (min(M,N) - 2 - 2*mult)
    for j in xrange(0, R % rotations):
        a = M - k
        b = k - 1
        c = N - k
        d = k - 1
        matrix = rotate(a, b, c, d, matrix)

for i in xrange(0, M):
    for j in xrange(0, N - 1):
        sys.stdout.write(str(matrix[i][j]))
        sys.stdout.write(" ")
    sys.stdout.write(str(matrix[i][j + 1]))
    print ("")
