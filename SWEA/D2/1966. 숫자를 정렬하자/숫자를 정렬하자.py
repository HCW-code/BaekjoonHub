n = int(input())

for testcase in range(1, n+1):
    num = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    print('#%d' %(testcase), end = ' ')
    print(*arr)