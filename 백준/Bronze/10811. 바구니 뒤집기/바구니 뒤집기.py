import sys

n, m = map(int, sys.stdin.readline().strip().split())
arr = [0] * n

for i in range(n):
    arr[i] = i+1

for _ in range(m):
    i, j = map(int, sys.stdin.readline().strip().split())
    r = (j-i+1)//2
    for _ in range(r):
        temp = arr[i-1]
        arr[i-1] = arr[j-1]
        arr[j-1] = temp
        i += 1
        j -= 1

print(' '.join(str(s) for s in arr))