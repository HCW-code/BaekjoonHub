import sys

m = sys.stdin.readline().strip()
dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
s = 0
for i in range(len(m)):
    for j in dial:
        if m[i] in j:
            s+=dial.index(j)+3
print(s)