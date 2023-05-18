def solve(index, curr_sum):
    global result
    if curr_sum == m:
        result+= 1
        return
    if index == n:
        if curr_sum == m:
            result+=1
        return
    solve(index+1, curr_sum)
    solve(index+1, curr_sum+arr[index])


for testcase in range(int(input())):
    n, m = map(int, input().split())
    arr = list(map(int, input().split()))
    result = 0
    solve(0, 0)
    print(f'#{testcase+1} {result}')