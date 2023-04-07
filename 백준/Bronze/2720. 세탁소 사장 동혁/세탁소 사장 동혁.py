n = int(input())

Q = 25
D = 10
N = 5
P = 1

for _ in range(n):
    result = ''
    m = int(input())
    result += str(m // Q) + ' '
    m %= Q
    result += str(m // D) + ' '
    m %= D
    result += str(m // N) + ' '
    m %= N
    result += str(m // P) + ' '
    m %= P
    print(result)
