import sys

first = int(sys.stdin.readline().strip())
second = sys.stdin.readline().strip()

list_second = list(second)

print(first * int(list_second[2]), first * int(list_second[1]), first * int(list_second[0]), first*int(second), sep = '\n')