n = int(input())

for num in range(n):
    count = int(input())
    result = 0
    arr = list(map(int, input().split()))
    arr.reverse()
    max = 0
    for i in arr:
        if i > max:
            max = i
        else:
            result += max - i
    print('#%d %d' %(num+1, result))