for _ in range(10):
    n = int(input())
    search = input()
    string = input()
    count = 0
    for st in range(len(string) - len(search)+1):
        if string[st] == search[0]:
            if string[st:st+len(search)] == search:
                count+=1
    print(f'#{n} {count}')