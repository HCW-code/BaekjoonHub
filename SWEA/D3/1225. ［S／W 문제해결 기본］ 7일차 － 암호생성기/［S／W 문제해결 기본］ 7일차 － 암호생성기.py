for testcase in range(10):
    num = int(input())
    arr = list(map(int, input().split()))
    i = 1
    while arr[7] != 0:
        temp = arr.pop(0) - i
        if temp < 0:
            temp = 0
        arr.append(temp)
        i +=1
        if i > 5:
            i = 1
    print('#%d' %(testcase+1), end = ' ')
    print(*arr)