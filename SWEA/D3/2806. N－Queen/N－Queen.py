

def dfs(y):
    global count
    if y == n:
        count+=1
        return
    else:
        for x in range(n):
            if row[x] or diag1[x+y] or diag2[x-y]:
                continue

            row[x] = diag1[x+y] = diag2[x-y] = 1
            dfs(y+1)
            row[x] = diag1[x+y] = diag2[x-y] = 0




for testcase in range(int(input())):
    n = int(input())
    count = 0
    row, diag1, diag2 = [0 for _ in range(n)], [0 for _ in range(n*2-1)], [0 for _ in range(n*2-1)]
    dfs(0)
    print(f'#{testcase+1} {count}')