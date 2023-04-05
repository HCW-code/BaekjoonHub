import sys

all = [1, 1, 2, 2, 2, 8]
m = list(map(int, input().split()))

for i in range(6):
    all[i] = all[i] - m[i]

print(' '.join(str(s) for s in all))