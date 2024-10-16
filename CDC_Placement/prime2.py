import math
def prime(n):
    if n>1:
        for i in range(2,round(math.sqrt(n))):
            if n%i==0:
                print("Number not a prime number")
                exit(0)
        print("Number is a prime number")
    else:
        print("Number is not a prime number")
x=prime(int(input("Enter the number: ")))
