for testcase in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    result = [1 for _ in range(n)]

    for i in range(1, n):
        for j in range(i):
            if arr[i] > arr[j] and result[i] <= result[j]:
                result[i] = result[j]+1
    print(f'#{testcase+1} {max(result)}')