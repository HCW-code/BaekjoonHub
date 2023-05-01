n = int(input())

for testcase in range(n):
    m = int(input())
    arr = []
    for i in range(m):
        arr.append(list(input()))
    middle = m//2
    result = 0
    for i in range(m):
        for j in range(m):
                if i <= middle:
                    if j >= middle-i and j <= middle+i:
                        result+= int(arr[i][j])
                else:
                    if j >= middle - (m-i-1) and j <= middle + (m-i-1):
                        result += int(arr[i][j])
                    
    print('#%d %d' %(testcase+1,result))