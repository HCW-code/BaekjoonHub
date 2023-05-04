n = int(input())
for testcase in range(n):
    num = int(input())
    result = ''
    next = 10
    for i in range(num):
        a, b = input().split()
        for j in range(int(b)):
            result += a
            if len(result) % next == 0:
                result+= '\n'
                next += 11
            
    print("#%d \n%s" %(testcase+1, result))
        
