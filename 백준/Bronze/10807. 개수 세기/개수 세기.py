import sys


count = sys.stdin.readline().strip()

yoon_suh = list(map(int, sys.stdin.readline().strip().split()))
result = int(sys.stdin.readline().strip())
n = 0
for i in yoon_suh:
    if i == result:
        n = n+1

print(n)