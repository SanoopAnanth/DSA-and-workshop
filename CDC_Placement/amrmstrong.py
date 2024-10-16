n=int(input("Enter the number: "))
x=str(n)
l=len(x)
sum=0
for i in x:
    print(i)
    k=int(i)
    sum=sum+(k**l)
if sum==n:
    print("Armstrong")
else:
    print("Not an Armstrong")