n = int(input())

for testcase in range(n):
    arr = list(map(int, input().split()))
    arr.sort()
    print('#%d %d' %(testcase+1, round(sum(arr[1:9])/8)))
