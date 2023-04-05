import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))

m_ax = max(arr)
for i in range(n):
    arr[i] = arr[i]/m_ax * 100

print(sum(arr)/len(arr))