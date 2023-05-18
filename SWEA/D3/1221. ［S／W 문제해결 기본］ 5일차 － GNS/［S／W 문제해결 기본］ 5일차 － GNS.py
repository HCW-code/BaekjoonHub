arr = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]
for testcase in range(int(input())):
    n, m = input().split()
    arr_input = list(input().split())
    for index in range(len(arr_input)):
        arr_input[index] = arr.index(arr_input[index])
    arr_input.sort()
    print(f'#{testcase+1}', end = ' ')
    for index in range(len(arr_input)):
        arr_input[index] = arr[arr_input[index]]
    print(*arr_input)
        