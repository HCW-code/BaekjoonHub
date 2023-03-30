import sys

a, b = map(int, sys.stdin.readline().strip().split())
b = b - 45
if b < 0:
    a -= 1
    b = 60 + b
if a < 0:
    a = 23
print(a, b)