for testcase in range(10):
    n = int(input())
    search = input()
    string = input()
    count = 0
    for st in range(len(string) - len(search)+1):
        if string[st] == search[0]:
            flag = True
            for se in range(len(search)):
                if string[st+se] != search[se]:
                    flag = False
                    break
            if flag:
                count += 1
                st += len(search) - 1
    print(f'#{testcase+1} {count}')

                
        
        

