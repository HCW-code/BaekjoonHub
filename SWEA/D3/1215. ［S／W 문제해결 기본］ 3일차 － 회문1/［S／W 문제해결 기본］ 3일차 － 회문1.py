for testcase in range(1, 11):
    n = int(input())
    arr = []
    new = ['' for i in range(8)]
    count = 0
    count_new = 0
    for _ in range(8):
        arr.append(input())
    for i in range(8):
        for j in range(8):
            new[i] += arr[7 - j][i]
    for i in range(8):
        for j in range(8 - n + 1):
            if n % 2 == 0:
                string = arr[i][n + j - 1:n // 2 + j - 1: -1]
                new_string = new[i][n + j - 1:n // 2 + j - 1: -1]
                if arr[i][j:n // 2 + j] == string:
                    count += 1
                if new[i][j:n // 2 + j] == new_string:
                    count += 1

            elif n % 2 == 1:
                string = arr[i][n + j - 1:n // 2 + j: -1]
                new_string = new[i][n + j - 1:n // 2 + j: -1]
                if arr[i][j:n // 2 + j] == string:
                    count += 1
                if new[i][j:n // 2 + j] == new_string:
                    count += 1

    print(f"#{testcase} {count}")
