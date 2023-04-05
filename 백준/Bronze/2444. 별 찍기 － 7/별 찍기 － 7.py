m = int(input())
s = ''
for i in range(1,m+1):
    s += ' ' * (m-i) + '*' * (i + (i-1)) + '\n'

for i in range(m-1, 0, -1):
    s += ' ' * (m-i) + '*' * (i + (i-1)) + '\n'


print(s)