n = int(input())

for testcase in range(n):
    visited = [0] * 10
    num = int(input())
    increase = 1
    while sum(visited) != 10:
        temp = []
        test_num = num * increase
        while test_num != 0:
            temp.append(test_num%10)
            test_num = test_num//10
        for i in temp:
            if visited[i] == 0:
                visited[i] = 1
        increase += 1
    print(f'#{testcase+1} {"".join(str(i) for i in list(reversed(temp)))}')