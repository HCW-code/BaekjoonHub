testcase = int(input())

for test in range(testcase):
    n, m = map(int, input().split())
    max = 0
    arr = []
    for i in range(n):
        arr.append(list(map(int, input().split())))
    for i in range(n - m + 1):
        for j in range(n - m + 1):
            sum_ = 0
            for p in range(m):
                for k in range(m):
                    sum_ += arr[i+p][j+k]
            if max < sum_:
                max = sum_
    print('#%d %d' %(test+1, max))