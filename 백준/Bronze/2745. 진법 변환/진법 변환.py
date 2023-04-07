n, m = input().split()
m = int(m)

arr = list(n)
result = 0

for i in range(len(arr)):
    if int(ord(arr[i])) < 58:
        result += int(arr[i]) * (m**(len(arr)-(i+1)))
    else:
        result += (ord(arr[i]) - 55) * (m**(len(arr)-(i+1)))

print(result)