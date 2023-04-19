testcase = int(input())

for test in range(testcase):
    arr = []
    for _ in range(9):
        arr.append(list(map(int, input().split())))
    flag = True
    for i in range(9):
        visited_1 = [0] * 9
        visited_2 = [0] * 9
        for j in range(9):
            if visited_1[arr[i][j] - 1] == 0:
                visited_1[arr[i][j] - 1] = 1
            else:
                flag = False
            
            if visited_2[arr[j][i]-1] == 0:
                visited_2[arr[j][i]-1] = 1
            else:
                flag = False
            
            if flag == False:
                break
        if flag == False:
            break
    for i in range(0,9,3):
        for j in range(0,9,3):
            visited = [0] * 9
            if visited[arr[i][j]-1] == 0:
                visited[arr[i][j]-1] = 1
            else:
                flag = False
            if visited[arr[i][j+1]-1] == 0:
                visited[arr[i][j+1]-1] = 1
            else:
                flag = False
            if visited[arr[i][j+2]-1] == 0:
                visited[arr[i][j+2]-1] = 1
            else:
                flag = False
            if visited[arr[i+1][j]-1] == 0:
                visited[arr[i+1][j]-1] = 1
            else:
                flag = False
            if visited[arr[i+1][j+1]-1] == 0:
                visited[arr[i+1][j+1]-1] = 1
            else:
                flag = False
            if visited[arr[i+1][j+2]-1] == 0:
                visited[arr[i+1][j+2]-1] = 1
            else:
                flag = False
            if visited[arr[i+2][j]-1] == 0:
                visited[arr[i+2][j]-1] = 1
            else:
                flag = False
            if visited[arr[i+2][j+1]-1] == 0:
                visited[arr[i+2][j+1]-1] = 1
            else:
                flag = False
            if visited[arr[i+2][j+2]-1] == 0:
                visited[arr[i+2][j+2]-1] = 1
            else:
                flag = False
            if flag == False:
                break
        if flag == False:
                break

    if flag == False:
        print('#%d %d' %(test+1, 0))
    else:
        print('#%d %d' %(test+1, 1))



