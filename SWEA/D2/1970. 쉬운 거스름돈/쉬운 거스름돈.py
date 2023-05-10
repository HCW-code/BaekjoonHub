n = int(input())
number = [50000, 10000, 5000, 1000, 500, 100, 50, 10]

for testcase in range(n):
    temp = int(input())
    result = [0] * 8
    for i in range(8):
        if temp >= number[i]:
            result[i] += temp//number[i]
            temp = temp - (temp//number[i]) * number[i]
    print(f'#{testcase+1}')
    print(*result)