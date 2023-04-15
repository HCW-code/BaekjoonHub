n = int(input())

for i in range(1, n+1):
    arr = list(str(i))
    # print(arr)
    result = ''
    flag = 0
    for j in arr:
        if j == '3' or j == '6' or j == '9':
            result += '-'
            flag = 1
    if flag == 0:
        result += str(i)
    print(result, end = ' ')