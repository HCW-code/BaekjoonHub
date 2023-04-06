
arr = [[''] * 15 for i in range(5)]
for j in range(5):
    temp = list(input())
    for i in range(len(temp)):
        arr[j][i] = temp[i]


for i in range(15):
    for j in range(5):
        if arr[j][i] != '':
            print(arr[j][i], end = '')