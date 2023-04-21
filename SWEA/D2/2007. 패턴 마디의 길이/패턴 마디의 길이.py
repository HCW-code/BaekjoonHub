n = int(input())

for testCase in range(n):
    m = list(input())
    result = []
    flag = True
    result.append(m[0])
    for i in range(1, len(m)):
        if result[0] != m[i]:
            result.append(m[i])
        else:
            for j in range(len(result)):
                if result[j] != m[i+j]:
                    flag = False
                    break
            if flag == False:
                result.append(m[i])
                flag = True
            else:
                print('#%d %d' %(testCase+1, i))
                break
            