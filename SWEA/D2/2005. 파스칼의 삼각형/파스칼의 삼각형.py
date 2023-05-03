n = int(input())

for testcase in range(n):
    height = int(input())
    arr = [[] for i in range(height)]
    arr[0].append(1)
    for i in range(1, height):
        arr[i].append(1)
        for j in range(1, i+1):
            if j == i:
                arr[i].append(arr[i-1][j-1])
            else:
                arr[i].append(arr[i-1][j] + arr[i-1][j-1])
    print('#%d' %(testcase+1))
    for i in range(len(arr)):
        print(*arr[i])
