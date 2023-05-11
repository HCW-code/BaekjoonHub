testcase = int(input())

def dfs(index, count):
    flag = 0
    for i in range(len(arr[index])):
        if visited[arr[index][i]] == 0:
            flag = 1
            visited[arr[index][i]] = 1
            dfs(arr[index][i], count+1)
            visited[arr[index][i]] = 0
    if flag == 0:
        result.append(count)
        return

for test in range(testcase):
    n, m = map(int, input().split())
    visited = [0] * n
    arr = [[] for i in range(n)]
    result = []
    for i in range(m):
        x, y = map(int, input().split())
        arr[x-1].append(y-1)
        arr[y-1].append(x-1)

    for i in range(n):
        visited[i] = 1
        dfs(i, 1)
        visited[i] = 0
    print(f'#{test+1} {max(result)}')