testcase = int(input())

for test in range(testcase):
    n, m = map(int, input().split())
    arr = []
    result = 0
    for i in range(n):
        arr.append(list(map(int, input().split())))
    
    for i in range(n):
        count = 0
        count_ = 0
        for j in range(n):
            if arr[i][j] == 1:
                count += 1
                if j == n-1 and count == m:
                    result+=1
            else:
                if count == m:
                    result+=1
                count = 0

            if arr[j][i] == 1:
                count_ += 1
                if j == n-1 and count_ == m:
                    result+=1
            else:
                if count_ == m:
                    result += 1
                count_ = 0
    print("#%d %d" %(test+1,result))

            