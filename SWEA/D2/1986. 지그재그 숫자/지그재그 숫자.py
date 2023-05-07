n = int(input())
for testcase in range(n):
    num = int(input())
    result=0
    for i in range(1, num+1):
        if i %2== 0:
            result-= i
        else:
            result+= i
    print("#%d %d" %(testcase+1, result))