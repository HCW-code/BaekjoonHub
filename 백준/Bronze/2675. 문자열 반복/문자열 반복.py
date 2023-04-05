import sys

n = int(sys.stdin.readline().strip())

for i in range(n):
    i, j = sys.stdin.readline().strip().split()
    i = int(i)
    arr = []
    for k in j:
        for _ in range(i):
            arr.append(k)
    print(''.join(arr))