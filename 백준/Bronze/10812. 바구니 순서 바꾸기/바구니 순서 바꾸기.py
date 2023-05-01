n, m = map(int, input().split())
arr = [i+1 for i in range(n)]
for testcase in range(m):
    result = []
    i, j, k = map(int, input().split())
    
    arr[i-1:j] = arr[k-1:j] + arr[i-1:k-1]
print(' '.join(str(i) for i in arr))