import sys

n, m = map(int, sys.stdin.readline().split())

arr = list(map(int, sys.stdin.readline().split()))

for i in range(n):
    if arr[i] < m:
        print(arr[i], end = ' ')