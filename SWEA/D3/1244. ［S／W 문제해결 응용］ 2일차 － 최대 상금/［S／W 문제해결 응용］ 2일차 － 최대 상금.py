# 3
# 123 1
# 2737 1
# 32888 2
def dfs(ar, m):
    global result
    if m == 0:
        if result < int(''.join(str(x) for x in ar)): 
            result = int(''.join(str(x) for x in ar))
        return 0
    for i in range(len(ar)-1):
        temp = ar[i]
        for j in range(i+1, len(ar)):
            max_temp = max(ar[i+1:len(ar)])
            if ar[j] == max_temp:
                ar[i] = ar[j]
                ar[j] = temp
                dfs(ar, m-1)
                ar[j] = ar[i]
                ar[i] = temp
            
            

for testcase in range(int(input())):
    n, m = map(int, input().split())
    arr = list(map(int, list(str(n))))
    result = 0
    dfs(arr, m)
    print(f"#{testcase+1} {result}")