import sys

byte = int(sys.stdin.readline().strip())

count = byte//4

for _ in range(count):
    print('long', end = ' ')

print('int')