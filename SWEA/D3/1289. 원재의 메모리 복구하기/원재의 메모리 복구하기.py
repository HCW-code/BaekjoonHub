for testcase in range(int(input())):
    string = input()
    result = '0' * len(string)
    length = len(string)
    count = 0
    for s in range(len(string)):
        if string[s] != result[s]:
            count+=1
            new_str = result[:s] + string[s] * (length - s)
            result = new_str
    print(f'#{testcase+1} {count}')