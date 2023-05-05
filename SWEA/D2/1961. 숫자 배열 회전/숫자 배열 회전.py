test = int(input())

for testcase in range(test):
    n = int(input())
    arr = []
    result = [[0 for _ in range(n)] for _ in range(n)]
    result1 = [[0 for _ in range(n)] for _ in range(n)]
    result2 = [[0 for _ in range(n)] for _ in range(n)]
    for _ in range(n):
        arr.append(list(map(int, input().split())))
    for i in range(n):
        for j in range(n):
            result[j][n-i-1] = arr[i][j]
            result1[n-1-i][n-1-j] = arr[i][j]
            result2[n-1-j][i] = arr[i][j]
    print('#%d' %(testcase+1))
    for i in range(n):
        print(''.join(str(i) for i in result[i]), ''.join(str(i) for i in result1[i]), ''.join(str(i) for i in result2[i]))






