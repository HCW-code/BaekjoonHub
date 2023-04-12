n = int(input())

for p in range(n):
    i, j = map(int, input().split())
    if i > j:
        print('#%d >' %(p+1))
    elif i < j:
        print('#%d <' %(p+1))
    else:
        print('#%d =' %(p+1))