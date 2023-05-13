for testcase in range(1,11):
    _ = int(input())
    search = input()
    string = input()
    count = string.count(search)
    print(f'#{testcase} {count}')