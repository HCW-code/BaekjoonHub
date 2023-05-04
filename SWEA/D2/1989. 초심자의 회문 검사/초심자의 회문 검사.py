n = int(input())

for testcase in range(n):
    word = input()
    flag = 1
    for i in range(len(word)//2):
        if word[i] != word[len(word) - 1 -i]:
            flag = 0
            break
    if flag:
        print("#%d %d" %(testcase+1, 1))
    else:
        print("#%d %d" %(testcase+1, 0))
        
    