n = int(input())

for testcase in range(n):
    m = int(input())
    arr = [[0 for _ in range(m)] for _ in range(m)]
    i = 0
    j = 0
    count = 1
    while 1:
        flag = 1
        while j < m and arr[i][j] == 0:
            arr[i][j] = count
            count += 1
            j+=1
            flag = 0
        j-=1
        i+=1
        while i < m and arr[i][j] == 0:
            arr[i][j] = count
            count += 1
            i+=1
            flag = 0
        i-=1
        j-=1
        while j >=0 and arr[i][j] == 0:
            arr[i][j] = count
            count += 1
            j-=1
            flag = 0
        j+=1
        i-=1
        while arr[i][j] == 0:
            arr[i][j] = count
            count += 1
            i-=1
            flag = 0
        i+=1
        j+=1
        if flag == 1:
            break
    print('#%d' %(testcase+1))
    for i in range(m):
        print(' '.join(str(j) for j in arr[i]))



# 0 0 0 0
# 0 0 0 0
# 0 0 0 0
# 0 0 0 0