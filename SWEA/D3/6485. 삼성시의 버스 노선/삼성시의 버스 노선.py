for testcase in range(int(input())):
    n = int(input())
    arr = []
    for i in range(n):
        arr.append(list(map(int, input().split())))
    p = int(input())
    arr_num = []
    for i in range(p):
        arr_num.append(int(input()))
    busstop = [0] * 5001
    for i in range(len(arr)):
        for j in range(arr[i][0], arr[i][1]+1):
            busstop[j] += 1
    print(f'#{testcase+1}', end=' ')
    result = ''
    for index in arr_num:
        result+= str(busstop[index]) + ' '
    print(result)