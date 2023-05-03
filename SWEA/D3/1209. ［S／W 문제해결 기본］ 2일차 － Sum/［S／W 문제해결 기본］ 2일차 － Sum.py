

for testcase in range(10):
    n = int(input())
    arr = []
    arr_sum = []
    for i in range(100):
        arr.append(list(map(int, input().split())))
    updown = 0
    sum_1 = 0
    sum_2 = 0
    for i in range(100):
        arr_sum.append(sum(arr[i]))
        sum_1 +=arr[i][i]
        sum_2 +=arr[99-i][i]
        for j in range(100):
            updown += arr[j][i]
        arr_sum.append(updown)
        updown = 0
    arr_sum.append(sum_1)
    arr_sum.append(sum_2)

    print('#%d %d' %(n, max(arr_sum)))
            