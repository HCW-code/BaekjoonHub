import sys

n = int(sys.stdin.readline())

for _ in range(n):
    string = sys.stdin.readline().strip()
    print(string[0],string[len(string)-1], sep='')