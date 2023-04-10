n = int(input())

for i in range(n):
    arr = list(map(int, input().split()))
    print('#%d %d' %(i+1, max(arr)))