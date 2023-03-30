import sys

count = int(sys.stdin.readline().strip())

for i in range(count):
    a, b = map(int, sys.stdin.readline().strip().split())
    print(a+b)