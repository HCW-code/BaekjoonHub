n, m = map(int, input().split())
arr, arr1 = [], []

for i in range(n):
        temp = list(map(int, input().split()))
        arr.append(temp)

for i in range(n):
        temp = list(map(int, input().split()))
        arr1.append(temp)


for i in range(n):
    for j in range(m):
        print(arr[i][j] + arr1[i][j], end = ' ')
    print()