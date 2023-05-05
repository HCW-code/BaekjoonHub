test = int(input())
score = ['A+', 'A0', 'A-', 'B+', 'B0', 'B-', 'C+', 'C0', 'C-', 'D0']
for testcase in range(test):
    N, K = map(int, input().split())
    score_count = N//10
    arr = []
    for _ in range(N):
        a, b, c = map(int, input().split())
        arr.append(a*35 + b*45 + c*20)
    temp = sorted(arr, reverse=True)
    print('#%d %s' %(testcase+1, score[temp.index(arr[K-1])//score_count]))