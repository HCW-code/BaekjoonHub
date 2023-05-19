def check(y, x):
    row = column = diag1 = diag2 = 1
    if x+4 < n:
        for i in range(5):
            if arr[y][x+i] == '.':
                row = 0
                break
        if y+4 < n:
            for i in range(5):
                if arr[y+i][x+i] == '.':
                    diag1 = 0
                    break
        else:
            diag1 = 0
    else:
        row = 0
        diag1 = 0
        
    if y+4 < n:
        for i in range(5):
            if arr[y+i][x] == '.':
                column = 0
                break
        if x - 4 >= 0:
            for i in range(5):
                if arr[y+i][x-i] == '.':
                    diag2 = 0
                    break
        else:
            diag2 = 0
    else:
        column = 0
        diag2 = 0
    
    if row or column or diag1 or diag2:
        return True
    else:
        return False
    



for testcase in range(int(input())):
    n = int(input())
    arr = []
    flag = False
    
    for _ in range(n):
        arr.append(input())

    for y in range(n):
        for x in range(n):
            if arr[y][x] == 'o':
                flag = check(y, x)
                if flag:
                    break
        if flag:
            break
    print(f'#{testcase+1} YES') if flag else print(f'#{testcase+1} NO')