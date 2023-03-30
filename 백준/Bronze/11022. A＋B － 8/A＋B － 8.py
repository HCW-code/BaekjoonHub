import sys

count = int(sys.stdin.readline().strip())

for i in range(1, count+1):
    a, b = map(int, sys.stdin.readline().strip().split())
    c = a+b
    print('Case #%d: %d + %d = %d' %(i, a, b, c))