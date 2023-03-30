import sys

total = int(sys.stdin.readline().strip())
count = int(sys.stdin.readline().strip())

sum = 0

for _ in range(count):
    a, b = map(int, sys.stdin.readline().strip().split())
    sum += a*b

if total == sum:
    print('Yes')
else:
    print('No')