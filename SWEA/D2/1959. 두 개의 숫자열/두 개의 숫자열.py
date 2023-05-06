testcase = int(input())

for current_testcase in range(testcase):
    n, m = map(int, input().split())
    arr1 = list(map(int, input().split()))
    arr2 = list(map(int, input().split()))
    temp = []
    if n < m:
        for i in range(m - n + 1):
            result = 0
            for j in range(n):
                result += arr1[j] * arr2[j+i]
            temp.append(result)
    else:
        for i in range(n - m + 1):
            result = 0
            for j in range(m):
                result += arr1[j+i] * arr2[j]
            temp.append(result)
    print('#%d %d' %(current_testcase+1, max(temp)))