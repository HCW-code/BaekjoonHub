for testcase in range(10):
    n = int(input())
    arr = []
    for _ in range(100):
        arr.append(list(map(int, input().split())))
    count = 0
    
    for i in range(100):
        temp = 0
        for j in range(100):
            if arr[j][i] == 1:
                if temp == 0:
                    temp = 1
            elif arr[j][i] == 2 and temp == 1:
                count+=1
                temp = 0
    print(f'#{testcase+1} {count}')