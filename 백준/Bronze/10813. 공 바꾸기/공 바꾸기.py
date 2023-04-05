import sys
n, m = map(int, sys.stdin.readline().split())
arr = [0] * n
for i in range(n):
    arr[i] = i+1

for _ in range(m):
    i,j = map(int, sys.stdin.readline().split())
    temp = arr[i-1]
    arr[i-1] = arr[j-1]
    arr[j-1] = temp

print(' '.join(str(s) for s in arr))