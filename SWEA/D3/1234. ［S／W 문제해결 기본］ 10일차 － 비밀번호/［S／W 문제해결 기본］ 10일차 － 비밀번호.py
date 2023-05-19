a=range(10);
c=[str(b)*2 for b in a]
for i in a:
    n,l=input().split()
    n=int(n)
    for _ in range(n//2):
        for j in c:
            l=l.replace(j,"")
    print(f"#{i+1}",l)
