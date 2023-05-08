n = int(input())
date = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
for testcase in range(n):
    a, b, c, d = map(int, input().split())
    result = 0
    for i in range(a, c):
        result += date[i]
    result = result-b+d+1
    print(f'#{testcase+1} {result}')