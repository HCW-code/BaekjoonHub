import sys


count = sys.stdin.readline().strip()
list_ex = list(map(int, sys.stdin.readline().strip().split()))

print(min(list_ex), max(list_ex))