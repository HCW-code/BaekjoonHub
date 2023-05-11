testcase = int(input())
for test in range(testcase):
    n = int(input())
    arr = list(map(int, input().split()))
    result = []
    for i in range(n-1):
        for j in range(i+1, n):
            flag = 1
            test_list = list(str(arr[i] * arr[j]))
            for k in range(len(test_list)-1):
                if test_list[k] > test_list[k+1]:
                    flag = 0
                    break
            if flag:
                result.append(arr[i] * arr[j])
    # if len(result) > 0:
    print(f'#{test+1} {max(result) if len(result) > 0 else -1}')