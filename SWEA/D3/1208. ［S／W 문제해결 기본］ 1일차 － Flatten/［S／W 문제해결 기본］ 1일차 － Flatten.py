for testcase in range(10):
    n = int(input())
    arr = list(map(int, input().split()))
    for i in range(n):
        arr_max = int(max(arr))
        arr_min = int(min(arr))
        arr[arr.index(arr_max)] -= 1
        arr[arr.index(arr_min)] += 1
    print('#%d %d' %(testcase+1,max(arr) - min(arr)))
