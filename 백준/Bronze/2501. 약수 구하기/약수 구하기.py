n, m = map(int, input().split())
i = 1
count = 0
while 1:
    if n % i == 0:
        count += 1
    if count == m:
        print(i)
        break
    i+=1
    if i > n:
        print(0)
        break