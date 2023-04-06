
arr = []
for _ in range(9):
    temp = list(map(int, input().split()))
    arr.append(temp)
max = 0
x, y = 0, 0
for i in range(9):
    for j in range(9):
        if max < arr[i][j]:
            max = arr[i][j]
            x = j
            y = i
            

print(max)
print(y+1, x+1)