import sys

total = int(sys.stdin.readline().strip())
count = int(sys.stdin.readline().strip())

sum = 0

for i in range(count):
    a, b = map(int, sys.stdin.readline().strip().split())
    c = a*b
    sum += c

if total == sum:
    print('Yes')
else:
    print('No')