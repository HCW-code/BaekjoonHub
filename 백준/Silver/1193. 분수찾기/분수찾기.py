n = int(input())

i = 1
while i < n:
    n = n - i
    i += 1
n-=1
if i % 2 == 0:
    x = 1+n
    y = i-n
else:
    x = i-n
    y = 1+n


print(str(x) + '/' + str(y))