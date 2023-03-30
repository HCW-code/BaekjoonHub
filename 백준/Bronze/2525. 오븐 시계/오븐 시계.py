import sys

a, b = map(int, sys.stdin.readline().strip().split())
c = int(sys.stdin.readline().strip())

hour = c//60
minute = c%60
a = a+hour

if b + minute < 60:
    if a < 24:
        print(a, b+minute)
    else:
        print(a-24, b+minute)
else:
    a += 1
    if a < 24:
        print(a, b+minute - 60)
    else:
        print(a-24, b+minute - 60)