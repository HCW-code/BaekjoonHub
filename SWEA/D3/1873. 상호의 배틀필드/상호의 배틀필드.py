for test in range(int(input())):
    n, m = map(int, input().split())
    arr = []
    for _ in range(n):
        arr.append(list(input()))
    num = int(input())
    string = input()
    for i in range(n):
        for j in range(m):
            if arr[i][j] == '<' or arr[i][j] =='>' or arr[i][j] =='^' or arr[i][j] =='v':
                current = [i, j]
    for s in range(len(string)):
        if string[s] == 'U':
            arr[current[0]][current[1]] = '^'
            if current[0] != 0: 
                if arr[current[0]-1][current[1]] == '.':
                    arr[current[0]][current[1]] = '.'
                    current[0] = current[0]-1
                    arr[current[0]][current[1]] = '^'
        elif string[s] =="D":
            arr[current[0]][current[1]] = 'v'
            if current[0] != n-1:
                if arr[current[0]+1][current[1]] == '.':
                    arr[current[0]][current[1]] = '.'
                    current[0] = current[0]+1
                    arr[current[0]][current[1]] = 'v'
        elif string[s] =='L':
            arr[current[0]][current[1]] = '<'
            if current[1] != 0:
                if arr[current[0]][current[1]-1] == '.':
                    arr[current[0]][current[1]] = '.'
                    current[1] = current[1]-1
                    arr[current[0]][current[1]] = '<'
        elif string[s] =='R':
            arr[current[0]][current[1]] = '>'
            if current[1] != m-1:
                if arr[current[0]][current[1]+1] == '.':
                    arr[current[0]][current[1]] = '.'
                    current[1] = current[1]+1
                    arr[current[0]][current[1]] = '>'
        elif string[s] == 'S':
            if arr[current[0]][current[1]] == '<':
                i = 0
                if current[1] != 0:
                    while arr[current[0]][current[1]-i] != '*' and arr[current[0]][current[1]-i] != '#':
                        i += 1
                        if arr[current[0]][current[1]- i] == '*':
                            arr[current[0]][current[1]- i] = '.'
                            break
                        elif arr[current[0]][current[1]- i] == '#':
                            break
                        if current[1]-i == 0:
                            break
            elif arr[current[0]][current[1]] == '>':
                i = 0
                if current[1] != m-1:
                    while arr[current[0]][current[1]+i] != '*' and arr[current[0]][current[1]+i] != '#':
                        i += 1
                        if arr[current[0]][current[1]+ i] == '*':
                            arr[current[0]][current[1]+ i] = '.'
                            break
                        elif arr[current[0]][current[1]+ i] == '#':
                            break
                        if current[1]+i == m-1:
                            break
            elif arr[current[0]][current[1]] == '^':
                i = 0
                if current[0] != 0:
                    while arr[current[0]-i][current[1]] != '*' and arr[current[0]-i][current[1]] != '#':
                        i += 1
                        if arr[current[0]-i][current[1]] == '*':
                            arr[current[0]-i][current[1]] = '.'
                            break
                        elif arr[current[0]-i][current[1]] == '#':
                            break
                        if current[0]-i == 0:
                            break
            elif arr[current[0]][current[1]] == 'v':
                i = 0
                if current[0] != n-1:
                    while arr[current[0]+i][current[1]] != '*' and arr[current[0]+i][current[1]] != '#':
                        i += 1
                        if arr[current[0]+i][current[1]] == '*':
                            arr[current[0]+i][current[1]] = '.'
                            break
                        elif arr[current[0]+i][current[1]] == '#':
                            break
                        if current[0]+i == n-1:
                            break
    print(f'#{test+1}', end=' ')
    for i in range(n):
        print(''.join(str(s) for s in arr[i]))