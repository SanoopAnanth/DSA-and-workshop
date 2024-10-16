def fibo(n):
    if (n==0 or n==1):
        return 1
    else:
        return fibo(n-1)+fibo(n-2)
y=int(input("Enter the number"))
for i in range(1,y+1):
    x=fibo(i)
    print(x)