import sys

n = sys.stdin.readline().strip()

for i in range(97, 123):
    for j in range(len(n)):
        flag = False
        if chr(i) == n[j]:
            print(j, end=' ')
            flag = True
            break
        
    if flag == False:
        print(-1, end=' ')
            