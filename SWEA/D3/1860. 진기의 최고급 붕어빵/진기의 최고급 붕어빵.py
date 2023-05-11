


testcase = int(input())

for test in range(testcase):
    N,M,K = map(int, input().split())
    arr = list(map(int, input().split()))
    arr.sort()
    time = 0
    completed = 0
    j = 0
    i = 0
    while(1):
        if i == M:
            completed += K
            i =0
        if arr[j] == time:
            if completed > 0:
                completed-= 1
                if j+1 == N:
                    print(f'#{test+1} Possible')
                    break
                else:
                    j+= 1
                continue
            else:
                print(f'#{test+1} Impossible')
                break
        time+=1
        i+=1

