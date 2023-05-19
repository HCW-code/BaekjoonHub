def sum_def(arr):
    if len(arr) == 1:
        return arr
    else:
        arr = list(map(int, list(str(sum(arr)))))
        return sum_def(arr)

T = int(input())
numbers = [input() for _ in range(T)]
string = []

for testcase in range(T):
    arr = list(map(int, list(str(numbers[testcase]))))
    result = sum_def(arr)
    string.append(result[0])
for testcase in range(T):
    print(f'#{testcase+1} {string[testcase]}')