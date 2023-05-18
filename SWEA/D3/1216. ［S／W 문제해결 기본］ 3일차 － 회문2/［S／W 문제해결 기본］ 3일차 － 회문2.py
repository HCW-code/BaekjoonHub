for testcase in range(10):
    n = int(input())
    arr = []
    for _ in range(100):
        arr.append(input())
    count = 101
    flag = False

    arr_rotated = zip(*arr)
    arr_ = [list(e)for e in arr_rotated]
    arr_string = []
    for i in range(100):
        arr_string.append(''.join(str(s) for s in arr_[i]))
    

    while flag == False:
        count -= 1
        for i in range(100):
            for j in range(100 - count + 1):
                if arr[i][j:j+count] == ''.join(reversed(arr[i][j:j+count])) or arr_string[i][j:j+count] == ''.join(reversed(arr_string[i][j:j+count])):
                    flag = True
                    break
            if flag:
                break

    

    print(f'#{testcase+1} {count}')

    