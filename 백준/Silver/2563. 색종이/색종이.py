
arr = [[0] * 100 for i in range(100)]

num = int(input())
for _ in range(num):
    n, m = map(int, input().split())
    for i in range(n, n+10):
        for j in range(m, m+10):
            if arr[i][100 - j] != 1:
                arr[i][100 - j] = 1

sum = 0
for i in range(100):
    for j in range(100):
       if arr[i][j] == 1:
            sum+= 1

print(sum)