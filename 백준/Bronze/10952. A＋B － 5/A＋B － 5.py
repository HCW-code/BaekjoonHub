import sys
while(1):
    a, b = map(int, sys.stdin.readline().strip().split())
    if a == 0 & b== 0:
        break
    print(a+b)
