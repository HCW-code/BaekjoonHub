b = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/'


for testcase in range(int(input())):
    c = ''
    d = ''
    e = ''
    test = input()
    while test != '':
        c = b.find(test[0])
        test = test[1:]
        d+= bin(c)[2:].zfill(6)
    while d != '':
        e += chr(int(d[:8], 2))
        d = d[8:]
    print(f'#{testcase+1}', e)