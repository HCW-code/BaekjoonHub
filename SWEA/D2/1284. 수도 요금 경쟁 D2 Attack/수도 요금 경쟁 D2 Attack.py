n = int(input())

for testcase in range(1, n+1):
    P, Q, R, S, W = map(int, input().split())
    print(f'#{testcase} {min(P * W, Q if W <= R else Q + S * (W - R))}')