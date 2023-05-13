for testcase in range(10):
    n = int(input())
    search = input()
    string = input()
    count = string.count(search)
    print(f'#{testcase+1} {count}')
