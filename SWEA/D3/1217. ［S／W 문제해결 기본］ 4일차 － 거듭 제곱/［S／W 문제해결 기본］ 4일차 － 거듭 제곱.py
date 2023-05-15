def function(num, a, b):
    if b == 0:
        return num
    num = num * a
    return function(num, a, b-1)



for _ in range(10):
    n = int(input())
    a, b = map(int, input().split())
    result = function(1, a, b)
    print(f"#{n} {result}")
