testcase = int(input())

def dfs(index, count, mat):
    if count + arr[index][1] > kcal:
        result.append(mat)
        return 0
    else:
        count += arr[index][1]
        mat += arr[index][0]
        if index == ingred-1:
            result.append(mat)

        for i in range(index+1, ingred):
            if visited[i] != 1:
                visited[i] = 1
                dfs(i, count, mat)
                visited[i] = 0
        

for test in range(testcase):
    ingred, kcal = map(int, input().split())
    arr = []
    visited = [0] * ingred
    result = []
    for i in range(ingred):
        n, m = map(int, input().split())
        arr.append([n, m])
    for i in range(ingred):
        mat = 0
        visited[i] = 1
        dfs(i, 0, mat)
        visited[i] = 0
    print(f'#{test+1} {max(result)}')
    


